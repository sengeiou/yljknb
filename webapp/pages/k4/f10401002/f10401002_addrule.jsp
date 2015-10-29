<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>规则模版管理</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>

</head>
<body>
	<form id="form" action="#">

		<div id="queryForm" class="cxTabbox">

			<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
				<tr>
					<td>规则编号：</td>
					<td>
						<div class="inputL" style="width: 120px">
							<div class="inputR">
								<div class="inputC">
									<input id="aaa168" name="aaa168" class="mini-textbox" />
								</div>
							</div>
						</div></td>
					<td>监控类型：</td>
					<td>
						<div class="inputL" style="width: 120px">
							<div class="inputR">
								<div class="inputC">
									<input id="aaa153" name="aaa153" class="mini-combobox"
										data="${dic['AAA153'] }" />
								</div>
							</div>
						</div></td>
					<td>对象类型：</td>
					<td>
						<div class="inputL" style="width: 120px">
							<div class="inputR">
								<div class="inputC">
									<input id="apa709" name="apa709" class="mini-combobox"
										data="${dic['APA709'] }" />
								</div>
							</div>
						</div></td>
					<td style="text-align: center; padding-top: 5px;" colspan="2">
						<input type="button" value="" class="cxsubmit" onclick="search();" />
						<input type="button" value="" class="cxreset" onclick="resets();" />
					</td>
				</tr>
			</table>

		</div>


		<div>
			<div class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">规则信息</span>
				</h3>
				<div class="fR pT5R9">
					<!-- <span class="bnt"><a class="mini-button" plain="true"
							iconCls="icon-save" onClick="save();">保存</a> </span>
						<span class="bnt"><a class="mini-button" plain="true"
							iconCls="icon-close" onClick="close();">关闭</a> </span> -->
					<span class="btnMini"> <em> <input type="button"
							value="添加" onclick="save()" /> </em> </span> <span class="btnMini"> <em>
							<input type="button" value="关闭" onclick="closeWin()" /> </em> </span>
				</div>
			</div>
			<div >
				<div id="datagrid1" class="mini-datagrid"
					onrowclick="searchThreshold" style="width: 100%; height: 180px;"
					idField="id" multiSelect="true" allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402002/queryRuleList.action">
					<div property="columns">
						<div type="checkcolumn"></div>

						<div field="aaa168" width="100" headerAlign="center">规则编号</div>
						<div field="aaa167" width="100" headerAlign="center">规则名称</div>
						<div field="aaa133" width="100" headerAlign="center">规则描述</div>
						<div field="aaa153" width="100" headerAlign="center"
							type="comboboxcolumn">
							监控类型 <input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA153']}">
						</div>
						<div field="apa709" width="100" headerAlign="center"
							type="comboboxcolumn">
							监控对象类型 <input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['APA709']}">
						</div>
						<div field="aaa154" width="100" headerAlign="center">
							阈值比较方式 <input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA154']}" valueField="id">
						</div>
					</div>

				</div>
			</div>
		</div>
		<div>
			<div class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">阈值信息</span>
				</h3>
			</div>
			<div >
				<div id="datagrid2" class="mini-datagrid"
					style="width: 100%; height: 180px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402004/queryThreshold.action">
					<div property="columns">
						<div field="aaa155" width="100" headerAlign="center"
							type="comboboxcolumn">
							阈值级别 <input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['AAA155']}">
						</div>
						<div field="ape735" width="100" headerAlign="center">阈值权重</div>
						<div field="aaa005" width="100" headerAlign="center">阈值</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>

<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("datagrid1");
	//grid1.load();
	var grid2 = mini.get("datagrid2");
	 grid1.load({"aae100":"1"});
	/* grid1.sortBy("aaz320", "desc") */
	var form = new mini.Form("#form");
	
    grid2.on("drawcell", function (e) {
	        var record = e.record,
	        column = e.column,
	        field = e.field,
	        value = e.value;
	        
	        e.rowStyle = "color:red";
	        
    });
	function closeWin(){
		CloseWindow();
	}
	
	function search(){
		var data = form.getData(true,false);
		data.aae100="1";
		grid1.load(data); 
	}
	
    function resets(){
   		form.reset();
    }
    
    function CloseWindow(action) {            
         if (window.CloseOwnerWindow){
              return window.CloseOwnerWindow(action);
         }else{
             window.close();
         }            
     }
   function GetData(){
   		var row = grid1.getSelected();
   		 var data = {
        	id:row.aaz319
        };
        return data;
   }
   
   function save(){
   	 if(grid1.getSelected()){
   			CloseWindow("ok");
   		}else{
   			mini.alert("请选择一行");
   		}
   }
   
   function searchThreshold(){
		var row=grid1.getSelected();
    	if(row){
    		grid2.load(row);
    	}else{
    		grid2.clearRows(); 
    	}
	}
  
   
	
	
</script>
