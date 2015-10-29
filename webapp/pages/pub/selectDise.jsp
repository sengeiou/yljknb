<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>疾病信息</title>
		<%@ include file="../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<div id="" style="margin: 10px; position: relative;">
						<table style="width: 100%;" class="cxTab">
							<tr>
								<td class="textR">疾病分类：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka122" name="aka122" class="mini-textBox" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">疾病编号：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka120" name="aka120" class="mini-textBox" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">疾病名称：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka121" name="aka121" class="mini-textBox" />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">特殊病种类别：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka035" name="aka035" class="mini-combobox"
													data="${dic['AKA035']}" textField="text" valueField="id"
													required="true" emptyText="请选择..." />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">有效标志：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae100" name="aae100" class="mini-combobox"
													data="${dic['AAE100']}" textField="text" valueField="id"
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
							</tr>
							<tr>
								<td style="text-align:right;padding-bottom:2px;padding-right: 14px;"
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
					<h3 class="cxTit pTb8"><span class="iconCx">疾病列表</span></h3>
				</div>
				<div style="margin-top:0px;">
					<div id="grid1" class="mini-datagrid" idField="id" multiSelect="true" style="width: 100%; height:220px;" 
						onselectionchanged="onSelectionChanged" onrowdblclick="onRowDblclick" allowResize="true" pageSize="10" 
						url="${pageContext.request.contextPath}/common/queryDisease.action">
						<div property="columns">
							<div type="indexcolumn"></div>
							<div field="aka122" width="80" headerAlign="center">疾病分类</div>
							<div field="aka120" width="80" headerAlign="center">疾病编号</div>
							<div field="aka121" width="80" headerAlign="center">疾病名称</div>
							<div field="aae100" width="80" headerAlign="center" type="comboboxcolumn">
								有效标志<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAE100']}">
							</div>
							<div field="aka035" width="80" headerAlign="center">特殊病种类型</div>
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