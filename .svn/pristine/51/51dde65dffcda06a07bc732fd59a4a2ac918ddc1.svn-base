<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>询问笔录生成</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body style="overflow-x: hidden; overflow-y: hidden;">
	<div id="editForm1" class="cxTabbox">
		<div id="" style="margin:0 10px; position: relative;">
			<form id="form1" action="#">
			<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">				
				<tr>
					<td class="textR">询问时间从：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="ape711Starts" name="ape711Starts" format="yyyy-MM-dd" 
										onvaluechanged="onValueChangedStart" class="mini-datepicker" vtype="date:yyyyMMdd"/>
									<input id="ape711Start" name="ape711Start" class="mini-hidden" />
								</div>
							</div>
						</div>
					</td>
					<td class="textR">到：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="ape711Ends" name="ape711Ends" format="yyyy-MM-dd" 
										onvaluechanged="onValueChangedEnd" class="mini-datepicker" vtype="date:yyyyMMdd"/>
									<input id="ape711End" name="ape711End" class="mini-hidden" />
								</div>
							</div>
						</div>
					</td>
					<td class="textR">人员类别：</td>
					<td class="textR"><span style="color: red;">*</span>人员类别：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa065" name="apa065" class="mini-combobox" emptyText="请选择类别"
									   		data="${dic['APA065']}" textField="text" valueField="id" required="true"/>
									  </div>
								</div>
							</div> 	
						</td>
					<td style="text-align: right; padding-top: 5px; padding-right:3%;"
						colspan="4">
						<input type="button"value="" class="cxsubmit" onclick="search()" />
						<input type="reset" value="" class="cxreset" onclick="resetProblem()"/>
					</td>
				</tr>
			</table>
		</form>
		</div>
	</div>
	
	<div class="mainlistCon">
		<div class="listTit">
			<h3 class="cxTit fL">
				<span class="iconCx">笔录基本信息</span>
			</h3>
			<div class="fR pT5R9">
				<span class="btnMini">
					<em>
						<input type="button" value="询问录入" onclick="add()"/>
					</em>
				</span> 
				<span class="btnMini">
					<em>
						<input type="button" value="笔录修改" onclick="edit()"/>
					</em>
				</span>
				<span class="btnMini">
					<em>
						<input type="button" value="笔录删除" onclick="removeWt()"/>
					</em>
				</span>
				<span class="btnMini">
					<em>
						<input type="button" value="笔录详情" onclick="inquiryInfo()"/>
					</em>
				</span>
			</div>
		</div>
		<div id="datagrid1" class="mini-datagrid" style="width: 100%; height:340px;" idField="id" 
			multiSelect="true" allowResize="false" pageSize="10" allowRowSelect="true"
			url="${pageContext.request.contextPath}/k3/f10301016/queryInquiryInput.action">
			<div property="columns">
				<div type="checkcolumn"></div>
				<div type="indexcolumn" ></div>
				<div field="operation" width="100" headerAlign="center" renderer="rendererGrid1">操作</div>
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
				<div field="aaz010" width="100" headerAlign="center">被询问人ID</div>
				<div field="aac003" width="100" headerAlign="center">被询问人姓名</div>
				<div field="aac002" width="100" headerAlign="center" ">
					身份证号
				</div>
				<div field="aac004" width="100" headerAlign="center" type="comboboxcolumn">
					性别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC004']}">
				</div>
				<div field="aac005" width="100" headerAlign="center">年龄</div>
				<%--<div field="apa065" width="100" headerAlign="center">人员类别</div>--%>
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
	<script type="text/javascript">
		mini.parse();
		
		var grid1 = mini.get("datagrid1");
		var queryForm = new mini.Form("form1");
		var data = queryForm.getData();
		
		grid1.load(data);
		grid1.sortBy("aae036", "desc");
		
		function search(){
			var data = queryForm.getData();
			var json = mini.encode(data);
			grid1.load(data);
		}
	
		function add(){
	        mini.open({
	            url: "${pageContext.request.contextPath}/pages/k3/f10301016/f10301016_add.jsp",
	            title: "新增询问笔录", width: 800, height: 320,
	            onload: function () {
	                var iframe = this.getIFrameEl();
	            },
	            ondestroy: function (action) {
	                grid1.reload();
	            }
	        });
	    }
	    
	    //受理日期 开始时间
		function onValueChangedStart(){
    		var ape711StartDate = mini.get("ape711Starts").getValue();
    		mini.get("ape711Start").setValue(getDateYmd(ape711StartDate));
       }
       
       //受理日期 结束时间
       function onValueChangedEnd(){
       		var ape711EndDate = mini.get("ape711Ends").getValue();
       		var ape711StartDate = mini.get("ape711Starts").getValue();
       		if(ape711EndDate < ape711StartDate){
       			mini.alert("结束日期不能小于开始日期");
       			mini.get("ape711Ends").setValue("");
       		}else{
       			mini.get("ape711End").setValue(getDateYmd(ape711EndDate));
       		}
       }
       
       //grid操作
			function rendererGrid1(e){
				var grid1 = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	//var s1 = "<a href='###' onclick = exprotWord() >导出Word</a> ";
            	var s1 = "<a href='###' onclick = exprotWord(" + record.aaz381 + ") >导出</a> ";
            	return s1;
			}
       function edit(){
			var row = grid1.getSelected();  //确定选中的哪一行
			if (row != null) {
				mini.open({
					url:"${pageContext.request.contextPath}/pages/k3/f10301016/f10301016_edit.jsp",
					title:"修改询问笔录",
					width:850,
					height:400,
					onload:function(){
						var iframe = this.getIFrameEl();
						var data = {aaz381 : row.aaz381};
						iframe.contentWindow.SetData(data);	
					},
					ondestroy:function(action){
						grid1.reload();
					}
			    });
			}
			else{
				mini.alert("请选中一条记录");
			} 
		}
		function exprotWord(aaz381){
			var url = "${pageContext.request.contextPath}/k3/f10301016/exportWord_bl.action?aaz381=" + aaz381 + "&sid="+Math.random() ;
			window.open(url);
		}
		//导出Word
		/* function exprotWord() {
			data = grid1.getSelected ();
			json = mini.encode(data);
			//mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
			window.location.href="${pageContext.request.contextPath}/k3/f10301016/exportWord.action?submitData="+json;
			//queryForm.action="${pageContext.request.contextPath}/k3/f10301016/exportWord.action?submitData="+json;
			//queryForm.submit();
			
			/*
			$.ajax({
		     		url:"${pageContext.request.contextPath}/k3/f10301016/exportWord.action",
		     		type:"post",
		     		data: { submitData: json },
		     		success: function (text) {
		     			mini.unmask(document.body);
		            	  mini.showMessageBox({
		            	  	title: "提示",
		            	  	message: "成功导出一条记录",
		            	  	buttons: ["确定"],
		            	  	iconCls: "mini-messagebox-info",
		            	  	callback: function(action){
		            	  		grid1.reload();
		            	  		closeWin();
		            	  	}
		            	  });
		     		}
		     	});
		     	
		} */
       //重置
       function resetProblem(){
       		queryForm.clear();
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
			
			function removeWt(){
				var rows = grid1.getSelecteds();
				if(rows.length > 0){
					mini.confirm("确定删除选中的记录","确认",
						function(action){
							if (action == "ok"){
								var ids = [];
								for (var i = 0, l = rows.length; i < l; i++){
									var r = rows[i];
									ids.push(r.aaz381);
								}
								var id = ids.join(',');
								$.ajax({
									url: "${pageContext.request.contextPath}/k3/f10301016/deleteInquiry.action",
									post:"post",
									data: {submitIds: id},
									success: function (text) {
					                    grid1.reload();
					                },
					                error: function () {
					                }
								}); 
							}else{
								//mini.alert("---------final-------");
							}
						}
					); 
				}else{
					mini.alert("请选中一条记录");
				}
			}
			
			function inquiryInfo(){
			var row = grid1.getSelected();  //确定选中的哪一行
			if (row != null) {
				mini.open({
					url:"${pageContext.request.contextPath}/pages/k3/f10301016/f10301016_info.jsp",
					title:"询问笔录详情",
					width:850,
					height:400,
					onload:function(){
						var iframe = this.getIFrameEl();
						var data = {aaz381 : row.aaz381};
						iframe.contentWindow.SetData(data);	
					},
					ondestroy:function(action){
						grid1.reload();
					}
			    });
			}
			else{
				mini.alert("请选中一条记录");
			} 
		}
</script>
</body>
</html>
