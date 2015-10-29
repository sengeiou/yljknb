<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html  xmlns="http://www.w3.org/1999/xhtml">
<head> 
      <title>监控对象维护</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
		 var Yxbz = [{ id: 0, text: '启用' }, { id: 1, text: '禁用'}];
          mini.parse();
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
     <body>
			<div id="editForm1" class="cxTabbox">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
				 <tr>
				   <td class="textR">规则名称：</td>
				      <td>
				         <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											 <input id="mc" name="mc" class="mini-textbox" maxLength="100"/>
										</div>
									</div>
							  </div>
				      </td>
				   <td class="textR">规则代码：</td>
				       <td>
				       <div class="inputL" style="width: 130px">
				           <div class="inputR">
										<div class="inputC">
											 <input id="gzdm" name="gzdm" class="mini-textbox" maxLength="100"/>
										</div>
									</div>
							  </div>
				   </td>
				         <td style="text-align: left; padding-top: 5px; padding-right: 20px;" >
							<input type="submit" value="" class="cxsubmit" onclick="onSearchClick()" />
							<input type="reset" value="" class="cxreset" onclick="reset()" />
				           </td>
				 </tr>
				</table>
				</div>
			       <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">规则信息(单击查询指标)</span>
					</h3>
						<td style="width: 100%;">
					   <div class="fR pT5R9">
					     <span class="btnMini"><em><input type="button" onClick="selectModel();" value="确定"/></em></span>
                         <span class="btnMini"><em><input type="button" onClick="closeWin();" value="返回"/></em></span>
					
					  </div>
					</td>
					</div>
				<div multiSelect="false" onrowclick="searchRuleByModel" id="datagrid1" class="mini-datagrid"
					style="width: 100%; height: 180px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402005/queryRuleMessage.action">
					<div property="columns">
					<div type="checkcolumn"></div>
						<div field="mc" width="100" headerAlign="center">
							规则名称
						</div>
						<div field="gzdm" width="100" headerAlign="center">
							规则代码
						</div>
						<div field="gzms" width="100" headerAlign="center">
							规则描述
						</div>
						<div field="zt" type="comboboxcolumn" name="zt" autoShowPopup="true" width="100" headerAlign="center" >
							规则状态<input property="editor"  class="mini-combobox" style="width:100%;" data="Yxbz" />  
						</div>
					</div>
				</div>
			       <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">指标信息(双击选择)</span>
					</h3>
					</tr>
					</div>
				<div multiSelect="false" onrowdblclick="selectModel" id="datagrid2" class="mini-datagrid"
					style="width: 100%; height: 180px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k4/f10402006/queryRuleTarget.action">
					<div property="columns">
					<div type="checkcolumn"></div>
						<div field="mc" width="100" headerAlign="center">
							规则名称
						</div>
						<div field="gzdm" width="100" headerAlign="center">
							规则代码
						</div>
						<div  field="zbmc" width="100" headerAlign="center">
							指标名称
						</div>
						<div field="zbdm" width="100" headerAlign="center">
							指标代码
						</div>
						<div field="zbms" width="100" headerAlign="center">
							指标描述
						</div>
						<div field="zt" type="comboboxcolumn" name="zt" autoShowPopup="true" width="100" headerAlign="center" >
							规则状态<input property="editor"  class="mini-combobox" style="width:100%;" data="Yxbz" />  
						</div>
						<div field="cjrmc" width="100" headerAlign="center">
							创建人
						</div>
						<div field="cjsj" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">
							创建日期
						</div>
					</div>
				</div>
		</body>
	<script type="text/javascript">
	mini.parse();
	var grid=mini.get("datagrid1");
	var grid1=mini.get("datagrid2");
	var queryForm = new mini.Form("editForm1");
    var mc = mini.get("mc");
    var gzdm = mini.get("gzdm");
	grid.load();
	
	 grid.sortBy("cjsj", "desc");
	var form = new mini.Form("form1");
	
	
	  function reset(){
   		queryForm.reset();
    }
      function onSearchClick(e) {
            grid.load({
            	mc: mc.value,gzdm:gzdm.value
            });
        }

      function selectModel(){
    	if(grid1.getSelected()){
    		CloseWindow("ok");
    	}else{
    		mini.alert("请选择一行");
    	}
    	
    }
           
	  function searchRuleByModel(){
    	var row=grid.getSelected();
    	if(row){
    		grid1.load(row);
			grid1.sortBy("cjsj", "desc")
    	}else{
    		grid1.clearRows(); 
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
        return grid1.getSelected();
   }
	
	</script>

</body>
</html>