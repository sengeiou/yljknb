<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医院扣款汇总</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<div id="plan_tabs" class="mini-tabs" activeIndex="0">
			<div title="医院汇总">
				<div id="grid1" class="mini-datagrid" idField="id"
					style="width:99%;height:360px;margin:1px 1px 1px 4px;"
					url="${pageContext.request.contextPath}/k2/f10201005/queryMedDeductHosPlan.action">
					<div property="columns">
					    <div type="detailcolumn" headerAlign="center" align="center" 
				         width="50" renderer="onMxRenderer">
				          ~
				        </div>
						<div field="akb021" width="150" headerAlign="center">
							机构名称
						</div>
						<div field="aae002" width="60" headerAlign="center">
							扣款月份
						</div>
						<div field="bae012" width="50" headerAlign="center">
							扣款总金额
						</div>
						<div field="akb020" width="100" headerAlign="center">
							机构编号
						</div>
						<div field="baz008" width="100" headerAlign="center">
							汇总ID
						</div>
						<div field="baz007" width="100" headerAlign="center">
							事件ID
						</div>
					</div>
				</div>
			</div>
			<div title="医院明细">
			   <div id="grid2" class="mini-datagrid" idField="id"
					style="width:99%;height:360px;margin:1px 1px 1px 4px;"
					url="${pageContext.request.contextPath}/k2/f10201005/queryMedDeductDetailPlan.action">
					<div property="columns">
						<div field="aac003" width="80" headerAlign="center">
							参保人姓名
						</div>
						<div field="akb065" width="100" headerAlign="center">
							单据明细总金额
						</div>
						<div field="baz041" width="60" headerAlign="center">
							扣款金额
						</div>
						<div field="aac002" width="100" headerAlign="center">
							社会保障号
						</div>
						<div field="aac001" width="100" headerAlign="center">
							参保人ID
						</div>
						<div field="baz008" width="100" headerAlign="center">
							汇总ID
						</div>
						<div field="baz009" width="100" headerAlign="center">
							明细ID
						</div>
						<div field="baz001" width="100" headerAlign="center">
							单据ID
						</div>
						<div field="baz003" width="100" headerAlign="center">
							单据明细ID
						</div>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("grid1");
	var grid2 = mini.get("grid2");
	function setData(data) {
		data = mini.clone(data);
		grid1.load( {
			baz007 : data.baz007
		});
	}
	function onMxRenderer(e){
    	var record = e.row;
        return "<a href='javascript:void(0)' onclick = showHosDetail('" + record.baz008 + "')>医院明细</a> ";
    }
    function showHosDetail(baz008){
    	grid2.load( {
			baz008 : baz008
		});
    	mini.get("plan_tabs").activeTab(1);
    }
</script>
	</body>
</html>
