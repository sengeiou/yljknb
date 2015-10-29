<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>查询监控对象信息</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript">
		var Yxbz = [{ id: 0, text: '启用' }, { id: 1, text: '禁用'}];
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
					<td class="textR">指标名称：</td>
				<td>
				<div class="inputL" style="width: 130px">
					<div class="inputR">
						<div class="inputC">
							<input id="zbmc"  class="mini-textbox"  />
						</div>
					</div>
				 </div>
				</td>
				 <td class="textR">规则名称：</td>
				<td> 
					<div class="inputL" style="width: 130px">
						<div class="inputR">
							<div class="inputC">
								<input id="mc"  class="mini-textbox"  />
							</div>
						</div>
					 </div>
				 </td>
					<td class="textR">对象名称：</td>
				<td>
					 <div class="inputL" style="width: 130px">
						 <div class="inputR">
							 <div class="inputC">
								<input id="dxmc"  class="mini-textbox"  />
							 </div>
						</div>
					</div>
				</td>
			</tr>
			<tr>
				 <td class="textR">有效标志：</td>
				 <td>
					<div class="inputL" style="width: 130px">
					  <div class="inputR">
						<div class="inputC">
							<input id="zt"  name="zt" emptyText="请选择..." class="mini-combobox" data="Yxbz" />
						 </div>
						</div>
					 </div>
					</td>
						 <td class="textR">监控类型：</td>
					<td colspan="2">
						<div class="inputL" style="width: 130px">
							<div class="inputR">
								<div class="inputC">
									<input id="dxlx"  name="dxlx" emptyText="请选择..." class="mini-combobox" data="Jklx" />
								</div>
							</div>
						</div>
					 </td>
				   <td style="float: left; padding-bottom: 5px; padding-left: 80px;" >
							<input type="submit" value="" class="cxsubmit" onclick="search()" />
							<input type="reset" value="" class="cxreset" onclick="reset()" />
				   </td>
				 </tr>
				</table>
		</div>
		 <div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">监控对象信息(双击可选择)</span>
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
					url="${pageContext.request.contextPath}/k4/f10402007/queryCaseNumberDxzb.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div type="indexcolumn" ></div>
						<div field="dxid"  width="100"	headerAlign="center">
							监控对象
						</div>
						<div field="dxmc" width="100"	headerAlign="center">
							监控对象名称
						</div>
						<div field="dxlx"  width="100"	headerAlign="center">
							对象类型
						</div>
						<div field="mc" width="100" headerAlign="center">
							规则名称
						</div>
						<div field="zbmc" width="100" headerAlign="center">
							指标名称
						</div>
						<div field="zbz" width="100" headerAlign="center">
							指标值
						</div>
						<div field="zbms" width="100" headerAlign="center">
							指标描述
						</div>
						<div field="gzly" width="100" headerAlign="center">
							规则来源
						</div>
						<div field="sm" width="100" headerAlign="center">
							说明
						</div>
						<div field="cs" width="100" headerAlign="center">
							参数
						</div>
						<div field="zt" type="comboboxcolumn" width="100" headerAlign="center">
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
</html>
<script type="text/javascript">
	mini.parse();
	var grid=mini.get("datagrid1");
	var form = new mini.Form("#editForm1");
	grid.load();
      var zbmc = mini.get("zbmc");
     	var zt = mini.get("zt");
       var dxmc = mini.get("dxmc");
     	var mc = mini.get("mc");
       var dxlx = mini.get("dxlx");
       
	
	function search(){
		
		 grid.load({
            	zbmc: zbmc.value,zt:zt.value,mc:mc.value,dxmc:dxmc.value,dxlx:dxlx.value
            });
	}
	
	function reset(){
		form.reset();
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
    
    function selectModel(){
    	var row=grid.getSelected();
    	if(row){
    		CloseWindow("ok");
    	}else{
    		mini.alert("请选择一行");
    	}
    	
    }
    
    function GetData(){
    	return grid.getSelected();
    }
	
</script>
