<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>分析规则定制</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
		<div>
			<div id="editform" class="cxTabbox">
				<form id="form" action="#">
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
												data="${dic['AAA027'] }" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								分析主题名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="aae417" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								适用对象类型：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="apa709" class="mini-combobox"
												data="${dic['APA709'] }" />
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
			</div>
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">分析主题信息</span>
					</h3>
					<div class="fR pT5R9">
						<span class="btnMini"> <em> <input type="button"
									value="添加" onclick="add()" /> </em> </span>
						<span class="btnMini"> <em> <input id="editBtn"
									type="button" value="修改" onclick="edit()" /> </em> </span>
						<span class="btnMini"> <em> <input id="tjBtn"
									type="button" value="统计期别维护" onclick="updateAae043()" /> </em> </span>
						<span class="btnMini"> <em> <input id="edBtn"
									type="button" value="启用" onclick="enableOrDisable()" /> </em> </span>
					</div>
				</div>
				<div id="datagrid" class="mini-datagrid" onrowclick="changeBtnText"
					style="width: 100%; height: 401px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402003/queryAnalysisRule.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div field="aaa027" width="100" headerAlign="center"
							type="comboboxcolumn">
							统筹区
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA027']}">
						</div>
						<div field="aae417" width="100" headerAlign="center">
							分析主题名称
						</div>
						<div field="ape032" width="100" headerAlign="center"
							type="comboboxcolumn">
							统计周期
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['APE032']}">
						</div>
						<div field="aaa152" width="100" headerAlign="center">
							参数列表
						</div>
						<div field="aae043" width="100" headerAlign="center">
							最后统计期别
						</div>
						<div field="aae100" width="100" headerAlign="center"
							type="comboboxcolumn">
							启用标志
							<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAE100']}">
						</div>
						<div field="aae011" width="100" headerAlign="center">
							分析定制人
						</div>
						<div field="aae036" width="100" headerAlign="center"
							dateFormat="yyyy-MM-dd">
							分析定制时间
						</div>
						<div field="aaa133" width="100" headerAlign="center">
							分析描述
						</div>
					</div>
			</div>
	</body>
</html>
<script type="text/javascript">
		mini.parse();
	var grid=mini.get("datagrid");
	grid.load();
	var form = new mini.Form("#form");

	grid.on("drawcell", function (e) {
        var record = e.record,
        column = e.column,
        field = e.field,
        value = e.value;
        if (field == "aae100" && value == '0') {
            e.rowStyle = "color:red";
        }
    });
	
	function search(){
		var data = form.getData(true,false);
		grid.load(data);
	}
	
	function resetForm(){
		form.reset();
	}
	
	function add(){
		mini.open({
	            url: "../pages/k4/f10402003/f10402003_add.jsp",
	            title: "新增分析规则",
	            width:550,
				height:220,
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
	            url: "../pages/k4/f10402003/f10402003_edit.jsp",
	            title: "修改分析规则", width: 800, height: 350,
	            width:550,
				height:220,
				onload:function(){
					var data={id:row.aaz319};
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
	
	function updateAae043(){
		var rows=grid.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			mini.open({
	            url: "../pages/k4/f10402003/f10402003_updateAae043.jsp",
	            title: "修改分析规则", width: 300, height: 200,
	            width:300,
				height:100,
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
            url: "${pageContext.request.contextPath}/k4/f10402003/updateAnalysisRuleAae100.action",
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
            	  mini.mini.alert(text.msg);
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
			$("#tjBtn").attr("disabled", false);
		}else{
			$("#edBtn").val('启用');
			$("#editBtn").attr("disabled", true);
			$("#tjBtn").attr("disabled", true);
		}
	}
</script>