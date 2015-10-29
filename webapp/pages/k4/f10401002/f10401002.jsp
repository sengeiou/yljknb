<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>调度计划管理</title>
		 <%@ include file="../../../pages/pub/pubsource.jsp"%>
		 
		</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
		
			<div>
				<div id="editForm1"  class="cxTabbox">
					<form id="form" action="#">
						<table  class="cxTab" cellpadding="0" cellspacing="0" border="0">
							<tr>
							    <td class="textR">
									计划名称：
								</td>
								<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa201" name="aaa201" class="mini-textbox"  />
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
												<input id="aae100" name="aae100" class="mini-combobox"
													emptyText="选择标志状态..." data="${dic['AAE100'] }" />
											</div>
									</div>
								</div>
								</td>
								<td style="text-align: center; padding-top: 2px;" colspan="2">
								<input type="button" value="" class="cxsubmit" onclick="search();"/>
								<input type="button" value="" class="cxreset" onclick="resets();" />
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
	
			 
				<div class="listTit"  style="padding-top: 2px;">
					<h3 class="cxTit fL">
						<span class="iconCx">调度计划信息</span>
					</h3>
					<div class="fR pT5R9">
						 
						<span class="btnMini">
							<em>
								<input type="button" value="添加" onclick="add()"/>
							</em>
						</span> 
						<span class="btnMini">
							<em>
								<input id="editBtn"  type="button" value="修改" onclick="edit()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input  id="editBtn1"  type="button" value="规则配置" onclick="checkManage(3)"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input id="editBtn2"  type="button" value="分析配置" onclick="checkManage(2)"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input id="typeBtn" type="button" value="启动" onclick="enableDispatch()"/>
							</em>
						</span>
					</div>
				</div>
				
					<div id="datagrid1" class="mini-datagrid" onrowclick="changeBtnText"
						style="width: 100%; height: 410px;" idField="id" multiSelect="true"
						allowResize="false" pageSize="20"
						url="${pageContext.request.contextPath}/k4/f10401002/queryDispatchManage.action">
						<div property="columns">
							<div type="checkcolumn"></div>
							<div field="aaa201" width="100" headerAlign="center">
								计划名称
							</div>
							<div field="aaa170" width="100" headerAlign="center">
								执行表达式
							</div>
							<div field="aaa152"  width="100"	headerAlign="center">
								参数列表
							</div>
							<div field="aae011" width="100" headerAlign="center">
								经办人
							</div>
							<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd"">
								经办时间
							</div>
							<div field="aae100" width="100" headerAlign="center" type="comboboxcolumn">
								有效标志
								<input property="editor" class="mini-combobox" style="width: 100%"
								data="${dic['AAE100']}">
							</div>
						</div>
					</div>
			
		
	</body>
<script type="text/javascript">
		mini.parse();
		var grid1 = mini.get("datagrid1");
		var queryForm = new mini.Form("editForm1");
		grid1.sortBy("aae100", "asc");
		grid1.load();
		var form = new mini.Form("#form");
		
		grid1.on("drawcell", function (e) {
        var record = e.record,
        column = e.column,
        field = e.field,
        value = e.value;

        //无效方案,红色标识
        if (field == "aae100" && value == '0') {
            e.rowStyle = "color:red";
        }

    });
    
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
    
	function search(){
		var data = form.getData(true,false);
		grid1.load(data); 
		
	}
		  function resets(){
   			form.reset();
   		}
		
		 function add(){
	        mini.open({
	            url: "../pages/k4/f10401002/f10401002_add.jsp",
	            title: "新增调度计划信息", width: 500, height: 250,
	            width:550,
				height:240,
				onload:function(){
					var iframe = this.getIFrameEl();
					iframe.contentWindow.SetData();	
				},
				ondestroy:function(action){
					search();	
				}
	        });
	         
	    }
	
	function edit(){
		var row = grid1.getSelected();//确定选中的哪一行
		if(row){
			mini.open({
				url:"../pages/k4/f10401002/f10401002_edit.jsp",
				title:"修改调度计划信息",
				width:550,
				height:240,
				onload:function(){
					var iframe = this.getIFrameEl();
					var data = {aaz325 : row.aaz325};
					iframe.contentWindow.SetData(data);	
				},
				ondestroy:function(action){
					search();
				}
		    });
		}else{
			mini.alert("请选中一条记录");
		} 
	}
	
	function checkManage(type){
	  var rows = grid1.getSelecteds();//确定选中的哪一行
	       var data;
		if(rows.length==1){
			var row=rows[0];
			data={aaz325:row.aaz325,type:type};
			$.ajax({
            url: "${pageContext.request.contextPath}/k4/f10401002/checkTask.action",
            type: "post",
            data: data,
            success: function (text) {
            	mini.unmask(document.body);
            	if(text.success){
            	 	if(type=='3'){
            	 		ruleTask();
            	 	}
            	 	if(type=='2'){
            	 		analyzeTask();
            	 	}
            	 	
            	}else{
            	  mini.alert(text.msg);
                }  
            }
        });
     	}else{
     		mini.alert("请选择一行");
     	}
	}
	
	function ruleTask(){
	       var row = grid1.getSelected();//确定选中的哪一行
	       //alert(row.aaz325)
		if(row){
			mini.open({
				url:"../pages/k4/f10401002/f10401002_ruleconfig.jsp",
				title:"任务配置",
				width:800,
				height:450,
				onload:function(){
					var iframe = this.getIFrameEl();
					var data = {aaz325 : row.aaz325};
					iframe.contentWindow.SetData(data);	
				},
				ondestroy:function(action){
					grid1.reload();
				}
		    });
		}else{
			mini.alert("请选中一条记录");
		} 
	}
	
	function analyzeTask(){
	       var row = grid1.getSelected();//确定选中的哪一行
	       //alert(row.aaz325)
		if(row){
			mini.open({
				url:"../pages/k4/f10401002/f10401002_analyzeconfig.jsp",
				title:"任务配置",
				width:800,
				height:450,
				onload:function(){
					var iframe = this.getIFrameEl();
					var data = {aaz325 : row.aaz325};
					iframe.contentWindow.SetData(data);	
				},
				ondestroy:function(action){
					grid1.reload();
				}
		    });
		}else{
			mini.alert("请选中一条记录");
		} 
	}
	
	
	
/* 	function enableDispatch(){
		var row = grid1.getSelected();
		if("1"==row.aae100){
				if(row){
				$.ajax({
	     		url:"${pageContext.request.contextPath}/k4/f10401002/startDispatchManage.action",
	     		data: { aaz325: row.aaz325,aae100: 1},
	     		type:"post",
	     		success: function (text){
	     			mini.showMessageBox({
	        				title: "提示",
	        				message: "禁用成功",
	        				buttons: ["确定"],
	        				iconCls: "mini-messagebox-info"
	        			});  
	        		   grid1.load();
	     		}
	     	});
			}else{
				alert("请选中一条记录");
			}
		}else{
		
			if(row){
				$.ajax({
	     		url:"${pageContext.request.contextPath}/k4/f10401002/startDispatchManage.action",
	     		data: { aaz325: row.aaz325,aae100: 0},
	     		type:"post",
	     		success: function (text){
	     			mini.showMessageBox({
	        				title: "提示",
	        				message: "启用成功",
	        				buttons: ["确定"],
	        				iconCls: "mini-messagebox-info"
	        			});  
	        		   grid1.load();
	     		}
	     	});
			}else{
				alert("请选中一条记录");
				}
		}	
	}
	
	function changeText(e){
	   var row = e.row;
	   var t = document.getElementById("btn");
	   
	   if("0"==row.aae100){
	   		var t1 = document.getElementById("editBtn1");
			var t2 = document.getElementById("editBtn2");
			var t3 = document.getElementById("editBtn3");
		
            t.value="启用";
            t1.disabled=true;
            t2.disabled=true;
            t3.disabled=true;
            
	   }else{
	   		 
	   		t.value="禁用";
	   		var t1 = document.getElementById("editBtn1");
			var t2 = document.getElementById("editBtn2");
			var t3 = document.getElementById("editBtn3");
		
            t1.disabled=false;
            t2.disabled=false;
            t3.disabled=false;
	   }  
	}
	 
	  */
	  function enableDispatch(){
		var rows = grid1.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			var type;
			if(row.aae100=='1'){
				type=1;
			}else{
				type=0;
			}
			var data={ aaz325: row.aaz325,aae100:type};
			$.ajax({
            url: "${pageContext.request.contextPath}/k4/f10401002/startDispatchManage.action",
            type: "post",
            data: data,
            success: function (text) {
            	mini.unmask(document.body);
            	if(text.success){
            	 	mini.showMessageBox({
        				title: "提示",
        				message: getMsg(row),
        				buttons: ["确定"],
        				iconCls: "mini-messagebox-info",
        				callback: function(action){
            				closeWin();
            				grid1.reload();
         				}
         			});
            	}else{
            	  mini.alert(text.msg);
                }  
            }
        });
		}else{
			mini.alert("请选中一条记录");
		}
	}
	
	function getMsg(row){
		var msg;
		if(row.aae100=='1'){
			msg="禁用成功";
		}else{
			msg="启用成功";
		}
		return msg;
	}
	
	function changeBtnText(){
		var row=grid1.getSelected();
		var dom1=document.getElementById("typeBtn");
		if(row.aae100=='1'){
			 
			dom1.value="禁用";
			var dom2=document.getElementById("editBtn");
			var dom3=document.getElementById("editBtn1");
			var dom4=document.getElementById("editBtn2");
			dom2.disabled=false;
			dom3.disabled=false;
			dom4.disabled=false;
		}else{
			/* mini.get("editBtn").setEnabled(false);
			mini.get("typeBtn").setText('启用'); */
			dom1.value="启用";
			
			var dom2=document.getElementById("editBtn");
			var dom3=document.getElementById("editBtn1");
			var dom4=document.getElementById("editBtn2");
			dom2.disabled=true;
			dom3.disabled=true;
			dom4.disabled=true;
			
			
		}
	}
	 
</script>
</html>
