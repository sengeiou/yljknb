<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
        <title>历史信息维护</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
		var Yxbz = [{ id: 0, text: '启用' }, { id: 1, text: '禁用'}];
	  	var ShZt = [{ id: 0, text: '待审核' }, { id: 1, text: '审核通过'}, { id: 2, text: '审核不通过'}];
		</script>
		<style type="text/css">
		.rowtype1{background:#fceee2;}
		.rowtype2{background:#fcccc2;}
		</style>
	</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
	<div id="editForm1" class="cxTabbox">
				<table style="width:100%;" class="cxTab">
						<tr>
						<td style=";width:10%;" class="textR">
							审批状态:
							</td>
							<td style="text-align:left;width:50%;">
							   <div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input  id="aae016" name="aae016" emptyText="请选择..." class="mini-combobox" data="ShZt" />
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
						<span class="iconCx">维护记录</span>
					</h3>
					<div class="fR pT5R9">
					<span class="btnMini"><em><input type="button" onClick="closeWin();" value="关闭"/></em></span>
					 </div>
					</div>
				<div id="datagrid1" class="mini-datagrid"
					style="width: 100%; height: 350px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="20"
					url="${pageContext.request.contextPath}/k5/f10502001/queryKb41Message.action">
					<div property="columns">
						<div type="indexcolumn" ></div>
						<div field="aae016" type="comboboxcolumn" width="100"	headerAlign="center" >
							审批状态<input property="editor"  class="mini-combobox" style="width:100%;" data="ShZt" />  
						</div>
						<div field="aae034" width="100"	headerAlign="center" dateFormat="yyyy-MM-dd">
							审批时间
						</div>
						<div field="aae011"  width="100"	headerAlign="center">
							维护人员
						</div>
						<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">
							维护时间
						</div>
						<div field="aab304" width="100" headerAlign="center">
							机构负责人
						</div>
						<div field="aab062" width="130" headerAlign="center">
							指标值分管医保负责人
						</div>
						<div field="aae004" width="100" headerAlign="center">
							医保联系人
						</div>
						<div field="akf015" width="100" headerAlign="center">
							床位数量
						</div>
						<div field="aae006" width="100" headerAlign="center">
							医疗机构地址
						</div>
						<div field="aae005" width="100" headerAlign="center">
							联系电话
						</div>
						<div field="aae007" width="100" headerAlign="center">
							邮政编码
						</div>
					</div>
			 </div>
		<script type="text/javascript">
	mini.parse();
     var grid1 = mini.get("datagrid1");
     
     grid1.load();
     
     function search() {
		var form = new mini.Form("editForm1");
		var data = form.getData(true,false);
			grid1.load(data);
	}
    function resetForm(){
		var queryForm = new mini.Form("editForm1");
		queryForm.reset();
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
