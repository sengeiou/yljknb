<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>规则配置</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>

</head>
<body>

	<div>
		<form id="form1" action="" method="post">
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">规则任务信息</span>
					</h3>
					<div class="fR pT5R9">
						<!-- <span class="bnt"><a class="mini-button" plain="true"
							iconCls="icon-add" onClick="add();">添加</a> </span>
						<span class="bnt"><a class="mini-button" plain="true"
							iconCls="icon-edit" onclick="setPriority()">设置优先级</a> </span>
						<span class="bnt"><a class="mini-button" plain="true"
							iconCls="icon-remove"onclick="remove()">删除</a> </span>
						<span class="bnt"><a class="mini-button" plain="true"
							iconCls="icon-close" onClick="close();">关闭</a> </span> -->
						<span class="btnMini">
							<em>
								<input type="button" value="添加" onclick="add()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="设置优先级" onclick="setPriority()"/>
							</em>
						</span>	
						<span class="btnMini">
							<em>
								<input type="button" value="删除" onclick="remove()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="关闭" onclick="closeWin()"/>
							</em>
						</span>	
					</div>
				</div>
				
				<div id="datagrid1" class="mini-datagrid"
					style="width: 100%; height: 380px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10401002/queryRule.action">
				 <div property="columns">
						<div type="checkcolumn"></div>
						<div field="aaa168" width="100" headerAlign="center">规则编号</div>
						<div field="aaa167" width="100" headerAlign="center">规则名</div>
						<div field="ake070" width="100" headerAlign="center" type="comboboxcolumn" >优先级
						 <input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AKE070']}">   
						</div>
						<div field="aaa153" width="100" headerAlign="center"  type="comboboxcolumn">监控类型 
					 	<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AAA153']}"> 
						</div>
						<div field="aaa133" width="100" headerAlign="center">规则描述</div>
	
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
	 
<script type="text/javascript">
	mini.parse();
		var form = new mini.Form("form1");
		var grid1 = mini.get("datagrid1");
		var aaz325;
		//grid1.load();
   function SetData(data){
      	init(data.aaz325);
   		data = mini.clone(data);
   		aaz325=data.aaz325;
   		//alert(aaz325);
     	$.ajax({
     		url:"${pageContext.request.contextPath}/k4/f10401002/queryRule.action",
     		type:"post",
     		data: {aaz325:data.aaz325},
     		success: function (text){
     			
     			var data = mini.decode(text);
		        form.setData(data);
     		}
     	});
     	
   }	
   
   function init(id){
   		grid1.setUrl(grid1.getUrl()+"?aaz325="+id);
   		//alert(grid1.getUrl());
   		grid1.reload();
   }	
   
    function add( ){
	        mini.open({
	            url: "../pages/k4/f10401002/f10401002_addrule.jsp",
	            title: "新增规则", width: 800, height: 450,
	            width:800,
				height:500,
					ondestroy:function(action){
					if(action=='ok'){
						var iframe = this.getIFrameEl();
						var aaz319=iframe.contentWindow.GetData().id;
						var data={aaz325:aaz325,aaz319:aaz319};
						save(data);
						grid1.reload(data);
						}
					}
	        });
	    }
	    
	   function save(data) {
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k4/f10401002/addRuleTask.action",
            type: "post",
            data: data,
            success: function (text) {
            	mini.unmask(document.body);
            	if(text.success){
            	 	mini.showMessageBox({
        				title: "提示",
        				message: "保存规则信息成功",
        				buttons: ["确定"],
        				iconCls: "mini-messagebox-info",
        				  callback: function(action){
            				grid1.load();
         			} });        	  
            	}else{
            	  mini.alert(text.msg);
                }  
            }
        });
    }
	  
	 function setPriority(){
	      var row=grid1.getSelected();
	 		 if(row){
			  mini.open({
			            url: "../pages/k4/f10401002/f10401002_setPriority.jsp",
			            title: "设置优先级", width: 70, height: 70,
			            width:300,
						height:180,
						onload:function(){
							var iframe = this.getIFrameEl();
							iframe.contentWindow.setData(row);
						},
			       
				ondestroy:function(action){
					grid1.reload();
				}
		    });
		}else{
			mini.alert("请选中一条记录");
		} 
			      
		    	 
	    }
	    
	 function remove(){
			var rows = grid1.getSelecteds();
			if (rows.length > 0){
				if (mini.confirm("确定删除选中记录？")){
					var ids = [];
					for (var i = 0, l = rows.length; i < l; i++){
						var r = rows[i];
	                    ids.push(r.aaz333);
					}
					var id = ids.join(',');
					$.ajax({
						url: "${pageContext.request.contextPath}/k4/f10401002/deleteRule.action",
						post:"post",
						data: {idStr: id},
						success: function (text) {
	                    	grid1.reload();
	                    },
	                    error: function () {
	                    }
					});
				}
			}else{
				mini.alert("请选中一条记录");
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
     
		
</script>