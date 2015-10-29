<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>规则实现方案</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>

	</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
		<div id="editform" class="cxTabbox">
			<form id="form" action="#">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
					<tr>
					    <td class="textR">
							方案名称：
						</td>
						<td> <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
							<input id="aaa201" name="aaa201" class="mini-textbox" /></div></div></div>
						</td>
						<td class="textR">
							方案分类：
						</td>
						<td> <div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
							<input id="aaa143" name="aaa143" emptyText="请选择..." readonly="readonly" class="mini-combobox" data="${dic['AAA143'] }" /></div></div></div>
						</td>
							<td style="text-align: center; padding-top: 5px;" colspan="2">
								<input type="button" value="" class="cxsubmit" onclick="search();"/>
								<input type="button" value="" class="cxreset" onclick="resetForm();" />
						</td>
					</tr></table>
			</form>
		</div>
		<div class="listTit">
			<h3 class="cxTit fL">
				<span class="iconCx">规则信息</span>
			</h3>
			<div class="fR pT5R9">
				<span class="btnMini"> <em> <input type="button"
							value="确定" onclick="selectScheme()" /> </em> </span>
				<span class="btnMini"> <em> <input type="button"
							value="关闭" onclick="CloseWindow();" /> </em> </span>
			</div>
			<div onrowdblclick="selectScheme" id="datagrid1"
				class="mini-datagrid" style="width: 100%; height: 350px;"
				idField="id" multiSelect="false" allowResize="false" pageSize="20"
				url="${pageContext.request.contextPath}/k4/f10402001/queryScheme.action">
				<div property="columns">
					<div type="checkcolumn"></div>
					<div field="aaa201" width="100" headerAlign="center">
						方案名称
					</div>
					<div field="aaa143" width="100" headerAlign="center"
						type="comboboxcolumn">
						方案分类
						<input property="editor" class="mini-combobox"
							style="width: 100%" data="${dic['AAA143']}">
					</div>
					<div field="aaa026" width="100" headerAlign="center"
						type="comboboxcolumn">
						实现类型
						<input property="editor" class="mini-combobox"
							style="width: 100%" data="${dic['AAA026']}">
					</div>
					<div field="aaa133" width="100" headerAlign="center">
						方案实现
					</div>
					<div field="aae100" width="100" headerAlign="center"
						type="comboboxcolumn">
						有效标志
						<input property="editor" class="mini-combobox"
							style="width: 100%" data="${dic['AAE100']}">
					</div>
					<div field="aae011" width="100" headerAlign="center">
						经办人
					</div>
					<div field="aae036" width="100" headerAlign="center"
						dateFormat="yyyy-MM-dd">
						经办时间
					</div>
				</div>
			</div>
		</div>
	</body>
</html>

<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("datagrid1");
	
	function search(){
		var form = new mini.Form("#form");
		var data = form.getData(true,false);
		data.aae100="1";
		grid1.load(data); 
	}
	
    function resetForm(){
   		mini.get("aaa201").setValue("");
    }
    
    function CloseWindow(action) { 
         if (window.CloseOwnerWindow){
              return window.CloseOwnerWindow(action);
         }else{
             window.close();
         }  
     }
   
   function selectScheme(){
 		 if(grid1.getSelected()){
    		CloseWindow("ok");
    	}else{
    		alert("请选择一行");
    	}
   }
   
   function GetData(){
   		var row = grid1.getSelected();
   		 var data = {
        	id:row.aaz100,
        	name:row.aaa201,
        	aaa143:row.aaa143
        };
        return data;
   }
   
    function SetData(data){
   		mini.get("aaa143").setValue(data.aaa143);
   		search();
   }
</script>
