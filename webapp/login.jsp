<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>宁波阳光医保监管平台医疗服务监控系统--用户登录</title>
	<link href="resource/css/login.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 6]>
		<script src="resource/scripts/iepng.js"></script>
	<![endif]-->
	
</head>


<body>
	<script type="text/javascript">
		if(top!=this){
			top.window.location.href="login.jsp";
		}
	</script>

	<form name="loginForm" action="login.action" method="post" style="margin:0">
    <input type="hidden" name="macAddress" value="00-00-00-00-00-00"/>
    <%--<input type="hidden" name="cert" id="cert" value=""/>--%>
	<div id="login">
		<div class="login_page">
			<h1 class="logo"></h1>
			<div class="froms">
		       <dl>
		       	 <dt>用户名：</dt>
		       	 <dd><span class="userIcon"><input type="text" name="loginName" id="loginName" class="textinput" /></span></dd>
		       	 <dt>密&nbsp;&nbsp;&nbsp;&nbsp;码：</dt>
		       	 <dd><span class="pwsIcon"><input type="password" name="password" id="password" class="textinput" /></span></dd>
		       	 <dd>
		       	 	<div class="form_foot">
			              <input type="submit" name="button" id="button" value="登录" class="submitBtn"  />
			              <input type="reset" name="button" id="button" value="重置" class="resetBtn" />
			        </div>
			     </dd>
			     <dd class="pT10"><font color="red">${loginInfo.errorMessage}</font></dd>
		       </dl>
			</div>
			<div class="copyright">建议使用1024*768以上分辩率&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;IE6.0以上浏览器&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;版权所有&nbsp;&nbsp;宁波市城镇医疗保险管理中心</div>
		</div>
	</div>
	</form>
</body>
</html>
