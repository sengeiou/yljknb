<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>新增分析主题</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>

	</head>
	<body>
		<form id="form" action="#">
				<div id="queryForm"    class="cxTabbox">
					
					<table  class="cxTab" cellpadding="0" cellspacing="0" border="0">
						<tr>
						    <td>
								分析主题名称：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae417" name="aae417" class="mini-textbox"  />
										</div>
									</div>
								</div>
							</td>
							 
							<td>
								适用对象类型：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa709" name="apa709" class="mini-combobox" data="${dic['APA709'] }" emptyText="选择使用对象..." />
										</div>
									</div>
								</div>
							</td>
							<td style="text-align: center; padding-top: 5px;" colspan="2">
								<input type="button" value="" class="cxsubmit" onclick="search();"/>
								<input type="button" value="" class="cxreset" onclick="resets();" />
							</td>
						</tr>
					</table>
					
				</div>
	
			<div>
				 <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">分析主题信息</span>
					</h3>
					<div class="fR pT5R9">
						<!-- <span class="bnt"><a class="mini-button" plain="true"
							iconCls="icon-save" onClick="save();">保存</a> </span>
						<span class="bnt"><a class="mini-button" plain="true"
							iconCls="icon-close" onClick="close();">关闭</a> </span> -->
						<span class="btnMini">
							<em>
								<input type="button" value="添加" onclick="save1()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button"  value="关闭" onclick="closeWin()"/>
							</em>
						</span>	
					</div>
				</div>
				<div >
					<div id="datagrid1" class="mini-datagrid"
						style="width: 100%; height: 340px;" idField="id" multiSelect="true"
						allowResize="false" pageSize="20"
						url="${pageContext.request.contextPath}/k4/f10402003/queryAnalysisRule.action">
						<div property="columns">
							<div type="checkcolumn"></div>
							
							<div field="aae417" width="100" headerAlign="center">
								主题名称：
							</div>
							<div field="apa709" width="100" headerAlign="center" type="comboboxcolumn">
								适用对象类型：
								<input property="editor" class="mini-combobox"
								style="width: 100%" data="${dic['APA709']}">
							</div>
							<div field="ape032" width="100" headerAlign="center">
								统计周期：
							</div>
							<div field="aaa152" width="100" headerAlign="center">
								参数列表：
							</div>
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
	//var row=grid1.getSelected();
	//alert(row.aae100);
	grid1.load({"aae100":"1"});
	var form = new mini.Form("#form");
	/* grid1.on("drawcell", function (e) {
        var record = e.record,
        column = e.column,
        field = e.field,
        value = e.value;

        if (e.rowIndex%2 == 0) {
        	e.rowCls = "rowtype1";
        }else{
        	e.rowCls = "rowtype2";
        }
        

    }); */
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
   
   function save1(){
   	 if(grid1.getSelected()){
   		CloseWindow("ok");
   	  }else{
		mini.alert("请选择一行");   	  
   	  }
   }
   
  
   
	
	
</script>
