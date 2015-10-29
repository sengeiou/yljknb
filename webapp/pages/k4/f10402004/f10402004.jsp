<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>阈值维护</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		
	</head>
	<body  style="overflow-x: hidden; overflow-y: hidden;">
		<div id="layout1" class="mini-layout"
			style="width: 100%; height: 490px;"
			borderStyle="border:solid 0px #aaa;">
			<div title="查询条件" showHeader="false" region="north" height="35"
				showSplitIcon="true" style="border:0px;">
				<div id="editForm1" class="cxTabbox">
					<form id="form">
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
							<tr>
								<td class="textR">
									监控类型：
								</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input name="aaa153" class="mini-combobox"
													data="${dic['AAA153'] }" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">
									模版名称：
								</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaz320"	allowInput="false" name="aaz320" class="mini-buttonedit"
													onbuttonclick="openQueryModel(this);" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">
									规则编号：
								</td>

								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa168" allowInput="false" name="aaa168" class="mini-buttonedit"
													onbuttonclick="openQueryRule(this);" />
											</div>
										</div>
									</div>
								</td>
								<td style="text-align: center; padding-top: 5px;" colspan="2">
									<input type="button" value="" class="cxsubmit"
										onclick="search();" />
									<input type="button" value="" class="cxreset"
										onclick="resetForm();" />
								</td>
							</tr>
						</table>
					</form>
					<form id="byForm" >
						<input id="aaa153" name="aaa153" class="mini-hidden"/>
						<input id="aaz320" name="aaz320" class="mini-hidden"/>
						<input id="aaa168" name="aaa168" class="mini-hidden"/>
					</form>
				</div>
			</div>
			<div region="south" showSplit="false" style="border:0px;" showHeader="false" height="200"
				showSplitIcon="true">
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">阈值信息</span>
					</h3>
				</div>
				<div id="datagrid3" class="mini-datagrid"
					style="width: 100%; height: 75%;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402004/queryThreshold.action">
					<div property="columns">
						<div field="aaa155" width="100" headerAlign="center"
							type="comboboxcolumn">
							阈值级别
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA155']}">
						</div>
						<div field="ape735" width="100" headerAlign="center">
							阈值权重
						</div>
						<div field="aaa005" width="100" headerAlign="center">
							阈值
						</div>
						<div renderer="rendererGrid3" width="100" headerAlign="center">
							操作
						</div>
					</div>
				</div>
			</div>
			
			<div  showHeader="false" style="border:0px;" region="west" width="300"
				showSplitIcon="true">
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">监控分类汇总信息</span>
					</h3>
				</div>
				<div id="datagrid1" class="mini-datagrid"
					onrowclick="searchRule" style="width: 100%; height: 84%;"
					idField="id" multiSelect="true" allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402004/queryRuleAaa153.action">
					<div property="columns">
						<div field="aaa153" width="100" headerAlign="center"
							type="comboboxcolumn">
							监控类型
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA153']}">
						</div>
						<div field="count" width="100" headerAlign="center">
							规则数量
						</div>
					</div>
				</div>
			</div>

			<div  showHeader="false" showSplit="false" style="border:0px;" region="center"  showCollapseButton="false">
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">规则信息</span>
					</h3>
				</div>
				<div id="datagrid2" class="mini-datagrid"
					onrowclick="searchThreshold" style="width: 100%; height: 84%;"
					idField="id" multiSelect="true" allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402004/queryRuleByAaa153.action">
					<div property="columns">
						<div field="aaa027" width="100" headerAlign="center"
							type="comboboxcolumn">
							统筹区编码
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA027']}">
						</div>
						<div field="aaa168" width="100" headerAlign="center">
							规则编号
						</div>
						<div field="aaa167" width="100" headerAlign="center">
							规则名称
						</div>
						<div field="aaa133" width="100" headerAlign="center">
							规则描述
						</div>
						<div field="aaa154" width="100" headerAlign="center"
							type="comboboxcolumn">
							阈值比较方式
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA154']}">
						</div>
						<div field="aaa105" width="100" headerAlign="center">
							增量方案参数说明
						</div>
						<div field="aae317" width="100" headerAlign="center">
							实现方案参数说明
						</div>
						<div renderer="rendererGrid2" width="100" headerAlign="center">
							操作
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
<script type="text/javascript">
	mini.parse();
	var grid1=mini.get("datagrid1");
	var grid2=mini.get("datagrid2");
	var grid3=mini.get("datagrid3");
	grid1.load();
	var form = new mini.Form("#form");
	var byForm = new mini.Form("#byForm");

	function search(){
		var data = form.getData(true,false);
		grid1.load(data);
		grid2.clearRows(); 
		grid3.clearRows(); 
		byForm.setData(data);
	}
	function resetForm(){
		form.reset();
	}
	
	function searchRule(){
		var row=grid1.getSelected();
    	if(row){
    		var data = byForm.getData(true,false);
    		data.aaa153=row.aaa153;
    		data.aae100="1";
    		grid2.load(data);
    		grid3.clearRows(); 
    		byForm.setData(data);
    	}else{
    		grid2.clearRows(); 
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
	function searchThreshold(){
		var row=grid2.getSelected();
    	if(row){
    		grid3.load(row);
    	}else{
    		grid3.clearRows(); 
    	}
	}
	
	function openQueryModel(btn){
		mini.open({
	            url: "../pages/k4/f10402002/f10402002_queryModel.jsp",
	            title: "请选择规则模板", width: 800, height: 450,
	            width:1000,
				height:450,
				ondestroy: function (action) {
				 		if(action=="ok"){
				 			 var iframe = this.getIFrameEl();
				            //获取选中、编辑的结果
				            var data = iframe.contentWindow.GetData();
				            data = mini.clone(data);    //必须。克隆数据
				           if(data){
				           		btn.setValue(data.aaz320);
				           		btn.setText(data.aaa169);
				           }
						}
					 }
	      		  });	
	}
	
	function openQueryRule(btn){
		mini.open({
	            url: "../pages/k4/f10402004/f10402004_queryRule.jsp",
	            title: "请选择规则模板", width: 800, height: 450,
	            width:1000,
				height:450,
				ondestroy: function (action) {
				 		if(action=="ok"){
				 			 var iframe = this.getIFrameEl();
				            //获取选中、编辑的结果
				            var data = iframe.contentWindow.GetData();
				            data = mini.clone(data);    //必须。克隆数据
				           if(data){
				           		btn.setValue(data.aaa168);
				           		btn.setText(data.aaa168);
				           }
						}
					 }
	      		  });	
	}
	
	function add(){
		var grid2=mini.get("datagrid2");
		var row=grid2.getSelected();
		if(row){
			mini.open({
	            url: "../pages/k4/f10402004/f10402004_addThreshold.jsp",
	            title: "新增阈值", width: 800, height: 450,
	            width:300,
				height:180,
				onload:function(){
					var iframe = this.getIFrameEl();
				    iframe.contentWindow.SetData({aaz319:row.aaz319});
				},
				ondestroy: function (action) {
				 	searchThreshold();
				 }
	      });
		}
			
	}
	
	function rendererGrid2(e){
            return "<a href='###' onclick = 'add();') >添加阈值</a>";
     }
        
    function rendererGrid3(e){
        return "<a href='###' onclick = 'edit();') >修改</a>　　　<a href='###' onclick = 'del();') >删除</a>";
    }
    
    function edit(){
    	var grid2=mini.get("datagrid2");
		var row=grid2.getSelected();
		var grid3=mini.get("datagrid3");
		var row1=grid3.getSelected();
		if(row){
			mini.open({
	            url: "../pages/k4/f10402004/f10402004_editThreshold.jsp",
	            title: "修改阈值", width: 800, height: 450,
	            width:300,
				height:180,
				onload:function(){
					var iframe = this.getIFrameEl();
				    iframe.contentWindow.SetData({aaz319:row.aaz319,aaa155:row1.aaa155});
				},
				ondestroy: function (action) {
				 	searchThreshold();
				 }
	      });
		}
			
    }
    
   function del(){
   		mini.confirm("确定删除选中记录？","确定",function(action){
			if(action=="ok"){
				mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
	   			var row=grid3.getSelected();
	   			if(row){
	   				$.ajax({
							url: "${pageContext.request.contextPath}/k4/f10402004/deleteThreshold.action",
							post:"post",
							data: row,
							success: function (text) {
		                    	mini.unmask(document.body);
					           	if(text.success){
					           	 	mini.showMessageBox({
					       				title: "提示",
					       				message: "删除成功",
					       				buttons: ["确定"],
					       				iconCls: "mini-messagebox-info",
					       				callback: function(action){
					           				closeWin();
					           				searchThreshold();
					        			}});        	  
					           	}else{
					           	  mini.alert(text.msg);
					               }  
		                    },
		                    error: function () {
		                    }
						});
	   			}
			}
   		})
   		  
	}
	
</script>