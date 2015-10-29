<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>宁波阳光医保监管平台医疗服务监控系统</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<jsp:include page="/pages/include/nocache.jsp"></jsp:include>
		<link
			href="${pageContext.request.contextPath}/resource/css/style.css"
			rel="stylesheet" type="text/css" />
		<link
			href="${pageContext.request.contextPath}/resource/css/reset.min.css"
			rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/resource/css/frame.css"
			rel="stylesheet" type="text/css" />
		<link
			href="${pageContext.request.contextPath}/resource/miniui/themes/default/miniui.css"
			rel="stylesheet" type="text/css" />
		<link
			href="${pageContext.request.contextPath}/resource/miniui/themes/icons.css"
			rel="stylesheet" type="text/css" />
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/miniui/jquery.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/miniui/miniui.js"></script>
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
	</head>
	<body>
		<!--Layout-->
		<div id="layout1" class="mini-layout"
			style="width: 100%; height: 100%;">
			<div region="north" height="53" style="border:0px;overflow:hidden;" showSplit="false" showHeader="false">
				<div id="topregion">
				
				</div>
			</div>
			<div title="south" region="south" showSplit="false"
				showHeader="false" height="33">
				<div style="line-height: 32px; text-align: center; background:#f0f0f0; cursor: default">
					<div class="adlog">
						<div class="adlay">
							<span class="fL">
							   <em class="ico_welcome">
							                  欢迎登录：<%=session.getAttribute("com.wondersgroup.wssip.operator.name")%>
							   </em>
							</span>
							<a href="javascript:void(changePassword())" class="pwsMod fL">密码修改</a>
							<a href="javascript:void(logoff())" class="exit fL" title="退出">退出</a>
						</div>
					</div>
					技术支持：万达信息 医保控费产品组
				</div>
			</div>
			<div title="center" region="center" bodyStyle="overflow:hidden;"
				style="border: 0;">
				<!--Splitter-->
				<div id="split" class="mini-splitter" style="width: 100%; height: 100%;"
					borderStyle="border:0;">
					<div size="180" maxSize="250" minSize="100"
						showCollapseButton="true" style="border-width: 1px;">
						<div id="leftregion">
							
						</div>
					</div>
					<div showCollapseButton="false" style="border: 0px;">
						<!--Tabs-->
						<div id="mainTabs" class="mini-tabs bg-toolbar" activeIndex="0"
							style="width: 100%; height: 100%;"
							onactivechanged="onTabsActiveChanged">
							<div title="首页" url="../resource/images/welcome_03.jpg">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<script type="text/javascript">
	mini.parse();
	$("#topregion").load("${pageContext.request.contextPath}/workspace/top.action");
	$("#leftregion").load("${pageContext.request.contextPath}/pages/workspace/left.jsp");
	topTab();

	function getLevel2Menu(menuid){
		$("#leftregion").load("${pageContext.request.contextPath}/workspace/left.action?menuId=" + menuid);
	}
	
	function showTab(menuid,url,menuname) {

		var menuId = menuid;
		var contentUrl = url;
		var titleUrl = "${pageContext.request.contextPath}/workspace/title.action?menuId=" + menuid;
		var tabs = mini.get("mainTabs");
		var id = "tab$" + menuid;
		var tab = tabs.getTab(id);
		
		if (!tab) {
			tab = {};
			tab._nodeid = id;
			tab.name = id;
			tab.title = menuname;
			tab.showCloseButton = true;

			//这里拼接了url，实际项目，应该从后台直接获得完整的url地址
			tab.url = "${pageContext.request.contextPath}/pages/workspace/maincontent.jsp?contentUrl="+escape(contentUrl)+"&titleUrl="+escape(titleUrl);
			tabs.addTab(tab);
		}
		tabs.activeTab(tab);
		topTab();
	}
	$('.mini-tab-close').click(function(){
		topTab();
	});
	function topTab(){
		$('.mini-tabs-scrollCt:first').attr('id','topTab');	
	}

	function onTabsActiveChanged(e) {
		var tabs = e.sender;
		var tab = tabs.getActiveTab();
	}
	function expandScreen(){
        
		if(mini.get("split").getPane(1).expanded){
			mini.get("split").collapsePane(1);
			mini.get("layout1").collapseRegion("north");
		}else{
			mini.get("split").expandPane(1);
			mini.get("layout1").expandRegion("north");
		}

		
	}
</script>

	</body>
</html>
