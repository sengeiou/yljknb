<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>新增医疗服务机构科室信息</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript">
		   var Shifou = [{id:0,text:'是'},{id:1,text:'否'}];
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
	<body>
	  <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">医疗服务机构信息</span>
					</h3>
					<td style="width: 100%;">
					</td>
					</div>
			<div id="editForm" >
					<table class="cxTab" style="margin-top:5px;">
						<tr>
							<td class="textR">
								医疗服务机构编号：<input id="aaz107"  name="aaz107" class="mini-hidden" />
								<input id="aaz307" name="aaz307" class="mini-hidden" />
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb020"  name="akb020"  class="mini-textbox" readonly="true"/>
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
											<input id="akb021"  name="akb021"  class="mini-textbox" readonly="true"/>
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
											<input id="aaa027"  name="aaa027"  class="mini-textbox" readonly="true" />
										</div>
									</div>
								</div>
							</td>
						</tr>
					</table>
                <div class="listTit">
			 		<h3 class="cxTit fL">
						<span class="iconCx">个人信息</span>
					</h3>
					<div class="fR pT5R9">
					    	<span class="btnMini"><em><input type="button" onClick="Save();" value="保存"/></em></span>
					  </div>
			     </div>
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
						  <td class="textR">
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
								姓名：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac003" name="aac003" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								公民身份证：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aab014" name="aab014" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							</tr>
							<tr>
							 <td class="textR">
								联系电话：
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
								医护人员编号：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz263" name="aaz263" class="mini-textbox" readonly="readonly"/>
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
											<input id="akc049" name="akc049" class="mini-combobox" emptyText="请选择..."  data="${dic['AKC049']}"/>
										</div>
									</div>
								</div>
							</td>
							</tr>
							<tr>
							 <td class="textR">
								专业技术职务：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaf009" name="aaf009"  class="mini-combobox" emptyText="请选择..." data="${dic['AAF009']}" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								是否门诊大病医师：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc052" name="akc052" class="mini-combobox"  emptyText="请选择..."  data="Shifou"/>
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								是否有医保服务资格：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc053" name="akc053" class="mini-combobox" emptyText="请选择..."  data="Shifou" />
										</div>
									</div>
								</div>
							</td>
							</tr>
							<tr>
							 <td class="textR">
								是否多点执业：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc051" name="akc051"  class="mini-combobox" emptyText="请选择..."  data="Shifou"/>
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								第一执业地点：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc057" name="akc057" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								医师资格证编码：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc054" name="akc054" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							</tr>
							<tr>
							 <td class="textR">
								医师执业证编码：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc056" name="akc056" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								药师类别：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc278" name="akc278" class="mini-combobox" emptyText="请选择..."  data="${dic['AKC278']}" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								药师执业类别：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc279" name="akc279" class="mini-combobox" emptyText="请选择..."  data="${dic['AKC279']}"/>
										</div>
									</div>
								</div>
							</td>
							</tr>
							<tr>
							 <td class="textR">
								药师执业范围：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc281" name="akc281" class="mini-combobox" emptyText="请选择..."  data="${dic['AKC281']}"/>
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								执业药师资格证书编号：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc282" name="akc282" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 <td class="textR">
								执业药师注册证编号：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc283" name="akc283" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							</tr>
							 <td class="textR">
								备注：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae013" name="aae013" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							 
							
						</tr>
					</table>
			</div>
<script type="text/javascript">
	var form = new mini.Form("editForm");
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
	
		 $(document).ready(function(){
	     	$.ajax({
	     		url:"${pageContext.request.contextPath}/k5/f10502001/loadHospMessage.action",
	     		type:"post",
	     		data: {},
	     		success: function (text){
	     		    text.aae005="";
	     			var data = mini.decode(text);
			        form.setData(data);
			        
	     		}
	     	});
	 });
	
	
        //方案添加
    function Save() {
    	var form = new mini.Form("editForm");
        var data = form.getData(); 
        form.validate();
        if (form.isValid() == false) {
            return;
        }
        var json = mini.encode(data);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k5/f10502003/saveKf65Message.action",
            type: "post",
            data: { submitData: json },
            success: function (text) {
            	mini.unmask(document.body);
            	if(text.success){
            	 	mini.showMessageBox({
        				title: "提示",
        				message: "成功添加一条记录",
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

</script>
	</body>
</html>
