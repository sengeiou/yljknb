<%@ page contentType="text/html; charset=utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>修改密码</title>
	</head>
<script>
function doChange(){
	var name = form1.name.value;
	var oldpassword = form1.oldpassword.value;
	var password = form1.password.value;
	var repassword = form1.repassword.value;
	if(name==""){
		alert("请输入姓名！");
		return;
	}
	if(oldpassword==""){
		alert("请输入原密码！");
		return;
	}
	if(password==""){
		alert("请输入新密码！");
		return;
	}else if(password.length<6){
		alert("密码长度至少6位");
		return;
	}
	if(password!=repassword){
		alert("两次输入密码不一致！");
		return;
	}
	
	form1.action = "${application.contextRoot}/changepassword.action?changePasswordFlag=0"
	form1.submit();
	
}
function doCancel(){
	window.location = "<s:url value='/workspace/main.action'/>";
}
</script>
<body>
	<form name="form1" action="" method="post" >
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="167" align="center" valign="middle">
        
        
        <s:if test="changePasswordFlag==-1">
        <table width="81%" height="117" border="0" cellpadding="0" cellspacing="0" style="margin-bottom:10px;">
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="75%" align="left" valign="bottom">
            <span class="font_col"><b>修改登录密码</b></span></td>
          </tr>
          <tr>
            <td align="right">姓名：</td>
            <td align="left"><input type="text" name="name" class="input_cp" value="${session['com.wondersgroup.cayth.operator.name']}"/> </td>
          </tr>
          <tr>
            <td align="right">原密码：</td>
            <td align="left"><input type="password" name="oldpassword" class="input_cp" value=""/> </td>
          </tr>
          <tr>
            <td align="right">新密码：</td>
            <td align="left"><input type="password" name="password" class="input_cp" value=""/> （至少6位）</td>
          </tr>
          <tr>
            <td align="right">再次输入新密码：</td>
            <td align="left"><input type="password" name="repassword" class="input_cp" value=""/></td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td align="left">
              <input type="button" name="Submit" value="提 交" class="bt_cp" onclick="doChange()" />&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="reset" name="Submit2" value="取 消" class="bt_cp" onclick="doCancel()"/></td>
          </tr>
		  <tr>
			<td colspan="2" align="center"></td>
		  </tr>
        </table>
        </s:if>
        <s:if test="changePasswordFlag==1">
          <table width="81%" height="117" border="0" cellpadding="0" cellspacing="0" style="margin-bottom:10px;">
          	<tr>
            	<td width="25%">&nbsp;</td>
            	<td width="75%" align="left" valign="bottom">
            	<span class="font_col">密码修改成功, 请记住新密码: </span><font color="red"><s:property value="password"/></font></td>
          </tr>
          </table>
        </s:if>
       </td>
       </tr>
       </table>
	</form>
</body>
</html>