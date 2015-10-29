<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>分析疑点问题</title>
		<%@ include file="/pages/pub/pubsource.jsp"%>
		<script type="text/javascript">
			var monit = [{'id':'1','text':'系统监控'}];
			var sourceType = [{'id':'22','text':'本单位其他部门'}];
			var way = [{'id':'8','text':'分析'}];
		</script>
	</head>
	<body>
		<form id="form1" action="" method="post">
			<input id="" name="" class="mini-hidden" />
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div id="editForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
						<td class="textR"><span style="color: red;">*</span>受理方式：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa703" name="apa703" class="mini-combobox" emptyText="请选择..."
								   			   data="monit" textField="text" valueField="id" required="true"
								   			   onvaluechanged="accept" value="1"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>受理日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape711s" name="ape711s" format="yyyy-MM-dd" class="mini-datepicker" 
								   			   onvaluechanged="onValueChanged" vtype="date:yyyyMMdd" allowInput="false"/>
										<input id="ape711" name="ape711" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>统筹区：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaa027" name="aaa027" class="mini-combobox" emptyText="请选择..."
								   				data="${dic['AAA027']}" textField="text" valueField="id" required="true"/>
									</div>
								</div>
							</div>
						</td>	
					</tr>
					<tr>
						<td class="textR"><span style="color: red;">*</span>信息来源方类型：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa704" name="apa704" class="mini-combobox" emptyText="请选择..."
											data="sourceType" textField="text" valueField="id" required="true"
											onvaluechanged="infoSource" value="22"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR"><span style="color: red;">*</span>来源方名称：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape028" name="ape028" class="mini-textbox" required="true" 
											vtype="maxLength:50"/>
									</div>
								</div>
							</div>
						</td>
						<!-- <td class="textR"><span style="color: red;">*</span>来源方联系人：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape713" name="ape713" class="mini-textbox" required="true" vtype="maxLength:50"/>
									</div>
								</div>
							</div>
						</td> -->
						<td class="textR"><span style="color: red;">*</span>信息来源方式：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa705" name="apa705" class="mini-combobox" emptyText="请选择..."
									   		data="way" textField="text" valueField="id" required="true"
									   		onvaluechanged="sourceWay" value="8"/>
									  </div>
								</div>
							</div> 	
						</td>
					</tr>
					<tr>
						<td class="textR">邮政编码：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae007" name="aae007" class="mini-textbox" onvalidation="onPostbox"/>
									 </div>
								</div>
							</div> 	
						</td>
						<td class="textR">地址：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae006" name="aae006" class="mini-textbox" required="true" vtype="maxLength:150"/>
									 </div>
								</div>
							</div> 	
						</td>
						<td class="textR"><span style="color: red;">*</span>联系电话：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae005" name="aae005" class="mini-textbox" onvalidation="onPhone"/>
									 </div>
								</div>
							</div> 	
						</td>
					</tr>
					<tr>
						<td class="textR">电子邮箱：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aae159" name="aae159" class="mini-textbox" vtype="email" vtype="maxLength:50"/>
									</div>
								</div>
							</div> 		
						</td>
					</tr>
					<tr>
						<td class="textR"><span style="color: red;">*</span>问题简述：</td>
						<td colspan="6">
							<div style="padding-right:10px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input id="ape712" name="ape712" class="mini-textarea" 
										 style="width:100%;height:100px;" required="true" vtype="maxLength:4000"/>
								</div>
								<div class="textareaBl">
									<div class="textareaBr">
										<div class="textareaBc">
										</div>
									</div>
								</div>
							</div>
						</td>
						</tr>
						<tr>
							<td style="text-align: right; padding-top: 5px; padding-right:10px;"
								colspan="6" class="mainlistCon">
								<span class="btnMini">
									<em>
										<input type="button" value="保存" onclick="SaveData()"/>
									</em>
								</span>
								<span class="btnMini">
									<em>
										<input type="button" value="清空" onclick="clearProblem()"/>
									</em>
								</span>
								<span class="btnMini">
									<em>
										<input type="button" value="返回" onclick="closeWin()"/>
									</em>
								</span>
							</td>
						</tr>
					</table>
				</div>
			</fieldset>
		</form>
		<script type="text/javascript">
			mini.parse();
			
			mini.get("ape711s").setValue(new Date());
			var ape711Date = mini.get("ape711s").getValue();
			mini.get("ape711").setValue(getDateYmd(ape711Date));
			
			var form = new mini.Form("form1");
			
			//信息录入
			function SaveData() {
		        var data = form.getData(); 
		        form.validate();
		        if (form.isValid() == false) {
		            return;
		        }
		        var json = mini.encode(data);
		        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
		        $.ajax({
		            url: "${pageContext.request.contextPath}/k3/f10301001/saveAuditProblem.action",
		            type: "post",
		            data: { submitData: json },
		            success: function (text) {
		            	mini.unmask(document.body);
		            	if(text.success){
		            	 	mini.showMessageBox({
		        				title: "提示",
		        				message: "成功添加一条记录",
		        				buttons: ["确定"],
		        				iconCls: "mini-messagebox-info",
		        				callback: function(action){
		            				closeWin();
		         			}});        	  
		            	}else{
		            	  mini.alert(text.msg);
		                }  
		            }
		        });
		    }
			
			function onValueChanged(){
		    	var ape711Date = mini.get("ape711s").getValue();
		    	var currDate = new Date();
		    	if(ape711Date < currDate){
		    		mini.get("ape711").setValue(getDateYmd(ape711Date));
		    	}else{
		    		mini.alert("受理日期不能大于当前日期");
		    		mini.get("ape711s").setValue(new Date());
		    		mini.get("ape711").setValue(getDateYmd(new Date()));
		    	}
		    }
			
			//清空
		    function clearProblem(){
		    	form.clear();
		    	
		    	mini.get("ape711s").setValue(new Date());
				var ape711Date = mini.get("ape711s").getValue();
				mini.get("ape711").setValue(getDateYmd(ape711Date));
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
		     
		      //验证邮编
		    function onPostbox(e){
		    	if(e.isValid){
		    		if(isPostbox(e.value) == false){
		    			e.errorText = "邮编必须是6位数字";
                    	e.isValid = false;
                    	//mini.alert(e.errorText);
		    		}
		    	}
		    }
		    
		    function isPostbox(v){
		    	var post = /^\d{6}$/;
		    	if(post.test(v)){
		    		return true;
		    	}
		    	return false;
		    }
		    
		    //验证手机号
		    function onPhone(e){
		    	if(e.isValid){
		    		if(isPhone(e.value) == false){
		    			e.errorText = "联系方式必须是 7 - 12 位数字";
                    	e.isValid = false;
                    	//mini.alert(e.errorText);
		    		}
		    	}
		    }
		    
		    function isPhone(v){
		    	var tel = /^\d{7,12}$/;
		    	if(tel.test(v)){
		    		return true;
		    	}
		    	return false;
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
		</script>
	</body>
</html>