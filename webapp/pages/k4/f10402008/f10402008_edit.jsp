<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>修改条件逻辑数据</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="checkBtnEdit.js"></script>
		<script type="text/javascript">
		  	var zsdlb = [
		  		{id : 'Y',
		  		text : '药品'},
		  		{id : 'C',
		  		text : '材料'},
		  		{id : 'F',
		  		text : '服务项目'}
		  		];
		  
			var shjg = [
					  		{id : 1,
					  		text : '人工待审核'},
					  		{id : 2,
					  		text : '人工审核'},
					  		{id : 3,
					  		text : '退回待审核'},
					  		{id : 4,
						  	text : '系统直接扣款'},
						  	{id : 5,
							 text : '系统自动扣款'}
					  		];
			var txfs = [
					  		{id : 1,
					  		text : '事前'},
					  		{id : 2,
					  		text : '事中'},
					  		{id : 3,
					  		text : '事后'}
					  		];
  		</script>
	</head>
	<body>
		<form id="form1" action="" method="post">
		<input id="mxid" name="ybgzmxid" class="mini-hidden" />
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						
						<%--<td class="textR">
							<span style="color: red;">*</span>知识点编码：
						</td>
						<td>

							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="zsdbm" maxLength="100" class="mini-textbox"
											required="true" readonly="readonly"/>

									</div>
								</div>
							</div>
							<input name="aaz320" class="mini-hidden" />
						</td>
						--%>
						<td class="textR">
							<span style="color: red;">*</span>知识点名称：
						</td>
						<td>

							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="zsdmc" maxLength="100" class="mini-textbox"
											required="true" readonly="readonly"/>

									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							<span style="color: red;">*</span>知识点类别：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="zsdlb" class="mini-combobox" emptyText="请选择..."
											data="zsdlb" readonly="readonly" textField="text" valueField="id"
											required="true" />

									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							审核结果：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="shjg" id="shjg" class="mini-combobox" emptyText="请选择..."
											data="shjg" textField="text" valueField="id"
											 />

									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							提醒方式：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="txfs" id="txfs" class="mini-combobox" emptyText="请选择..."
											data="txfs" textField="text" valueField="id"
											 />

									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						
						<td class="textR">
							知识点描述：
						</td>
						<td colspan="3">
							<div style="padding-right: 4px; width:92.5%;margin-bottom:3px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="zsdgzms" name="zsdgzms" class="mini-textarea" style="width: 100%;"
										vtype="maxLength:400" />
								</div>
								<div class="textareaBl">
									<div class="textareaBr">
										<div class="textareaBc">
										</div>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr >
						<td colspan="4" style="padding-top:40px;">
							<div class="listTit">
								<h3 class="cxTit fL">
									<span class="iconCx">条件逻辑</span>
								</h3>
								<div class="fR pT5R9">
									<span class="btnMini"> <em> <input id="edit"
												type="button" value="修改逻辑数据" onclick="editLjsj()" /> </em> </span>
									
								</div>
							</div>
							<div id="datagrid1"
							class="mini-datagrid" style="width: 100%; height: 200px;"
							idField="id" multiSelect="false" allowResize="false" pageSize="20"
							url="${pageContext.request.contextPath}/k4/f10402008/queryLjtjWithPage.action">
							<div property="columns">
								<div type="checkcolumn"></div>
								<%--<div type="indexcolumn"></div>   
								--%>
								<div field="ysgz" width="100" headerAlign="center">
								运算规则
								</div>
								<div field="sjmsnr" width="100" headerAlign="center">
								数据内容
								</div>
							</div>
						</div>
							
						</td>
					</tr>
					<tr>
						<td
							style="text-align: right; padding-top: 20px; padding-right:25px;"
							colspan="4">
							<span class="btnMini"> <em> <input type="button"
										value="提交" onclick="SaveData()" /> </em> </span>
							<span class="btnMini"> <em> <input type="button"
										value="关闭" onclick="closeWin()" /> </em> </span>
						</td>
					</tr>
					
				</table>
			</div>
		</form>
	</body>
</html>
<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("datagrid1");
	var ybgzbm;
	var xgbz;
	var ljdata;
	var form = new mini.Form("form1");
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

	 function SetData(data){
		ybgzbm=data.ybgzbm;
   		data = mini.clone(data);
   		ljdata=data;
     	$.ajax({
     		url:"${pageContext.request.contextPath}/k4/f10402008/loadZsdxx.action",
     		type:"post",
     		data: data,
     		success: function (text){
     			ljdata.xgbz=text.xgbz;
     			grid1.load(ljdata);
     			var data_1 = mini.decode(text);
		        form.setData(data_1);
     		}
     	});
   }
	
    function SaveData() {
    	 var data = form.getData(); 
         form.validate();
         if (form.isValid() == false) {
             return;
         }
        var json = mini.encode(data);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k4/f10402008/updateZsdmx.action",
            type: "post",
            data: {submitData:json},
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
    

   	function editLjsj(){
   		var rows=grid1.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			mini.open({
				url:"../pages/k4/f10402008/f10402008_tjsj.jsp",
				title:"条件逻辑数据",
				 width:650,
				height:412,
				onload:function(){
					var iframe = this.getIFrameEl();
					var data = {yssjnr : row.sjnr,ybgztjljbm:row.ybgztjljbm,sjzdb:row.sjzdb,sjzszd:row.sjzszd,sjtjzd:row.sjtjzd,ybgzbm:ybgzbm,sjzdlx:row.sjzdlx};
					iframe.contentWindow.SetData(data);	
				},
				ondestroy:function(action){
					if(action=='1'){
						ljdata.xgbz=1;
						grid1.load(ljdata);
					}
				}
		    });
		}else{
			mini.alert("请选中一条记录");
		} 
   	}
</script>
