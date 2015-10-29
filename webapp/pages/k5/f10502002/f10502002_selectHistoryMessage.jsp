<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
        <title>历史信息维护</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
	  	var ShZt = [{ id: 0, text: '待审核' }, { id: 1, text: '审核通过'}, { id: 2, text: '审核不通过'}];
	  	var Whbz = [{ id: 1, text: '新增' }, { id: 2, text: '修改'}, { id: 3, text: '删除'}];
		</script>
	</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
	<div id="editForm1" class="cxTabbox">
				<table style="width:100%;" class="cxTab">
						<tr>
						<td style=";width:10%;" class="textR">
							审批状态:
							</td>
							<td >
							   <div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input  id="aae016" name="aae016" class="mini-combobox" data="ShZt" />
										</div>
									</div>
							  </div>
							</td>
							<td style=";width:10%;" class="textR">
							维护类型:
							</td>
							<td >
							   <div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input  id="apa120" name="apa120" class="mini-combobox" data="${dic['APA120']}"/>
										</div>
									</div>
							  </div>
							</td>
							<td style="text-align: left; padding-bottom: 5px; padding-right: 10px;" >
							<input type="submit" value="" class="cxsubmit" onclick="search()" />
							<input type="reset" value="" class="cxreset" onclick="resetForm()" />
				        </td>
						</tr>
					</table>
				</div>
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">维护信息</span>
					</h3>
		          </div>
                <div id="datagrid1"  class="mini-datagrid"
						style="width: 100%; height: 380px;" idField="id"
						multiSelect="true" allowResize="false" pageSize="20"
						url="${pageContext.request.contextPath}/k5/f10502002/queryKf66Message.action">
						<div property="columns">
							<div type="indexcolumn" ></div>
                            <div field="aae016" width="100" type="comboboxcolumn" headerAlign="center">
								审核状态<input property="editor"  class="mini-combobox" style="width:100%;" data="ShZt" />
							</div>
							<div field="apa120" headerAlign="center" width="100" type="comboboxcolumn">
								维护标志<input property="editor" emptyText="请选择..." class="mini-combobox" data="${dic['APA120']}"/>
							</div>
							<div field="aaa027" headerAlign="center" width="100">
								统筹区编码
							</div>
							<div field="aaz307" width="100" headerAlign="center">
							           科室编码
						   </div>
							<div field="akf001" width="100" type="comboboxcolumn" headerAlign="center">
								科室类别<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AKF001']}" />
							</div>
							<div field="aae386" width="100" headerAlign="center">
							           科室名称
						   </div>
							<div field="akf015" width="100" headerAlign="center">
								床位数
							</div>
							<div field="aae011" width="100" headerAlign="center">
								维护人
							</div>
							<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">
								维护时间
							</div>
						</div>
					</div>
			</div>
	<script type="text/javascript">
      mini.parse();
     var grid = mini.get("datagrid1");
     
     grid1.load();
     
     		
	function search() {
		var form = new mini.Form("editForm1");
		var data = form.getData(true,false);
			grid.load(data);
	}
    function resetForm(){
		var queryForm = new mini.Form("editForm1");
		queryForm.reset();
	}
    	
     function SetData(){
     	 grid1.load();
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
    
     
     
	</script>
	</body>
</html>
