<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>

		<title>批量扣款任务计划</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript">
		   var aaa027Str = [{id:'310003',text:'上海市'}];
		</script>
	</head>

	<body>
		<div>
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
							<td class="textR">
								结算月份：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae002" name="aae002" format="yyyyMM" class="mini-monthpicker" 
											    onvaluechanged="onValueChanged" required="true"/>
											<input id="aae002Str" name="aae002Str" class="mini-hidden" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								统筹区：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa027" name="aaa027" class="mini-combobox" required="true"
												emptyText="选择统筹区..." data="aaa027Str" />
										</div>
									</div>
								</div>
							</td>
							<td style="text-align: left;">
								<span class="btnMini"><em><input type="button" value="生成计划" onclick="generateDeduct();"/></em></span>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
        
		<div class="mainlistCon">
			<div class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">单据</span>
				</h3>
				<div class="fR pT5R9">
					<span class="btnMini"><em><input type="button" onclick="searchPlan()" value="查询" /></em></span>
				</div>
			</div>
			<div id="datagrid1" class="mini-datagrid" style="width:100%;height:400px;"
				idField="id" multiSelect="true" allowResize="false" pageSize="20"
				url="${pageContext.request.contextPath}/k2/f10201005/queryMedDeductPlan.action">
				<div property="columns">
				    <div type="detailcolumn" headerAlign="center" align="center" 
				         width="50" renderer="onYlRenderer">
				      ~
				    </div>
				    <div field="baz045" type="comboboxcolumn" width="80"
						headerAlign="center" align="center">
						计划状态
						<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['BAZ045']}">
					</div>
					<div field="aae002" width="60" headerAlign="center" align="center">
						扣款月份
					</div>
					<div field="bab010" width="100" headerAlign="center" align="center">
						扣款医疗机构数
					</div>
					<div field="bae011" width="100" headerAlign="center" align="center">
						扣款总金额
					</div>
					<div field="aaa027" width="120" headerAlign="center" align="center">
						统筹区
					</div>
					<div field="aae036" width="120" headerAlign="center" dateFormat="yyyy-MM-dd HH:mm:ss" align="center">
						操作时间
					</div>
					<div field="aae011" width="80" headerAlign="center" align="center">
						操作人
					</div>
					<div field="baz007" width="100" headerAlign="center" align="center">
						事件ID
					</div>
				</div>
			</div>
			<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("datagrid1");
	var form = new mini.Form("form1");

	function searchPlan(){
		var aaa027 = mini.get("aaa027").getValue();
		var aae002Str = mini.get("aae002Str").getValue();
		if(aae002Str == ''){
			mini.alert("请选择结算月份!");
			return;
		}
		if(aaa027 == ''){
			mini.alert("请选择统筹区!");
			return;
		}
		grid1.load({aae002:aae002Str,aaa027:aaa027});
	}
	
	function generateDeduct() {
		var data = form.getData(); 
        form.validate();
        if (form.isValid() == false) {
            return;
        }
        var json = mini.encode(data);
		mini.mask({el: document.body,cls: 'mini-mask-loading',html: '正在处理,请稍后...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k2/f10201005/saveDeductPlan.action",
            type: "post",
            data: { submitData: json },
            success: function (text) {
            	mini.unmask(document.body);
            	if(text.success){
            	  mini.alert("操作成功!");
            	  grid1.load({baz007:text.result[0].baz007,aaa027:text.result[0].aaa027});	
            	}else{
            	  mini.alert(text.msg);
                }  
            }
        });
	}
	function onYlRenderer(e){
    	var record = e.row;
        return "<a href='javascript:void(0)' onclick = showHosPlan('" + record.baz007 + "')>医院汇总</a> ";
    }
    function showHosPlan(baz007){
        mini.open({
			url : "${pageContext.request.contextPath}/pages/k2/f10201005/f10201005_hosplan.jsp",
			title: "医院汇总计划", 
			width: 900, 
			height: 450,
			onload: function () {
				var iframe = this.getIFrameEl();
				var data =  {baz007 : baz007};
				iframe.contentWindow.setData(data);
			},
			ondestroy: function (action) {
				
			}
		});
    }
	function onValueChanged(e) {
		var aae002 = mini.get("aae002");
        mini.get("aae002Str").setValue(aae002.getFormValue());
	}
</script>
	</body>
</html>
