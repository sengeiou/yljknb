<%@ page contentType="text/html;charset=utf-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@page import="java.security.MessageDigest"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%! private String byteArr2HexStr(byte[] arrB)
{
    int iLen = arrB.length;
    //每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍



    StringBuffer sb = new StringBuffer(iLen * 2);
    for (int i = 0; i < iLen; i++)
    {
        int intTmp = arrB[i];
        //把负数转换为正数
        while (intTmp < 0){
            intTmp = intTmp + 256;
        }
        //小于0F的数需要在前面补0
        if (intTmp < 16){
            sb.append("0");
        }
        sb.append(Integer.toString(intTmp, 16));
    }
    return sb.toString();
} %>
<%
	MessageDigest md = MessageDigest.getInstance("md5");
	md.update(session.getId().getBytes());
	String winName="cayth"+byteArr2HexStr(md.digest());
%>
<html>
	<head>
		<title>上海市医药集中采购平台</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<script LANGUAGE="JavaScript">   
	  function   closewindows()   
	  {   //关闭窗口   
	      window.self.opener=window.self;
		  window.self.close();  
	  }   
	  function   openmainwindows()   
	  {//打开主界面窗口   	  	  
	      var win = window.open('<s:url value="/pages/redirect.jsp"/>','','resizable=1,scrollbars=0,status=1,menubar=no,toolbar=no,location=no, menu=no');   
	  	  win.moveTo(0, 0);
		  win.resizeTo(screen.availWidth,screen.availHeight);	
	  }   
  	</script>
	  	
	<script language="JavaScript">
	<!--
	function CloseWin()
	{	
		if(window.name=='member')
			return;
			
		var ua=navigator.userAgent
		var ie=navigator.appName=="Microsoft Internet Explorer"?true:false
		if(ie){
			var IEversion=parseFloat(ua.substring(ua.indexOf("MSIE ")+5,ua.indexOf(";",ua.indexOf("MSIE "))))
			if(IEversion< 5.5){
				var str = '<object id=noTipClose classid="clsid:ADB880A6-D8FF-11CF-9377-00AA003B7A11">'
				str += '<param name="Command" value="Close"></object>';
				document.body.insertAdjacentHTML("beforeEnd", str);
				document.all.noTipClose.Click();
			}
			else{
				window.opener =null;
				window.close();
			}
		}
		else{
			window.close();
		}
	}
	
	function loadCenter(){
	<%--
		var winName='<%=winName%>';
		if(window.name!=winName&&(window.name==""||(window.name.length>5&&window.name.substr(0,5)!="cayth"))){
			var win=window.open("",winName,'width=600,height=480,scrollbars=yes,status=yes,resizable=no');
			win.moveTo(0, 0);
			win.resizeTo(screen.availWidth,screen.availHeight);	
			wForm.submit();
			CloseWin();	
		}else{
			location.replace('<s:url value="/pages/redirect.jsp"/>');
		}
		--%>
		location.replace('<s:url value="/pages/redirect.jsp"/>');
	}
	//-->
	</script>  	
	</head>

	<body onload="loadCenter();" bgcolor="#FFFFFF" text="#000000">
		<%-- 
		<script LANGUAGE="JavaScript">   
			  openmainwindows();   
			  closewindows();   
 		 </script>
 		 --%>
 		 <form  name="wForm" action='<s:url value="/pages/redirect.jsp"/>' target='<%=winName%>'></form>
	</body>
</html>
