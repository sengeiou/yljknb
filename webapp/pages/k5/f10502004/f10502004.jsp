<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<title>维护信息审核</title>
	<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/scripts/swfupload.js"></script>
		<script type="text/javascript">
		var Shifou = [{id:0,text:'是'},{id:1,text:'否'}];
		var Yxbz = [{ id: 0, text: '启用' }, { id: 1, text: '禁用'}];
		var ShZt = [{ id: 0, text: '待审核' }, { id: 1, text: '审核通过'}, { id: 2, text: '审核不通过'}];
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
   <body style="overflow-x: hidden; overflow-y: hidden;">
   <div id="detail_tabs" class="mini-tabs" activeIndex="0"
			style="height: 620px; border: 0;" plain="false" buttons="#tabsButtons">
			<div title="医疗服务机构维护">
			<div id="editForm1" class="cxTabbox" >
				<table style="width:100%;" class="cxTab">
					<tr>
						<td class="textR">
							医疗机构编码：
						</td>
						<td>
					     	<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz107" name="aaz107" class="mini-buttonedit"
												onbuttonclick="openQueryModel" allowInput="false" />
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
											<input id="aae016" name="aae016" class="mini-combobox"  data="ShZt" value="0"/>
									</div>
							  </div>
						  </div>
						</td>
						<td class="textR">
							统筹区编码：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input id="aaa027" name="aaa027" emptyText="请选择..." class="mini-combobox" data="${dic['AAA027']}"/>
									</div>
							  </div>
						  </div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							维护开始时间：
						</td>
						<td>
					     	<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae036s1" name="aae036s" format="yyyy-MM-dd" 
											onvaluechanged="onValueChanged" class="mini-datepicker" />
										</div>
									</div>
							</div>
						</td>
						<td class="textR">
							维护结束时间：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input id="aae036e1" name="aae036e"  format="yyyy-MM-dd" 
											onvaluechanged="onValueChanged" class="mini-datepicker" />
									</div>
							  </div>
						  </div>
						</td>
						<td style="text-align: center; padding-bottom: 5px;" >
								<input type="button" value="" class="cxsubmit" onclick="searchyy();"/>
								<input type="button" value="" class="cxreset" onclick="resetFormyy();" />
							</td>
					</tr>
				   </table>
					</div>
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">医疗服务机构审核信息</span>
					</h3>
					<div class="fR pT5R9">
					<span class="btnMini"><em><input type="button" onClick="auditPassyy();" value="审核通过"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="auditNotPassyy();" value="审核不通过"/></em></span>
					 </div>
		          </div>
                  <div id="datagrid1"  class="mini-datagrid"
					style="width: 100%; height: 420px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20" required="required"
					url="${pageContext.request.contextPath}/k5/f10502001/queryKb41Message.action">
					<div property="columns">
						<div type="indexcolumn" ></div>
						<div field="aae016" headerAlign="center" type="comboboxcolumn" width="100">
							审核状态<input property="editor"  class="mini-combobox" style="width:100%;" data="ShZt" />
						</div>
						<div field="apa120" type="comboboxcolumn" headerAlign="center" width="100">
							维护标志<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['APA120']}" />
						</div>
						<div field="akb020" headerAlign="center" width="130">
							医疗服务机构编码
						</div>
						<div field="akb021" headerAlign="center"  width="130">
							医疗服务机构名称
						</div>
						<div field="akb022" width="130" type="comboboxcolumn" headerAlign="center">
							医疗服务机构类别<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AKB022']}" />
						</div>
						<div field="aka101" width="100" type="comboboxcolumn" headerAlign="center">
							医院等级<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AKA101']}" />
						</div>
						<div field="aab304" width="100" headerAlign="center">
							机构负责人
						</div>
						<div field="aab062" width="100" headerAlign="center">
							分管医保负责人
						</div>
						<div field="aae004" width="100" headerAlign="center">
							医保联系人
						</div>
						<div field="akf015" width="100" headerAlign="center">
							床位数
						</div>
						<div field="aae006" width="100" headerAlign="center">
							地址
						</div>
						<div field="aae005" width="100" headerAlign="center">
							联系电话
						</div>
						<div field="aae007" width="100" headerAlign="center">
							邮政编码
						</div>
						<div field="aae011" width="100" headerAlign="center">
							维护人
						</div>
						<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">
							维护时间
						</div>
						<div field="baz048"  visible="false">医疗机构维护id</div>
					</div>
				</div>
			</div>
			<div title="科室信息维护">
			 <div id="editForm2" class="cxTabbox" >
				<table style="width:100%;" class="cxTab">
					<tr>
						<td class="textR">
							医疗机构编码：
						</td>
						<td>
					     	<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz107" name="aaz107" class="mini-buttonedit"
												onbuttonclick="openQueryModel(this);" allowInput="false" />
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
											<input id="aae016" name="aae016" class="mini-combobox"  data="ShZt" value="0"/>
									</div>
							  </div>
						  </div>
						</td>
						<td class="textR">
							统筹区编码：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input id="aaa027" name="aaa027" emptyText="请选择..." class="mini-combobox" data="${dic['AAA027']}"/>
									</div>
							  </div>
						  </div>
						</td>
					</tr>
					<tr>
					  <td class="textR">
							科室编码：
						</td>
						<td>
					     	<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz307" name="aaz307" class="mini-textbox" />
										</div>
									</div>
							</div>
						</td>
						<td class="textR">
							维护开始时间：
						</td>
						<td>
					     	<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae036s2" name="aae036s" format="yyyy-MM-dd" 
											onvaluechanged="onValueChanged" class="mini-datepicker"/>
										</div>
									</div>
							</div>
						</td>
						<td class="textR">
							维护结束时间：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input id="aae036e2" name="aae036e"  format="yyyy-MM-dd" 
											onvaluechanged="onValueChanged" class="mini-datepicker" />
									</div>
							  </div>
						  </div>
						</td>
						<td style="text-align: center; padding-bottom: 5px;" >
								<input type="button" value="" class="cxsubmit" onclick="searchks();"/>
								<input type="button" value="" class="cxreset" onclick="resetFormks();" />
							</td>
					</tr>
				   </table>
					</div>
					<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">医疗服务机构科室审核信息</span>
					</h3>
					<div class="fR pT5R9">
					<span class="btnMini"><em><input type="button" onClick="auditPassks();" value="审核通过"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="auditNotPassks();" value="审核不通过"/></em></span>
					 </div>
		          </div>
                <div id="datagrid2"  class="mini-datagrid"
						style="width: 100%; height: 420px;" idField="id"
						multiSelect="true" allowResize="false" pageSize="20"
						url="${pageContext.request.contextPath}/k5/f10502002/queryKf66Message.action">
						<div property="columns">
							<div type="indexcolumn" ></div>
                            <div field="aae016" width="100" type="comboboxcolumn" headerAlign="center">
								审核状态<input property="editor"  class="mini-combobox" style="width:100%;" data="ShZt" />
							</div>
							<div field="apa120" headerAlign="center" width="100" type="comboboxcolumn">
								维护标志<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['APA120']}" />
							</div>
							<div field="akb021" headerAlign="center" width="130">
								医疗服务机构名称
							</div>
							<div field="aaa027" headerAlign="center" width="100">
								统筹区编码
							</div>
							<div field="aaz307" width="100" headerAlign="center">
							           科室编码
						   </div>
							<div field="akf001" width="100" type="comboboxcolumn" headerAlign="center">
								科室类别<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AKF001']}" />
							</div>
							<div field="aae386" width="100" headerAlign="center">
							           科室名称
						   </div>
							<div field="akf015" width="100" headerAlign="center">
								床位数
							</div>
							<div field="aae011" width="100" headerAlign="center">
								维护人
							</div>
							<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">
								维护时间
							</div>
							<div field="aae100" width="100" type="comboboxcolumn" headerAlign="center">
								有效标志<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AAE100']}" />
							</div>
							<div field="baz047"  visible="false">科室维护记录id</div>
						</div>
					</div>
			</div>
				<div title="医护人员维护">
				<div id="editForm3" class="cxTabbox" >
				<table style="width:100%;" class="cxTab">
					<tr>
							<td class="textR">
							医疗机构编码：
						</td>
						<td>
					     	<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz107" name="aaz107" class="mini-buttonedit"
												onbuttonclick="openQueryModel(this);" allowInput="false" />
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
											<input id="aae016" name="aae016" class="mini-combobox"  data="ShZt" value="0"/>
									</div>
							  </div>
						  </div>
						</td>
						<td class="textR">
							统筹区编码：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input id="aaa027" name="aaa027" emptyText="请选择..." class="mini-combobox" data="${dic['AAA027']}"/>
									</div>
							  </div>
						  </div>
						</td>
						<td class="textR">
							医护人员姓名：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input id="aac003" name="aac003" class="mini-textbox" />
									</div>
							  </div>
						  </div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							医护人员编码：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input id="aaz263" name="aaz263"  class="mini-textbox" />
									</div>
							  </div>
						  </div>
						</td>
						<td class="textR">
							维护开始时间：
						</td>
						<td>
					     	<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
										<input id="aae036s3" name="aae036s" format="yyyy-MM-dd" 
											onvaluechanged="onValueChanged" class="mini-datepicker" />
										</div>
									</div>
							</div>
						</td>
						<td class="textR">
							维护结束时间：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input id="aae036e3" name="aae036e"  format="yyyy-MM-dd" 
											onvaluechanged="onValueChanged" class="mini-datepicker"/>
									</div>
							  </div>
						  </div>
						</td>
						<td style="text-align: center; padding-bottom: 5px;" >
								<input type="button" value="" class="cxsubmit" onclick="searchys();"/>
								<input type="button" value="" class="cxreset" onclick="resetFormys();" />
							</td>
					</tr>
				   </table>
					</div>
						<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">医护人员审核信息</span>
					</h3>
					<div class="fR pT5R9">
					<span class="btnMini"><em><input type="button" onClick="auditPassys();" value="审核通过"/></em></span>
					<span class="btnMini"><em><input type="button" onClick="auditNotPassys();" value="审核不通过"/></em></span>
					 </div>
		          </div>
                <div id="datagrid3"  class="mini-datagrid"
						style="width: 100%; height: 420px;" idField="id"
						multiSelect="true" allowResize="false" pageSize="20"
						url="${pageContext.request.contextPath}/k5/f10502003/queryKf65Message.action">
						<div property="columns">
							<div type="indexcolumn" ></div>
                            <div field="aae016" width="100" type="comboboxcolumn" headerAlign="center">
								审核状态<input property="editor"  class="mini-combobox" style="width:100%;" data="ShZt" />
							</div>
							<div field="apa120" type="comboboxcolumn" headerAlign="center" width="100">
								维护标志<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['APA120']}" />
							</div>
							<div field="akb021" headerAlign="center" width="130">
								医疗服务机构名称
							</div>
							<div field="aae386" headerAlign="center" width="100">
								科室名称
							</div>
							<div field="aac003" width="100" headerAlign="center">
							          医护人员姓名
						   </div>
							<div field="aab014" width="100" headerAlign="center">
								公民身份号码
							</div>
							<div field="akc049" width="100" type="comboboxcolumn" headerAlign="center">
							           行政职务<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AKC049']}" />
						   </div>
							<div field="aaf009" width="100" type="comboboxcolumn" headerAlign="center">
								专业技术职务<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AAF009']}" />
							</div>
							<div field="aaz263" width="100" headerAlign="center">
								医护人员编号
							</div>
							<div field="akc054" width="130" headerAlign="center">
								医师资格证编码
							</div>
							<div field="akc056" width="130" headerAlign="center">
								医师执业证编码
							</div>
							<div field="akc057" width="100" headerAlign="center">
								第一执业地点
							</div>
							<div field="akc051" type="comboboxcolumn" name="akc051" autoShowPopup="true" width="100" headerAlign="center" >
							           多点执业标志<input property="editor"  class="mini-combobox" style="width:100%;" data="Shifou" />  
					     	</div>
					     	<div field="akc052" type="comboboxcolumn" name="akc052" autoShowPopup="true" width="120" headerAlign="center" >
							           门诊大病医师标识<input property="editor"  class="mini-combobox" style="width:100%;" data="Shifou" />  
					     	</div>
					     	<div field="akc053" type="comboboxcolumn" name="akc053" autoShowPopup="true" width="140" headerAlign="center" >
							           医师医保服务资格状态<input property="editor"  class="mini-combobox" style="width:100%;" data="Shifou" />  
					     	</div>
							<div field="aae005" width="100" headerAlign="center">
								联系电话
							</div>
							<div field="aae013" width="100" headerAlign="center">
								备注
							</div>
							<div field="akc278" width="100" headerAlign="center" type="comboboxcolumn">
								药师类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKC278']}">
							</div>
							<div field="akc279" width="100" headerAlign="center" type="comboboxcolumn">
								药师执业类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKC279']}">
							</div>
							<div field="akc281" width="100" headerAlign="center" type="comboboxcolumn">
								药师执业范围<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKC281']}">
							</div>
							<div field="akc282" width="140" headerAlign="center">
								执业药师资格证书编号
							</div>
							<div field="akc283" width="140" headerAlign="center">
								执业药师注册证编号
							</div>
							<div field="aae011" width="100" headerAlign="center">
								维护人员
							</div>
							<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">
								维护时间
							
						</div>
					</div>
			</div>
		</div>
	</div>	
</body>
<script type="text/javascript">
mini.parse();
var grid1 = mini.get("datagrid1");
searchyy();
var grid2 = mini.get("datagrid2");
searchks();
var grid3 = mini.get("datagrid3");
searchys();
function openQueryModel(e){
    	var bnEdit = this;
    	
		mini.open({
	            url: "../pages/k5/f10502003/f10502003_suoshukeshi.jsp",
	            title: "",
	            width:800,
				height:425,
				ondestroy: function (action) {
				 		if(action=="ok"){
				 			var iframe = this.getIFrameEl();
                			var data = iframe.contentWindow.GetData();
                			data = mini.clone(data);
                			bnEdit.setValue(data.aaz107);
                			bnEdit.setText(data.aaz107);
				            mini.get("aaz107").setValue(data.aaz107);
				            mini.get("aaz107").setText(data.akb020);
						}
					 }
	      		  });	
	        }
	 function auditPassyy(){
				var row = grid1.getSelected();
				if (row) {
					if(row.aae016==0){
						mini.confirm("确认审核通过","确认",
							function(action){
								if (action == "ok"){
									$.ajax({
						     		url:"${pageContext.request.contextPath}/k5/f10502004/auditPassyy.action?method=auditPassyy",
						     		type:"post",
						     		data: {baz048 : row.baz048},
						     		success: function (text){
						     			if(text.success){
						     				mini.showMessageBox({
					        				title: "提示",
					        				message: " 审核通过操作成功",
					        				buttons: ["确定"],
					        				iconCls: "mini-messagebox-info",
					        				callback: function(action){
				            					var form = new mini.Form("editForm1");
												var data = form.getData(true,false);
													grid1.load(data);
				         					}});
						     			}
				     				}
				     				});
								}
							}
						);
					}else{
						mini.alert("该记录已审核!");
					}
				} else {
					mini.alert("请选择一条记录!");
				}
				
			}
		function auditNotPassyy(){
				var row = grid1.getSelected();
				if (row) {
					if(row.aae016==0){
						mini.confirm("确认审核不通过","确认",
							function(action){
								if (action == "ok"){
									$.ajax({
						     		url:"${pageContext.request.contextPath}/k5/f10502004/auditNotPassyy.action?method=auditNotPassyy",
						     		type:"post",
						     		data: {baz048 : row.baz048},
						     		success: function (text){
						     			if(text.success){
						     				mini.showMessageBox({
					        				title: "提示",
					        				message: " 审核不通过操作成功",
					        				buttons: ["确定"],
					        				iconCls: "mini-messagebox-info",
					        				callback: function(action){
				            					var form = new mini.Form("editForm1");
												var data = form.getData(true,false);
													grid1.load(data);
				         					}});
						     			}
				     				}
				     				});
								}
							}
						);
					}else{
						mini.alert("该记录已审核!");
					}
				} else {
					mini.alert("请选择一条记录!");
				}
				
			}
		
		function auditPassks(){
				var row = grid2.getSelected();
				if (row) {
					if(row.aae016==0){
						mini.confirm("确认审核通过","确认",
							function(action){
								if (action == "ok"){
									$.ajax({
						     		url:"${pageContext.request.contextPath}/k5/f10502004/auditPassks.action?method=auditPassks",
						     		type:"post",
						     		data: {baz047 : row.baz047,apa120 : row.apa120},
						     		success: function (text){
						     			if(text.success){
						     				mini.showMessageBox({
					        				title: "提示",
					        				message: " 审核通过操作成功",
					        				buttons: ["确定"],
					        				iconCls: "mini-messagebox-info",
					        				callback: function(action){
				            					var form = new mini.Form("editForm2");
												var data = form.getData(true,false);
													grid2.load(data);
				         					}});
						     			}
				     				}
				     				});
								}
							}
						);
					}else{
						mini.alert("该记录已审核!");
					}
				} else {
					mini.alert("请选择一条记录!");
				}
				
			}
		function auditNotPassks(){
				var row = grid2.getSelected();
				if (row) {
					if(row.aae016==0){
						mini.confirm("确认审核不通过","确认",
							function(action){
								if (action == "ok"){
									$.ajax({
						     		url:"${pageContext.request.contextPath}/k5/f10502004/auditNotPassks.action?method=auditNotPassks",
						     		type:"post",
						     		data: {baz047 : row.baz047,apa120 : row.apa120},
						     		success: function (text){
						     			if(text.success){
						     				mini.showMessageBox({
					        				title: "提示",
					        				message: " 审核不通过操作成功",
					        				buttons: ["确定"],
					        				iconCls: "mini-messagebox-info",
					        				callback: function(action){
				            					var form = new mini.Form("editForm2");
												var data = form.getData(true,false);
													grid2.load(data);
				         					}});
						     			}
				     				}
				     				});
								}
							}
						);
					}else{
						mini.alert("该记录已审核!");
					}
				} else {
					mini.alert("请选择一条记录!");
				}
				
			}
		function auditPassys(){
			var row = grid3.getSelected();
			if (row) {
				if(row.aae016==0){
					mini.confirm("确认审核通过","确认",
						function(action){
							if (action == "ok"){
								$.ajax({
					     		url:"${pageContext.request.contextPath}/k5/f10502004/auditPassys.action?method=auditPassys",
					     		type:"post",
					     		data: {baz046 : row.baz046,apa120 : row.apa120},
					     		success: function (text){
					     			if(text.success){
					     				mini.showMessageBox({
				        				title: "提示",
				        				message: " 审核通过操作成功",
				        				buttons: ["确定"],
				        				iconCls: "mini-messagebox-info",
				        				callback: function(action){
			            					var form = new mini.Form("editForm3");
											var data = form.getData(true,false);
												grid3.load(data);
			         					}});
					     			}
			     				}
			     				});
							}
						}
					);
				}else{
					mini.alert("该记录已审核!");
				}
			} else {
				mini.alert("请选择一条记录!");
			}
		}
		function auditNotPassys(){
			var row = grid3.getSelected();
			if (row) {
				if(row.aae016==0){
					mini.confirm("确认审核不通过","确认",
						function(action){
							if (action == "ok"){
								$.ajax({
					     		url:"${pageContext.request.contextPath}/k5/f10502004/auditNotPassys.action?method=auditNotPassys",
					     		type:"post",
					     		data: {baz046 : row.baz046,apa120 : row.apa120},
					     		success: function (text){
					     			if(text.success){
					     				mini.showMessageBox({
				        				title: "提示",
				        				message: " 审核不通过操作成功",
				        				buttons: ["确定"],
				        				iconCls: "mini-messagebox-info",
				        				callback: function(action){
			            					var form = new mini.Form("editForm3");
											var data = form.getData(true,false);
												grid3.load(data);
			         					}});
					     			}
			     				}
			     				});
							}
						}
					);
				}else{
					mini.alert("该记录已审核!");
				}
			} else {
				mini.alert("请选择一条记录!");
			}
			
		}
			
	function searchyy() {
		var form = new mini.Form("editForm1");
		var data = form.getData(true,false);
			grid1.load(data);
	}
    function resetFormyy(){
		var queryForm = new mini.Form("editForm1");
		queryForm.reset();
	}
	function searchks() {
		var form = new mini.Form("editForm2");
		var data = form.getData(true,false);
			grid2.load(data);
	}
    function resetFormks(){
		var queryForm = new mini.Form("editForm2");
		queryForm.reset();
	}
	function searchys() {
		var form = new mini.Form("editForm3");
		var data = form.getData(true,false);
			grid3.load(data);
	}
    function resetFormys(){
		var queryForm = new mini.Form("editForm3");
		queryForm.reset();
	}

</script>
</html>
