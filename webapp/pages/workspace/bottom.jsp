<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<link href='<c:url value="/resource/css/reset.min.css"/>' rel="stylesheet" type="text/css" />
		<link href='<c:url value="/resource/css/frame.css"/>' rel="stylesheet" type="text/css" />
		<title>底部</title>
	</head>

	<body>
		<div class="bgc_bottom">
			<div class="adlog">
				<div class="adlay">
					<span class="fL HlineR">
					   <em class="ico_welcome">
					                  欢迎登录：<%=session.getAttribute("com.wondersgroup.wssip.operator.name")%>
					   </em>
					</span>
					<a href="javascript:void(changePassword())" class="pwsMod fL">密码修改</a>
					<a href="javascript:void(logoff())" class="exit fL" title="退出"></a>
				</div>
			</div>
			版权所有&nbsp;&nbsp;&nbsp;万达信息股份有限公司&nbsp;&nbsp;&nbsp;技术支持：医保控费产品组
		</div>
	</body>
</html>

