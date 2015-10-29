<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>申诉审核</title>
<%@ include file="./pages/pub/pubsource.jsp"%>
<%

String userid=request.getParameter("userid");
String loginname=request.getParameter("loginname");
String realname=request.getParameter("realname");
String orgid=request.getParameter("orgid");
String orgname=request.getParameter("orgname");
String xzqhid=request.getParameter("xzqhid");
String check=request.getParameter("check");
String type=request.getParameter("type");
String dwybh=request.getParameter("dwybh");
String dwdm=request.getParameter("dwdm");
%>

</head>
<body>
	<script type="text/javascript">
		var loginname='<%=loginname%>';
		var userid='<%=userid%>';
		var realname='<%=realname%>';
		var orgid='<%=orgid%>';
		var orgname='<%=orgname%>';
		var xzqhid='<%=xzqhid%>';
		var check='<%=check%>';
		var type='<%=type%>';
		var dwybh='<%=dwybh%>';
		var dwdm='<%=dwdm%>';
		loginByAjax();
		function loginByAjax() {
			$
					.ajax({
						url : "loginByAjax.action",
						type : "post",
						data : {
							loginname : loginname,
							userid : userid,
							realname : realname,
							orgid : orgid,
							orgname : orgname,
							xzqhid : xzqhid,
							check : check,
							type : type,
							dwybh : dwybh,
							dwdm : dwdm
						},
						success : function(text) {
							if (text=='success') {
							} else {
							}
						}
					});
		}

	</script>
</body>
</html>
