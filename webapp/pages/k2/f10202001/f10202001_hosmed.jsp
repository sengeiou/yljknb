<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>单据信息</title>
		<link rel="stylesheet"	href="${pageContext.request.contextPath}/resource/css/style.css" type="text/css" />
<link href="${pageContext.request.contextPath}/resource/miniui/themes/default/miniui.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/resource/miniui/themes/icons.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/miniui/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/miniui/miniui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/jquery.nicescroll.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/scripts/dateUtils.js"></script>
	</head>
	<body>
		<div id="sum_tabs" class="mini-tabs" activeIndex="0">
			<div title="单据">
				<div id="grid1" class="mini-datagrid" idField="id"
					style="width:890px;height:360px;margin:1px 1px 1px 4px;"
					url="${pageContext.request.contextPath}/k2/f10202001/queryHosMedDocument.action">
					<div property="columns">
					    <div type="detailcolumn" headerAlign="center" align="center" 
				         width="100" renderer="onMxRenderer">
				          ~
				        </div>
						<div field="baz021" type="comboboxcolumn" width="100" headerAlign="center">
						           智能审核结果<input property="editor" class="mini-combobox" style="width:100%" data="${dic['BAZ021']}">
						</div>
						<div field="baz001" width="100" headerAlign="center">
							违规单据ID
						</div>
						<div field="aaz370" width="100" headerAlign="center">
							就诊编号
						</div>
						<div field="aac003" width="100" headerAlign="center">
							参保人姓名
						</div>
						<div field="aac002" width="100" headerAlign="center">
							社会保障号
						</div>
						<div field="aac001" width="100" headerAlign="center">
							参保人ID
						</div>
						<div field="aac004" type="comboboxcolumn" width="100" headerAlign="center">
							参保人性别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC004']}">
						</div>
						<div field="aac006" width="100" headerAlign="center">
							参保人出生日期
						</div>
						<div field="aac012" type="comboboxcolumn" width="100" headerAlign="center">
							个人身份<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC012']}">
						</div>
						<div field="akb020" width="100" headerAlign="center">
							医疗服务机构编号
						</div>
						<div field="akb021" width="100" headerAlign="center">
							医疗服务机构名称
						</div>
						<div field="akb022" type="comboboxcolumn" width="100" headerAlign="center">
							医疗服务机构类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKB022']}">
						</div>
						<div field="aaz307" width="100" headerAlign="center">
							科室编码
						</div>
						<div field="akf001" type="comboboxcolumn" width="100" headerAlign="center">
							科室分类<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKF001']}">
						</div>
						<div field="aae386" width="100" headerAlign="center">
							科室名称
						</div>
						<div field="aaz263" width="100" headerAlign="center">
							医护人员编号
						</div>
						<div field="aka130" type="comboboxcolumn" width="100" headerAlign="center">
							就诊类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKA130']}">
						</div>
						<div field="akc194" dateFormat="yyyyMMdd" width="100" headerAlign="center">
							就诊结算时间
						</div>
						<div field="ake038" width="100" headerAlign="center">
							个人账户支出
						</div>
						<div field="akc254" width="100" headerAlign="center">
							个人自付金额
						</div>
						<div field="akc253" width="100" headerAlign="center">
							自费金额
						</div>
						<div field="akb067" width="100" headerAlign="center">
							个人现金支付金额
						</div>
						<div field="akc264" width="100" headerAlign="center">
							总费用
						</div>
						<div field="akc050" width="100" headerAlign="center">
							入院疾病诊断名称
						</div>
						<div field="akc193" width="100" headerAlign="center">
							入院疾病诊断代码
						</div>
						<div field="akc185" width="100" headerAlign="center">
							出院主要疾病诊断
						</div>
						<div field="aka120" width="100" headerAlign="center">
							出院主要诊断编码
						</div>
						<div field="akc186" width="100" headerAlign="center">
							出院次要疾病诊断
						</div>
						<div field="akc188" width="100" headerAlign="center">
							出院次要疾病诊断编码
						</div>
						<div field="akc274" width="100" headerAlign="center">
							出院次要疾病第三诊断
						</div>
						<div field="akc275" width="100" headerAlign="center">
							出院次要疾病第三诊断编码
						</div>
						<div field="akc276" width="100" headerAlign="center">
							出院次要疾病第四诊断
						</div>
						<div field="akc277" width="100" headerAlign="center">
							出院次要疾病第四诊断编码
						</div>
						<div field="aae030" width="100" headerAlign="center">
							入院日期
						</div>
						<div field="aae031" width="100" headerAlign="center">
							出院日期
						</div>
						<div field="baz020" dateFormat="yyyyMMdd" width="100" headerAlign="center">
							智能审核时间
						</div>
						<div field="baz022" width="100" headerAlign="center">
							智能审核结果说明
						</div>
						<div field="baz031" type="comboboxcolumn" width="100" headerAlign="center">
							审核状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['BAZ031']}">
						</div>
						<div field="aaa027" width="100" headerAlign="center">
							统筹区
						</div>
					</div>
				</div>
			</div>
			<div title="单据明细">
			   <div id="grid2" class="mini-datagrid" idField="id"
					style="width:890px;height:360px;margin:1px 1px 1px 4px;"
					url="${pageContext.request.contextPath}/k2/f10202001/queryHosMedDocumentDetail.action">
					<div property="columns">
						<div field="baz031" type="comboboxcolumn" width="100" headerAlign="center">
							审核状态<input property="editor" class="mini-combobox" data="${dic['BAZ031']}">
						</div>
						<div field="baz033" type="comboboxcolumn" width="100" headerAlign="center">
							违规类型<input property="editor" class="mini-combobox" data="${dic['BAZ033']}">
						</div>
						<div field="baz003" width="100" headerAlign="center">
							违规明细ID
						</div>
						<div field="baz001" width="100" headerAlign="center">
							违规单据ID
						</div>
						<div field="ake001" width="100" headerAlign="center">
							社保三大目录统一编码
						</div>
						<div field="ake002" width="100" headerAlign="center">
							社保三大目录名称
						</div>
						<div field="ake003" type="comboboxcolumn" width="100" headerAlign="center">
							三大目录类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKE003']}">
						</div>
						<div field="aka065" type="comboboxcolumn" width="100" headerAlign="center">
							收费项目等级<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKA065']}">
						</div>
						<div field="aka081" width="100" headerAlign="center">
							用药途径
						</div>
						<div field="ake106" width="100" headerAlign="center">
							常规用量
						</div>
						<div field="aka072" width="100" headerAlign="center">
							用药频次
						</div>
						<div field="aka071" width="100" headerAlign="center">
							单次用量
						</div>
						<div field="ake131" width="100" headerAlign="center">
							用量单位类型
						</div>
						<div field="akc229" width="100" headerAlign="center">
							用药天数
						</div>
						<div field="akc231" width="100" headerAlign="center">
							药量天数
						</div>
						<div field="akc226" width="100" headerAlign="center">
							数量
						</div>
						<div field="akc225" width="100" headerAlign="center">
							单价
						</div>
						<div field="aka052" width="100" headerAlign="center">
							计价单位
						</div>
						<div field="aka074" width="100" headerAlign="center">
							规格
						</div>
						<div field="ake004" width="100" headerAlign="center">
							材料名称
						</div>
						<div field="aka098" width="100" headerAlign="center">
							生产单位
						</div>
						<div field="ake005" width="100" headerAlign="center">
							生产地类别
						</div>
						<div field="akb065" width="100" headerAlign="center">
							合计
						</div>
						<div field="aaz213" width="100" headerAlign="center">
							明细ID
						</div>
						<div field="aaa027" width="100" headerAlign="center">
							统筹区
						</div>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("grid1");
	var grid2 = mini.get("grid2");
	function setData(data) {
		data = mini.clone(data);
		grid1.load({
			  start:data.akc194Start,
			  akb020:data.akb020,
			  ac62Baz031:data.ac62Baz031,
			  aaa027:data.aaa027,
		      end:data.akc194End
	        });
	}
	function onMxRenderer(e){
    	var record = e.row;
        return "<a href='javascript:void(0)' onclick = showHosDetail('" + record.baz001 + "')>单据明细</a> ";
    }
    function showHosDetail(baz001){
    	grid2.load( {
			baz001 : baz001
		});
    	mini.get("sum_tabs").activeTab(1);
    }
</script>
	</body>
</html>
