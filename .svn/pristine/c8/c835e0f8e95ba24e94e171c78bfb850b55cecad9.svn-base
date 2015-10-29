<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>就诊信息</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<input id="aac001" name="aac001" value="" class="mini-hidden" required="true"/>
					<div id="" style="margin: 10px; position: relative;">
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
							<tr>
								<td class="textR">就诊起始年月：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae041" name="aae041" value="" class="mini-textbox" required="true"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR">就诊终止年月：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae042" name="aae042" value="" class="mini-textbox" required="true"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR">就诊类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka130" name="aka130" class="mini-combobox" emptyText="请选择..." 
													data="${dic['AKA130']}" textField="text" valueField="id" required="true"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR">医疗机构类别：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akb022" name="akb022" class="mini-combobox"
													data="${dic['AKB022']}" textField="text" valueField="id"
													required="true" emptyText="请选择..." />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">医疗机构ID：</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaz107" name="aaz107" class="mini-buttonedit"
													onbuttonclick="onButtonEdit1" emptyText="" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">疾病分类：</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka122" name="aka122" class="mini-buttonedit"
													onbuttonclick="onButtonEdit2" emptyText="" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">收费项目等级：</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka065" name="aka065" class="mini-combobox"
													data="${dic['AKA065']}" textField="text" valueField="id"
													required="true" emptyText="请选择..." />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">三大目录类别：</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="ake003" name="ake003" class="mini-combobox"
													data="${dic['AKE003']}" textField="text" valueField="id"
													required="true" emptyText="请选择..." />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">发票项目类别：</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka063" name="aka063" class="mini-combobox"
													data="${dic['AKA063']}" textField="text" valueField="id"
													required="true" emptyText="请选择..." />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">费用统计类别：</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="tjlb" name="tjlb" class="mini-combobox"
													data="${dic['TJLB']}" textField="text" valueField="id"
													required="true" emptyText="请选择..." />
											</div>
										</div>
									</div>
								</td>
								<td style="text-align: right; padding-top: 5px; padding-right:5px;"
									colspan="6">
									<input type="button"value="" class="cxsubmit" onclick="search()" />
									<input type="reset" value="" class="cxreset" onclick="resetForm()"/>
								</td>
							</tr>
						</table>
					</div>
				</form>
			</div>
		</fieldset>
		
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<div id="tabs" name="tabs" class="mini-tabs" activeIndex="0" style="width:100%;height:430px;" plain="false">
				<div title="就诊信息" id="tab1" name="tab1">
					<div class="mainlistCon">
						<div class="listTit">
							<h3 class="cxTit fL"><span class="iconCx" id="titleText">就诊信息</span></h3>
							<div class="fR pT5R9">
								<span class="btnMini">
									<em>
										<input type="button" value="问题登记" onclick="regProblem()"/>
									</em>
								</span>
							</div>
						</div>
						<div id="grid1" class="mini-datagrid" idField="id"   onrowclick="queryDetail" 
							onselectionchanged="onSelectionChanged" selectOnLoad="true"
							multiSelect="false" style="width: 100%; height: 160px;" allowResize="true" 
							url="${pageContext.request.contextPath}/k6/f10601001/loadInsurVis.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<!-- <div field="operate" width="100" headerAlign="center" align="center" allowSort="true" renderer="showDetail">详细</div> -->
								<div field="aaz217" width="100" headerAlign="center" align="center" allowSort="true" visible="false">就诊号</div>
								<div field="aac003" width="100" headerAlign="center" align="center" allowSort="true">姓名</div>
								<div field="aac004" width="100" headerAlign="center" allowSort="true" type="comboboxcolumn">
				                 	性别<input property="editor" class="mini-combobox" style="width: 100%" data="${dic['AAC004']}">
			                	</div>
								<div field="aac002" width="100" headerAlign="center" align="center" allowSort="true">社会保障号码</div>
								<div field="akb021" width="100" headerAlign="center" align="center" allowSort="true">医疗服务机构</div>
								<div field="aae004" width="100" headerAlign="center" align="center" allowSort="true">医师</div>
								<div field="aka130" width="100" headerAlign="center" align="center" allowSort="true" type="comboboxcolumn">
									就诊类别<input property="editor" class="mini-combobox" style="width: 100%" data="${dic['AKA130']}">
								</div>
								<div field="aka122" width="100" headerAlign="center" align="center" allowSort="true" type="comboboxcolumn">
									疾病分类<input property="editor" class="mini-combobox" style="width: 100%" data="${dic['AKA122']}">
								</div>
								<div field="aae030" width="100" headerAlign="center" align="center" allowSort="true" dateFormat="yyyy-MM-dd">
									入院日期
								</div>
								<div field="aae031" width="100" headerAlign="center" align="center" allowSort="true" dateFormat="yyyy-MM-dd">
									出院日期
								</div>
								<div field="akc264" width="100" headerAlign="center" align="center" allowSort="true">总费用</div>
								<div field="ake039" width="100" headerAlign="center" align="center" allowSort="true">基本医疗统筹支出</div>
								<div field="akc190" width="100" headerAlign="center" align="center" allowSort="true">门诊号</div>
								<div field="akc194" width="100" headerAlign="center" align="center" allowSort="true" dateFormat="yyyy-MM-dd HH:mm:ss">
									就诊时间
								</div>
								<div field="akc021" width="100" headerAlign="center" align="center" allowSort="true" type="comboboxcolumn">
									结算类别<input property="editor" class="mini-combobox" style="width: 100%" data="${dic['AKC021']}">
								</div>
								<div field="ake024" width="100" headerAlign="center" align="center" allowSort="true">症状描述</div>
								<div field="aaz307" width="100" headerAlign="center" align="center" allowSort="true">科室</div>
								<div field="ake038" width="100" headerAlign="center" align="center" allowSort="true">个人账户支出</div>
								<div field="akb067" width="100" headerAlign="center" align="center" allowSort="true">个人现金</div>
								<div field="akc254" width="100" headerAlign="center" align="center" allowSort="true">自付金额</div>
								<div field="akc253" width="100" headerAlign="center" align="center" allowSort="true">自费金额</div>
								<div field="ake029" width="100" headerAlign="center" align="center" allowSort="true">大额医疗</div>
								<div field="ake035" width="100" headerAlign="center" align="center" allowSort="true">公务员</div>
								<div field="ake043" width="100" headerAlign="center" align="center" allowSort="true">离休</div>
								<div field="ake032" width="100" headerAlign="center" align="center" allowSort="true">伤残军人</div>
								<div field="ake042" width="100" headerAlign="center" align="center" allowSort="true">老红军</div>
								<div field="aka151" width="100" headerAlign="center" align="center" allowSort="true">起付标准</div>
								<div field="aka153" width="100" headerAlign="center" align="center" allowSort="true">封顶线</div>
								<div field="ake092" width="100" headerAlign="center" align="center" allowSort="true">年度支付</div>
								<div field="aac001" width="100" headerAlign="center" align="center" allowSort="true" visible="false">
									个人编号
								</div>
								<div field="aaz263" width="100" headerAlign="center" align="center" allowSort="true" visible="false">
									医师编号
								</div>
							</div>
						</div>
					</div>
					<div class="mainlistCon">
						<div class="listTit">
							<h3 class="cxTit fL"><span class="iconCx">处方和诊疗信息</span></h3>
						</div>
						<div id="grid2" class="mini-datagrid" idField="id" multiSelect="true"
	     					style="width:100%;height:160px;" allowResize="true"
	             			url="${pageContext.request.contextPath}/k6/f10601001/loadInsurPres.action">
	             			<div property="columns">
	             				<div type="indexcolumn"></div>
	             				<div field="aaz210" width="100" headerAlign="center" allowSort="true">处方编号</div>
			              		<div field="aac003" width="100" headerAlign="center" allowSort="true">处方医师</div>
			              		<div field="aaz328k" width="100" headerAlign="center" allowSort="true" visible="false">处方违规</div>
			              		<div field="aaz328m" width="100" headerAlign="center" allowSort="true" visible="false">明细违规</div>
			              		<div field="aae317k" width="100" headerAlign="center" allowSort="true" visible="false">处方提示</div>
			              		<div field="aae317m" width="100" headerAlign="center" allowSort="true" visible="false">明细提示</div>
			              		<div field="akc221" width="100" headerAlign="center" allowSort="true" dateFormat="yyyy-MM-dd HH:mm:ss">
			              			处方时间
			              		</div>
			              		<div field="aae019" width="100" headerAlign="center" allowSort="true">处方金额</div>
			              		<div field="aka017" width="100" headerAlign="center" allowSort="true" type="comboboxcolumn">
			              			处方类型<input property="editor" class="mini-combobox" style="width: 100%" data="${dic['AKA017']}">
			              		</div>
			              		<div field="ake002" width="100" headerAlign="center" allowSort="true">三目名称</div>
			              		<div field="akc226" width="100" headerAlign="center" allowSort="true">数量</div>
			              		<div field="akc225" width="100" headerAlign="center" allowSort="true">单价</div>
			              		<div field="akb065" width="100" headerAlign="center" allowSort="true">合计</div>
			              		<div field="akc229" width="100" headerAlign="center" allowSort="true">用药天数</div>
			              		<div field="akc231" width="100" headerAlign="center" allowSort="true">药量天数</div>
			              		<div field="aka081" width="100" headerAlign="center" allowSort="true">药量天数</div>
			              		<div field="aka029" width="100" headerAlign="center" allowSort="true">医保基本药代码</div>
			              		<div field="aka031" width="100" headerAlign="center" allowSort="true">一级分类</div>
			              		<div field="aka032" width="100" headerAlign="center" allowSort="true">二级分类</div>
			              		<div field="aka033" width="100" headerAlign="center" allowSort="true">三级分类</div>
			              		<div field="aka070" width="100" headerAlign="center" allowSort="true">药品剂型</div>
			              		<div field="ake004" width="100" headerAlign="center" allowSort="true">生产地</div>
			              		<div field="aka166" width="100" headerAlign="center" allowSort="true">国家基本药标志</div>
			              		<div field="aka064" width="100" headerAlign="center" allowSort="true">处方药</div>
			              		<div field="aka184" width="100" headerAlign="center" allowSort="true">贵重药</div>
			              		<div field="aka187" width="100" headerAlign="center" allowSort="true">儿童用药</div>
			              		<div field="aka169" width="100" headerAlign="center" allowSort="true">谈判药</div>
			              		<div field="aka170" width="100" headerAlign="center" allowSort="true">管控药</div>
			              		<div field="aka196" width="100" headerAlign="center" allowSort="true">抗微生物药</div>
			              		<div field="aac004" width="100" headerAlign="center" allowSort="true">限制性别</div>
			              		<div field="aka065" width="100" headerAlign="center" allowSort="true">收费等级</div>
			              		<div field="ake003" width="100" headerAlign="center" allowSort="true">三目类别</div>
			              		<div field="aka063" width="100" headerAlign="center" allowSort="true">发票类别</div>
			              		<div field="aaz217" width="100" headerAlign="center" allowSort="true">就诊编号</div>
			              		<div field="aaz213" width="100" headerAlign="center" allowSort="true" visible="false">处方明细ID</div>
			              		<div field="ake001" width="100" headerAlign="center" allowSort="true" visible="false">三目ID</div>
	             			</div>
	             		</div>
					</div>
				</div>
				<div title="历史违规记录" id="tab2" name="tab2">
					<div class="mainlistCon">
						<div class="listTit">
							<h3 class="cxTit fL"><span class="iconCx" id="titleText">处方和诊疗信息</span></h3>
						</div>
						<div id="grid3" class="mini-datagrid" idField=" idmultiSelect="false" 
							style="width: 100%; height:360px;" allowResize="true"
						 	url="${pageContext.request.contextPath}/k6/f10601001/loadViolateRecord.action">
						 	<div property="columns">
						 		<div type="indexcolumn"></div>
						 		<div field="apa701" width="100" headerAlign="center" align="center" allowSort="true" type="comboboxcolumn">
									稽核类型<input property="editor" class="mini-combobox" style="width: 100%" data="${dic['APA701']}">
								</div>
								<div field="aae189" width="100" headerAlign="center" align="center" allowSort="true">结论批示意见</div>
								<div field="apa005" width="100" headerAlign="center" align="center" allowSort="true" type="comboboxcolumn">
									结论类型<input property="editor" class="mini-combobox" style="width: 100%" data="${dic['APA005']}">
								</div>
								<div field="ape726" width="100" headerAlign="center" align="center" allowSort="true" type="comboboxcolumn">
									稽核结论<input property="editor" class="mini-combobox" style="width: 100%" data="${dic['APA726']}">
								</div>
								<div field="ape727" width="100" headerAlign="center" align="center" allowSort="true">定论日期</div>
								<div field="ape752" width="100" headerAlign="center" align="center" allowSort="true">违规金额</div>
								<div field="ape008" width="100" headerAlign="center" align="center" allowSort="true">当事人</div>
								<div field="aaz010" width="100" headerAlign="center" align="center" allowSort="true" visible="false">
									对象ID
								</div>
						 	</div>
						 </div>
					</div>
				</div>
			</div>
		</fieldset>
		
		<div style="margin:10px;text-align:right;" class="mainlistCon">
			<span class="btnMini">
				<em>
					<input type="button" value="返回" onclick="closeWin()" id="b_btn" name="b_btn"/>
				</em>
			</span>
		</div>
		
		<script type="text/javascript">
			mini.parse();
			
			var form = new mini.Form("form1");
			
			var grid1 = mini.get("grid1");
			var grid2 = mini.get("grid2");
			var grid3 = mini.get("grid3");
			
			//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			mini.get("aac001").setValue(data.aac001);
     			mini.get("aae041").setValue(data.aae041);
     			mini.get("aae042").setValue(data.aae041);
     			search();
     		}
     		
     		//查询
     		function search(){
     			var data = form.getData(true);
     			var json = mini.encode(data);
     			grid1.load({submitData : json});
     			grid3.load({submitData : json});
     		}
     		
     		function onSelectionChanged(e){
     			var grid = e.sender;
     			var record = grid.getSelected();
     			if (record){
     				grid2.load({aaz217:record.aaz217});
     			}
     		}
			
			//弹出医疗机构
			function onButtonEdit1(e){
				var btnEdit = this;
				mini.open({
					url:"${pageContext.request.contextPath}/pages/pub/selectMedi.jsp",
					title:"查询案件信息",
					width: 800,
                	height: 480,
                	ondestroy: function (action){
                		if (action == "ok"){
                			var iframe = this.getIFrameEl();
                			var data = iframe.contentWindow.GetData();
                			data = mini.clone(data);
                			btnEdit.setValue(data.aaz107);
                			btnEdit.setText(data.aaz107);
                		}
                	}
				});
			}
			
			//弹出疾病分类
			function onButtonEdit2(e){
				var btnEdit = this;
				mini.open({
					url:"${pageContext.request.contextPath}/pages/pub/selectDise.jsp",
					title:"查询疾病信息",
					width: 800,
                	height: 480,
                	ondestroy: function (action){
                		if (action == "ok"){
                			var iframe = this.getIFrameEl();
                			var data = iframe.contentWindow.GetData();
                			data = mini.clone(data);
                			btnEdit.setValue(data.aka122);
                			btnEdit.setText(data.aka122);
                		}
                	}
				});
			}
			
			//问题登记
			function regProblem(){
				mini.open({
		            url: "${pageContext.request.contextPath}/pages/pub/analproblem.jsp",
		            title: "分析疑点问题", 
		            width: 800, 
		            height: 300,
		            onload: function () {
		                var iframe = this.getIFrameEl();
		            },
		            ondestroy: function (action) {
		                grid1.reload();
		            }
	        	});
			}
			
			function closeWin(){
				CloseWindow();
			}
			
			function CloseWindow(action) {            
		         if (window.CloseOwnerWindow){
		              return window.CloseOwnerWindow(action);
		         }else{
		             window.close();
		         }            
		     }
		     
		     function getDateYmd(date){   
			    var thisYear = date.getFullYear() + "";   
			    var thisMonth = date.getMonth() + 1 + "";   
			    //如果月份长度是一位则前面补0   
			    if(thisMonth<10) thisMonth = "0" + thisMonth;   
			       
			    var thisDay = date.getDate() + "";   
			    //如果天的长度是一位则前面补0   
			    if(thisDay<10) thisDay = "0" + thisDay;
			       
			    return thisYear + "" + thisMonth + "" + thisDay + "";   
			}
			
			function resetForm(){
				mini.get("akb022").setValue("");
				mini.get("aaz107").setValue("");
				mini.get("aka122").setValue("");
				mini.get("aka130").setValue("");
			}
		</script>
	</body>
</html>