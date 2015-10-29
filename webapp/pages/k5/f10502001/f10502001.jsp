<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医疗服务机构信息维护</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript">
		  	var ShZt = [{ id: 0, text: '待审核' }, { id: 1, text: '审核通过'}, { id: 1, text: '审核不通过'}];
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
	<body>
	
	      <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">医疗服务机构基本信息</span>
					</h3>
					<td style="width: 100%;">
					   <div class="fR pT5R9">
					     <span class="btnMini"><em><input type="button" onClick="SaveData();" value="保存"/></em></span>
                         <span class="btnMini"><em><input type="button" onClick="selectHistory();" value="维护记录查看"/></em></span>
					  </div>
					</td>
					</div>
				<form id="form" action="post">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						
						<tr>
							<td class="textR">
								医疗机构编码：<input id="aaz107"  name="aaz107" class="mini-hidden" />
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb020"  name="akb020" class="mini-textbox"  readonly="true"/>
										</div>
									</div>
								</div>
							</td>
		                   <td class="textR">
								医疗机构名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb021"  name="akb021"  class="mini-textbox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								统筹区编号：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa027"  name="aaa027" class="mini-textbox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
		                   <td class="textR">
								医疗机构类型：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb022"  name="akb022" emptyText="请选择..."  class="mini-combobox" readonly="true" 
											    valueField="id"  textField="text" data="${dic['AKB022']}"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">
								所有制形式：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aab112" name="aab112" emptyText="请选择..."  class="mini-combobox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
		                   <td class="textR">
								医院等级：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aka101" name="aka101" emptyText="请选择..."  class="mini-combobox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								机构医保评级：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb012" name="akb012" emptyText="请选择..."  class="mini-combobox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
		                   <td class="textR">
								医疗机构类别：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb023" name="akb023" emptyText="请选择..."  class="mini-combobox" readonly="true"
											  valueField="id"  textField="text" data="${dic['AKB023']}" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">
								机构执业范围：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb102" name="akb102" emptyText="请选择..."  class="mini-combobox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
		                   <td class="textR">
								执业许可证：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb026" name="akb026"  class="mini-textbox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								是否联网结算：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb011" name="akb011" emptyText="请选择..."  class="mini-combobox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
		                   <td class="textR">
								是否分院：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb100" name="akb100" emptyText="请选择..."  class="mini-combobox"  readonly="true"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">
								上级机构编号：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb101" name="akb101" class="mini-textbox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
		                   <td class="textR">
								法人姓名：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aab013" name="aab013" class="mini-textbox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								开始日期：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae030" name="aae030" class="mini-textbox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
		                   <td class="textR">
								终止日期：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae031" name="aae031" class="mini-textbox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
						</tr>
					</table>
        <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">可维护信息</span>
					</h3>
					</div>
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
						   <td class="textR">
								机构负责人：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aab304" name="aab304" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								分管医保负责人：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aab062" name="aab062" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								医保联系人：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae004" name="aae004" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								床位数量：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akf015" name="akf015" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
						   <td class="textR">
								医疗机构地址：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae006" name="aae006" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								电话：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae005" name="aae005" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								邮政编码：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae007" name="aae007"  class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						</tr>
					</table>
				</form>
<script type="text/javascript">
	mini.parse();
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
	
	var form = new mini.Form("form");
	 $(document).ready(function(){
	     	$.ajax({
	     		url:"${pageContext.request.contextPath}/k5/f10502001/loadHospMessage.action",
	     		type:"post",
	     		data: {},
	     		success: function (text){
		     		if(text.aae030==0){
						text.aae030="";
		     		}
		     		if(text.aae031==0){
						text.aae031="";
		     		}
	     			var data = mini.decode(text);
			        form.setData(data);
			        
	     		}
	     	});
	 });
	
	

        //方案修改后保存
	    function SaveData() {
	    	var form = new mini.Form("form");
	        var data = form.getData(); 
	        form.validate();
	        if (form.isValid() == false) {
	            return;
	        }
	        var json = mini.encode(data);
	       // alert(json);
	        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
	        $.ajax({
	            url: "${pageContext.request.contextPath}/k5/f10502001/saveHospMessage.action ",
	            type: "post",
	            data: { submitData: json },
	            success: function (text) {
	            	mini.unmask(document.body);
	            	if(text.success){
	            	 	mini.showMessageBox({
	        				title: "提示",
	        				message: "成功修改一条记录",
	        				buttons: ["确定"],
	        				iconCls: "mini-messagebox-info",
	        				callback: function(action){
	            				closeWin();
	         			}});        	  
	            	}else{
	            	  mini.alert(text.msg);
	                }  
	            }
	        });
	    }
	    
	     function selectHistory(){
	        mini.open({
	            url: "../pages/k5/f10502001/f10502001_selectHistoryMessage.jsp",
	            title: "维护记录查看", 
	            width:800,
				height:455,
				onload:function(){
					var iframe = this.getIFrameEl();
					iframe.contentWindow.SetData();	
				}
	        });
	    }
</script>
	</body>
</html>
