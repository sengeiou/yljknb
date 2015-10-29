<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医疗机构查询反馈</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<div>
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
							<td class="textR">统筹区：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaa027" name="aaa027" class="mini-combobox" value="" emptyText="请选择..."
											data="${dic['AAA027']}" textField="text" valueField="id"
											 />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">申诉开始日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape711s" name="ape711s" class="mini-datepicker" format="yyyy-MM-dd"
										 allowInput="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">申诉结束日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape711e" name="ape711e" class="mini-datepicker" format="yyyy-MM-dd"
										 allowInput="false" />
									</div>
								</div>
							</div>
						</td>
							<td style="text-align: center; padding-top: 5px;" colspan="2">
								<input type="button" value="" class="cxsubmit" onclick="search();"/>
								<input type="button" value="" class="cxreset" onclick="resetForm();" />
							</td>
						</tr>
					</table>
				</form>

			</div>
		</div>

		<div class="mainlistCon">
			<div id="tabs1" class="mini-tabs" activeIndex="0" plain="false">
				<div title="申诉情况汇总" name="panel1">
						<div id="grid1" class="mini-datagrid" multiSelect="false" allowResize="true" style="width: 100%; height: 420px;"
							url="${pageContext.request.contextPath}/k5/f10503004/queryBreAuditCount.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="aaa027" width="80" headerAlign="center" align="center"
									allowSort="true" type="comboboxcolumn">
									统筹区编码
									<input property="editor" class="mini-combobox"
										style="width: 100%" data="${dic['AAA027']}">
								</div>
								<div field="apa709" width="80" headerAlign="center" align="center"
									allowSort="true" type="comboboxcolumn">
									申诉对象类型<input property="editor" class="mini-combobox"
										style="width: 100%" data="${dic['APA709']}">
								</div>
								<div field="apa701" width="80" headerAlign="center" align="center"
									allowSort="true" type="comboboxcolumn">
									问题类型<input property="editor" class="mini-combobox"
										style="width: 100%" data="${dic['APA701']}">
								</div>
								<div field="dsb" width="80" headerAlign="center" align="center"
									allowSort="true">
									待申报
								</div>
								<div field="dsp" width="80" headerAlign="center" align="center"
									allowSort="true">
									待审批
								</div>
								<div field="sptg" width="80" headerAlign="center" align="center"
									allowSort="true">
									审批通过
								</div>
								<div field="spbtg" width="80" headerAlign="center" align="center"
									allowSort="true">
									审批不通过
								</div>
								<div field="wg" width="80" headerAlign="center" align="center"
									allowSort="true">
									违规
								</div>
								<div field="zf" width="80" headerAlign="center" align="center"
									allowSort="true">
									作废
								</div>
								<div field="clsc" width="80" headerAlign="center" align="center"
									allowSort="true">
									补充材料
								</div>
								<div field="cswsb" width="80" headerAlign="center" align="center"
									allowSort="true">
									超时未申报
								</div>
							</div>
						</div>
				</div>
				<div title="医疗机构申诉汇总" name="panel2">
						<div id="grid2" class="mini-datagrid" multiSelect="false" allowResize="true" style="width: 100%; height: 420px;"
							url="${pageContext.request.contextPath}/k5/f10503004/queryOrgAuditCount.action">
							<div property="columns">
							<div type="indexcolumn"></div>
								<div field="ape008" width="80" headerAlign="center" align="center"
									allowSort="true">
									医疗机构名称
								</div>
								<div field="apa701" width="80" headerAlign="center" align="center"
									allowSort="true" type="comboboxcolumn">
									问题类型<input property="editor" class="mini-combobox"
										style="width: 100%" data="${dic['APA701']}">
								</div>
								<div field="dsb" width="80" headerAlign="center" align="center"
									allowSort="true">
									待申报
								</div>
								<div field="dsp" width="80" headerAlign="center" align="center"
									allowSort="true">
									待审批
								</div>
								<div field="sptg" width="80" headerAlign="center" align="center"
									allowSort="true">
									审批通过
								</div>
								<div field="spbtg" width="80" headerAlign="center" align="center"
									allowSort="true">
									审批不通过
								</div>
								<div field="wg" width="80" headerAlign="center" align="center"
									allowSort="true">
									违规
								</div>
								<div field="zf" width="80" headerAlign="center" align="center"
									allowSort="true">
									作废
								</div>
								<div field="clsc" width="80" headerAlign="center" align="center"
									allowSort="true">
									补充材料
								</div>
								<div field="cswsb" width="80" headerAlign="center" align="center"
									allowSort="true">
									超时未申报
								</div>
							</div>
						</div>
				</div>
				<div title="医师申诉汇总" name="panel2">
						<div id="grid3" class="mini-datagrid" multiSelect="false" allowResize="true" style="width: 100%; height: 420px;"
							url="${pageContext.request.contextPath}/k5/f10503004/queryDoctorAuditCount.action">
							<div property="columns">
							<div type="indexcolumn"></div>
								<div field="ape008" width="80" headerAlign="center" align="center"
									allowSort="true">
									医师名称
								</div>
								<div field="apa701" width="80" headerAlign="center" align="center"
									allowSort="true" type="comboboxcolumn">
									问题类型<input property="editor" class="mini-combobox"
										style="width: 100%" data="${dic['APA701']}">
								</div>
								<div field="dsb" width="80" headerAlign="center" align="center"
									allowSort="true">
									待申报
								</div>
								<div field="dsp" width="80" headerAlign="center" align="center"
									allowSort="true">
									待审批
								</div>
								<div field="sptg" width="80" headerAlign="center" align="center"
									allowSort="true">
									审批通过
								</div>
								<div field="spbtg" width="80" headerAlign="center" align="center"
									allowSort="true">
									审批不通过
								</div>
								<div field="wg" width="80" headerAlign="center" align="center"
									allowSort="true">
									违规
								</div>
								<div field="zf" width="80" headerAlign="center" align="center"
									allowSort="true">
									作废
								</div>
								<div field="clsc" width="80" headerAlign="center" align="center"
									allowSort="true">
									补充材料
								</div>
								<div field="cswsb" width="80" headerAlign="center" align="center"
									allowSort="true">
									超时未申报
								</div>
							</div>
						</div>
				</div>
			</div>
			<script type="text/javascript">
	mini.parse();
	
	var grid = mini.get("grid1");
	var grid2 = mini.get("grid2");
	var grid3 = mini.get("grid3");
	
	function search() {
		var queryForm = new mini.Form("form1");
		var data = queryForm.getData(true,false);
		grid.load(data);
		grid2.load(data);
		grid3.load(data);
	}
			
	function resetForm() {
		queryForm.reset();
	}
</script>
	</body>
</html>
