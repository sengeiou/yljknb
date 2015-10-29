
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>新增监控对象信息</title>
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
	<body>

		<form id="form1" action="" method="post">
			<input id="id" name="id" class="mini-hidden" />
				<h3 class="cxTit pTb8"><span class="iconCx"> </span></h3>
				<div id="editForm1" >
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
						<tr>
							<td class="textR">
								<span style="color: red;">*</span>监控对象名称:
							</td >
							<td >
							<div class="inputL" style="width: 130px" >
									<div class="inputR">
										<div class="inputC">
											<input name="dxmc" id="dxmc" required="required" class="mini-buttonedit" onbuttonclick="queryPlan" />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								监控对象ID:
							</td>
								<td >
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="dxid" id="dxid" enabled="false" class="mini-textbox" required="required"  />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								对象类型:
							</td>
								<td>
								<div class="inputL" style="width: 130px;">
									<div class="inputR">
										<div class="inputC">
											<input id="dxlx"  name="dxlx" enabled="false" emptyText="请选择..." class="mini-combobox"   data="Jklx"/>
										</div>
									</div>
							</div>
							</td>
							</tr>
							<tr>
							<td class="textR">
								<span style="color: red;">*</span>规则名称:
							</td>
							<td >
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input  id="gzdm" name="gzdm" required="required"  textName='mc' class="mini-buttonedit" onbuttonclick="queryPlan1" 
											  allowInput="false"/>
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								指标名称:
							</td>
							<td >
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="zbmc" name="zbmc" enabled="false"  class="mini-textbox" style="width: 100%;" allowInput="false"/>
								            <input id="zbdm" name="zbdm"  class="mini-hidden" style="width: 100%;" />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								指标描述:
							</td>
							<td >
							<div class="inputL" style="width: 130px;">
									<div class="inputR">
										<div class="inputC">
											<input id="zbms" name="zbms" enabled="false" class="mini-textbox" style="width: 100%;" allowInput="false"/>
										</div>
									</div>
							</div>
							</td>
							</tr>
							<tr>
							<td class="textR">
								指标值:
							</td>
							<td >
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="zbz" class="mini-textbox" style="width: 100%;" />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								规则指标来源:
							</td>
							<td >
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="gzly" class="mini-textbox" style="width: 100%;" />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								说明:
							</td>
							<td>
							<div class="inputL" style="width: 130px;">
									<div class="inputR">
										<div class="inputC">
												<input name="sm" class="mini-textbox" style="width: 100%;" />
										</div>
									</div>
							</div>
							</td>
						</tr>
						<tr>
	                	<td class="textR">
								参数:
							</td>
							<td>
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input name="cs" class="mini-textbox" style="width: 100%;" />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								经办时间:
							</td>
							<td>
							<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="sj" enabled="false"  name="cjsj" dataFormat="yyyy-MM-dd" onvaluechanged="onValueChanged" class="mini-datepicker"
										disabled="disabled" />
										</div>
									</div>
							</div>
							</td>
							<td class="textR">
								创建人:
							</td>
								<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="cjr" name="cjrmc" enabled="false"  readonly="readonly" class="mini-textbox" required="required"/>
										</div>
									</div>
							</div>
							</td>
						</tr>
						<tr>
						<td class="textR">
								 参数说明:
							</td>
							<td colspan="5">
							<div style="padding-right:27px;padding-bottom:2px">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input name="cssm" class="mini-textarea" style="width: 100%;" height="100" readOnly="true"
					            value= "参数一：就诊类别，如果有多个就诊类别，可用逗号分隔;可为空
参数二：险种类型，支持多个，用逗号分隔，可空。
参数三：疾病分类，支持not in/in1，2，3格式，可为空;
参数四：限使用项目。
参数五：医院等级。
参数六：性别，1男性，2女性，可为空。
参数七：限急救，1限急救。
参数八：次数限制，可含最小和最大值。
参数九：年龄。"/>
								</div>
								<div class="textareaBl">
									<div class="textareaBr">
										<div class="textareaBc">
										</div>
									</div>
								</div>
							</div>
						</td>
						</tr>
						<tr>
							<td
								style="text-align: right; padding-top: 5px; padding-right: 23px;"
								colspan="6">
								<span class="btnMini"><em><input type="button" onClick="SaveData();" value="提交"/></em></span>
								<span class="btnMini"><em><input type="button" onClick="closeWin();" value="关闭"/></em></span>
						
							</td>
						</tr>
					</table>
				</div>
		</form>
<script type="text/javascript">
	mini.parse();
		var form = new mini.Form("form1");
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
	function SetData() {
			$.ajax( {
					url : "${pageContext.request.contextPath}/k4/f10402007/ruleDxzbData.action",
					type : "post",
					success : function(text) {
						var data = mini.decode(text);
						mini.get("sj").setValue(data.cjsj);
						mini.get("cjr").setValue(data.cjrmc);
					}
				});
	}
	
	
	 function SaveData() {
        var data = form.getData(); 
        form.validate();
        if (form.isValid() == false) {
            return;
        }
        var json = mini.encode(data);
       // alert(json);
        mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
        $.ajax({
            url: "${pageContext.request.contextPath}/k4/f10402007/addDxzb.action",
            type: "post",
            data: { submitData: json },
            success: function (text) {
            	mini.unmask(document.body);
            	if(text.success){
            	 	mini.showMessageBox({
        				title: "提示",
        				message: "成功添加一条记录",
        				buttons: ["确定"],
        				iconCls: "mini-messagebox-info",
        				callback: function(action){
            				closeWin();
         			}});        	  
            	}else{
            	  mini.alert(text.msg);
                }  
            }
        });
    }

	  mini.parse();

        function queryPlan() {
            var btn=this;
			mini.open({
				url:"../pages/k4/f10402007/f10402007_getMidx.jsp",
				title:"请选择计划",
				width:800,
				height:400,
				ondestroy:function(action){
					var iframe = this.getIFrameEl();
					var data=iframe.contentWindow.GetData();
		            data = mini.clone(data);    //必须。克隆数据
		            if(data){
		           		mini.get("dxmc").setText(data.dxmc);
		           		mini.get("dxmc").setValue(data.dxmc);
		           		mini.get("dxlx").setValue(data.dxlx);
		           		mini.get("dxid").setValue(data.dxid);
		           }	
				}
			});
             
        }    
        
        function queryPlan1() {
            var btn=this;
			mini.open({
				url:"../pages/k4/f10402007/f10402007_selectGzzb.jsp",
				title:"请选择计划", 
				width: 800, height: 500,
				ondestroy:function(action){
					var iframe = this.getIFrameEl();
					var data=iframe.contentWindow.GetData();
		            data = mini.clone(data);    //必须。克隆数据
		            //alert(data);
		            if(data){
		          mini.get("gzdm").setText(data.mc);
		          mini.get("gzdm").setValue(data.gzdm);
		          mini.get("zbmc").setValue(data.zbmc);
		          mini.get("zbdm").setValue(data.zbdm);
		          mini.get("zbms").setValue(data.zbms);
		           }	
				}
			});
             
        }        
	

</script>
	</body>
</html>

