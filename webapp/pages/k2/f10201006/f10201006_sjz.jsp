<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>时间轴</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/jquery.widget.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/jquery.mCustomScrollbar.min.js"></script>
<link
	href="${pageContext.request.contextPath}/resource/css/jquery.mCustomScrollbar.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/resource/css/ui.icon.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath}/resource/css/ui.widget.css"
	rel="stylesheet" type="text/css" />
</head>
<style>
.warp {
	width: 960px;
	background-color: #edf3f3;
	margin-left: auto;
	margin-right: auto;
	overflow: hidden;
}

.top_box3 {
	height: 180px;
	width: 940px;
	margin-left: auto;
	margin-right: auto;
	padding-top: 10px;
}

.bottom_box {
	width: 940px;
	margin-left: auto;
	margin-right: auto;
	padding-top: 10px;
	height: 540px;
}

.zhaopian {
	width: 150px;
	height: 171px;
	float: left;
	display: inline;
	margin-left: 10px;
}

.top_center {
	width: 380px;
	float: left;
	display: inline;
	margin-left: 30px;
}

.top_name {
	line-height: 35px;
	color: #4584c8;
	border-bottom: 2px solid #bfbfbf;
	font-weight: bold;
}

.top_name_fontsize {
	font-size: 24px !important;
	font-weight: bold;
	font-family: "微软雅黑";
}

.top_jj {
	line-height: 25px;
	overflow: hidden;
	margin-top: 5px;
}

.top_list {
	overflow: hidden;
	margin-top: 5px;
}

.top_list ul li.ll {
	width: 80px;
	overflow: hidden;
}

.top_list ul li.lr {
	width: 280px;
	overflow: hidden;
}

.top_list ul li {
	font-size: 12px;
	line-height: 25px;
	float: left;
	display: inline;
}

.top_right {
	width: 320px;
	float: left;
	display: inline;
	margin-left: 50px;
	font-size: 14px;
	color: #34466d;
}

.top_right ul li {
	height: 38px;
	overflow: hidden;
	line-height: 38px;
	font-size: 14px;
	color: #34466d;
}

.top_right ul li.h50 {
	height: 75px;
	overflow: hidden;
	line-height: 30px;
	padding-top: 10px;
	font-size: 14px;
	color: #34466d;
}

.f24 {
	font-size: 28px !important;
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
	color: #ffad1f;
}

.f20 {
	font-size: 20px !important;
	font-weight: bold;
	color: #4584bf;
}

.box_nei_top {
	width: 875px;
	height: 35px;
	line-height: 35px;
	padding-left: 25px;
}

.chartTitle1 {
	height: 50px;
	width: 440px;
	text-align: center;
}

.chartTitle2 {
	height: 50px;
	width: 440px;
	text-align: center;
}

.chartTitle3 {
	height: 35px;
	text-align: center;
}

.chartTitle4 {
	height: 35px;
	text-align: center;
}

.kuang {
	width: 100%;
	overflow: hidden;
	min-height: 100px;
}

.mini-splitter-pane {
	overflow: auto;
}
</style>
<body style="background-color:#F3F3F3 ;">
	<div class="mainlistCon">
		<div title="就诊时间轴">
			<div id='yishisjz' style=" margin-left:20px; "></div>
		</div>
	</div>
	<script type="text/javascript">
		mini.parse();

		function SetData(data) {
			valuechanged1(data.baz001);
		}

		//tab页1的js查询
		function valuechanged1(baz001) {
			var yishisjz = document.getElementById('yishisjz');
			$
					.ajax({
						url : "${pageContext.request.contextPath}/k2/f10201006/getChartSZJ.action",
						type : "post",
						data : {
							baz001 : baz001
						},
						success : function(text) {
							bulidTimeTxtBox(yishisjz, text.sjz, 600, 350);
						}
					});
		}
		function filedownload(fileurl) {
			var url = "${pageContext.request.contextPath}" + fileurl;
			$
					.ajax({
						url :url,
						success : function() {
							location.href=url;
						},
						error : function(e) {
							if (e.status == 404)
								alert('文件不存在');
						}
					});
		}
	</script>
</body>
</html>
