<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>调度日志查询</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>

</head>
<body>
	<form id="form" action="#">
	 
			<div id="editForm1"  class="cxTabbox">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="textR">计划名称：</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaz325" name="aaz325" class="mini-buttonedit"
											onbuttonclick="queryPlan" />
									</div>
								</div>
							</div></td>
						<td class="textR">起始日期：</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae310" name="aae310" format="yyyyMMdd"
											allowInput="false" showTodayButton="false"
											ondrawdate="onDrawDate" class="mini-datepicker" />
									</div>
								</div>
							</div></td>
						<td class="textR">终止日期：</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae311" name="aae311" format="yyyyMMdd"
											onblur="checkHandlerDate()" allowInput="false"
											showTodayButton="false" ondrawdate="onDrawDate"
											class="mini-datepicker" />
									</div>
								</div>
							</div></td>
						<td style="text-align: center; padding-top: 5px;" colspan="2">
							<input type="button" value="" class="cxsubmit"
							onclick="search();" /> <input type="button" value=""
							class="cxreset" onclick="resets();" /></td>
					</tr>
				</table>
			</div>
		 

		<div>
			<div class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">计划执行情况</span>
				</h3>
			</div>
			<div >
				<div onrowclick="searchRuleByModel" id="datagrid1"
					class="mini-datagrid" style="width: 100%; height: 180px;"
					idField="id" multiSelect="true" allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10401003/queryPlan.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div field="aaa201" width="100" headerAlign="center">计划名称</div>
						<div field="aae310" width="100" headerAlign="center"
							dateFormat="yyyy-MM-dd">开始时间</div>
						<div field="aae311" width="100" headerAlign="center"
							dateFormat="yyyy-MM-dd">结束时间</div>
						<div field="aae312" width="100" headerAlign="center">执行状态</div>
						<div field="aae013" width="100" headerAlign="center">备注</div>
					</div>
				</div>
			</div>
		</div>

		<div>
			<div class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">任务执行情况</span>
				</h3>
			</div>
			<div >
				<div id="datagrid2" class="mini-datagrid"
					style="width: 100%; height: 185px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10401003/queryTask.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div field="aaa167" width="100" headerAlign="center">任务名称</div>
						<div field="aaa156" width="100" headerAlign="center"
							type="comboboxcolumn">
							任务类型 <input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA156']}">
						</div>
						<div field="aae311" width="100" headerAlign="center"
							dateFormat="yyyy-MM-dd">执行时间</div>
						<div field="aae312" width="100" headerAlign="center">执行状态</div>
						<div field="aae317" width="100" headerAlign="center">说明</div>
					</div>
				</div>
			</div>
		</div>
	</form>
	<script type="text/javascript">
		mini.parse();
		var form=new mini.Form("#form");
		var grid1=mini.get("datagrid1");
		var grid2=mini.get("datagrid2");
		
		/* grid1.on("drawcell", function (e) {
	        var record = e.record,
	        column = e.column,
	        field = e.field,
	        value = e.value;
	
	        if (e.rowIndex%2 == 0) {
	        	e.rowCls = "rowtype1";
	        }else{
	        	e.rowCls = "rowtype2";
	        }
	        

    }); */
    
    	/* grid2.on("drawcell", function (e) {
	        var record = e.record,
	        column = e.column,
	        field = e.field,
	        value = e.value;
	
	        
	        e.rowStyle = "color:red";
	        

    }); */
	function queryPlan() {
			var btn=this;
			mini.open({
				url:"../pages/k4/f10401003/f10401003_queryplan.jsp",
				title:"请选择计划", width: 800, heigth: 350,
				width:1000,
				heigth:650,
				ondestroy:function(action){
					var iframe = this.getIFrameEl();
					var data=iframe.contentWindow.GetData();
		            data = mini.clone(data);    //必须。克隆数据
		            if(data){
		           		btn.setValue(data.id);
		           		btn.setText(data.name);
		           		/* mini.get("aaa153").setValue(data.typeId);
		           		getAaa168(data.typeId); */
		           }	
				}
			});
		}
		
	function search(){
		var data = form.getData(true,false);
		grid1.load(data); 
	}
	
    function resets(){
   		form.reset();
    }
    
    function searchRuleByModel(){
    	var row=grid1.getSelected();
    	if(row){
    		grid2.load(row);
    	}else{
    		grid2.clearRows(); 
    	}
		
    }
    
	function onDrawDate(e) {
            var date = e.date;
            var d = new Date();

            if (date.getTime() > d.getTime()) {
                e.allowSelect = false;
            }
        }
   function checkHandlerDate(){
	    	var t1 = mini.get("aae310").getValue();
	  		var t2 = mini.get("aae311").getValue();
	  		if(t1 > t2){
	  			mini.get("aae311").setValue("");
	  			mini.alert("经办截止日期不可以小于经办开始日期");
	  		}
   }
	</script>
</body>
</html>
