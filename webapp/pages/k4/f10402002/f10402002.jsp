<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>监控规则定制</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>

	</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
		<div>
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
							<td class="textR">
								统筹区编码：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aaa027" class="mini-combobox"
												data="${dic['AAA027'] }" emptyText="请选择..." />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								规则编号：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aaa168" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								规则名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aaa167" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								监控类型：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aaa153" class="mini-combobox"
												data="${dic['AAA153'] }" emptyText="请选择..." />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							
							<td class="textR">
								规则描述：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aaa133" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								有效标志：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aae100" class="mini-combobox"
												data="${dic['AAE100'] }" emptyText="请选择..." />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								对象类型：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="apa709" class="mini-combobox"
												data="${dic['APA709'] }" emptyText="请选择..." />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								规则医疗分类：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aaa178" class="mini-combobox"
												data="${dic['AAA178'] }" emptyText="请选择..." />
										</div>
									</div>
								</div>
							</td>
							<td style="text-align: center; padding-top: 5px;" colspan="2">
								<input type="button" value="" class="cxsubmit"
									onclick="search();" />
								<input type="button" value="" class="cxreset"
									onclick="resetForm();" />
							</td>
						</tr>
					</table>
				</form>
			</div>
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">监控规则信息</span>
					</h3>
					<div class="fR pT5R9">
						<span class="btnMini"> <em> <input type="button"
									value="添加" onclick="add()" /> </em> </span>
						<span class="btnMini"> <em> <input id="editBtn"
									type="button" value="修改" onclick="edit()" /> </em> </span>
						<span class="btnMini"> <em> <input id="edBtn"
									type="button" value="启用" onclick="enableOrDisable()" /> </em> </span>
					</div>
				</div>
				<div id="datagrid1" class="mini-datagrid" onrowclick="changeBtnText"
					style="width: 100%; height: 378px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402002/queryRuleList.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div field="aaa027" width="100" headerAlign="center"
							type="comboboxcolumn">
							统筹区编码
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA027']}">
						</div>
						<div field="aaa168" width="100" headerAlign="center">
							规则编号
						</div>
						<div field="aaa167" width="100" headerAlign="center">
							规则名称
						</div>
						<div field="aaa133" width="100" headerAlign="center">
							规则描述
						</div>
						<div field="aaa154" width="100" headerAlign="center"
							type="comboboxcolumn">
							阈值比较方式
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA154']}">
						</div>
						<div field="aaa179" width="100" headerAlign="center"
							type="comboboxcolumn">
							场景粒度
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA179']}">
						</div>
						<div field="aaa153" width="100" headerAlign="center"
							type="comboboxcolumn">
							监控类型
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA153']}">
						</div>
						<div field="apa709" width="100" headerAlign="center"
							type="comboboxcolumn">
							对象类型
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['APA709']}">
						</div>
						<div field="aaa105" width="100" headerAlign="center">
							增量方案参数说明
						</div>
						<div field="aae317" width="100" headerAlign="center">
							实现方案参数说明
						</div>
						<div field="aae100" width="100" headerAlign="center"
							type="comboboxcolumn">
							规则启用标志
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAE100']}">
						</div>
						<div field="aae011" width="100" headerAlign="center">
							规则定制人
						</div>
						<div field="aae036" width="100" headerAlign="center"
							dateFormat="yyyy-MM-dd">
							规则定制时间
						</div>
					</div>
				</div>
	</body>
</html>
<script type="text/javascript">
	mini.parse();
	var grid=mini.get("datagrid1");
	grid.load();
	var form = new mini.Form("#form1");

	grid.on("drawcell", function (e) {
        var record = e.record,
        column = e.column,
        field = e.field,
        value = e.value;

        //违规明细,红色标识
        if (field == "aae100" && value == '0') {
            e.rowStyle = "color:red";
        }

    });
	
	function search(){
		var data = form.getData(true);
		grid.load(data);
	}
	
	function resetForm(){
		form.reset();
	}
	
	function add(){
		mini.open({
	            url: "../pages/k4/f10402002/f10402002_add.jsp",
	            title: "新增监控规则", width: 800, height: 350,
	            width:600,
				height:420,
				onload:function(){
					var iframe = this.getIFrameEl();
					iframe.contentWindow.SetData();	
				},
				ondestroy:function(action){
					search();	
				}
	        });
	}
	
	function edit(){
		var rows=grid.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			mini.open({
	            url: "../pages/k4/f10402002/f10402002_edit.jsp",
	            title: "修改监控规则", width: 800, height: 350,
	            width:600,
				height:420,
				onload:function(){
					var data={aaz319:row.aaz319};
					var iframe = this.getIFrameEl();
					iframe.contentWindow.SetData(data);	
				},
				ondestroy:function(action){
					search();
				}
	        });
		}else{
			mini.alert('请选择一条记录');		
		}
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
	function enableOrDisable(){
		var rows = grid.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			var type;
			if(row.aae100=='0'){
				type=1;
			}else{
				type=0;
			}
			var data={aaz319:row.aaz319,aae100:type};
			$.ajax({
            url: "${pageContext.request.contextPath}/k4/f10402002/updateRuleAae100.action",
            type: "post",
            data: data,
            success: function (text) {
            	mini.unmask(document.body);
            	if(text.success){
            	 	mini.showMessageBox({
        				title: "提示",
        				message: getMsg(row),
        				buttons: ["确定"],
        				iconCls: "mini-messagebox-info",
        				callback: function(action){
            				closeWin();
            				search();
         				}
         			});
            	}else{
            	  mini.alert(text.msg);
                }  
            }
        });
		}else{
			mini.alert("请选中一条记录");
		}
	}
	
	function getMsg(row){
		var msg;
		if(row.aae100=='1'){
			msg="禁用成功";
		}else{
			msg="启用成功";
		}
		return msg;
	}
	
	function changeBtnText(){
		var row=grid.getSelected();
		if(row.aae100=='1'){
			$("#edBtn").val('禁用');
			$("#editBtn").attr("disabled", false);
		}else{
			$("#edBtn").val('启用');
			$("#editBtn").attr("disabled", true);
		}
	}
</script>
