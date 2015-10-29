<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>方案管理</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<div>
			<div id="editForm1"  class="cxTabbox">
				<form id="form" action="#">
					<table  class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
						    <td class="textR">
								方案名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa201" name="aaa201" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								方案分类：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa143" name="aaa143" class="mini-combobox"
												emptyText="选择方案分类..." data="${dic['AAA143'] }" />
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
											<input id="aae100" name="aae100" class="mini-combobox"
												emptyText="选择标志状态..." data="${dic['AAE100'] }" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">
								经办人：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae011" name="aae011" class="mini-textbox"  />
												
										</div>
									</div>
								</div>
							</td>
							<td style="text-align: center; padding-top: 1px;" colspan="2">
								<input type="button" value="" class="cxsubmit" onclick="search();"/>
								<input type="button" value="" class="cxreset" onclick="resets();" />
							</td>
						</tr>
						 
					</table>
				</form>
			</div>
		</div>

		<div class="mainlistCon" style="padding-top: 2px;">
			<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">方案信息</span>
					</h3>
					<div class="fR pT5R9">
						<span class="btnMini">
							<em>
								<input type="button" value="添加" onclick="add()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" id="editBtn" value="修改" onclick="edit()"/>
							</em>
						</span>	
						<span class="btnMini">
							<em>
								<input type="button" id="typeBtn" value="启用" onclick="enablePlan()"/>
							</em>
						</span>
					</div>
				</div>
				
				<div id="datagrid1" class="mini-datagrid"
					style="width: 100%; height: 405px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20" onrowclick="changeBtnText" 
					url="${pageContext.request.contextPath}/k4/f10401001/queryPlanManage.action">
					<div property="columns" >
						<div type="checkcolumn"></div>
						<div field="aaa201" width="100" headerAlign="center">
							方案名称
						</div>
						<div field="aaa143" width="100" headerAlign="center" type="comboboxcolumn">
							方案分类
							<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AAA143']}">
						</div>
						<div field="aaa026" width="100"	headerAlign="center" type="comboboxcolumn">
							实现类型
							<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AAA026']}">
						</div>
						<div field="aaa133" width="100" headerAlign="center">
							方案描述
						</div>
						<div field="aae100" width="100" headerAlign="center" type="comboboxcolumn">
							有效标志
							<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AAE100']}">
						</div>
						<div field="aae011" width="100" headerAlign="center">
							经办人
						</div>
						<div field="aae036" width="100" dateFormat="yyyy-MM-dd" headerAlign="center">
							经办时间
						</div>
					</div>
				</div>
			</div>
		    <!--导出Excel相关HTML-->
		     <form id="excelForm"  method="post" target="excelIFrame">
	        <input type="hidden" name="columns" id="excelData" />
	    	</form>
	    <iframe id="excelIFrame" name="excelIFrame" style="display:none;"></iframe>
	</body>
</html>
<script type="text/javascript">
		mini.parse();
		var grid1 = mini.get("datagrid1");
		var queryForm = new mini.Form("editForm1");
		grid1.sortBy("aae100", "asc");
		grid1.load();
		var form = new mini.Form("#form");
		
		grid1.on("drawcell", function (e) {
        var record = e.record,
        column = e.column,
        field = e.field,
        value = e.value;

        //违规明细,红色标识
        if (field == "aae100" && value == '0') {
            e.rowStyle = "color:red";
        }

    });
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
		
	}
		  function resets(){
   			form.reset();
   			 
   		}
		
		 function add(){
	        mini.open({
	            url: "../pages/k4/f10401001/f10401001_add.jsp",
	            title: "新增方案信息", width: 800, height: 250,
	            width:550,
				height:250,
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
		var row = grid1.getSelected();//确定选中的哪一行
		if(row){
			mini.open({
				url:"../pages/k4/f10401001/f10401001_edit.jsp",
				title:"修改方案信息",width: 800, height: 250,
				width:550,
				height:280,
				onload:function(){
					var iframe = this.getIFrameEl();
					var data = {aaz100 : row.aaz100};
					iframe.contentWindow.SetData(data);	
				},
				ondestroy:function(action){
					search();
				}
		    });
		}else{
			mini.alert("请选中一条记录");
		} 
	}
		
function enablePlan(){
		var rows = grid1.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			var type;
			if(row.aae100=='1'){
				type=1;
			}else{
				type=0;
			}
			var data={aaz100:row.aaz100,aae100:type};
			$.ajax({
            url: "${pageContext.request.contextPath}/k4/f10401001/startPlanManage.action",
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
		var dom1=document.getElementById("typeBtn");
		if(row.aae100=='1'){
			/* mini.get("typeBtn").setText('禁用');
			mini.get("editBtn").setEnabled(true); */
			dom1.value="禁用";
			var dom2=document.getElementById("editBtn");
			dom2.disabled=false;
		}else{
			/* mini.get("editBtn").setEnabled(false);
			mini.get("typeBtn").setText('启用'); */
			dom1.value="启用";
			
			var dom2=document.getElementById("editBtn");
			dom2.disabled=true;
						
			
		}
	}
  function ExportExcel() {
	            var excelForm = document.getElementById("excelForm");
	            
	            var aaa201 = mini.get("aaa201").getValue();
	            var aaa143 = mini.get("aaa143").getValue();
	            var aae100 = mini.get("aae100").getValue();
	            var aae011 = mini.get("aae011").getValue();
	            
	            
	            excelForm.action = "${pageContext.request.contextPath}/common/excelExport.action?classname=f10401001VS&aaa201=" + aaa201+"&aaa143="+aaa143+"&aae100="+aae100+"&aae011="+aae011;
	            excelForm.submit();
	        }
</script>