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
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="textR">
							模版名称：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa169" class="mini-textbox" />
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
						<span class="iconCx">规则信息</span>
					</h3>
					<div class="fR pT5R9">
						<span class="btnMini"> <em> <input type="button"
									value="确定" onclick="selectModel()" /> </em> </span>
						<span class="btnMini"> <em> <input type="button"
							value="关闭" onclick="CloseWindow();" /> </em> </span>
					</div>
					<div id="datagrid1" class="mini-datagrid"
						onrowdblclick="selectModel" style="width: 100%; height: 348px;"
						idField="id" multiSelect="false" allowResize="false" pageSize="20"
						url="${pageContext.request.contextPath}/k4/f10402001/queryModelManage.action">
						<div property="columns">
							<div type="checkcolumn"></div>
							<div field="aaz320" width="100" headerAlign="center">
								模版ID
							</div>
							<div field="aaa169" width="100" headerAlign="center">
								模版名称
							</div>
							<div field="aaa153" width="100" headerAlign="center">
								类型监控
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
								<input property="editor" class="mini-combobox"
									style="width: 100%" data="${dic['AAE100']}">
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
				</div>
	</body>
</html>

<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("datagrid1");
	grid1.load({"aae100":"1"});
	var form = new mini.Form("#form");

	
	function search(){
		var data = form.getData(true,false);
		data.aae100="1";
		grid1.load(data); 
	}
	
    function resetForm(){
   		form.reset();
    }
    
    function selectModel(){
    	if(grid1.getSelected()){
    		CloseWindow("ok");
    	}else{
    		alert("请选择一行");
    	}
    	
    }
    
     function CloseWindow(action) { 
         if (window.CloseOwnerWindow){
              return window.CloseOwnerWindow(action);
         }else{
             window.close();
         }  
     }
   
   function GetData(){
        return grid1.getSelected();
   }
   
</script>
