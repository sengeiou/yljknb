<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="cw" uri="/widget-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>tree示例</title>
		<cw:base />
		<script>
	var json = [ {
		"text" :"安徽省",
		"id" :200,
		"leaf" :false,
		"cls" :"folder",
		"children" : [ {
			"text" :"黄山市",
			"id" :201,
			"leaf" :true,
			"cls" :"file",
			"checked":false
		}, {
			"text" :"淮北市",
			"id" :202,
			"leaf" :true,
			"cls" :"file",
			"checked":false
		}, {
			"text" :"巢湖市",
			"id" :241,
			"leaf" :true,
			"cls" :"file",
			"checked":false
		}, {
			"text" :"六安市",
			"id" :242,
			"leaf" :true,
			"cls" :"file",
			"checked":false
		} ]
	} ];

	function treeBeforeLoad(treeLoader, node) {
		this.baseParams.pid = node.id;
	}
	function treeClick(node, e) {
		alert(node.id);
	}
	function treeCheckChange(node, checked) {
		alert(node.text + "," + checked);
	}
</script>
	</head>
	<body style="margin: 10">
		<table>
			<tr valign="top">
				<td>
					静态节点数据树:
					<cw:tree width="300" rootText="hello" data="json"
						rootVisible="true" enableDD="true" allowEdit="true"
						onClick="treeClick"/>
				</td>
				<td>
					一次性加载节点数据树:
					<cw:tree url="/WidgetCenter/sample/tree.fullTreeQuery.action" width="300"
						onCheckChange="treeCheckChange" />
				</td>
				<td>
					文件节点数据树:
					<cw:tree url="data.json" width="300" />
				</td>
				<td>
					异步加载树:
					<cw:tree url="/WidgetCenter/sample/tree.query.action" />
				</td>
			</tr>
		</table>
	</body>
</html>
