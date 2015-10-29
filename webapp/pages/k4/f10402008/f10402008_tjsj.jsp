<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>条件逻辑数据</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>

	</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
				<div class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">条件逻辑数据</span>
					</h3>
					<div class="fR pT5R9">
						<span class="btnMini"> <em> <input type="button"
									value="确定" onclick="SaveData();" /> </em> </span>
						<span class="btnMini"> <em> <input type="button"
							value="关闭" onclick="CloseWindow();" /> </em> </span>
					</div>
					<div id="datagrid1" class="mini-datagrid"
						onrowdblclick="selectModel" style="width: 100%; height: 348px;"
						idField="id" multiSelect="false" allowResize="false" pageSize="20"
						url="${pageContext.request.contextPath}/k4/f10402008/queryLjsjWithPage.action">
						<div property="columns">
							<div type="checkcolumn"></div>
							<div field="sjtjzd" width="100" headerAlign="center">
								数据内容
							</div>
							<div field="sjzszd" width="100" headerAlign="center">
								数据描述
							</div>
						</div>
					</div>
				</div>
	</body>
</html>

<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("datagrid1");
    var ybgzbm;
    var ybgztjljbm;
    var yssjnr;
    var sjzdlx;

    function SetData(data){
        ybgzbm=data.ybgzbm;
        yssjnr=data.yssjnr;
        ybgztjljbm=data.ybgztjljbm;
    	grid1.load(data);
    }
    
     function CloseWindow(action) { 
         if (window.CloseOwnerWindow){
              return window.CloseOwnerWindow(action);
         }else{
             window.close();
         }  
     }
   
   function SaveData(){
       var row=grid1.getSelected();
       if(row.sjtjzd!=yssjnr){
    	   mini.mask( {
   			el : document.body,
   			cls : 'mini-mask-loading',
   			html : '处理中...'
   			});
   			$.ajax( {
   					url : "${pageContext.request.contextPath}/k4/f10402008/saveSjnr.action",
   					type : "post",
   					data : {
   						sjnr : row.sjtjzd,
   						ybgztjljbm:ybgztjljbm,
   						ybgzbm:ybgzbm
   					},
   					success : function(text) {
   						mini.unmask(document.body);
   						if (text.success) {
   							mini.showMessageBox( {
   								title : "提示",
   								message : "成功修改一条记录",
   								buttons : [ "确定" ],
   								iconCls : "mini-messagebox-info",
   								callback : function(action) {
   									CloseWindow(1);
   								}
   							});
   						} else {
   							mini.alert(text.msg);
   						}
   					}
   				});
       }
   }

   grid1.on("drawcell", function (e) {
       var record = e.record,
       column = e.column,
       field = e.field,
       value = e.value;
       if(field == "sjtjzd" && value == yssjnr){
    	  grid1.setSelected(e);
    	   
       }
       
   });
   
   
</script>
