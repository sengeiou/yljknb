<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>监控规则定制</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<div id="queryform" class="cxTabbox">
			<form id="form" action="#">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="textR">
							规则编号：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa168" class="mini-textbox" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							监控类型：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa153" class="mini-combobox"
											data="${dic['AAA153'] }" emptyText="请选择..." />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							对象类型：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="apa709" class="mini-combobox"
											data="${dic['APA709'] }" emptyText="请选择..." />
									</div>
								</div>
							</div>
						</td>
						<td style="text-align: center; padding-top: 5px;" colspan="2">
							<input type="button" value="" class="cxsubmit"
								onclick="search();" />
							<input type="button" value="" class="cxreset"
								onclick="resetForm();" />
						</td>
					</tr>
				</table>
			</form>
		</div>
		</fieldset>

		<div style="margin: 10px;">
			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">规则信息</span>
					</h3>
					<div class="fR pT5R9">
						<span class="btnMini"> <em> <input type="button"
									value="确定" onclick="ok()" /> </em> </span>
						<span class="btnMini"> <em> <input type="button"
							value="关闭" onclick="CloseWindow();" /> </em> </span>
					</div>

					<div id="datagrid1" class="mini-datagrid" onrowdblclick="ok"
						style="width: 100%; height: 300px;" idField="id"
						multiSelect="false" allowResize="false" pageSize="20"
						url="${pageContext.request.contextPath}/k4/f10402002/queryRuleList.action">
						<div property="columns">
							<div type="checkcolumn"></div>
							<div field="aaa168" width="100" headerAlign="center">
								规则编号
							</div>
							<div field="aaa167" width="100" headerAlign="center">
								规则名称
							</div>
							<div field="aaa133" width="100" headerAlign="center">
								规则描述
							</div>
							<div field="aaa153" width="100" headerAlign="center"
								type="comboboxcolumn">
								监控类型
								<input property="editor" class="mini-combobox"
									style="width: 100%" data="${dic['AAA153']}">
							</div>
							<div field="aaa154" width="100" headerAlign="center"
								type="comboboxcolumn">
								阈值比较方式
								<input property="editor" class="mini-combobox"
									style="width: 100%" data="${dic['AAA154']}">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
<script type="text/javascript">
	mini.parse();
	var grid=mini.get("datagrid1");
	grid.load({"aae100":"1"});
	var form = new mini.Form("#form");

	function search(){
		var data = form.getData(true,false);
		data.aae100="1";
		grid.load(data);
	}
	
	function resetForm(){
		form.reset();
	}
	
	function closeWin(){
		CloseWindow();
	}
	
	function CloseWindow(action) {            
         if (window.CloseOwnerWindow){
              return window.CloseOwnerWindow(action);
         }else{
             window.close();
         }            
    }
    
    function ok(){
    	var row=grid.getSelected();
    	if(row){
    		CloseWindow("ok");
    	}else{
    		alert("请选择一行");
    	}
    	
    }
    
    function GetData(){
    	return grid.getSelected();
    }
	
</script>
