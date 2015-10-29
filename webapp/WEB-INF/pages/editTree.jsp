<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="cw" uri="/widget-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>tree示例</title>
		<cw:base />
	</head>
	<body style="margin: 10">
		<table>
			<tr valign="top">
				<td width="300">
					<cw:tree id="tree"
						url="/WidgetCenter/sample/mytree.query.action" height="500"
						formLoadAction="/WidgetCenter/sample/mytree.loadForm.action"
						editable="true"
						formDeleteAction="/WidgetCenter/sample/mytree.delForm.action"
						formAddAction="/WidgetCenter/sample/mytree.saveForm.action"
						formUpdateAction="/WidgetCenter/sample/mytree.saveForm.action" />
				</td>
				<td>
					<cw:form ajax="true" id="form" method="post">
						<table>
							<tr>
								<td>
									节点内容：
								</td>
								<td>
									<cw:text property="text" />
								</td>
							</tr>
							<tr>
								<td>
									节点ID：
								</td>
								<td>
									<cw:text property="id" readOnly="true" />
									<cw:text property="parentId" type="hidden" />
								</td>
							</tr>
						</table>
					</cw:form>
				</td>
			</tr>
		</table>
	</body>
</html>

