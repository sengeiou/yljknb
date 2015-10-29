<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;

	background-color: #D7D7D7;
	
}
-->
</style>
<link href="../resource/css/style.css" rel="stylesheet" type="text/css" />
<script>

function fr(){
	var f = parent.document.getElementById("fr").cols;
	
	if(f=="198,9,*"){ parent.document.getElementById("fr").cols = "0,9,*";
		document.getElementById("di").innerHTML="<img src=../resource/images/ljt.jpg title='显示菜单' style='margin:200px 1px 0 1px'>"
	}else{
		parent.document.getElementById("fr").cols = "198,9,*";
		document.getElementById("di").innerHTML="<img src=../resource/images/rjt.jpg title='隐藏菜单' style='margin:200px 1px 0 1px'>"
	}
	
}
function onLoad(){
	document.getElementById("di").focus();
}
</script>
</head>

<body onLoad="onLoad()" >
<table width="9" height="100%" border="0" cellpadding="0" cellspacing="0">
   <tr>
    <td width="9" align="left" style="cursor:pointer;" title="隐藏/显示菜单" onClick="fr()"><div id="di" style="display: ;"><img src=
	"../resource/images/rjt.jpg" width="7" height="74" border="0" style="margin:200px 1px 0 1px;" /></div></td>
  </tr>
</table>
</body>
</html>
