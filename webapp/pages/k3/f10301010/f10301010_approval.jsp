<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>多重审批</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
			<div id="grid1" class="mini-datagrid" style="width: 100%; height: 370px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="10" selectOnLoad="true" 
					url="${pageContext.request.contextPath}/k3/f10301010/queryApprovalData.action">
					<div property="columns">
						<div type="indexcolumn"></div>
						<div field="operation" width="100" headerAlign="center" renderer="rendererGrid">操作</div>
						<div field="ailid" visible="false" headerAlign="center" >id</div>
						<div field="aclname" width="80" headerAlign="center">审批级别</div>
						<div field="ailmen" width="70" headerAlign="center">审批人</div>
						<div field="ailtime" width="120" headerAlign="center" dateFormat="yyyy-MM-dd HH:mm:ss">审批时间</div>
						<div field="ailyj" width="200" headerAlign="center">审批意见</div>
						<div field="ailzt" width="70" headerAlign="center">审批状态</div>
						<div field="ailtg" width="70" headerAlign="center">是否通过</div>
					</div>
				</div>
			</div>
		
		<script type="text/javascript">
			mini.parse();
			//标准方法接口定义
			function setData(data){
				data = mini.clone(data);
				var grid = mini.get("grid1");
				grid.load({aaz318 : data.aaz318});
			}
			
			
			
			//操作
			function rendererGrid(e){
				var grid1 = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	var s;
            	if(record.ailzt == '未审批'){
            		s = "<a href='###' onclick = precheck('"+record.ailid+"','"+record.aclid+"','"+record.aaz318+"','是')>通过</a> | <a href='###' onclick = precheck('"+record.ailid+"','"+record.aclid+"','"+record.aaz318+"','否')>不通过</a>";
            	}else{
            		s = "";
            	}
            	return s;
			}
			
			
			function precheck(ailid,aclid,aaz318,ailtg){
						//alert(aclid);
						var grid = mini.get("grid1");
						mini.open({
							url: "${pageContext.request.contextPath}/pages/k3/f10301010/f10301010_sptg.jsp",
							title: "结论确认审批",
							width: 600, 
							height: 220,
							onload: function (){
								var iframe = this.getIFrameEl();
								var data = {ailid: ailid ,aclid : aclid , aaz318 : aaz318 , ailtg : ailtg , ailzt : '<font color = "red">已审批</font>'};
								iframe.contentWindow.setData(data);
							},
							ondestroy: function (action){
								grid.reload();
							}
				   		});
			}
			
			
     		//返回
     		function revert(){
     			CloseWindow();
     		}
		</script>
	</body>
</html>
