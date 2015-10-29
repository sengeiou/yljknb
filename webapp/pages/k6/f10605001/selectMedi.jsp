<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>药店查询</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body>
	<fieldset>
		<div class="mainlistCon">
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<input id="akb021" name="akb021" class="mini-hidden" required="true" />
					<input id="akb020" name="akb020" class="mini-hidden" required="true" />
					<input id="ape032" name="ape032" class="mini-hidden" required="true" />
					<input id="akb027" name="akb027" class="mini-hidden" required="true" />
					<input id="analid" name="analid" class="mini-hidden" required="true" />
					<input id="aae041" name="aae041" class="mini-hidden" required="true" />
					<input id="fxzb" name="fxzb" class="mini-hidden" required="true" />
					<input id="aae042" name="aae042" class="mini-hidden" required="true" />
					<h3 class="cxTit fL">
						<span class="iconCx" id="titleText">发展趋势表</span>
					</h3>
					<div id="tabs" class="mini-tabs" activeIndex="0"
						style="width:100%;height:365px;" plain="false"
						onactivechanged="onactivechanged">
						
						<div title="就诊总人数">
							<div id="grid1" class="mini-datagrid" idField=""
								multiSelect="false" style="width: 100%; height: 340px;"
								allowResize="true"
								url="${pageContext.request.contextPath}/k6/f10605001/loadDevelopTend.action">

								<div property="columns">
									<div type="indexcolumn"></div>
									<div field="aae041" width="140" headerAlign="center"
										align="center" allowSort="true">统计本月</div>
									<div field="cur_pred" width="140" headerAlign="center"
										align="center" allowSort="true">本期数</div>
									<div field="sam_pred" width="140" headerAlign="center"
										align="center" allowSort="true">上年同期数</div>
									<div field="pre_pred" width="140" headerAlign="center"
										align="center" allowSort="true">上期数</div>
									<div field="sam_rate" width="140" headerAlign="center"
										align="center" allowSort="true">同比增长率(%)</div>
									<div field="pre_rate" width="140" headerAlign="center"
										align="center" allowSort="true">环比增长率(%)</div>
									<div field="tqtlhb_rate" width="140" headerAlign="center"
										align="center" allowSort="true" visible="false">同期同类药店环比增长率(%)</div>
									<div field="tlcz_avg_rate" width="140" headerAlign="center"
										align="center" allowSort="true">与同类同期药店平均增长率差值</div>
									<div field="sq_avg" width="140" headerAlign="center"
										align="center" allowSort="true" visible="false">上期平均值</div>
									<div field="qnpjbj_rate" width="140" headerAlign="center"
										align="center" allowSort="true">与自己去年平均值比较的增长率(%)</div>
									<%-- <div field="tre_mean" width="140" headerAlign="center" align="center"allowSort="true">移动平均</div>--%>
								</div>
							</div>
						</div>
						<div title="就诊总费用">
							<div id="grid2" class="mini-datagrid" idField=""
								multiSelect="false" style="width: 100%; height: 340px;"
								allowResize="true"
								url="${pageContext.request.contextPath}/k6/f10605001/loadDevelopTend.action">

								<div property="columns">
									<div type="indexcolumn"></div>
									<div field="aae041" width="140" headerAlign="center"
										align="center" allowSort="true">统计本月</div>
									<div field="cur_pred" width="140" headerAlign="center"
										align="center" allowSort="true">本期数</div>
									<div field="sam_pred" width="140" headerAlign="center"
										align="center" allowSort="true">上年同期数</div>
									<div field="pre_pred" width="140" headerAlign="center"
										align="center" allowSort="true">上期数</div>
									<div field="sam_rate" width="140" headerAlign="center"
										align="center" allowSort="true">同比增长率(%)</div>
									<div field="pre_rate" width="140" headerAlign="center"
										align="center" allowSort="true">环比增长率(%)</div>
									<div field="tqtlhb_rate" width="140" headerAlign="center"
										align="center" allowSort="true" visible="false">同期同类药店环比增长率(%)</div>
									<div field="tlcz_avg_rate" width="140" headerAlign="center"
										align="center" allowSort="true">与同类同期药店平均增长率差值</div>
									<div field="sq_avg" width="140" headerAlign="center"
										align="center" allowSort="true" visible="false">上期平均值</div>
									<div field="qnpjbj_rate" width="140" headerAlign="center"
										align="center" allowSort="true">与自己去年平均值比较的增长率(%)</div>
									<%-- <div field="tre_mean" width="140" headerAlign="center" align="center"allowSort="true">移动平均</div>--%>
								</div>
							</div>
						</div>
						<div title="处方药">
							<div id="grid3" class="mini-datagrid" idField=""
								multiSelect="false" style="width: 100%; height: 340px;"
								allowResize="true"
								url="${pageContext.request.contextPath}/k6/f10605001/loadDevelopTend.action">

								<div property="columns">
									<div type="indexcolumn"></div>
									<div field="aae041" width="140" headerAlign="center"
										align="center" allowSort="true">统计本月</div>
									<div field="cur_pred" width="140" headerAlign="center"
										align="center" allowSort="true">本期数</div>
									<div field="sam_pred" width="140" headerAlign="center"
										align="center" allowSort="true">上年同期数</div>
									<div field="pre_pred" width="140" headerAlign="center"
										align="center" allowSort="true">上期数</div>
									<div field="sam_rate" width="140" headerAlign="center"
										align="center" allowSort="true">同比增长率(%)</div>
									<div field="pre_rate" width="140" headerAlign="center"
										align="center" allowSort="true">环比增长率(%)</div>
									<div field="tqtlhb_rate" width="140" headerAlign="center"
										align="center" allowSort="true" visible="false">同期同类药店环比增长率(%)</div>
									<div field="tlcz_avg_rate" width="140" headerAlign="center"
										align="center" allowSort="true">与同类同期药店平均增长率差值</div>
									<div field="sq_avg" width="140" headerAlign="center"
										align="center" allowSort="true" visible="false">上期平均值</div>
									<div field="qnpjbj_rate" width="140" headerAlign="center"
										align="center" allowSort="true">与自己去年平均值比较的增长率(%)</div>
									<%-- <div field="tre_mean" width="140" headerAlign="center" align="center"allowSort="true">移动平均</div>--%>
								</div>
							</div>
						</div>
						<div title="非处方药">
							<div id="grid4" class="mini-datagrid" idField=""
								multiSelect="false" style="width: 100%; height: 340px;"
								allowResize="true"
								url="${pageContext.request.contextPath}/k6/f10605001/loadDevelopTend.action">

								<div property="columns">
									<div type="indexcolumn"></div>
									<div field="aae041" width="140" headerAlign="center"
										align="center" allowSort="true">统计月份</div>
									<div field="cur_pred" width="140" headerAlign="center"
										align="center" allowSort="true">本期数</div>
									<div field="sam_pred" width="140" headerAlign="center"
										align="center" allowSort="true">上年同期数</div>
									<div field="pre_pred" width="140" headerAlign="center"
										align="center" allowSort="true">上期数</div>
									<div field="sam_rate" width="140" headerAlign="center"
										align="center" allowSort="true">同比增长率(%)</div>
									<div field="pre_rate" width="140" headerAlign="center"
										align="center" allowSort="true">环比增长率(%)</div>
									<div field="tqtlhb_rate" width="140" headerAlign="center"
										align="center" allowSort="true" visible="false">同期同类药店环比增长率(%)</div>
									<div field="tlcz_avg_rate" width="140" headerAlign="center"
										align="center" allowSort="true">与同类同期药店平均增长率差值</div>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</fieldset>

	<div style="text-align:center;margin:10px;" class="mainlistCon">
	<span class="btnMini"> <em> <input type="button"
				value="查询" onclick="search()" id="cxsubmit" name="b_btn" /> </em> </span>
		<span class="btnMini"> <em> <input type="button"
				value="关闭" onclick="closeWin()" id="b_btn" name="b_btn" /> </em> </span>
	</div>
	<script type="text/javascript">
		mini.parse();
		
		var form = new mini.Form("form1");
		var grid1 = mini.get("grid1");
		var grid2 = mini.get("grid2");
		var grid3 = mini.get("grid3");
		var grid4 = mini.get("grid4");
		
		
		function setData(datas) {
			data = mini.clone(datas);
			mini.get("akb020").setValue(data.data.akb020);
			mini.get("akb021").setValue(data.data.akb021);
			mini.get("akb027").setValue(data.data.akb027);
			mini.get("ape032").setValue(data.formO.ape032);
			mini.get("aae041").setValue(data.data.aae041);
			mini.get("aae042").setValue(data.data.aae042);
		};
		function onactivechanged(e) {
			
				if (e.tab.title == "就诊总人数") {
					mini.get("fxzb").setValue("1");
					data = form.getData(true);
					json = mini.encode(data);
					grid1.load({
						submitData : json
					});
				} else if (e.tab.title == "就诊总费用") {
					mini.get("fxzb").setValue("2");
					data = form.getData(true);
					json = mini.encode(data);
					grid2.load({
						submitData : json
					});
				} else if (e.tab.title == "处方药") {
					mini.get("fxzb").setValue("3");
					data = form.getData(true);
					json = mini.encode(data);
					grid3.load({
						submitData : json
					});
				} else if (e.tab.title == "非处方药") {
					mini.get("fxzb").setValue("4");
					data = form.getData(true);
					json = mini.encode(data);
					grid4.load({
						submitData : json
					});
				}
			
		}
		
		function search() {
			mini.get("fxzb").setValue("1");
			data = form.getData(true);
			json = mini.encode(data);
			grid1.load({
				submitData : json
			});
		}

		//返回
		function closeWin() {
			CloseWindow();
		}

		function CloseWindow(action) {
			if (window.CloseOwnerWindow) {
				window.CloseOwnerWindow(action);
			} else {
				window.close();
			}
		}
	</script>
</body>
</html>