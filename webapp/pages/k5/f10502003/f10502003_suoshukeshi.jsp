<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>科室信息维护</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
		var Yxbz = [{ id: 0, text: '启用' }, { id: 1, text: '禁用'}];
          mini.parse();
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
   <body style="overflow-x: hidden; overflow-y: hidden;">
   		<div id="editForm1" class="cxTabbox" >
				<table style="width:100%;" class="cxTab">
					<tr>
						<td class="textR">
							科室名称：
						</td>
						<td>
					     	<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aae386" class="mini-textbox" />
										</div>
									</div>
							</div>
						</td>
						<td class="textR">
							科室类别：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input name="akf001" emptyText="请选择..." class="mini-combobox" data="${dic['AKF001']}"/>
									</div>
							  </div>
						  </div>
						</td>
							<td style="text-align: center; padding-bottom: 5px;" >
								<input type="button" value="" class="cxsubmit" onclick="search();"/>
								<input type="button" value="" class="cxreset" onclick="resetForm();" />
							</td>
					</tr>
				   </table>
					</div>
			     <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">科室信息</span>
					</h3>
					<div class="fR pT5R9">
					    <span class="btnMini"><em><input type="button" onClick="selectValue()" value="确定"/></em></span>
					  </div>
		          </div>
		<div id="datagrid1" class="mini-datagrid"  multiSelect="false" onrowdblclick="selectModel"
					style="width: 100%; height: 405px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k5/f10502002/queryKf06Message.action">
						<div property="columns">
						<div type="checkcolumn"></div>
						<div type="indexcolumn" ></div>
						<div field="aae386" width="100" headerAlign="center">
							科室名称
						</div>
						<div field="akf001"  width="100" type="comboboxcolumn"	headerAlign="center">
							科室分类<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AKF001']}" />
						</div>
						
					</div>
					</div>
				</div>
	<script type="text/javascript">
	
		mini.parse();
		var grid = mini.get("datagrid1");
		var form = new mini.Form("editForm1");
		grid.load();
		
		

	
			
	function search() {
		var form = new mini.Form("editForm1");
		var data = form.getData(true,false);
			grid.load(data);
	}
    function resetForm(){
		var queryForm = new mini.Form("editForm1");
		queryForm.reset();
	}
	
 function selectModel(e){
 	CloseWindow("ok");
    	
    }
    
    function GetData(){
    	var row = grid.getSelected();
		return row;
    }
    
    function closeWin() {
				CloseWindow();
			}
			
			
			function selectValue(){
				var row = grid.getSelected();
				if (row == null){
					mini.alert("请选择一条记录");
				}else{
					CloseWindow("ok");
				}
			}

    function closeWin() {
		CloseWindow();
	}
    function search(){
		grid.load(form.getData(true));
	}
	function CloseWindow(action) {
		if (window.CloseOwnerWindow) {
			return window.CloseOwnerWindow(action);
		} else {
			window.close();
		}
	}
	
</script>
	</body>
</html>