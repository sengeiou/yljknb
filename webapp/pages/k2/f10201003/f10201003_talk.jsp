<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>信息交互</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<style type="text/css">
body {
	margin: 0;
	padding: 0;
	border: 0;
	width: 100%;
	height: 100%;
	overflow: hidden;
}
</style>
	<body>
		<div id="layout1" class="mini-layout infoMutual"
			style="width: 100%; height: 100%;"
			borderStyle="border:0;">

			<div region="south" showHeader="false" showSplit="true" height="80">
				<div style="text-align: center; margin: 10px;">
					<form id="form1" action="#">
						<table cellpadding="0" cellspacing="0" border="0" width="100%">
							<tr>
								<td width="80%">
									<div style="padding-right:4px;">
									   <div class="textareaTl"><div class="textareaTr"><div class="textareaTc"></div></div></div>
									   <div class="textareaLay">
										   <textarea id="baz035" name="baz035" class="mini-textarea"
												emptyText="输入要发送的信息" required="true"></textarea>
										   <input id="baz003" name="baz003" class="mini-hidden" required="true"/>
									   </div>
									   <div class="textareaBl"><div class="textareaBr"><div class="textareaBc"></div></div></div>
									   </div>
									
								</td>
								<td nowrap="nowrap" style="padding: 5px;">
									<span class="btnMini"><em><input type="button" onclick="sendMsg()" value="发送" /></em></span>
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>

			<div title="center" region="center">
			   <div id="talk">
			   </div>
			</div>
		</div>
		<script type="text/javascript">
	mini.parse();
	var form = new mini.Form("form1");
	function setData(data) {
		data = mini.clone(data);
		mini.get("baz003").setValue(data.baz003);
		$.ajax({
            url: "${pageContext.request.contextPath}/k2/f10201003/queryMedInteractiveInfo.action",
            type: "post",
            data: { baz003: data.baz003 },
            success: function (text) {
            	if(text.success){
                	var htmlStr = "";
                	for(var i=0;i<text.result[0].talkList.length;i++){
                		htmlStr += "<div class='ask'>";
                		htmlStr += "<span>[";
                		htmlStr += text.result[0].talkList[i].baz038 + "(";
                		htmlStr += text.result[0].talkList[i].baz039 + ")]：";                		
                		htmlStr += text.result[0].talkList[i].baz035;
                		htmlStr += "</span>";
                		htmlStr += "</div>";
                    }
            		$("#talk").append(htmlStr);
            	}else{
                	mini.alert(text.msg);
                }  
            }
        });
	}
	function sendMsg(){

    	var data = form.getData(); 
        form.validate();
        if (form.isValid() == false) {
            return;
        }
        var json = mini.encode(data);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k2/f10201003/medInteractive.action",
            type: "post",
            data: { submitData: json },
            success: function (text) {
            	mini.unmask(document.body);
            	if(text.success){
            		var htmlStr = "";
                	for(var i=0;i<text.result.length;i++){
                		htmlStr += "<div class='answer'>";
                		htmlStr += "<span>[";
                		htmlStr += text.result[i].baz038 + "(";
                		htmlStr += text.result[i].baz039 + ")]："; 
                		htmlStr += text.result[i].baz035;
                		htmlStr += "</span>";                		
                		htmlStr += "</div>";
                    }
            		$("#talk").append(htmlStr);	  
            		mini.get("baz035").setValue('');      	  
            	}else{
            	    mini.alert(text.msg);
                }  
            }
        });
	}
</script>
	</body>
</html>
