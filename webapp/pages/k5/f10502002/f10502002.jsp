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
   		<form id="form1" action="#">
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
				   </form>
					</div>
			     <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">科室信息</span>
					</h3>
					<div class="fR pT5R9">
					<span class="btnMini"><em><input type="button" onClick="add();" value="添加"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="edit();" value="修改"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="remove();" value="删除"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="selectHistory1();" value="历史信息查看"/></em></span>
					 </div>
		          </div>
		<div id="datagrid1" class="mini-datagrid"
					style="width: 100%; height: 460px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k5/f10502002/queryKf06Message.action">
						<div property="columns">
						<div type="indexcolumn" ></div>
						<div field="aae386" width="100" headerAlign="center">
							科室名称
						</div>
						<div field="akf001"  width="100" type="comboboxcolumn" headerAlign="center">
							科室类别<input property="editor" emptyText="请选择..." class="mini-combobox" data="${dic['AKF001']}"/>
						</div>
						<div field="akf015" width="100" headerAlign="center">
							床位数
						</div>
						<div field="aaz307"  visible="false">科编号</div>
						
					</div>
					</div>
				</div>
	<script type="text/javascript">
	
		mini.parse();
		var grid = mini.get("datagrid1");
		grid.load();
		
		
	function search() {
		var form = new mini.Form("form1");
		var data = form.getData(true,false);
			grid.load(data);
	}
    function resetForm(){
		var queryForm = new mini.Form("form1");
		queryForm.reset();
	}
    
     function add(){
	        mini.open({
	            url: "../pages/k5/f10502002/f10502002_add.jsp",
	            title: "新增信息", 
	            width:700,
				height:350,
				onload:function(){
					var iframe = this.getIFrameEl();
					iframe.contentWindow.SetData();	
				},
				ondestroy:function(action){
					grid.reload();
				}
	        });
	    }
	 function selectHistory1(){
	        mini.open({
	            url: "${pageContext.request.contextPath}/pages/k5/f10502002/f10502002_selectHistoryMessage.jsp",
	            title: "新增信息", 
	            width:900,
				height:500,
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
				url:"${pageContext.request.contextPath}/pages/k5/f10502002/f10502002_edit.jsp",
				title:"修改方案信息",
				width:800,
				height:300,
				onload:function(){
					var iframe = this.getIFrameEl();
					var data = {aaz307 : row.aaz307};
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
				     		url:"${pageContext.request.contextPath}/k5/f10502002/deleteKf06Message.action?method=deleteKf06Message",
				     		type:"post",
				     		data: {aaz307 : row.aaz307},
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
    

</script>
	</body>
</html>