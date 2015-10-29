<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    

<%
	java.text.DateFormat ___df___ =new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String	___dateStr___ = ___df___.format(new java.util.Date());
	
	request.setAttribute("now",___dateStr___); 
%>  	