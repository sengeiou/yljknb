<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>规则维护</title>
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
							规则名称：
						</td>
						<td>
					     	<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="mc" class="mini-textbox" />
										</div>
									</div>
							</div>
						</td>
						<td class="textR">
							规则代码：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input name="gzdm" class="mini-textbox" />
									</div>
							  </div>
						  </div>
						</td>
						<td class="textR">
							有效标志：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						         <div class="inputR">
										<div class="inputC">
												<input name="zt"  emptyText="请选择..." class="mini-combobox" data="Yxbz" />
										</div>
									</div>
								</div>
						</td>
							<td style="text-align: center; padding-bottom: 5px;" >
								<input type="button" value="" class="cxsubmit" onclick="search();"/>
								<input type="button" value="" class="cxreset" onclick="formReset();" />
							</td>
					</tr>
				</table>
					</div>
					
			     <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">规则信息</span>
					</h3>
					<div class="fR pT5R9">
					<span class="btnMini"><em><input type="button" onClick="add();" value="添加"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="edit();" value="修改"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="remove1();" value="删除"/></em></span>
					 </div>
		    </div>
					 
				<div id="datagrid1" class="mini-datagrid"
					style="width: 100%; height: 405px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402005/queryRuleMessage.action">
						<div property="columns">
						<div type="checkcolumn"></div>
						<div type="indexcolumn" ></div>
						<div field="mc" width="100" headerAlign="center">
							规则名称
						</div>
						<div field="gzdm"  width="100"	headerAlign="center">
							规则代码
						</div>
						<div field="gzms" width="100" headerAlign="center">
							规则描述
						</div>
						<div field="zt" type="comboboxcolumn" name="zt" autoShowPopup="true" width="100" headerAlign="center" >
							规则状态<input property="editor"  class="mini-combobox" style="width:100%;" data="Yxbz" />  
						</div>
						<div field="cjrmc" width="100" headerAlign="center">
							创建人
						</div>
						<div field="cjsj" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">
							创建日期
						</div>
					</div>
					</div>
				</div>
		
	<script type="text/javascript">
	
	
		mini.parse();
		var grid = mini.get("datagrid1");
		var queryForm = new mini.Form("editForm1");
		//var form = new mini.Form("#form");
		grid.load();
		
	function search() {
		var data = queryForm.getData(true,false);
		
			grid.load(data);
		
	}
    function formReset(){
   		queryForm.reset();
    }
	    function add(){
	        mini.open({
	            url: "../pages/k4/f10402005/f10402005_add.jsp",
	            title: "新增规则信息", 
	            width:500,
				height:250,
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
				url:"../pages/k4/f10402005/f10402005_edit.jsp",
				title:"修改方案信息",
				width:500,
				height:250,
				onload:function(){
					var iframe = this.getIFrameEl();
					//alert(row.id);
					var data = {id : row.id};
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
	 
	 function remove1(){
			var rows = grid.getSelecteds();
			if (rows.length > 0){
				mini.confirm("确定删除选中的记录","确认",
					function(action){
					if (action == "ok"){
		             var ids = [];
					for (var i = 0, l = rows.length; i < l; i++){
						var r = rows[i];
	                    ids.push(r.id);
					}
					var id = ids.join(',');
					$.ajax({
						url: "${pageContext.request.contextPath}/k4/f10402005/deleteRuleMessage.action",
						post:"post",
						data: {idStr: id},
						success: function (text) {
	                    	grid.reload();
	                    },
	                    error: function () {
	                    }
					});
				}else{
							//mini.alert("---------final-------");
						}
					}
				); 
			}else{
				mini.alert("请选中一条记录");
			}
		}

</script>
	</body>
</html>