<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>规则指标维护</title>
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
						 <span >规则名称：</span>
				      </td>
				      <td>
					    <div class="inputL" style="width: 130px">
					      <div class="inputR">
							<div class="inputC">
								 <input id="mc" name="mc" class="mini-textbox"  />
						   </div>
						</div>
			        </div>
				</td>
					   <td class="textR">
						 <span >指标名称：</span>
				      </td>
				      <td>
					    <div class="inputL" style="width: 130px">
					      <div class="inputR">
							<div class="inputC">
								 <input id="zbmc" name="zbmc" class="mini-textbox"  />
						   </div>
						</div>
			        </div>
				</td>
				 <td class="textR">
					<span>有效标志：</span>
				 </td>
				 <td>
					 <div class="inputL" style="width: 130px">
				       <div class="inputR">
							<div class="inputC">
							    <input id="zt"  name="zt" emptyText="请选择..." class="mini-combobox" data="Yxbz" />
							 </div>
						 </div>
					 </div>
                </td>
                 <td style="float:left; padding-right: 10px; padding-bottom: 5px;">
				  <input type="submit" value="" class="cxsubmit" onclick="search()" />
				  <input type="reset" value="" class="cxreset" onclick="reset()" />
								</tr>
							</table>
					</div>
					
			       <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">规则指标信息</span>
					</h3>
					<td style="width: 100%;">
					   <div class="fR pT5R9">
					   <span class="btnMini"><em><input type="button" onClick="add();" value="添加"/></em></span>
					   <span class="btnMini"><em><input type="button" onClick="remove1();" value="删除"/></em></span>
					
					  </div>
					</td>
					</div>
				<div id="grid1" class="mini-datagrid" 
					style="width: 100%; height: 400px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402006/queryRuleTarget.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div field="mc"  width="100" headerAlign="center">
							规则名称
						</div>
						<div field="gzdm" width="100"	headerAlign="center">
							规则代码
						</div>
						<div field="zbmc" width="100" headerAlign="center">
							指标名称
						</div>
						<div field="zbdm"  width="100"	headerAlign="center">
							指标代码
						</div>
						<div field="zbms" width="100" headerAlign="center">
							指标描述
						</div>
						<div name="zt" type="comboboxcolumn" field="zt" width="100" headerAlign="center" >
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
	<script type="text/javascript">
	
		mini.parse();
		var grid = mini.get("grid1");
		var mc = mini.get("mc");
		var zbmc = mini.get("zbmc");
		var zt = mini.get("zt");
		var queryForm = new mini.Form("editForm1");
		grid.load();
		
	function search(){
	 // var data = queryForm.getData(true,false);
	    grid.load({
            	zbmc: zbmc.value,zt:zt.value,mc:mc.value
            });
		 
	}
	
	function reset(){
		queryForm.reset();
	}
	
	function openSelect(btn){
		mini.open({
	            url: "../pages/k4/f10402006/f10402006_select.jsp",
	            title: "请选择规则模板", 
	            width:800,
				height:400,
				ondestroy: function (action) {
				 		if(action=="ok"){
				 			 var iframe = this.getIFrameEl();
				            //获取选中、编辑的结果
				            var data = iframe.contentWindow.GetData();
				            data = mini.clone(data);    //必须。克隆数据
				           if(data){
				           		btn.setValue(data.id);
				           		btn.setText(data.zbmc);
				           }
						}
					 }
	      		  });	
	}
	
		  function add(){
	        mini.open({
	            url: "../pages/k4/f10402006/f10402006_add.jsp",
	            title: "新增规则指标", 
	            width:500,
				height:300,
				onload:function(){
					var iframe = this.getIFrameEl();
					iframe.contentWindow.SetData();	
				},
			        ondestroy:function(action){
					grid.reload();
				}
	        });
	    }
		  
		   function remove1(){
			var rows = grid.getSelecteds();
			if(rows.length > 0){
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
						url: "${pageContext.request.contextPath}/k4/f10402006/deleteRuleTarget.action",
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
		 function selectModel(){
    	var row=grid.getSelected();
    	if(row){
    		CloseWindow("ok");
    	}else{
    		mini.alert("请选择一行");
    	}
    	
    }
    
    function GetData(){
    	return grid.getSelected();
    }
  
		
	</script>
	</body>		
</html>
