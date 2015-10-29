<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>规则模板管理</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>

	</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
		<div id="editform" class="cxTabbox">
			<form id="form" action="#">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
							<td class="textR">
							模版名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa169" name="aaa169" class="mini-textbox" />
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
											<input id="aaa153" name="aaa153" emptyText="请选择..."
												class="mini-combobox" data="${dic['AAA153'] }" />
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
											<input id="aae100" name="aae100" emptyText="请选择..."
												class="mini-combobox" data="${dic['AAE100'] }" />
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
						<span class="iconCx">模版信息</span>
					</h3>
					<div class="fR pT5R9">
						<span class="btnMini"> <em> <input type="button"
									value="添加" onclick="add()" /> </em> </span>
						<span class="btnMini"> <em> <input id="edit"
									type="button" value="修改" onclick="edit()" /> </em> </span>
						<span class="btnMini"> <em> <input id="edBtn"
									type="button" value="启用" onclick="enableOrDisable()" /> </em> </span>
					</div>
				</div>
			
			<div onrowclick="searchRuleByModel" id="datagrid1"
				class="mini-datagrid" style="width: 100%; height: 205px;"
				idField="id" multiSelect="true" allowResize="false" pageSize="20"
				url="${pageContext.request.contextPath}/k4/f10402001/queryModelManage.action">
				<div property="columns">
					<div type="checkcolumn"></div>
					<div field="aaz320" width="100" headerAlign="center">
						模版ID
					</div>
					<div field="aaa169" width="100" headerAlign="center">
						模版名称
					</div>
					<div field="aaa153" width="100" headerAlign="center"
						type="comboboxcolumn">
						类型监控
						<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AAA153']}">
					</div>
					<div field="zlfamc" width="100" headerAlign="center">
						增量数据分析方案名称
					</div>
					<div field="sxfamc" width="100" headerAlign="center">
						实现方案名称
					</div>
					<div field="aae100" width="100" headerAlign="center"
						type="comboboxcolumn">
						当前有效标志
						<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AAE100']}">
					</div>
					<div field="aae011" width="100" headerAlign="center">
						经办人
					</div>
					<div field="aae036" width="100" headerAlign="center"
						dateFormat="yyyy-MM-dd">
						经办时间
					</div>
				</div>
		</div>

			<div class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">规则信息</span>
				</h3>
			</div>
				<div id="datagrid2" class="mini-datagrid"
					style="width: 100%; height: 160px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402001/queryRule.action">
					<div property="columns">
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
					</div>
				</div>
		
	</body>
</html>
<!--导出Excel相关HTML-->
<form id="excelForm" method="post" target="excelIFrame">
	<input type="hidden" name="columns" id="excelData" />
</form>
<iframe id="excelIFrame" name="excelIFrame" style="display: none;"></iframe>
<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("datagrid1");
	var grid2 = mini.get("datagrid2");
	grid1.load();
	
	grid1.on("drawcell", function (e) {
        var record = e.record,
        column = e.column,
        field = e.field,
        value = e.value;
       
        if (field == "aae100" && value == '0') {
            e.rowStyle = "color:red";
        }
    });

	grid2.on("drawcell", function (e) {
        var record = e.record,
        column = e.column,
        field = e.field,
        value = e.value;
     
        if (field == "aae100" && value == '0') {
            e.rowStyle = "color:red";
        }
       

    });
	
	var form = new mini.Form("#form");
	
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
	function search(){
		var data = form.getData(true);
		grid1.load(data); 
		grid2.clearRows();
	}
	
    function resetForm(){
   		form.reset();
    }
    
    function searchRuleByModel(){
    	changeBtnText();
    	var row=grid1.getSelected();
    	if(row){
    		grid2.load(row);
    	}else{
    		grid2.clearRows(); 
    	}
		
    }
    
    function add(){
	        mini.open({
	            url: "../pages/k4/f10402001/f10402001_add.jsp",
	            title: "新增规则模板", width: 800, height: 450,
	            width:600,
				height:280,
				onload:function(){
					var iframe = this.getIFrameEl();
					iframe.contentWindow.SetData();	
				},
				ondestroy:function(action){
					if(action=='ok'){
						grid1.reload();
					}
				}
	        });
	    }
	
	function edit(){
		var rows=grid1.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			mini.open({
				url:"../pages/k4/f10402001/f10402001_edit.jsp",
				title:"修改规则模板",
				 width:600,
				height:280,
				onload:function(){
					var iframe = this.getIFrameEl();
					var data = {aaz320 : row.aaz320};
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
	
	 function openQueryScheme(){
    	mini.open({
	            url: "../pages/k4/f10402001/f10402001_query.jsp",
	            title: "请选择方案", width: 800, height: 450,
	            width:800,
				height:450
	        });
    }
    function enableOrDisable(){
		var rows = grid1.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			var type;
			if(row.aae100=='0'){
				type=1;
			}else{
				type=0;
			}
			var data={aaz320:row.aaz320,aae100:type};
			$.ajax({
            url: "${pageContext.request.contextPath}/k4/f10402001/updateModelManageAae100.action",
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
            				grid1.reload();
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
		var row=grid1.getSelected();
		if(row.aae100=='1'){
			$("#edBtn").val('禁用');
			$("#edit").attr("disabled", false);
		}else{
			$("#edBtn").val('启用');
			$("#edit").attr("disabled", true);
		}
	}
	
</script>
