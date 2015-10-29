<!DOCTYPE html>
<%@ page contentType="text/html;charset=utf-8"%>
<html>
	<head>

		<title>汇总查询</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript">
		   var aaa027Str = [{id:'310003',text:'上海市'}];
		</script>
	</head>

	<body>
		<div>
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
							<td class="textR">
								机构编码：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb020" name="akb020" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						    <td class="textR">
								机构名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb021" name="akb021" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								审核状态：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="ac62Baz031" name="ac62Baz031" class="mini-combobox"
												emptyText="选择审核状态..." data="${dic['BAZ031']}" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								统筹区：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa027" name="aaa027" class="mini-combobox" required="true"
												emptyText="选择统筹区..." data="aaa027Str" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">
								结算时间：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc194Start" name="akc194Start" format="yyyyMMdd" class="mini-datepicker" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">至</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc194End" name="akc194End" format="yyyyMMdd" class="mini-datepicker" />
										</div>
									</div>
								</div>
							</td>
							<td style="text-align: center; padding-top: 5px;" colspan="4">
								<input type="button" value="" class="cxsubmit" onclick="search();"/>
								<input type="button" value="" class="cxreset" onclick="resetForm();" />
							</td>
						</tr>
					</table>
				</form>

			</div>
		</div>
        
		<div class="mainlistCon">
			<div class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">单据</span>
				</h3>
			</div>
			<div id="datagrid1" class="mini-datagrid" style="width:100%;height:380px;"
				idField="id" multiSelect="true" allowResize="false" pageSize="20"
				url="${pageContext.request.contextPath}/k2/f10202001/medAuditSummaryQuery.action">
				<div property="columns">
				    <div type="detailcolumn" headerAlign="center" align="center" 
				         width="50" renderer="onYlRenderer">
				      ~
				    </div>
				    <div field="akb020" headerAlign="center" align="center">
						机构编码
					</div>
					<div field="akb021" headerAlign="center" align="center">
						机构名称
					</div>
					<div field="count" headerAlign="center" align="center">
						涉及单据数
					</div>
				</div>
			</div>
			<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("datagrid1");
	var form = new mini.Form("form1");

	function search(){
		var data = form.getData(true);
		grid1.load(data);
	}
	
	function onYlRenderer(e){
    	var record = e.row;
        return "<a href='javascript:void(0)' onclick='showHosMed("+record.akb020+")'>单据信息</a> ";
    }
    function showHosMed(akb020){
        mini.open({
			url : "${pageContext.request.contextPath}/pages/k2/f10202001/f10202001_hosmed.jsp",
			title: "单据", 
			width: 900, 
			height: 450,
			onload: function () {
				var iframe = this.getIFrameEl();
				var data =  {
				  akb020:akb020,
				  ac62Baz031:mini.get("ac62Baz031").getValue(),
				  aaa027:mini.get("aaa027").getValue(),
			      akc194Start:mini.get("akc194Start").getFormValue(),
			      akc194End:mini.get("akc194End").getFormValue()
		        };
				iframe.contentWindow.setData(data);
			},
			ondestroy: function (action) {
				
			}
		});
    }
	
	function resetForm() {
		form.reset();
		grid1.clear();
	}
</script>
	</body>
</html>
