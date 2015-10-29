<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>上海市医药集中采购平台</title>
		<SCRIPT>
    <!--
	function selectLevel2Menu(level2MenuId){
		window.frames["leftFrame"].location="<s:url value='/workspace/left.action'/>?menuId=" + level2MenuId;
	}
	function selectLevel4Menu1(level4MenuId,url){
		window.frames["titleFrame"].location="<s:url value='/workspace/title.action'/>?menuId=" + level4MenuId;
		if(url.length>0){
			if(url.indexOf('?')>0)
				window.frames["mainFrame"].location=url+"&menuId="+level4MenuId;
			else
				window.frames["mainFrame"].location=url+"?menuId="+level4MenuId;
		}else{
			window.frames["mainFrame"].location="<s:url value='/workspace/main.action'/>";
		}
	}
	function selectLevel4Menu(level4MenuId,url,name){	
		var titleUrl="<s:url value='/workspace/title.action'/>?menuId=" + level4MenuId; 		
		if(url.length>0){
			if(url.indexOf('?')>0)
				url=url+"&menuId="+level4MenuId;
			else
				url=url+"?menuId="+level4MenuId;		  

			window.frames["mainFrame"].addTab(level4MenuId,url,name,titleUrl);
		}else{
			alert("该功能尚未实现!");
		}
	}		
	var openlogoff=true;
	window.onunload=function(){
		if(openlogoff){
			var win=window.open('<s:url value="/logout.action"></s:url>');
			win.moveTo(0, 0);
			win.resizeTo(screen.availWidth,screen.availHeight);	
			win.focus();
		}
	}
	-->
</SCRIPT>
	</head>
	
<frameset rows="85,*,38" frameborder="no" border="0" framespacing="0">
  <frame src="<s:url value='/workspace/top.action'/>" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" title="topFrame" />
  <frameset rows="*" cols="200,*" framespacing="0" frameborder="no" border="0" id="fr">
    <frame src="<s:url value='/pages/workspace/left.jsp'/>" name="leftFrame" scrolling="no" noresize="noresize" id="leftFrame" title="leftFrame" />
    <frame src="<s:url value='/pages/workspace/tabs.jsp'/>" name="mainFrame" scrolling="no" id="mainFrame" title="mainFrame" />
  </frameset>
  <frame src="<s:url value='/pages/workspace/bottom.jsp'/>">
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>
