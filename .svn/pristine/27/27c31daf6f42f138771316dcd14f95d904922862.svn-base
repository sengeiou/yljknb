<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>外部受理疑点登记</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body style="overflow-x: hidden; overflow-y: hidden;">
	<div id="editForm1" class="cxTabbox">
			<form id="form1" action="#">
			<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
				<tr>
					<td class="textR">受理方式：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="apa703" name="apa703" class="mini-combobox" emptyText="请选择受理方式..." 
									       data="${dic['APA703']}" />
								</div>
							</div>
						</div>
					</td>
					<!-- <td class="textR">受理日期：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="ape711s" name="ape711s" format="yyyy-MM-dd" onvaluechanged="onValueChanged" 
								    	class="mini-datepicker" />
									<input id="ape711" name="ape711" class="mini-hidden" />
								</div>
							</div>
						</div>
					</td> -->
					<td class="textR">问题状态：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="apa165" name="apa165" class="mini-combobox" emptyText="请选择问题状态..." 
										data="${dic['APA165']}" />
								</div>
							</div>
						</div>
					</td>
					<td class="textR">举报人类型：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="apa704" name="apa704" class="mini-combobox"
										emptyText="请选择来源方类型..." data="${dic['APA704']}" />
								</div>
							</div>
						</div>
					</td>
					<td class="textR">举报人单位：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="ape028" name="ape028" class="mini-textbox" />
								</div>
							</div>
						</div>
					</td>
				</tr>
				
				<tr>
					<td class="textR">受理日期从：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="ape711Starts" name="ape711Starts" format="yyyy-MM-dd" 
										onvaluechanged="onValueChangedStart" class="mini-datepicker" />
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
										onvaluechanged="onValueChangedEnd" class="mini-datepicker" />
									<input id="ape711End" name="ape711End" class="mini-hidden" />
								</div>
							</div>
						</div>
					</td>
					<td class="textR">问题关键字：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="ape712" name="ape712" class="mini-textbox" />
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
				<span class="iconCx">疑点问题</span>
			</h3>
			<div class="fR pT5R9">
				<span class="btnMini">
					<em>
						<input type="button" value="简单处理" onclick="simpExcute()"/>
					</em>
				</span> 
				<span class="btnMini">
					<em>
						<input type="button" value="问题录入" onclick="add()"/>
					</em>
				</span> 
				<span class="btnMini">
					<em>
						<input type="button" value="问题修改" onclick="edit()"/>
					</em>
				</span>
				<span class="btnMini">
					<em>
						<input type="button" value="问题删除" onclick="removeWt()"/>
					</em>
				</span>
				<span class="btnMini">
					<em>
						<input type="button" value="问题详情" onclick="problemInfo()"/>
					</em>
				</span>
			</div>
		</div>
		<div id="datagrid1" class="mini-datagrid" style="width: 100%; height:340px;" idField="id" 
			multiSelect="true" allowResize="false" pageSize="10" 
			url="${pageContext.request.contextPath}/k3/f10301001/queryAuditProblem.action">
			<div property="columns">
				<div type="checkcolumn"></div>
				<div type="indexcolumn" ></div>
				<div field="operation" width="100" headerAlign="center" renderer="rendererGrid1">操作</div>
			 	<div field="aaz281" width="100" headerAlign="center">疑点问题记录ID</div>
				<div field="apa165" width="100" headerAlign="center" type="comboboxcolumn">
					问题状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA165']}">
				</div>
				<div field="ape711s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">受理日期</div>
				<div field="ape712" width="100" headerAlign="center">举报投诉内容</div>
				<div field="apa703" width="100" headerAlign="center" type="comboboxcolumn">
					受理方式<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA703']}">
				</div>
				<div field="apa704" width="100" headerAlign="center" type="comboboxcolumn">
					举报人类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA704']}">
				</div>
				<div field="apa705" width="100" headerAlign="center" type="comboboxcolumn">
					举报（投诉）方式<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA705']}">
				</div>
				<div field="ape028" width="100" headerAlign="center">举报人单位</div>
				<div field="ape713" width="100" headerAlign="center">举报人姓名</div>
				<div field="aac004" width="100" headerAlign="center" type="comboboxcolumn">
					举报人性别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC004']}">
				</div>
				<div field="aae005" width="100" headerAlign="center">举报人电话</div>
				<div field="aae006" width="100" headerAlign="center">举报人地址</div>
				<div field="aae007" width="100" headerAlign="center">举报人邮政编码</div>
				<div field="aae159" width="100" headerAlign="center">举报人邮箱</div>
				<div field="aae011" width="100" headerAlign="center">问题登记人</div>
				<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">登记时间</div>
				<div field="aaa027" width="100" headerAlign="center">统筹区</div>
				<div field="ape714" width="100" headerAlign="center">被举报对象名称</div>
				<div field="aac302" width="100" headerAlign="center">被举报对象编号</div>
				<div field="aae306" width="100" headerAlign="center">被举报对象地址</div>
				<div field="aae305" width="100" headerAlign="center">被举报对象联系电话</div>
				<div field="aae200" width="300" headerAlign="center">简单处理的处理意见</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		mini.parse();
		
		//mini.get("apa165").setValue("1");
		
		var grid1 = mini.get("datagrid1");
		var queryForm = new mini.Form("form1");
		var data = queryForm.getData();
		
		grid1.load(data);
		grid1.sortBy("aae036", "desc")
		
		function search(){
			var data = queryForm.getData();
			var json = mini.encode(data);
			grid1.load(data);
		}
	
		function add(){
	        mini.open({
	            url: "${pageContext.request.contextPath}/pages/k3/f10301001/f10301001_add.jsp",
	            title: "新增疑点问题", width: 820, height: 450,
	            onload: function () {
	                var iframe = this.getIFrameEl();
	            },
	            ondestroy: function (action) {
	                grid1.reload();
	            }
	        });
	    }
	
		function edit(){
			var row = grid1.getSelected();  //确定选中的哪一行
			if(row){
				var apa165 = row.apa165;
				if(apa165 == '2'){
					mini.alert("该疑点问题已经处理，不能修改！");
					return;
				}
				if(apa165 == '3'){
					mini.alert("该疑点问题已被立案，不能修改！");
					return;
				}
				if(apa165 == '4'){
					mini.alert("该疑点问题已被立案，不能修改！");
					return;
				}
				if(apa165 == '5'){
					mini.alert("该疑点问题已被简单处理，不能修改！");
					return;
				}
				mini.open({
					url:"${pageContext.request.contextPath}/pages/k3/f10301001/f10301001_edit.jsp",
					title:"修改疑点问题",
					width:800,
					height:400,
					onload:function(){
						var iframe = this.getIFrameEl();
						var data = {aaz281 : row.aaz281};
						iframe.contentWindow.SetData(data);	
					},
					ondestroy:function(action){
						grid1.reload();
					}
			    });
			}else{
				mini.alert("请选中一条记录");
			} 
		}
		
		function simpExcute(){
			var rows = grid1.getSelecteds();
			if(rows.length > 0){
				var ids = [];
				var apa165;
				for (var i = 0, l = rows.length; i < l; i++){
								var r = rows[i];
								apa165 = r.apa165;
								if(apa165 == '2'){
									mini.alert("该疑点问题已经处理，不能再次操作！");
									return;
								}
								if(apa165 == '3'){
									mini.alert("该疑点问题已被立案，不能处理！");
									return;
								}
								if(apa165 == '4'){
									mini.alert("该疑点问题已被立案，不能处理！");
									return;
								}
								if(apa165 == '5'){
									mini.alert("该疑点问题已被简单处理，不能再次处理！");
									return;
								}
								ids.push(r.aaz281);
				}
				var aaz281s = ids.join(',');
				mini.open({
							url: "${pageContext.request.contextPath}/pages/k3/f10301001/f1030100_jdclyyj.jsp",
							title: "简单处理",
							width: 600, 
							height: 200,
							onload: function (){
								var iframe = this.getIFrameEl();
								var data = {aaz281s: aaz281s};
								iframe.contentWindow.setData(data);
							},
							ondestroy: function (action){
								grid1.reload();
							}
				});
			}else{
				mini.alert("请选中一条记录");
			}
		}
	
		function removeWt(){
			var rows = grid1.getSelecteds();
			if(rows.length > 0){
				mini.confirm("确定删除选中的记录","确认",
					function(action){
						if (action == "ok"){
							var ids = [];
							var apa165;
							for (var i = 0, l = rows.length; i < l; i++){
								var r = rows[i];
								apa165 = r.apa165;
								if(apa165 == '2'){
									mini.alert("该疑点问题已经处理，不能删除！");
									return;
								}
								if(apa165 == '3'){
									mini.alert("该疑点问题已被立案，不能删除！");
									return;
								}
								if(apa165 == '4'){
									mini.alert("该疑点问题已被立案，不能删除！");
									return;
								}
								if(apa165 == '5'){
									mini.alert("该疑点问题已被简单处理，不能删除！");
									return;
								}
								ids.push(r.aaz281);
							}
							var id = ids.join(',');
							$.ajax({
								url: "${pageContext.request.contextPath}/k3/f10301001/deleteAuditProblem.action",
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
		
		function problemInfo(){
			var row = grid1.getSelected();//确定选中的哪一行
			if(row){
				mini.open({
					url:"${pageContext.request.contextPath}/pages/k3/f10301001/f10301001_info.jsp",
					title:"疑点问题详情",
					width:850,
					height:500,
					onload:function(){
						var iframe = this.getIFrameEl();
						var data = {aaz281 : row.aaz281};
						iframe.contentWindow.setData(data);
					},
					ondestroy:function(action){
						grid1.reload();
					}
				});
			}else{
				mini.alert("请选中一条记录"); 
			}
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
       
       //重置
       function resetProblem(){
       		queryForm.clear();
       		//mini.get("apa165").setValue("1");
       }
       
        //grid操作
		function rendererGrid1(e){
			var grid1 = e.sender;
           	var record = e.record;
           	var rowIndex = e.rowIndex;
           	//var s1 = "<a href='###' onclick = exprotWord() >导出Word</a> ";
           	var s1 = "<a href='###' onclick = exprotWord(" + record.aaz281 + ") >导出</a> ";
           	return s1;
		}
		
		function exprotWord(aaz281){
			var url = "${pageContext.request.contextPath}/k3/f10301001/exportWord_yddj.action?aaz281=" + aaz281 + "&sid="+Math.random() ;
			window.open(url);
		}
</script>
</body>
</html>
