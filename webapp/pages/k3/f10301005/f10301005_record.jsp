<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核案件调查记录</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<!-- <h3 class="cxTit pTb8"><span class="iconCx">调查记录列表</span></h3> -->
			<div style="margin: 10px;">
				<div class="mainlistCon">
					<div id="grid1" class="mini-datagrid" idField="id" multiSelect="true"
					 	style="width: 100%; height:350px;" allowResize="true"
					 	url="${pageContext.request.contextPath}/common/querySurveyRecord.action">
					 
						 <div property="columns">
							 	<div type="indexcolumn"></div> --
							 	<div field="optera" width="100" headerAlign="center" renderer="rendererGrid1">操作</div>
							 	<div field="aaz148" width="100" headerAlign="center">稽核调查记录事件ID</div>
							 	<div field="aaz010" width="100" headerAlign="center">被调查人ID</div>
							 	<div field="apa709" width="100" headerAlign="center" type="comboboxcolumn">
							 		被调查人类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA709']}">
							 	</div>
							 	<div field="ape128" width="100" headerAlign="center">被调查人姓名</div>
							 	<div field="apa706" width="100" headerAlign="center" type="comboboxcolumn">
							 		调查取证方式<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA706']}">
							 	</div>
							 	<div field="ape718" width="100" headerAlign="center">调查人</div>
							 	<div field="ape722s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">调查日期</div>
							 	<div field="ape721" width="100" headerAlign="center">调查结果</div>
							 	<%-- <div field="apa702" width="100" headerAlign="center" type="comboboxcolumn">
							 		是否发单通知<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA702']}">
							 	</div> --%>
							 	<div field="ape715" width="100" headerAlign="center">要求准备材料</div>
							 	<div field="ape023" width="100" headerAlign="center">材料说明</div>
						 </div>
					</div>
				</div>
			</div>
			<div style="text-align:right;margin:10px;" class="mainlistCon">
				<span class="btnMini">
					<em>
						<input type="button" value="返回" onclick="closeWin()" id="b_btn" name="b_btn"/>
					</em>
				</span>
			</div>
		</fieldset>
		
		<script type="text/javascript">
			mini.parse();
			
			var grid = mini.get("grid1");
			
			//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			grid.load({aaz077:data.aaz077,aaz318:data.aaz318});
     		}
     		
     		//grid操作
     		function rendererGrid1(e){
     			var grid = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	var s = "<a href='###' onclick = searchSurveyRecordInfo('" + record.aaz148 + "') >记录详情</a> ";
            	return s;
     		}
     		
     		function searchSurveyRecordInfo(aaz148){
				 mini.open({
                	url: "${pageContext.request.contextPath}/pages/k3/f10301004/f10301004_surveyRecordInfo.jsp",
                	title: "调查记录详情", 
                	width: 800, 
                	height: 400,
                	onload: function () {
                    	var iframe = this.getIFrameEl();
                    	var data = {aaz148 : aaz148};
                    	iframe.contentWindow.setData(data);
                	},
                	ondestroy: function (action) {
                	}
            	});
			}
			
			function closeWin() {
				CloseWindow();
			}
		
			function CloseWindow(action) {
				if (window.CloseOwnerWindow) {
					window.CloseOwnerWindow(action);
				} else {
					window.close();
				}
			}
		</script>
	</body>
</html>