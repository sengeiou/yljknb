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
								知识点类别：
							</td>
							<td>
								<div class="inputL" style="width: 140px">
									<div class="inputR">
										<div class="inputC">
											<input name="zsdlb" class="mini-combobox"
											 data="${dic['ZSDLB'] }" /> 
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								知识点名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input  name="zsdmc" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								知识点描述：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="zsdgzms" class="mini-textbox"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">
								规则类别：
							</td>
							<td>
								<div class="inputL" style="width: 140px">
									<div class="inputR">
										<div class="inputC">
										
											<input id="gzfl" name="ybfgzflbm" onvaluechanged="onDeptChanged"  emptyText="请选择..."
												class="mini-combobox"  url="${pageContext.request.contextPath}/k4/f10402008/getGzfl.action" />
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
												<input id="gzflmc" name="ybgzflbm" emptyText="请选择..." class="mini-combobox"  />
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
											<input id="aae100" name="sfyx" emptyText="请选择..."
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
						<span class="btnMini"> <em> <input id="edit"
									type="button" value="修改" onclick="edit()" /> </em> </span>
						<span class="btnMini"> <em> <input id="edBtn"
									type="button" value="启用" onclick="enableOrDisable()" /> </em> </span>
					</div>
				</div>
			
			<div id="datagrid1"
				class="mini-datagrid" style="width: 100%; height: 375px;" onrowclick="changeBtnText"
				idField="id" multiSelect="true" allowResize="false" pageSize="20"
				url="${pageContext.request.contextPath}/k4/f10402008/queryZsdWithPage.action">
				<div property="columns">
					<div type="checkcolumn"></div>
					<div field="ybfgzflmc" width="100" headerAlign="center">
						规则类别
					</div>
					<div field="ybgzflmc" width="100" headerAlign="center">
						规则名称
					</div>
					<div field="zsdbm" width="100" headerAlign="center">
						知识点编码
					</div>
					<div field="zsdmc" width="100" headerAlign="center">
						知识点名称
					</div>
					<div field="zsdlb" width="100" headerAlign="center">
						知识点类别
					</div>
					<div field="zsdgzms" width="100" headerAlign="center">
						知识点描述
					</div>
					<div field="sfyx" width="100" headerAlign="center"
						type="comboboxcolumn">
						当前有效标志
						<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AAE100']}">
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
	grid1.load();

	var gzfl = mini.get("gzfl");
    var gzflmc = mini.get("gzflmc");
    
    grid1.on("drawcell", function (e) {
        var record = e.record,
        column = e.column,
        field = e.field,
        value = e.value;

        //违规明细,红色标识
        if (field == "sfyx" && value == '0') {
            e.rowStyle = "color:red";
        }

    });
    function onDeptChanged(e) {
        var id = gzfl.getValue();
        gzflmc.setValue("");
        alert('');
        var url = "${pageContext.request.contextPath}/k4/f10402008/getGzflxx.action?id=" + id;
        gzflmc.setUrl(url);
        positionCombo.select(0);
    }
	
	grid1.on("drawcell", function (e) {
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

	function enableOrDisable(){
		var rows = grid1.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			var type;
			if(row.yxbz=='0' || row.yxbz==null){
				type=1;
			}else{
				type=0;
			}
			var data={id:row.ybgzmxid};
			$.ajax({
            url: "${pageContext.request.contextPath}/k4/f10402008/startOrEnd.action",
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
	}
	
    function resetForm(){
   		form.reset();
    }
    
   
	
	function edit(){
		var rows=grid1.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			mini.open({
				url:"../pages/k4/f10402008/f10402008_edit.jsp",
				title:"修改条件逻辑数据",
				 width:650,
				height:480,
				onload:function(){
					var iframe = this.getIFrameEl();
					var data = {zsdid : row.ybgzmxid,ybgzbm:row.ybgzbm,xgbz:row.xgbz};
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
		if(row.sfyx=='1'){
			$("#edBtn").val('禁用');
			$("#edit").attr("disabled", false);
		}else{
			$("#edBtn").val('启用');
			$("#edit").attr("disabled", true);
		}
	}
	
</script>
