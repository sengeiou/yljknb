<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>查询医疗机构信息</title>
		<%@ include file="../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<div id="" style="margin: 10px; position: relative;">
						<table style="width: 100%;" class="cxTab">
							<tr>
								<td class="textR">医疗机构编号：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akb020" name="akb020" class="mini-textBox" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">医疗机构名称：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akb021" name="akb021" class="mini-textBox" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">医疗机构类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akb022" name="akb022" class="mini-combobox"
													data="${dic['AKB022']}" textField="text" valueField="id"
													required="true" emptyText="请选择..." />
											</div>
										</div>
									</div>
								</td>
							</tr>
							
							<tr>
								<td class="textR">医院等级：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka101" name="aka101" class="mini-combobox" 
													data="${dic['AKA101']}" textField="text" valueField="id"
													required="true" emptyText="请选择..." />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">统筹区编码：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa027" name="aaa027" class="mini-combobox" emptyText="请选择..."
											   		data="${dic['AAA027']}" textField="text" valueField="id" required="true"/>
											 </div>
										</div>
									</div>
								</td>
								<td class="textR">医疗机构类别：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akb023" name="akb023" class="mini-combobox" emptyText="请选择..."
											   		data="${dic['AKB023']}" textField="text" valueField="id" required="true"/>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td style="text-align:right;padding-bottom:2px;padding-right: 8px;"
									colspan="6">
									<input type="button" value="" class="cxsubmit" onclick="search()" />
									<input type="reset" value="" class="cxreset" onclick="resetForm()"/>
								</td>
							</tr>
						</table>
					</div>
				</form>
			</div>
		</fieldset>
		
		<fieldset style="border: solid 0px #aaa; position: relative;">
			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit pTb8"><span class="iconCx">医疗服务机构列表</span></h3>
				</div>
				
				<div style="margin-top:0px;">
					<div id="grid1" class="mini-datagrid" idField="id" multiSelect="true" style="width: 100%; height:220px;" 
						onselectionchanged="onSelectionChanged" onrowdblclick="onRowDblclick" allowResize="true" pageSize="10" 
						url="${pageContext.request.contextPath}/common/queryMedInstitution.action">
						<div property="columns">
							<div type="indexcolumn"></div>
							<div field="aaz107" width="80" headerAlign="center">医疗服务机构ID</div>
							<div field="akb020" width="80" headerAlign="center">医疗服务机构编号</div>
							<div field="akb021" width="60" headerAlign="center">医疗服务机构名称</div>
							<div field="akb022" width="80" headerAlign="center" type="comboboxcolumn">
								医疗服务机构类型<input property="editor" class="mini-combobox" style="width: 100%;" data="${dic['AKB022']}" />
							</div>
							<div field="aka101" width="80" headerAlign="center" type="comboboxcolumn">
								医疗服务机构等级<input property="editor" class="mini-combobox" style="width: 100%;" data="${dic['AKA101']}" />
							</div>
							<div field="aab112" width="80" headerAlign="center">所有制形式</div>
							<div field="aaa027" width="80" headerAlign="center">统筹区编码</div>
						</div>
					</div>
					
					<div style="text-align:center;margin:10px;" class="mainlistCon">
						<span class="btnMini">
							<em>
								<input type="button" value="确定" onclick="selectValue()" id="e_btn" name="e_btn"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="返回" onclick="closeWin()" id="b_btn" name="b_btn"/>
							</em>
						</span>
					</div>
					
				</div>
			</div>
		</fieldset>
		
		<script type="text/javascript">
			mini.parse();
			
			var form = new mini.Form("form1");
			var grid = mini.get("grid1");
			
			//查询
			function search(){
				var data = form.getData(true,false);
				grid.load(data);
			}
			
			
			//确定
			function selectValue(){
				var row = grid.getSelected();
				if(row==null){
					mini.alert("请选择一条记录");
				}else{
					CloseWindow("ok");
				}
			}
			
			function GetData(){
				var row = grid.getSelected();
				return row;
			}
			
			function onRowDblclick(e) {
		       CloseWindow("ok");
		    }
		    
		    function onSelectionChanged(e){
		    	var grid = e.sender;
			    var record = grid.getSelected();
			    var btn = new mini.get("e_btn");
			    btn.enabled=true;
		    }
			
			//返回
			function closeWin(){
				CloseWindow();
			}
			
			function CloseWindow(action) {
				if (window.CloseOwnerWindow){
					window.CloseOwnerWindow(action);
				}else{
					window.close();
				} 
			}
			
			//重置
			function resetForm(){
				form.reset();
			}
		</script>
	</body>
</html>