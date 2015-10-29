<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>药店综合分析</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts-3d.js"></script>
</head>
<body>
	<fieldset style="width: 100%; border: solid 0px #aaa;">
		<div id="editForm1" class="cxTabbox">
			<form id="form1" action="#">
				<div id="" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
							<td class="textR"><span style="color: red;">*</span>统计周期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="ape032" name="ape032" class="mini-combobox"
												value="M" emptyText="请选择..." data="${dic['APE032']}"
												required="true" onvaluechanged="changeDate" />
										</div>
									</div>
								</div></td>
							<td class="textR"><span style="color: red;">*</span>起始日期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae041str" name="aae041str"
												onvaluechanged="onValueChanged1" class="mini-monthpicker"
												format="yyyy-MM" required="true" /> <input id="aae041s"
												name="aae041s" class="mini-hidden" />
										</div>
									</div>
								</div></td>
							<td class="textR"><span style="color: red;">*</span>终止日期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae042" name="aae042"
												onvaluechanged="onValueChanged2" class="mini-monthpicker"
												format="yyyy-MM" required="true" /> <input id="aae042s"
												name="aae042s" class="mini-hidden" />
										</div>
									</div>
								</div></td>
							<td class="textR">统筹区：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<div class="inputC">
												<input id="aaa027" name="aaa027" class="mini-combobox"
													emptyText="请选择..." data="${dic['AAA027']}" textField="text"
													valueField="id" required="true" />
											</div>
										</div>
									</div>
							</td>
							<td class="textR">药店类型：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb027" name="akb027" class="mini-combobox"
												data="${dic['AKB027']}" textField="text" valueField="id"
												required="true" emptyText="请选择..." />
										</div>
									</div>
								</div></td>
						</tr>
						<tr>
							<td class="textR">药店代码：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb020" name="akb020" class="mini-textBox" />
										</div>
									</div>
								</div></td>
							<td class="textR">药店名称：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb021" name="akb021" class="mini-textBox" />
										</div>
									</div>
								</div></td>

							<td
								style="text-align: right; padding-top: 5px; padding-right:10px;"
								colspan="10"><input type="button" value="" class="cxsubmit"
								onclick="search()" /> <input type="reset" value=""
								class="cxreset" onclick="resetForm()" /></td>
						</tr>
					</table>
				</div>
			</form>
		</div>
	</fieldset>
	
	<fieldset style="border: solid 0px #aaa; position: relative;">
		<div class="mainlistCon">
			<div class="listTit">
				<h3 class="cxTit pTb8">
					<span class="iconCx">医疗服务机构列表</span>
				</h3>
			</div>

			<div style="margin-top:0px;">
				<div id="grid1" class="mini-datagrid" idField="id"
					multiSelect="true" style="width: 100%; height:350px;"
					onrowdblclick="onRowDblclick" allowResize="true" pageSize="20"
					url="${pageContext.request.contextPath}/k6/f10605001/selectMed.action">
					<div property="columns">
						<div type="indexcolumn"></div>
						<div field="ape032" width="80" headerAlign="center"
							data="${dic['APE032']}" visible="false" required="true">日期</div>
						<div field="akb020" width="80" headerAlign="center">药店代码</div>
						<div field="akb021" width="60" headerAlign="center">药店名称</div>
						<div field="akb027" width="80" headerAlign="center"
							type="comboboxcolumn">
							药店类型<input property="editor" class="mini-combobox"
								style="width: 100%;" data="${dic['AKB027']}" />
						</div>
						<div field="akb023" width="60" headerAlign="center">分数</div>
						<div field="akb024" width="80" headerAlign="center"
							visible="false">排名</div>
						<div field="aaa027" width="80" headerAlign="center">统筹区编码</div>
					</div>
				</div>


			</div>
		</div>
	</fieldset>
	<script type="text/javascript">
		mini.parse();
		var form = new mini.Form("form1");
		var grid = mini.get("grid1");
		$(document).ready(function() {
			GetDate();
			changeDate();
		});

		function search() {
			var data = form.getData();
			var json = mini.encode(data);
			if (!data.akb027 == "") {
				grid.load({
					submitData : json
				});
			} else {
				mini.alert("请选择药店类型");
			}
		}

		//弹出医疗机构
		function onRowDblclick(e) {
			var grid = e.sender;
			var datas = grid.getSelected();
			var formO = form.getData();
			//var akb021 = mini.get("akb021").getValue();
			mini
					.open({
						url : "${pageContext.request.contextPath}/pages/k6/f10605001/selectMedi.jsp",
						title : "药店查询",
						width : 800,
						height : 480,
						onload : function() {
							var iframe = this.getIFrameEl();
							var data = {
								data : datas,
								formO : formO
							};
							iframe.contentWindow.setData(data);
						},
						ondestroy : function(action) {
							CloseWindow(action);

						}
					});
		}

		function onValueChanged1(e) {
			var aae041Date = mini.get("aae041str").getValue();
			mini.get("aae041s").setValue(getDateYmd(aae041Date));
		}

		function onValueChanged2(e) {
			var aae041Date = mini.get("aae041str").getValue();
			var aae042Date = mini.get("aae042").getValue();
			if (aae041Date > aae042Date) {
				mini.alert("结束日期不能小于开始日期");
				mini.get("aae042s").setValue("");
				mini.get("aae042").setValue("");
			} else {
				mini.get("aae042s").setValue(getDateYmd(aae042Date));
			}
		}


		function resetForm() {
			form.clear();
			mini.get("ape032").setValue("M");
			changeDate();
			grid.load();
		}

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

		function getDateYmd(date) {
			var thisYear = date.getFullYear() + "";
			var thisMonth = date.getMonth() + 1 + "";
			//如果月份长度是一位则前面补0   
			if (thisMonth < 10)
				thisMonth = "0" + thisMonth;

			var thisDay = date.getDate() + "";
			//如果天的长度是一位则前面补0   
			if (thisDay < 10)
				thisDay = "0" + thisDay;

			return thisYear + "" + thisMonth + "" + thisDay + "";
		}

		var monthStart;
		var monthEnd;
		var quarterStart;
		var quarterEnd;
		var yearStart;
		var yearEnd;
				
		function GetDate() {
			var quarter;
			var myDate = new Date();
			var year = myDate.getFullYear();
			var month = myDate.getMonth() + 1; 	
			yearStart = "2014-01";
			yearEnd = (year - 1) + "-12";
			if (month > 1) {
				monthStart = 2014 + "-01";
				monthEnd = 2014 + "-12";
			} else {
				monthStart = (year - 1) + "-01";
				monthEnd = (year - 1) + "-12";
			}
			quarter = Math.ceil(month / 3);
			if (quarter == "1") {
				quarterStart = 2014 + "-10";
				quarterEnd = 2014 + "-12";
			} else {
				quarterStart = 2014 + "-0" + (quarter * 3 - 5);
				quarterEnd = 2014 + "-0" + (quarter * 3 - 3);
			}
		}

		function changeDate() {
			var ape032 = mini.get("ape032").getValue();
			var aae041str = mini.get("aae041str");
			var aae042 = mini.get("aae042");
			if (ape032 == "M") {
				aae041str.setValue(monthStart);
				aae042.setValue(monthEnd);
			} else if (ape032 == "S") {
				aae041str.setValue(quarterStart);
				aae042.setValue(quarterEnd);
			} else if (ape032 == "Y") {
				aae041str.setValue(yearStart);
				aae042.setValue(yearEnd);
			}
		}

		/* function onSelectionChanged(e){
		    var grid = e.sender;
		    var datas = grid.getSelected();
		    json = mini.encode(datas);
		    return;
		} */
	</script>
</body>
</html>