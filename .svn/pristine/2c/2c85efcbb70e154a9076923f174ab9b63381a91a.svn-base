<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html  xmlns="http://www.w3.org/1999/xhtml">
<head> 
      <%@ include file="../../../pages/pub/pubsource.jsp"%>
      <script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
	    var Jklx = [ {id : 'YP',text : '药品'}, {id : 'FWXM',text : '服务项目'}, {id : 'CL',text : '材料'}];
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
     <body style="overflow-x: hidden; overflow-y: hidden;">
			<div id="editForm1" class="cxTabbox">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
				 <tr>
				   <td class="textR">目录编码：</td>
				    <td>
				       <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											  <input id="dxid" name="dxid" class="mini-textbox"/>
										</div>
									</div>
							  </div>
				      </td>
				   <td>目录名称：</td>
				     <td>
				       <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											   <input id="dxmc" name="dxmc" class="mini-textbox"/>
										</div>
									</div>
							  </div>
				       </td>
				   <td>目录类型：</td>
				      <td>
				        <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="dxlx" name="dxlx" emptyText="请选择..." class="mini-combobox"  data="Jklx"/>
										</div>
									</div>
							  </div>
				      </td>
				   <td style="text-align: left; padding-top: 5px; padding-right: 5px;" >
							<input type="submit" value="" class="cxsubmit" onclick="onSearchClick()" />
							<input type="reset" value="" class="cxreset" onclick="reset()" />
				   </td>
				 </tr>
				</table>
				</div>
         
			       <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">目录信息(双击可选择)</span>
					</h3>
					<td style="width: 100%;">
					   <div class="fR pT5R9">
					    <span class="btnMini"><em><input type="button" onClick="selectModel();" value="确定"/></em></span>
                         <span class="btnMini"><em><input type="button" onClick="closeWin();" value="返回"/></em></span>
					  </div>
					</div>
				<div multiSelect="false" onrowdblclick="selectModel"  id="datagrid1" class="mini-datagrid"
					style="width: 100%; height: 300px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402007/queryMldx.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div type="indexcolumn" ></div>
						<div field="dxid" width="100" headerAlign="center">
							社保目录统一编码
						</div>
						<div field="dxmc" width="100" headerAlign="center">
							目录名称
						</div>
						<div field="dxlx" width="100" headerAlign="center" >
							目录类型
						</div>
					</div>
				</div>
	
<script type="text/javascript">

    mini.parse();

    var grid = mini.get("datagrid1");
    var queryForm = new mini.Form("editForm1");
    var dxid = mini.get("dxid");
    var dxmc = mini.get("dxmc");
	var dxlx = mini.get("dxlx");
      grid.load();
    function reset(){
   		queryForm.reset();
    }
     function onSearchClick(e) {
            grid.load({
            	dxid: dxid.value,dxmc:dxmc.value,dxlx:dxlx.value
            });
        }
    	 
      function selectModel(){
    	if(grid.getSelected()){
    		CloseWindow("ok");
    	}else{
    		mini.alert("请选择一行");
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
			
       function GetData(){
        return grid.getSelected();
   }

</script>
</body>
</html>