<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
        <title>监控对象维护</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
		var Yxbz = [{ id: 0, text: '启用' }, { id: 1, text: '禁用'}];
	    var Jklx = [ {id : 'YP',text : '药品'}, {id : 'FWXM',text : '服务项目'}, {id : 'CL',text : '材料'}];
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>

	<body style="overflow-x: hidden; overflow-y: hidden;">
	<div id="editForm1" class="cxTabbox">
				<table style="width:100%;" class="cxTab">
						<tr>
						<td style=";width:10%;" class="textR">
							对象ID:
							</td>
							<td style="text-align:left;width:50%;">
							   <div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input  id="dxid" name="dxid" class="mini-buttonedit"
													onbuttonclick="openQueryModel(this);" allowInput="false" />
										</div>
									</div>
							  </div>
							</td>
							<td style="text-align: left; padding-bottom: 5px; padding-right: 10px;" >
							<input type="submit" value="" class="cxsubmit" onclick="search()" />
							<input type="reset" value="" class="cxreset" onclick="reset()" />
				        </td>
						</tr>
					</table>
				</div>
			<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">监控对象维护信息</span>
					</h3>
					<td style="width: 100%;">
					<div class="fR pT5R9">
					<span class="btnMini"><em><input type="button" onClick="add();" value="增加"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="batchAdd();" value="批量增加"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="edit();" value="修改"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="remove1();" value="删除"/></em></span>
			
					 </div>
					</td>
					</div>
				<div id="datagrid1" class="mini-datagrid"
					style="width: 100%; height: 405px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402007/queryDxzbMessage.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div field="dxid"  width="100"	headerAlign="center">
							监控对象
						</div>
						<div field="dxmc" width="100"	headerAlign="center">
							监控对象名称
						</div>
						<div field="dxlx"  width="100"	headerAlign="center">
							对象类型
						</div>
						<div field="mc" width="100" headerAlign="center">
							规则名称
						</div>
						<div field="zbmc" width="100" headerAlign="center">
							指标名称
						</div>
						<div field="zbz" width="100" headerAlign="center">
							指标值
						</div>
						<div field="zbms" width="100" headerAlign="center">
							指标描述
						</div>
						<div field="gzly" width="100" headerAlign="center">
							规则来源
						</div>
						<div field="sm" width="100" headerAlign="center">
							说明
						</div>
						<div field="cs" width="100" headerAlign="center">
							参数
						</div>
						<div field="zt" type="comboboxcolumn" width="100" headerAlign="center">
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
	var grid=mini.get("datagrid1");
    var queryForm = new mini.Form("editForm1");
	
	grid.load();
	 
	function search() {
		var data = queryForm.getData(true,false);
		grid.load(data);
	}
	
	function reset(){
		queryForm.reset();
	}
	
	function openQueryModel(btn){
		mini.open({
	            url: "../pages/k4/f10402007/f10402007_selectTb_rule_dxzb.jsp",
	            title: "查询监控对象信息",
	            width:1000,
				height:425,
				ondestroy: function (action) {
				 		if(action=="ok"){
				 			 var iframe = this.getIFrameEl();
				            //获取选中、编辑的结果
				            var data = iframe.contentWindow.GetData();
				            data = mini.clone(data);    //必须。克隆数据
				           if(data){
				           		btn.setValue(data.dxid);
				           		btn.setText(data.dxid);
				           }
						}
					 }
	      		  });	
	}
	
   function add(){
	        mini.open({
	            url: "../pages/k4/f10402007/f10402007_add.jsp",
	            title: "新增监控对象信息",
	            width:800,
				height:320,
				onload:function(){
					var iframe = this.getIFrameEl();
					iframe.contentWindow.SetData();	
				},
				ondestroy:function(action){
					grid.reload();
				}
	        });
	    }
		
	  function batchAdd(){
	        mini.open({
	            url: "../pages/k4/f10402007/f10402007_batchAdd.jsp",
	            title: "批量新增规则", width: 800, height: 400,
	            width:800,
				height:400,
				ondestroy:function(action){
					grid.reload();
				}
	        });
	    }
	  
	   function edit(){
		var row = grid.getSelected();//确定选中的哪一行
		
		if(row){
			mini.open({
				url:"../pages/k4/f10402007/f10402007_updata.jsp",
				title:"修改监控对象信息",
				width:800,
				height:320,
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
					//alert(id);
					$.ajax({
						url: "${pageContext.request.contextPath}/k4/f10402007/deleteDxzbMessage.action",
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
