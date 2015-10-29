<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医护人员信息维护</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
		var Yxbz = [{ id: 0, text: '启用' }, { id: 1, text: '禁用'}];
		 var Shifou = [{id:0,text:'是'},{id:1,text:'否'}];
          mini.parse();
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
   <body style="overflow-x: hidden; overflow-y: hidden;">
   		<div id="editForm1" name="editForm1" class="cxTabbox" >
   		<form action="" id="editForm">
				<table style="width:100%;" class="cxTab">
					<tr>
						<td style=";width:10%;" class="textR">
								所属科室：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz307" name="aaz307" class="mini-buttonedit"
												onbuttonclick="openQueryModel" allowInput="false" />
										</div>
									</div>
								</div>
							</td>
						<td class="textR">
							医护人员姓名：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input name="aac003"  class="mini-textbox" />
									</div>
							  </div>
						  </div>
						</td>
						<td class="textR">
							行政职务：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input name="akc049" emptyText="请选择..." class="mini-combobox" data="${dic['AKC049']}"/>
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
				   </form>
					</div>
			     <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">医护人员信息</span>
					</h3>
					<div class="fR pT5R9">
					<span class="btnMini"><em><input type="button" onClick="add();" value="添加"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="edit();" value="修改"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="remove();" value="删除"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="selectHistory2();" value="历史信息查看"/></em></span>
					 </div>
		          </div>
		<div id="datagrid1" class="mini-datagrid"
					style="width: 100%; height: 460px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k5/f10502003/queryKf05Message.action">
						<div property="columns">
						<div type="indexcolumn" ></div>
						<div field="aae386" width="100" headerAlign="center">
							科室名称
						</div>
						<div field="aac003"  width="100" headerAlign="center">
							姓名
						</div>
						<div field="aab014" width="100" headerAlign="center">
							公民身份号码
						</div>
						<div field="akc049" width="100"  type="comboboxcolumn" headerAlign="center">
							行政职务<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AKC049']}" />
						</div>
						<div field="aaf009" width="100" type="comboboxcolumn" headerAlign="center">
							专业技术职务<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AAF009']}" />
						</div>
						<div field="aaz263" width="100" headerAlign="center">
							医护人员编号
						</div>
						<div field="akc054" width="100" headerAlign="center">
							医师资格证编码
						</div>
						<div field="akc056" width="100" headerAlign="center">
							医师执业证编码
						</div>
						<div field="akc057" width="100" headerAlign="center">
							第一执业地点
						</div>
						<div field="akc051" type="comboboxcolumn" name="akc051" autoShowPopup="true" width="100" headerAlign="center" >
						           多点执业标志<input property="editor"  class="mini-combobox" style="width:100%;" data="Shifou" />  
					    </div>
					    <div field="akc052" type="comboboxcolumn" name="akc052" autoShowPopup="true" width="120" headerAlign="center" >
							  门诊大病医师标识<input property="editor"  class="mini-combobox" style="width:100%;" data="Shifou" />  
					    </div>
					    <div field="akc053" type="comboboxcolumn" name="akc053" autoShowPopup="true" width="140" headerAlign="center" >
							   医师医保服务资格状态<input property="editor"  class="mini-combobox" style="width:100%;" data="Shifou" />  
					    </div>
						<div field="aae005" width="100" headerAlign="center">
							联系电话
						</div>
						<div field="akc281" width="100" headerAlign="center">
							药师执业范围
						</div>
						<div field="akc282" width="140" headerAlign="center">
							执业药师资格证书编号
						</div>
						<div field="aaz263"  visible="false">医护人员编号</div>
					</div>
					</div>
				</div>
	<script type="text/javascript">
   mini.parse();
	var grid = mini.get("datagrid1");
	var form = new mini.Form("#editForm1");
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
    	
		function search(){
			grid.load(form.getData(true));
		}
		
		  function add(){
	        mini.open({
	            url: "../pages/k5/f10502003/f10502003_add.jsp",
	            title: "新增信息", 
	            width:900,
				height:350,
				ondestroy:function(action){
				    grid.reload();
				}
	        });
	    }
	 
	function selectHistory2(){
	        mini.open({
	            url: "../pages/k5/f10502003/f10502003_selectHistoryMessage.jsp",
	            title: "新增信息", 
	            width:1000,
				height:480,
				onload:function(){
					var iframe = this.getIFrameEl();
					iframe.contentWindow.SetData();	
				},
				ondestroy:function(action){
					grid.reload();
				}
	        });
	    }
	    
	    function edit(){
		var row = grid.getSelected();//确定选中的哪一行
		if(row){
			mini.open({
				url:"../pages/k5/f10502003/f10502003_edit.jsp",
				title:"修改方案信息",
				width:1000,
				height:460,
				onload:function(){
					var iframe = this.getIFrameEl();
					//alert(row.aaa027);
					var data = {aaz263 : row.aaz263};
					iframe.contentWindow.SetData(data);	
				},
				ondestroy:function(action){
					grid.reload();
				}
		    });
		}else{
			mini.alert("请选中一条记录");
		} 
	}
	 
	    function remove(){
				var row = grid.getSelected();
				if (row) {
					mini.confirm("确认删除","确认",
					function(action){
						if (action == "ok"){
							$.ajax({
				     		url:"${pageContext.request.contextPath}/k5/f10502003/deleteKf05Message.action",
				     		type:"post",
				     		data: {aaz263 : row.aaz263},
				     		success: function (text){
				     			if(text.success){
				     				mini.showMessageBox({
			        				title: "提示",
			        				message: " 维护信息提交操作成功",
			        				buttons: ["确定"],
			        				iconCls: "mini-messagebox-info",
			        				callback: function(action){
		            					search();
		         					}});
				     			}else{
				            	  mini.alert(text.msg);
				                } 
		     				}
		     				});
						}
					}
					);
				} else {
					mini.alert("请选择一条记录!");
				}
				
			}
    function openQueryModel(e){
    	var bnEdit = this;
    	
		mini.open({
	            url: "../pages/k5/f10502003/f10502003_suoshukeshi.jsp",
	            title: "",
	            width:800,
				height:425,
				ondestroy: function (action) {
				 		if(action=="ok"){
				 			var iframe = this.getIFrameEl();
                			var data = iframe.contentWindow.GetData();
                			data = mini.clone(data);
                			bnEdit.setValue(data.aae386);
                			bnEdit.setText(data.aae386);
				            mini.get("aaz307").setValue(data.aaz307);
				            mini.get("aaz307").setText(data.aae386);
						}
					 }
	      		  });	
	        }
	
    function formReset(){
		form.reset();
	}
</script>
	</body>
</html>