<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="cw" uri="/widget-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<cw:base />
		<title>密码修改</title>
	</head>
	
	<style type="text/css">
		body {
			margin-top: 25px;

		}
	</style>
	<script type="text/javascript" src="<s:url value='/resource/scripts/gridUtils.js'/>"></script>
		<script type="text/javascript" src="<s:url value='/resource/scripts/formUtils.js'/>"></script>
		<script type="text/javascript" src="<s:url value='/resource/scripts/utils.js'/>"></script>
		<script type="text/javascript" src="<s:url value='/resource/scripts/date.js'/>"></script>
		<script type="text/javascript" src="<s:url value='/resource/scripts/windowUtils.js'/>"></script>
	<script type="text/javascript">
	function subAjInfo(){
		var newpassword =Ext.getCmp('newpassword').getValue();
		var querenpassword =Ext.getCmp('querenpassword').getValue();
		if(newpassword!=querenpassword){
 			Ext.MessageBox.alert('提示', ' 输入新密码与确认密码不符');
 			return false;
		}
		Wonders.utils.formSubmit(Ext.getCmp('button_submit'),'form',tjSuccess,null,null,null,null,false);
		
	}

	var tjSuccess=function(form,action){
 		Ext.MessageBox.alert('提示', ' 提交成功 ');
 	}
 	function reset(){
		Ext.getCmp('oldpassword').setValue("");
		Ext.getCmp('newpassword').setValue("");
		Ext.getCmp('querenpassword').setValue("");
 	}
	</script>
	
	<body>
		<div id="fields">
		<cw:form method="post" id="form" url="${pageContext.request.contextPath}/mycommon/modifyPwd.action" listeners="{'submit':subAjInfo}">
			
				<cw:text property="id" id="id" type="hidden"></cw:text>
				
				
					<table width="80%" cellspacing="10">
						<colgroup> 
				          <col width="40%" align="right"> 
				          <col width="40%" align="left"> 
				        </colgroup> 
						<tr height="25">
							<td>您的原密码：</td>
							<td><cw:text property="oldpassword" id="oldpassword" type="password"></cw:text></td>
						</tr>
						<tr height="25">
							<td>输入新密码：</td>
							<td><cw:text property="newpassword" id="newpassword" type="password"></cw:text></td>
						</tr>
						<tr height="25">
							<td>确认新密码：</td>
							<td><cw:text property="querenpassword" id="querenpassword" type="password"></cw:text></td>
						</tr>
						<tr height="25"> 
							<td>
							
							<cw:button id="button_submit" text="保存" onclick="subAjInfo()"></cw:button>
							<!-- 	<cw:formButton actionType="submit" formId="form" /> -->
							</td> 
							<td>
								<cw:button id="reset_submit" text="重置" onclick="reset()"></cw:button>
							</td> 
						</tr> 
					</table>				
		</cw:form>
		</div>
		<cw:theme />
		<script type="text/javascript">


	Ext.onReady(function(){
		var id="${sessionScope['com.wondersgroup.wssip.operator.id']}";
		Ext.getCmp('id').setValue(id);
	});
	  	 
	</script>
	</body>
</html>
