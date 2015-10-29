<%@ page contentType="text/html; charset=utf-8"%>
<%@page import="com.wondersgroup.wssip.application.SessionConstants"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<script>
		<%if(session.getAttribute(SessionConstants.WSSIP_OPERATOR_ID)==null){%>
			window.close();
		<%}else{
			//request.getRequestDispatcher("/pages/index_fullscreen.jsp").forward(request,response);
			request.getRequestDispatcher("/pages/mini.jsp").forward(request,response);
		}%>
	</script>
</head>
</html>