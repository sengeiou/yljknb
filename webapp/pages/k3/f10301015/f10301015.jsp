<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核案件查询</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<script type="text/javascript">
	var selectId = [{
		id : 0,
		text : '非传达含导出WORD'
	},{
		id : 1,
		text : '稽核结论传达'
	},{
		id : 2,
		text : '不含导出WORD'
	}];
</script>
<body style="overflow-x: hidden; overflow-y: hidden;">
	<div id="editForm1" class="cxTabbox">
		<div id="" style="margin:0 10px; position: relative;">
			<form id="form1" action="#">
			<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">				
				<tr>
					<td class="textR">查询选择：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="selectId" name="selectId" class="mini-combobox" value="0" 
										data="selectId" onvaluechanged="changeShowGrid(this.value);"/>
							   	</div>
							</div>
						</div>
					</td>
					<td class="textR">立案日期：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="aae034s" name="aae034s" format="yyyy-MM-dd" class="mini-datepicker" 
						   			   onvaluechanged="onValueChanged1" vtype="date:yyyyMMdd" allowInput="false"/>
									<input id="aae034" name="aae034" value="" class="mini-hidden" required="true"/>
								</div>
							</div>
						</div>
					</td>
						<td class="textR">案情关键字：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="apf094" name="apf094" class="mini-textbox" />
								</div>
							</div>
						</div>
					</td>
					<td class="textR">案件来源：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="abb006" name="abb006" class="mini-combobox" 
										   emptyText="请选择案件来源..." data="${dic['ABB006']}" />
							   	</div>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td class="textR">案件编号：</td>
					<td>
						<div class="inputL" style="width:130px">
							<div class="inputR">
								<div class="inputC">
									<input id="abz001" name="abz001" class="mini-buttonedit" 
											onbuttonclick="onButtonEdit" textName="abz001"/>
								</div>
							</div>
						</div>
					</td>
					<td style="text-align: right; padding-top: 5px; padding-right:3%;" colspan="6">
						<input type="button"value="" class="cxsubmit" onclick="search()" />
						<input type="reset" value="" class="cxreset" onclick="resetProblem()"/>
					</td>
				</tr>
			</table>
		</form>
		</div>
	</div>
	<div id="select1">
		<div class="mainlistCon">
			<div class="listTit">
				<h3 class="cxTit fL"><span class="iconCx">案件信息</span></h3>
			</div>
			<div id="datagrid1" class="mini-datagrid" style="width: 100%; height: 150px;" idField="id" multiSelect="true"
				allowResize="false" pageSize="10" onselectionchanged="onSelectionChanged" selectOnLoad="true" 
				url="${pageContext.request.contextPath}/k3/f10301015/queryCaseInfo.action">
				<div property="columns">
					<%--<div type="checkcolumn"></div>--%>
					<div type="indexcolumn"></div>
					<div field="aaz281" width="100" headerAlign="center">疑点问题ID</div>
					<div field="aaz318" width="100" headerAlign="center">稽核案件ID</div>
					<div field="abz001" width="100" headerAlign="center">案件编号</div>
					<div field="aae426" width="100" headerAlign="center" type="comboboxcolumn">
						案件状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAE426']}">
					</div>
					<!--<div field="ape711s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">立案登记日期</div>-->
					<div field="aae034s" width="100" headerAlign="center"  renderer="r2">立案日期</div>
					<div field="apf094" width="100" headerAlign="center">案情描述</div>
					<div field="abb006" width="100" headerAlign="center" type="comboboxcolumn">
						案件来源<input property="editor" class="mini-combobox" style="width:100%" data="${dic['ABB006']}">
					</div>
					<div field="aae011" width="100" headerAlign="center">立案人</div>
				</div>
			</div>
		</div>
				
		<div class="bottom_box" style="overflow:hidden;">
			<div id="detail_tabs" class="mini-tabs" activeIndex="0"
				style="width:100%;height:100%;" onactivechanged="gerenTabs">
				<div title="外部受理疑点登记 " id="divgrid2">
					<div size="100%" showCollapseButton="false">
						<div id="detailgrid1_Form" style="display: none;">
							<div id="detailgrid2"></div>
						</div>
						<div id="datagrid2" class="mini-datagrid" style="width: 100%; height: 200px;" 
							 idField="id" multiSelect="true" allowResize="false" pageSize="10"
							 url="${pageContext.request.contextPath}/k3/f10301015/queryAuditTargetInfo.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="operation" width="100" headerAlign="center" renderer="rendererGrid2">操作</div>
							 	<div field="aaz281" width="100" headerAlign="center">疑点问题记录ID</div>
								<div field="apa165" width="100" headerAlign="center" type="comboboxcolumn">
									问题状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA165']}">
								</div>
								<div field="ape711s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">受理日期</div>
								<div field="ape712" width="100" headerAlign="center">举报投诉内容</div>
								<div field="apa703" width="100" headerAlign="center" type="comboboxcolumn">
									受理方式<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA703']}">
								</div>
								<div field="apa704" width="100" headerAlign="center" type="comboboxcolumn">
									举报人类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA704']}">
								</div>
								<div field="apa705" width="100" headerAlign="center" type="comboboxcolumn">
									举报（投诉）方式<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA705']}">
								</div>
								<div field="ape028" width="100" headerAlign="center">举报人单位</div>
								<div field="ape713" width="100" headerAlign="center">举报人姓名</div>
								<div field="aac004" width="100" headerAlign="center" type="comboboxcolumn">
									举报人姓名<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC004']}">
								</div>
								<div field="aae005" width="100" headerAlign="center">举报人电话</div>
								<div field="aae006" width="100" headerAlign="center">举报人地址</div>
								<div field="aae007" width="100" headerAlign="center">举报人邮政编码</div>
								<div field="aae159" width="100" headerAlign="center">举报人邮箱</div>
								<div field="aae011" width="100" headerAlign="center">问题登记人</div>
								<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">登记时间</div>
								<div field="aaa027" width="100" headerAlign="center">统筹区</div>
								<div field="ape714" width="100" headerAlign="center">被举报对象名称</div>
								<div field="aae306" width="100" headerAlign="center">被举报对象地址</div>
								<div field="aae200" width="300" headerAlign="center">简单处理的处理意见</div>
							</div>
						</div>
					</div>
				</div>
	
				<div title="稽核结论登记" id="divgrid3">
					<div size="100%" showCollapseButton="false">
						<div id="detailgrid1_Form" style="display: none;">
							<div id="detailgrid3"></div>
						</div>
						<div id="datagrid3" class="mini-datagrid" style="width: 100%; height: 200px;" 
							 idField="id" multiSelect="true" allowResize="false" pageSize="10"
							 url="${pageContext.request.contextPath}/common/loadBeAuditTargetByAaz318.action?method=loadBeAuditTargetInfoByAaz318">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="operation" width="100" headerAlign="center" renderer="rendererGrid3">操作</div>
								<div field="aaz077" dataType="string" width="100" headerAlign="center">被稽核对象ID</div>
								<div field="aaz318" width="100" headerAlign="center">稽核案件ID</div>
								<div field="aaz010" width="100" headerAlign="center">被调查人ID</div>
								<div field="ape008" width="100" headerAlign="center">被调查人姓名</div>
								<div field="apa709" width="100" headerAlign="center" type="comboboxcolumn">
									稽核对象类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA709']}">
								</div>
								<div field="jlbz" width="100" headerAlign="center" type="comboboxcolumn">
									结论标志<input property="editor" class="mini-combobox" style="width:100%" data="${dic['JLBZ']}">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div title="询问笔录生成" id="divgrid4">
					<div size="100%" showCollapseButton="false">
						<div id="detailgrid1_Form" style="display: none;">
							<div id="detailgrid4"></div>
						</div>
						<div id="datagrid4" class="mini-datagrid" style="width: 100%; height: 200px;" 
							 idField="id" multiSelect="true" allowResize="false" pageSize="10"
							 url="${pageContext.request.contextPath}/k3/f10301015/queryInquiryInputInfo.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="operation" width="100" headerAlign="center" renderer="rendererGrid4">操作</div>
								<div field="aaz381" width="100" headerAlign="center">询问笔录ID</div>
								<div field="aaa027" width="100" headerAlign="center" type="comboboxcolumn">
									统筹区<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAA027']}">
								</div>
								<div field="ape712" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">询问时间</div>
								<div field="aae007" width="100" headerAlign="center">询问地点</div>
								<div field="ape134" width="100" headerAlign="center" ">
									询问人
								</div>
								<div field="ape135" width="100" headerAlign="center" ">
									记录人
								</div>
								<div field="aac002" width="100" headerAlign="center" ">
									身份证号
								</div>
								<div field="aac003" width="100" headerAlign="center">被询问人姓名</div>
								<div field="aac004" width="100" headerAlign="center" type="comboboxcolumn">
									性别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC004']}">
								</div>
								<div field="aac005" width="100" headerAlign="center">年龄</div>
								<div field="apa705" width="100" headerAlign="center">人员类别</div>
								<div field="ape029" width="100" headerAlign="center">工作单位</div>
								<div field="aae006" width="100" headerAlign="center">家庭地址</div>
								<div field="aae005" width="100" headerAlign="center">联系电话</div>
								<div field="aae013" width="300" headerAlign="center">备注</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="select2" style="display: none;">
		<div class="mainlistCon">
			<div class="listTit">
				<h3 class="cxTit pTb8"><span class="iconCx">案件信息</span></h3>
			</div>
			<div id="datagrid6" class="mini-datagrid" style="width: 100%; height: 150px;" 
			     idField="id" multiSelect="true" allowResize="false" pageSize="10" onload="afterload"
				 url="${pageContext.request.contextPath}/k3/f10301008/loadVerdictConveyByabz001.action?method=loadVerdictConveyInfoByabz001">
				<div property="columns">
					<div type="indexcolumn"></div>
					<div field="operation" width="100" headerAlign="center" renderer="rendererGrid6">操作</div>
					<div field="aaz318" width="100" headerAlign="center">稽核案件ID</div>
					<!-- <div field="aaz281" width="100" headerAlign="center">疑点问题受理记录ID</div> -->
					<div field="abz001" width="100" headerAlign="center">案件编号</div>
					<div field="abb006" width="100" headerAlign="center" type="comboboxcolumn">
						案件来源<input property="editor" class="mini-combobox" style="width:100%" data="${dic['ABB006']}">
					</div>
					<div field="aae426" width="100"	headerAlign="center" type="comboboxcolumn">
						案件状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAE426']}">
					</div>
					<div field="apf094" width="100" headerAlign="center">案情描述</div>
					<div field="aae011" width="100" headerAlign="center">立案经办人</div>
					<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">立案经办时间</div>
					<div field="aae189" width="100" headerAlign="center">批示意见</div>
					<div field="apa047" width="100" headerAlign="center">督办期限</div>
					<div field="acc789" width="100" headerAlign="center">办案责任人</div>
					<div field="aae012" width="100" headerAlign="center">立案确认人</div>
					<div field="abb025s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">结案日期</div>
					<div field="ape028" width="100" headerAlign="center">信息来源方名称</div>
					<div field="apa704" width="100" headerAlign="center" type="comboboxcolumn">
						信息来源方类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA704']}">
					</div>
					<div field="ape713" width="100" headerAlign="center">信息来源方联系人</div>
					<div field="aae006" width="100" headerAlign="center">地址</div>
					<div field="aae007" width="100" headerAlign="center">邮政编码</div>
					<div field="aae005" width="100" headerAlign="center">联系电话</div>
					<div field="aae159" width="100" headerAlign="center">联系电子邮箱</div>
					<div field="aae034s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">立案确认日期</div>
				</div>
			</div>
		</div>
		<div class="mainlistCon">
			<div class="listTit">
				<h3 class="cxTit pTb8"><span class="iconCx">被稽核对象</span></h3>
			</div>
			<div id="datagrid7" class="mini-datagrid" style="width: 100%; height: 200px;" 
			     idField="id" multiSelect="true" allowResize="false" pageSize="10"
				 url="${pageContext.request.contextPath}/k3/f10301008/loadBeAuditByAaz318.action?method=loadVerdictBeAuditByAaz318">
				<div property="columns">
					<div type="indexcolumn"></div>
					<div field="operation" width="100" headerAlign="center" renderer="rendererGrid7">操作</div>
					<div field="aaz077" dataType="string" width="100" headerAlign="center">被稽核对象ID</div>
					<div field="aaz318" width="100" headerAlign="center">稽核案件ID</div>
					<div field="aaz010" width="100" headerAlign="center">被稽核对象ID</div>
					<div field="aae425" width="100" headerAlign="center" type="comboboxcolumn">
						传达状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAE425']}">
					</div>
					<div field="ape008" width="100" headerAlign="center">被稽核对象</div>
					<div field="apa163" width="100" headerAlign="center" visible="false">是否暂停待遇</div>
					<div field="apa709" width="100" headerAlign="center" type="comboboxcolumn">
						稽核对象类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA709']}">
					</div>
					<div field="apa701" width="100" headerAlign="center" type="comboboxcolumn">
						稽核问题类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA701']}">
					</div>
					<div field="ape726" width="100" headerAlign="center">稽核结论</div>
				</div>
			</div>
		</div>
	</div>
	<div id="select3" style="display: none;">
		<div class="mainlistCon">
			<div class="listTit">
				<h3 class="cxTit fL"><span class="iconCx">案件信息</span></h3>
			</div>
			<div id="datagrid5" class="mini-datagrid" style="width: 100%; height: 350px;" idField="id" multiSelect="true"
				allowResize="false" pageSize="10" onselectionchanged="onSelectionChanged" selectOnLoad="true" 
				url="${pageContext.request.contextPath}/k3/f10301015/queryCaseInfo.action">
				<div property="columns">
					<%--<div type="checkcolumn"></div>--%>
					<div type="indexcolumn"></div>
					<div field="aaz281" width="100" headerAlign="center">疑点问题ID</div>
					<div field="aaz318" width="100" headerAlign="center">稽核案件ID</div>
					<div field="abz001" width="100" headerAlign="center">案件编号</div>
					<div field="aae426" width="100" headerAlign="center" type="comboboxcolumn">
						案件状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAE426']}">
					</div>
					<!--<div field="ape711s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">立案登记日期</div>-->
					<div field="aae034s" width="100" headerAlign="center"  renderer="r2">立案日期</div>
					<div field="apf094" width="100" headerAlign="center">案情描述</div>
					<div field="abb006" width="100" headerAlign="center" type="comboboxcolumn">
						案件来源<input property="editor" class="mini-combobox" style="width:100%" data="${dic['ABB006']}">
					</div>
					<div field="aae011" width="100" headerAlign="center">立案人</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		mini.parse();
		
		var grid1 = mini.get("datagrid1");
		var grid2 = mini.get("datagrid2");
		var grid3 = mini.get("datagrid3");
		var grid4 = mini.get("datagrid4");
		var grid5 = mini.get("datagrid5");
		var grid6 = mini.get("datagrid6");
		var grid7 = mini.get("datagrid7");
		var queryForm = new mini.Form("form1");
		var data = queryForm.getData();
		var tabId = 0;
		function changeShowGrid(selectIds){
			if(selectIds==0){
				grid1.load(data);
				grid1.sortBy("aae036", "desc");
				document.getElementById("select1").style.display = "";
				document.getElementById("select2").style.display = "none";
				document.getElementById("select3").style.display = "none";
			}else if(selectIds==1){
				grid6.load(data);
				document.getElementById("select1").style.display = "none";
				document.getElementById("select2").style.display = "";
				document.getElementById("select3").style.display = "none";
			}else{
				grid5.load(data);
				grid5.sortBy("aae036", "desc");
				document.getElementById("select1").style.display = "none";
				document.getElementById("select2").style.display = "none";
				document.getElementById("select3").style.display = "";
			}
		}
		
		function search(){
			var data = queryForm.getData();
			var json = mini.encode(data);
			var selectId = mini.get("selectId").getValue();
			if(selectId==0){
				grid1.load(data);
			}else if(selectId==1){
				grid6.load(data);
			}else if(selectId==2){
				grid5.load(data);
			}
		}
		
		function afterload(e){
			var grid = e.sender;
			if(e.data.length == 0){
				grid7.clearRows();
			}
			if(e.data != null){
				grid7.load({aaz318:e.data[0].aaz318}); 
			}
		}
		
		//页签变更
		function gerenTabs(e) {
			if (e.tab.title == '外部受理疑点登记 ') {
				tabId = 0;
				search();
			} else if (e.tab.title == '稽核结论登记') {
				tabId = 1;
				search();
			} else if (e.tab.title == '询问笔录生成') {
				tabId = 2;
				search();
			}
		}
		
		//案件编号查询
		function onButtonEdit(e){
			var bnEdit = this;
			mini.open({
				url:"${pageContext.request.contextPath}/pages/k3/f10301008/f10301008_selectcase.jsp",
				title:"查询案件信息",
				width: 700,
               	height: 480,
               	ondestroy: function (action){
               		if (action == "ok"){
               			var iframe = this.getIFrameEl();
               			var data = iframe.contentWindow.GetData();
               			data = mini.clone(data);
               			bnEdit.setValue(data.abz001);
               			bnEdit.setText(data.abz001);
               			search();
               		}
               	}
			});
		}
	
		//联动查询
		function onSelectionChanged(e){
			var grid = e.sender;
			var record = grid1.getSelecteds();
			if(tabId == 0){
				//af32表
				var aaz281s = "";
				for ( var i = 0; i < record.length; i++) {
					if (i + 1 == record.length) {
						aaz281s += record[i].aaz281;
					} else {
						aaz281s += record[i].aaz281 + ",";
					}
				}
				if (aaz281s != "" && aaz281s != null) {
					grid2.load({aaz281Str:aaz281s});
				}
			}else if(tabId == 1){
				var aaz318s = "";
				for ( var i = 0; i < record.length; i++) {
					if (i + 1 == record.length) {
						aaz318s += record[i].aaz318;
					} else {
						aaz318s += record[i].aaz318 + ",";
					}
				}
				if(aaz318s != "" && aaz318s != null) {
					grid3.load({aaz318:aaz318s}); 
				}
			}else if(tabId == 2){
				var aaz318s = "";
				for ( var i = 0; i < record.length; i++) {
					if (i + 1 == record.length) {
						aaz318s += record[i].aaz318;
					} else {
						aaz318s += record[i].aaz318 + ",";
					}
				}
				if(aaz318s != "" && aaz318s != null) {
					grid4.load({aaz318:aaz318s}); 
				}
			}
		}
       
       //重置
       function resetProblem(){
       		queryForm.clear();
       }
       
       //grid2操作
	   function rendererGrid2(e){
		   var grid1 = e.sender;
           var record = e.record;
           var rowIndex = e.rowIndex;
           var s1 = "<a href='###' onclick = exprotWord(" + record.aaz281 + ") >导出</a> ";
           return s1;
	   }
		
	   function exprotWord(aaz281){
		   var url = "${pageContext.request.contextPath}/k3/f10301001/exportWord_yddj.action?aaz281=" + aaz281 + "&sid="+Math.random() ;
		   window.open(url);
	   }
	   
	   //grid3操作
	   function rendererGrid3(e){
			var grid3 = e.sender;
           	var record = e.record;
           	var rowIndex = e.rowIndex;
           	var s3 = "<a href='###' onclick = notify('" + record.aaa027 + "','" + record.aaz077 + "','"	+ record.aaz318 + "') >告知</a>";
           	return s3;
	   }
	   //稽核结论登记告知
	   function notify(aaa027,aaz077,aaz318){
			var record = grid3.getSelected();
			if(record.jlbz != "1"){
				mini.alert("当前对象不能执行告知操作!");
				return;
			}
			if(aaa027 != null && aaz077 != null && aaz318 != null ){
				mini.open({
					url:"${pageContext.request.contextPath}/pages/k3/f10301006/f10301006_notify.jsp",
					title:"告知",
					width:500,
					height:300,
					onload:function(){
						var iframe = this.getIFrameEl();
						var data = {aaa027 : aaa027 ,  aaz077 : aaz077 , aaz318 : aaz318};
						iframe.contentWindow.setData(data);
					}
				});
			}else{
				mini.alert("告知对象aaa027,aaz077,aaz318 为空");
			}
		}
       //grid4操作
	   function rendererGrid4(e){
			var grid1 = e.sender;
           	var record = e.record;
           	var rowIndex = e.rowIndex;
           	var s1 = "<a href='###' onclick = exprotWord4(" + record.aaz381 + ") >导出</a> ";
           	return s1;
	   }
	   //询问笔录生成导出
	   function exprotWord4(aaz381){
			var url = "${pageContext.request.contextPath}/k3/f10301016/exportWord_bl.action?aaz381=" + aaz381 + "&sid="+Math.random() ;
			window.open(url);
		}
	   
	   //grid6操作
	   function rendererGrid6(e){
			var grid6 = e.sender;
           	var record = e.record;
           	var rowIndex = e.rowIndex;
           	var s1 = "<a href='###' onclick = moveCase('" + record.aaz318 + "') >移交</a> ";
           	return s1;
		}
		
	    //移交
		function moveCase(aaz318){
			mini.open({
				url:"${pageContext.request.contextPath}/pages/k3/f10301008/f10301008_caseMove.jsp",
				title:"稽核案件移交",
				width: 800, 
				height: 400,
				onload: function (){
					var iframe = this.getIFrameEl();
					var data = {aaz318 : aaz318};
					iframe.contentWindow.setData(data);
				},
				ondestroy: function (action){
						
				}
			});
		}
		
		//grid7操作
		function rendererGrid7(e){
			var grid7 = e.sender;
           	var record = e.record;
           	var rowIndex = e.rowIndex;
           	var s2 = "<a href='###' onclick = conver('" + record.apa163 + "','" + record.apa709 + "','" + record.aaa027 + "','"	 + record.aaz077 + "','"	+ record.aaz318 + "') >传达</a>";
           	return s2;
		}
		
		//传达
		function conver(apa163 , apa709 , aaa027 , aaz077 , aaz318){
			if(apa709 != null && aaa027!= null && aaz077 != null && aaz318 != null){
				mini.open({
					url:"${pageContext.request.contextPath}/pages/k3/f10301008/f10301008_conver.jsp",
					title:"传达信息维护",
					width:800,
					height:480,
					onload:function(){
						var iframe = this.getIFrameEl();
						var data = {apa163 : apa163 , apa709 : apa709 , aaa027 : aaa027,aaz077 : aaz077 , aaz318 : aaz318};
						iframe.contentWindow.setData(data);
					},
					ondestroy:function(action){
						grid2.reload();
					}
				});
			}else{
				mini.alert("传达记录 aaa027  aaz077 aaz318 为空");
			}
		} 
</script>
</body>
</html>
