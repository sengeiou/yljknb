<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<title></title>
	<%@ include file="../../../pages/pub/pubsource.jsp"%>
	 
	</head>
   <body style="overflow-x: hidden; overflow-y: hidden;">
   		<form id="form" action="#" >
			<div id="editForm1" class="cxTabbox" >
				<table style="width:100%;" class="cxTab">
					<tr>
						<td class="textR">
							医疗机构名称：
						</td>
						<td>
					     	<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb021"  name="akb021"  class="mini-textbox"
												 />
										</div>
									</div>
							</div>
						</td>
						<td class="textR">
							医院等级：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input id="aka101" name="aka101" emptyText="请选择..." data="${dic['AKA101']}" class="mini-combobox" />
									</div>
							  </div>
						  </div>
						</td>
						<td class="textR">
							医疗机构编号：
						</td>
						<td>
						   <div class="inputL" style="width: 130px">
						      <div class="inputR">
									<div class="inputC">
											<input id="akb020"  name="akb020"   class="mini-textbox" />
									</div>
							  </div>
						  </div>
						</td>
						<td>
						<div class="fR pT5R9">
					        <span class="btnMini"><em><input type="button" onClick="search();" value="查询"/></em></span>
					        <span class="btnMini"><em><input type="button" onClick="resets();" value="重置"/></em></span>
					    </div>
						</td>
					</tr>
				</table>
				</div>
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">医疗服务机构信息(<span style="color:red;">可双击选择</span>)</span>
					</h3>
					<div class="fR pT5R9">
					    <span class="btnMini"><em><input type="button" onClick="selectValue()" value="确定"/></em></span>
					  </div>
		          </div>
			 
                  <div id="datagrid1" class="mini-datagrid" multiSelect="false" onrowdblclick="selectModel"
					style="width: 100%; height: 350px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20" onrowdblclick="selectplan"
					url="${pageContext.request.contextPath}/k5/f10502001/queryKb41Message.action">
					<div property="columns">
						<div type="indexcolumn" ></div>
						<div field="akb020" headerAlign="center" width="130">
							医疗服务机构编码
						</div>
						<div field="akb021" headerAlign="center" width="130">
							医疗服务机构名称
						</div>
						<div field="aka101" width="100"  headerAlign="center" type="comboboxcolumn">
							医疗机构服务等级 
							<input property="editor" class="mini-combobox" style="width: 100%"
							data="${dic['AKA101']}">
						</div>
						<div field="aaa027" width="100" headerAlign="center" >
							统筹区
						</div>
					</div>
				</div>
				
			</div>
		</form>	
</body>
<script type="text/javascript">
mini.parse();
var grid1 = mini.get("datagrid1");
var form = new mini.Form("#form");

grid1.load();

function search(){
		var data = form.getData(true);
		grid1.load(data); 
		
	}
		  function resets(){
   			form.reset();
   			 
   		}
				
			function selectValue(){
				var row = grid.getSelected();
				if (row == null){
					mini.alert("请选择一条记录");
				}else{
					CloseWindow("ok");
				}
			}
	 function selectModel(e){
 	CloseWindow("ok");
    	
    }
    
    function GetData(){
    	var row = grid.getSelected();
		return row;
    }	
 
</script>
</html>
