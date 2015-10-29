<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>调度计划管理</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>

</head>
<body>
	<div>
		<form id="form" action="#">
			<div id="editForm1" class="cxTabbox">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="textR">计划名称：</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaa201" name="aaa201" class="mini-textbox" />
									</div>
								</div>
							</div>
						</td>
						<td style="text-align: center; padding-top: 5px;" colspan="2">
							<input type="button" value="" class="cxsubmit"
							onclick="search();" /> <input type="button" value=""
							class="cxreset" onclick="resets();" />
						</td>
					</tr>
				</table>
			</div>
		</form>
	</div>

 
		<div class="listTit">
			<h3 class="cxTit fL">
				<span class="iconCx">调度计划信息<span style="color: red;">(请双击选择)</span></span>
			</h3>
			<div class="fR pT5R9">

				<span class="btnMini">
				 <em> <input type="button" value="确定" onclick="selectplan()" /></em> 
				</span><!--
				 <span class="btnMini">
					<em> <input type="button" value="关闭" onclick="closeWin()" /> </em>
				</span>
			--></div>
		</div>
	 


		<div id="datagrid1" class="mini-datagrid" onrowdblclick="selectplan"
			style="width: 100%; height: 280px;" idField="id" multiSelect="true"
			allowResize="false" pageSize="20"
			url="${pageContext.request.contextPath}/k4/f10401002/queryDispatchManage.action">
			<div property="columns">
				<div type="checkcolumn"></div>
				<div field="aaa201" width="100" headerAlign="center">计划名称</div>
				<div field="aaa170" width="100" headerAlign="center">执行表达式</div>
				<div field="aaa152" width="100" headerAlign="center">参数列表</div>
				<div field="aae011" width="100" headerAlign="center">经办人</div>
				<div field="aae036" width="100" dateFormat="yyyy-MM-dd"
					headerAlign="center">经办时间</div>
				<div field="aae100" width="100" headerAlign="center">有效标志</div>
			</div>
		</div>
	

</body>
<script type="text/javascript">
		mini.parse();
		var grid1 = mini.get("datagrid1");
		var queryForm = new mini.Form("editForm1");
		var form = new mini.Form("#form");
		grid1.load({"aae100":"1"});
		
	
	function search(){
		var data = form.getData(true,false);
		data.aae100="1";
		grid1.load(data); 
		
	}
	
	 function resets(){
   		form.reset();
   	}
   		
	function selectplan(){
		 
		var row=grid1.getSelected();
    	if(row){
    		CloseWindow("ok");
    	}else{
    		mini.alert("请选择一行");
    	}
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
	function GetData() {
		var row=grid1.getSelected();
		var data={
			id:row.aaz325,
			name:row.aaa201
			//aae100:aae100
			};
			return data;
		
	}
		  
 	 
	 
</script>
</html>
