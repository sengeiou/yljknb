<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<script language="JavaScript" type="text/javascript">
		$(function() {
			$('.menuNav li').click(function() {
				$(this).addClass('cur').siblings().removeClass('cur');
			});
			$('.menuNav li:last').addClass('lastnobg');
			$(".menuNav").find("li").each(function(i){
				$(this).find("span").addClass("icon_0" + (i+1));
			});

		});
		function logoff() {
			if (confirm("是否真的退出?")) {
				top.close();
			}
		}
		function changePassword() {
			top.selectLevel4Menu('password',
					'${pageContext.request.contextPath}/pages/pwdModify.jsp',
					'修改密码');
		}
	</script>
	</head>

	<body>

		<div class="header">
			<div class="headBox">
				<div class="headR fR">
					<div class="menuLay">
						<ul class="menuNav fR">
						   <s:iterator value="topMenuList" status="topMenuIndex" id="topMenu">
								<li>
									<a href="javascript:void(0)" onclick='getLevel2Menu("<s:property value='#topMenu.menuid'/>")'>
										<span>
										    <em><s:property value="name"/></em>
										</span>
									</a>
								</li>
							</s:iterator>
						</ul>
					</div>	
				</div>
				<h1 class="logo fL"></h1>
			</div>
		</div>		
	</body>
</html>

