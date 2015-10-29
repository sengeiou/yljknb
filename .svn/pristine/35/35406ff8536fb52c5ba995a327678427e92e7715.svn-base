<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>关联询问笔录</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<div id="" style="margin-top:0px; position: relative;">
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<input id="aaz281" name="aaz281" value="" class="mini-hidden" />
					<input id="abz001" name="abz001" value="" class="mini-hidden" />
					<input id="abb006" name="abb006" value="" class="mini-hidden" />	
					<input id="aaa027" name="aaa027" value="" class="mini-hidden" />	
					<input id="aaz318" name="aaz318" value="" class="mini-hidden" />
					<input id="apf094" name="apf094" value="" class="mini-hidden" />
					<input id="type" name="type" value="" class="mini-hidden" />
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<td class="textR">统筹区：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<%--<input id="aaa027" name="aaa027" class="mini-textBox" vtype="float" />
										--%>
											<input id="aaa027" name="aaa027" class="mini-combobox" emptyText="请选择统筹区"
								   				data="${dic['AAA027']}" textField="text" valueField="id" required="true"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">询问时间：</td>
							<td>
								<div class="inputL" style="width:130px">
								 	<div class="inputR">
								 		<div class="inputC">
											<input id="ape712s" name="ape712s" format="yyyy-MM-dd" 
										onvaluechanged="onValueChangedApe712" class="mini-datepicker" vtype="date:yyyyMMdd" />
											<input id="ape712Start" name="ape712Start" class="mini-hidden" value=""/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							
							<td style="text-align: right; padding-top: 5px; padding-right: 10px;"
								colspan="4">
								<input type="button" value="" class="cxsubmit" onclick="search()"/>
								<input type="reset" value="" class="cxreset" onclick="resetForm()"/>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<fieldset style="border: solid 0px #aaa; position: relative;">
			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit fL"><span class="iconCx">笔录信息</span></h3>
				</div>
					<div style="margin:0px;">
							<div class="mainlistCon">
								<div id="datagrid1" class="mini-datagrid" style="width: 100%; height: 250px;" allowResize="true"
									 allowCellEdit="false" allowRowSelect="true" allowCellSelect="true" idField="id" multiSelect="false" 
									 showPager="false"  url="${pageContext.request.contextPath}/k3/f10301004/queryInquiryInput.action">
									<div property="columns">
										<div type="checkcolumn"></div>
										<div type="indexcolumn" ></div>
									 	<div field="aaz381" width="100" headerAlign="center">询问笔录ID</div>
										<div field="aaa027" width="100" headerAlign="center" type="comboboxcolumn">
											统筹区<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAA027']}">
										</div>
										<div field="ape712" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">询问时间</div>
										<div field="aae007" width="100" headerAlign="center">询问地点</div>
										<div field="ape134" width="100" headerAlign="center" ">
											询问人
										</div>
										<div field="ape135" width="100" headerAlign="center" ">
											记录人
										</div>
										<div field="aac002" width="100" headerAlign="center" ">
											身份证号
										</div>
										<div field="aac003" width="100" headerAlign="center">被询问人姓名</div>
										<div field="aac004" width="100" headerAlign="center" type="comboboxcolumn">
											性别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC004']}">
										</div>
										<div field="aac005" width="100" headerAlign="center">年龄</div>
										<div field="apa065" width="100" headerAlign="center" type="comboboxcolumn">
											人员类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA065']}">
										</div>
										<div field="ape029" width="100" headerAlign="center">工作单位</div>
										<div field="aae006" width="100" headerAlign="center">家庭地址</div>
										<div field="aae005" width="100" headerAlign="center">联系电话</div>
										<div field="aae013" width="300" headerAlign="center">备注</div>
									</div>
								</div>
							</div>
					</div>
					<div style="margin:10px;text-align:center;" class="mainlistCon">
						<span class="btnMini">
							<em>
								<input type="button" value="关联" onclick="save()" id="s_btn" name="s_btn"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="返回" onclick="closeWin()" id="b_btn" name="b_btn"/>
							</em>
						</span>
				    </div>
			    </div>
			</fieldset>

		
		<script type="text/javascript">
			mini.parse();
			
			var form = new mini.Form("form1");
			var grid1 = mini.get("datagrid1");
			var queryForm = new mini.Form("editForm1");
			var data;
			
			function setData(data){
				data = mini.clone(data);
				mini.get("aaz318").setValue(data.aaz318);
				grid1.load();
			}
			
			
			function save(){
				var row = grid1.getSelecteds();
				var aaz381 = row[0].aaz381;
				var aaz318 = mini.get("aaz318").getValue();
					$.ajax({
		                url: "${pageContext.request.contextPath}/k3/f10301004/relateRecord.action?method=relateRecord",
		                type: "post",
		                data: { aaz381:aaz381,
		                		aaz318:aaz318
		                		},
		                success: function (text) {
		                    if(text.success){
		                    	mini.showMessageBox({
		                    		title: "提示",
				            		message: "关联成功",
				            		buttons: ["确定"],
				            		iconCls: "mini-messagebox-info",
				            		callback: function(action){
				            			closeWin();
				            		}
		                    	});
		                    }else{
		                        mini.alert(text.msg);
		                    }
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
		     
			function onValueChangedApe712(){
	    		var ape712 = mini.get("ape712s").getValue();
	    		mini.get("ape712Start").setValue(getDateYmd(ape712));
	       }
			
			function getDateYmd(date) {
		    	var year = date.getFullYear();
		    	var month = date.getMonth() + 1;
		    	
		    	if (month.toString().length == "1") {
					month = "0" + month;
				}
		    	var day = date.getDate();
		    	if (day.toString().length == "1") {
					day = "0" + day;
				}
		    	var time = year + "" + month + "" + day;
		    	return time;
		    	
		    }
			
			function resetForm(){
				var queryForm = new mini.Form("editForm1");
				queryForm.reset();
			}
			
			function search(){
				var data = queryForm.getData(true,false);
				grid1.load(data);
			}
		</script>
	</body>
</html>
