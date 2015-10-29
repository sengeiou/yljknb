<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>统计分析1</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js"></script>
<script type="text/javascript">
var xs=[{id:"310000",text:"上海市"}];
</script>
</head>
<body><div id="xx"></div>
	<div id="tabs1" class="mini-tabs" activeIndex="0" style="width: 100%; "
		plain="false" onactivechanged="activeChanged">
		<div title="药品通用名查询" name="panel1" style="width: 100%; ">
			<fieldset style="width: 100%; border: solid 0px #aaa;background-color: red">
				<div id="editForm1" class="cxTabbox">
					<form id="form1" action="#">
						<div id="" style="margin: 10px; position: relative;">
								<table style="width: 100%;" class="cxTab">
									<tr>
										<td class="textR" >
											开始年月：
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="akc194s1" name="akc194s1"
															class="mini-monthpicker" onvaluechanged="onValueChanged1"
															format="yyyy-MM" required="true" value="2011-11"/>
													</div>
												</div>
											</div>
										</td>
										<td class="textR">
											结束年月：
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="akc194e1" name="akc194e1"
															onvaluechanged="onValueChanged1" class="mini-monthpicker"
															format="yyyy-MM" required="true" value="2015-01"/>
													</div>
												</div>
											</div>
										</td>
										<td class="textR">
											县市：
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="aaa027" name="aaa027" class="mini-combobox"
															emptyText="请选择..." data="xs" onvaluechanged="onValueChanged1"
															textField="text" valueField="id" value="310000" required="true" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">
											药品通用名：
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="ake002" name="ake002" onvaluechanged="onValueChanged1" class="mini-textbox" />
													</div>
												</div>
											</div>
										</td>
										<td style="text-align: left; padding-top: 2px; padding-right: 20px;">
											<input type="button" value="" class="cxsubmit" onclick="search1()" />
											<input type="button" value="" class="cxreset" onclick="reset1()"/>
										</td>
									</tr>
								</table>
							</div>
					</form>
				</div>
			</fieldset>
			<div id="detailgrid1_Form" style="display: none;">
				<div id="detailgrid1" align="center">
				</div>
			</div>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div class="mini-splitter nobor" style="width: 100%; height: 425px;">
					<div size="100%" showCollapseButton="false" class="listTit">
						<h3 class="cxTit fL">
							<span class="iconCx">排名分析</span>
						</h3>
						<div id="grid1" class="mini-datagrid" 
							style="width: 100%; height: 390px;" multiSelect="false"
							allowResize="true" pageSize="20" onshowrowdetail="onShowDetail1"
							url="${pageContext.request.contextPath}/k6/f10605002/queryHosByDrug.action">
							<div property="columns">
								<div type="expandcolumn">~</div>
								<div field="rank" width="80" headerAlign="center" align="center" >名次</div>
								<div field="akb020" width="80" headerAlign="center" align="center">药店代码</div>
								<div field="akb021" width="80" headerAlign="center" align="center">药店名称</div>
								<div field="akc226" width="80" headerAlign="center" align="center">药品数量</div>
								<div field="akb065" width="80" headerAlign="center" align="center">药品金额</div>
								<div field="ake002" width="80" headerAlign="center" align="center"></div>
							</div>
						</div>
					</div>
				</div>
			</fieldset>
		</div>
		<div title="药店药品查询" name="panel2" style="width: 100%; ">
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div id="editForm2" class="cxTabbox">
					<form id="form2" action="#">
						<div id="" style="margin: 10px; position: relative;">
								<table style="width: 100%;" class="cxTab">
									<tr>
										<td class="textR">
											开始年月：
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="akc194s2" name="akc194s2"
															class="mini-monthpicker" onvaluechanged="onValueChanged2"
															format="yyyy-MM" required="true" value="2011-11"/>
													</div>
												</div>
											</div>
										</td>
										<td class="textR">
											结束年月：
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="akc194e2" name="akc194e2"
															onvaluechanged="onValueChanged2" class="mini-monthpicker"
															format="yyyy-MM" required="true" value="2015-01"/>
													</div>
												</div>
											</div>
										</td>
										<td class="textR">
											县市：
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="aaa027" name="aaa027" class="mini-combobox"
															emptyText="请选择..." data="xs" onvaluechanged="onValueChanged2"
															textField="text" valueField="id" value="310000" required="true" />
													</div>
												</div>
											</div>
										</td>
										<td class="textR">
											药店名称：
										</td>
										<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
														<input id="akb021" name="akb021" class="mini-textbox" onvaluechanged="onValueChanged2"/>
													</div>
												</div>
											</div>
										</td>
										<td style="text-align: left; padding-top: 2px; padding-right: 20px;">
											<input type="button" value="" class="cxsubmit" onclick="search2()" />
											<input type="button" value="" class="cxreset" onclick="reset2()"/>
										</td>
									</tr>
								</table>
							</div>
					</form>
				</div>
			</fieldset>
			<div id="detailgrid2_Form" style="display: none;">
				<div id="detailgrid2" align="center" >
				</div>
			</div>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div class="mini-splitter nobor" style="width: 100%; height: 425px;">
					<div size="100%" showCollapseButton="false" class="listTit">
						<h3 class="cxTit fL">
							<span class="iconCx">排名分析</span>
						</h3>
						<div id="grid2" class="mini-datagrid" 
							style="width: 100%; height: 390px;" multiSelect="false"
							allowResize="true" pageSize="20" onshowrowdetail="onShowDetail2"
							url="${pageContext.request.contextPath}/k6/f10605002/queryDrugByHos.action">
							<div property="columns">
								<div type="expandcolumn">~</div>
								<div field="rank" width="80" headerAlign="center" align="center" >名次</div>
								<div field="ake002" width="80" headerAlign="center" align="center">药品名称</div>
								<div field="akc226" width="80" headerAlign="center" align="center">药品数量</div>
								<div field="akb065" width="80" headerAlign="center" align="center">药品金额</div>
							</div>
						</div>
					</div>
				</div>
			</fieldset>
		</div>
	</div>
	<script type="text/javascript">
		mini.parse();
		var grid1=mini.get("grid1");
		var grid2=mini.get("grid2");
		var detailgrid1_Form = document.getElementById("detailgrid1_Form");
		var detailgrid2_Form = document.getElementById("detailgrid2_Form");
		var form1 = new mini.Form("form1");
		var form2 = new mini.Form("form2");
		function search1(){
			form1.validate();
	        if (form1.isValid() == false) {
	            return;
	        }
			var data=form1.getData(true);
			grid1.load(data);
			grid1.sortBy("akb065","desc");
			
		}	
		function search2(){	
			form2.validate();
	        if (form2.isValid() == false) {
	            return;
	        }
			var data=form2.getData(true);		
			grid2.load(data);
			grid2.sortBy("akb065","desc");
		}
		function onShowDetail1(e){
				var data=form1.getData(true);
			 	var grid = e.sender;
		        var row = e.record;
		        data.akb020=row.akb020;
		        data.akb021=row.akb021;
		        var td = grid.getRowDetailCellEl(row);
		        td.appendChild(detailgrid1_Form);
		        detailgrid1_Form.style.display = "block";
		        $("#detailgrid1").html("");
		        $.ajax({
		            url: "${pageContext.request.contextPath}/k6/f10605002/queryDocOfHos.action",
		            type: "post",
		            data: data,
		            success: function (text) {
			        	if(text.success){
		                	var htmlStr = "<table border='2px;' bordercolor='#000000' width='50%' cellspacing='1px' style:'text-align: center;border:1px;' >";
		                	htmlStr +="<tr><th><h1>医生姓名</h1></th><th><h1>药品数量</h1></th><th><h1>金额</h1></th><th><h1>排名</h1></th><tr>"
		                	for(var i=0;i<text.result.length;i++){
		                		htmlStr += "<tr>";
		                		htmlStr += "<td align='center'>"+text.result[i].aac003 + "</td>"; 
		                		htmlStr += "<td>"+text.result[i].akc226 + "</td>"; 
		                		htmlStr += "<td>"+text.result[i].akb065+ "</td>";
		                		htmlStr += "<td align='center'>"+text.result[i].rank + "</td>";
		                		htmlStr += "</tr>";
		                    }
		                	htmlStr += "</table>";
		            		$("#detailgrid1").append(htmlStr);
		            	}else{
		                }   
		            }
		        });
		}
		function onShowDetail2(e){
			var data=form2.getData(true);
		 	var grid = e.sender;
	        var row = e.record;
	        data.ake002=row.ake002;
	        var td = grid.getRowDetailCellEl(row);
	        td.appendChild(detailgrid2_Form);
	        detailgrid2_Form.style.display = "block";
	        $("#detailgrid2").html("");
	        $.ajax({
	            url: "${pageContext.request.contextPath}/k6/f10605002/queryDocOfDrug.action",
	            type: "post",
	            data: data,
	            success: function (text) {
	            	if(text.success){
	            		var htmlStr = "<table  width='50%' cellspacing='1px' style:'text-align: center;border:1px;'  >";
	                	htmlStr +="<tr><th><h1>医生姓名</h1></th><th><h1>药品数量</h1></th><th><h1>金额</h1></th><th><h1>排名</h1></th><tr>"
	                	for(var i=0;i<text.result.length;i++){
	                		htmlStr += "<tr>";
	                		htmlStr += "<td align='center'>"+text.result[i].aac003 + "</td>"; 
	                		htmlStr += "<td>"+text.result[i].akc226 + "</td>"; 
	                		htmlStr += "<td>"+text.result[i].akb065+ "</td>";
	                		htmlStr += "<td align='center'>"+text.result[i].rank + "</td>";
	                		htmlStr += "</tr>";
	                    }
	                	htmlStr += "</table>";
	            		$("#detailgrid2").append(htmlStr);
	            	}else{
	                }  
	            }
	        });
	}
        function onValueChanged1(){
			grid1.clearRows();
        }
        function onValueChanged2(){
			grid2.clearRows();
        }
        function reset2(){
        	grid2.clearRows();
            form2.reset();
        }
        function reset1(){
        	grid1.clearRows();
            form1.reset();
        }
	</script>
</body>
</html>