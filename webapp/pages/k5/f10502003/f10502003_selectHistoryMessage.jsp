<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
        <title>历史信息维护</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/report.js"></script>
		<script type="text/javascript">
	  	var ShZt = [{ id: 0, text: '待审核' }, { id: 1, text: '审核通过'}, { id: 2, text: '审核不通过'}];
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
											<input  id="aae016" name="aae016" class="mini-combobox" data="ShZt"/>
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
							<td style=";width:10%;" class="textR">
							医护人员姓名:
							</td>
							<td >
							   <div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input  id="aac003" name="aac003" class="mini-textbox" />
										</div>
									</div>
							  </div>
							</td>
							</tr>
							<tr>
						<td style=";width:10%;" class="textR">
								所属科室：
							</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz307" name="aaz307" class="mini-buttonedit"
												onbuttonclick="openQueryModel" allowInput="false" />
										</div>
									</div>
								</div>
							</td>
							<td style="text-align: left; padding-bottom: 5px; padding-right: 10px;" 
								colspan="4">
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
						style="width: 100%; height: 350px;" idField="id"
						multiSelect="true" allowResize="false" pageSize="20"
						url="${pageContext.request.contextPath}/k5/f10502003/queryKf65Message.action">
						<div property="columns">
							<div type="indexcolumn" ></div>
                            <div field="aae016" width="100" type="comboboxcolumn" headerAlign="center">
								审核状态<input property="editor"  class="mini-combobox" style="width:100%;" data="ShZt" />
							</div>
							<div field="apa120" headerAlign="center" width="100">
								维护标志
							</div>
							<div field="aae034" headerAlign="center" width="100">
								审批时间
							</div>
							<div field="akb021" headerAlign="center" width="130">
								医疗服务机构名称
							</div>
							<div field="aae386" headerAlign="center" width="100">
								科室名称
							</div>
							<div field="aac003" width="100" headerAlign="center">
							          医护人员姓名
						   </div>
							<div field="aab014" width="100" headerAlign="center">
								公民身份号码
							</div>
							<div field="akc049" width="100" type="comboboxcolumn" headerAlign="center">
							           行政职务<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AKC049']}" />
						   </div>
							<div field="aaf009" width="100" type="comboboxcolumn" headerAlign="center">
								专业技术职务<input property="editor"  class="mini-combobox" style="width:100%;" data="${dic['AAF009']}" />
							</div>
							<div field="aaz263" width="100" headerAlign="center">
								医护人员编号
							</div>
							<div field="akc054" width="130" headerAlign="center">
								医师资格证编码
							</div>
							<div field="akc056" width="130" headerAlign="center">
								医师执业证编码
							</div>
							<div field="akc057" width="100" headerAlign="center">
								第一执业地点
							</div>
							<div field="akc051" width="100" headerAlign="center">
								多点执业标志
							</div>
							<div field="akc052" width="130" headerAlign="center">
								门诊大病医师标识
							</div>
							<div field="akc053" width="130" headerAlign="center">
								医师医保服务资格状态
							</div>
							<div field="aae005" width="100" headerAlign="center">
								联系电话
							</div>
							<div field="aae013" width="100" headerAlign="center">
								备注
							</div>
							<div field="akc278" width="100" headerAlign="center">
								药师类别
							</div>
							<div field="akc279" width="100" headerAlign="center">
								药师执业类别
							</div>
							<div field="akc281" width="100" headerAlign="center">
								药师执业范围
							</div>
							<div field="akc282" width="130" headerAlign="center">
								执业药师资格证书编号
							</div>
							<div field="akc283" width="130" headerAlign="center">
								执业药师注册证编号
							</div>
							<div field="aae011" width="100" headerAlign="center">
								维护人员
							</div>
							<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">
								维护时间
							
						</div>
						</div>
					</div>
<script type="text/javascript">
	mini.parse();
     var grid = mini.get("datagrid1");
     
     grid.load();
     
     		
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
     	 grid.load();
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
     
      function openQueryModel(e){
    	var bnEdit = this;
    	
		mini.open({
	            url: "../pages/k5/f10502003/f10502003_suoshukeshi.jsp",
	            title: "",
	            width:800,
				height:425,
				ondestroy: function (action) {
				 		if(action=="ok"){
				 			var iframe = this.getIFrameEl();
                			var data = iframe.contentWindow.GetData();
                			data = mini.clone(data);
                			bnEdit.setValue(data.aae386);
                			bnEdit.setText(data.aae386);
				            mini.get("aaz307").setValue(data.aaz307);
				            mini.get("aaz307").setText(data.aae386);
						}
					 }
	      		  });	
	        }
		</script>
	</body>
</html>
