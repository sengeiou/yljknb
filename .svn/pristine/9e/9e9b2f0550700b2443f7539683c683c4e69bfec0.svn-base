<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>

		<title>审核概况查看</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<%--	<script type="text/javascript">
       if(document.all){
          document.body.style.csstext="border:15 ridge red"; 
       }
	</script>--%>
	</head>
	<body>
		<div class="cxTabbox">
			<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
				width="100%">
				<tr>
					<td colspan="3" width="33%">
						<div class="inputL" style="width: 130px">
							<div class="inputR">
								<div class="inputC">
									<input id="baz020" name="baz020" class="mini-monthpicker"
										onvaluechanged="doChanged" />
								</div>
							</div>
						</div>
					</td>
					<td colspan="3" width="33%">
						智能审核结果
					</td>
					<td colspan="3" width="33%">
						规则统计
					</td>
				</tr>
				<tr>
					<td>
						待审核：
						<span id="baz031_04"></span>
					</td>
					<td>
						申诉数：
						<span id="baz031_08"></span>
					</td>
					<td>
						回复数：
						<span id="baz031_10"></span>
					</td>
					<td>
						系统直接扣款数：
						<span id="baz021_1"></span>
					</td>
					<td>
						送核查数：
						<span id="baz021_2"></span>
					</td>
					<td>
						待人工审核数：
						<span id="baz021_3"></span>
					</td>
					<td>
						总规则数：
						<span id="aaa168_1"></span>
					</td>
					<td>
						启用规则数：
						<span id="aaa168_2"></span>
					</td>
					<td>
						违规规则数：
						<span id="aaa168_3"></span>
					</td>
				</tr>
			</table>
		</div>

		<div class="mainlistCon">
			<div class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">医疗机构统计情况</span>
				</h3>
				<div class="fR pT5R9">
				    <span class="btnMini"><em><input type="button" value="医院"/></em></span>
					<span class="btnMini"><em><input type="button" value="药店"/></em></span>
				</div>
			</div>

			<div id="grid1" class="mini-datagrid"
				url="<%=request.getContextPath()%>/k2/f10201001/queryF10201001WithYljg.action"
				style="width: 100%; height: 200px;" idField="id" pageSize="20">
				<div property="columns">
					<div field="akb021" width="150" headerAlign="center" align="center">
						医疗机构名称
					</div>
					<div field="cscount" width="80" headerAlign="center" align="center">
						待初审
					</div>
					<div field="fscount" width="100" headerAlign="center"
						align="center">
						待复审
					</div>
					<div field="fycount" width="100" headerAlign="center"
						align="center">
						待复议
					</div>
				</div>
			</div>
			
			
			<div class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">规则统计情况</span>
				</h3>
				<div class="fR pT5R9">
				    <span class="btnMini"><em><input type="button" value="医院"/></em></span>
					<span class="btnMini"><em><input type="button" value="药店"/></em></span>
				</div>
			</div>

			<div id="grid2" class="mini-datagrid"
				url="<%=request.getContextPath()%>/k2/f10201001/queryF10201001WithGz.action"
				style="width: 100%; height: 180px;" idField="id" pageSize="20">
				<div property="columns">
					<div field="aaa167" width="120" headerAlign="center" align="center">
						规则名称
					</div>
					<div field="cscount" width="80" headerAlign="center" align="center">
						待初审
					</div>
					<div field="fscount" width="100" headerAlign="center"
						align="center">
						待复审
					</div>
					<div field="fycount" width="100" headerAlign="center"
						align="center">
						待复议
					</div>

				</div>
			</div>
		</div>
		
		<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("grid1");
	var grid2 = mini.get("grid2");
	$(document).ready(function() {
		mini.get("baz020").setValue(new Date());
		var baz020 = mini.get("baz020").getFormValue();
		init(baz020);
	});

	function doChanged(e) {
		/*	var t= e.sender;*/
		var baz020 = this.getFormValue();//这是取到String类型的字符串
		//	var baz020 = this.getValue();
		init(baz020);
	}

	/**
	 * 
	 * @param {Object} baz020
	 */
	function init(baz020) {
		$
				.ajax( {
					url : "${pageContext.request.contextPath}/k2/f10201001/queryF10201001.action",
					type : "GET",
					data : {
						baz020 : baz020
					},
					success : function(text) {
						if (text.success) {
							document.getElementById("baz031_04").innerHTML = text.result[0].dshcount;//待审核数
							document.getElementById("baz031_08").innerHTML = text.result[0].sscount;//申诉数
							document.getElementById("baz031_10").innerHTML = text.result[0].hfcount;//回复数
							document.getElementById("baz021_1").innerHTML = text.result[0].zjkkcount;//系统直接扣款数
							document.getElementById("baz021_2").innerHTML = text.result[0].dthshcount;//待退回审核数
							document.getElementById("baz021_3").innerHTML = text.result[0].rgdshcount;//人工待审核数
							document.getElementById("aaa168_1").innerHTML = text.result[0].zgzs;//总规则数
							document.getElementById("aaa168_2").innerHTML = text.result[0].qygzs;//启用规则数
							document.getElementById("aaa168_3").innerHTML = text.result[0].mxwgs + text.result[0].djwgs;//违规规则数
						} else {
							mini.alert(text.msg);
						}
					},
					error : function() {
						mini.alert("操作失败!");
					}
				});

		grid1.load( {
			baz020 : baz020
		});
		grid2.load( {
			baz020 : baz020
		});
	}
</script>
	</body>
</html>
