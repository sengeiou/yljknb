<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="cw" uri="/widget-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>工作区</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<cw:base></cw:base>
		<%--<script src="<c:url value='struts/library/extjs/tabs/tabs.js'/>"></script>
		<script src="<c:url value='struts/library/wonders/tabs/TabCloseMenu.js'/>"></script>--%>
		<script type="text/javascript" src="<%=request.getContextPath()%>/resource/scripts/cookies.js"></script>
		
		<script type="text/javascript"> 
		var availHeight=screen.availHeight;
		var availWidth=screen.availWidth;
		var realHeight=0;
		<!--
			Ext.onReady(function(){
					var fm=Ext.get(self.top.window.frames['leftFrame'].document.body);
					
					realHeight=fm ? fm.getHeight()+20 : 614;
					
					var mainTab = new Ext.TabPanel({
  			 		id : 'mainTabs',
   					enableTabScroll : true,renderTo:'test',
   					closeAll : true,
   					activeTab : 0,
   					items : [{
         				id : 'welcomeTab',
				        xtype : 'panel',
				        height:realHeight-35,
				        title : '欢迎使用系统[0]',
				        autoLoad : {
				    		url : "<c:url value='/workspace/main.action'/>",
				    		scripts : true
			   		 	}
  					}],
       				listeners:{
       					beforeremove:beforeTabRemove
       				},
       				plugins :new Ext.ux.TabCloseMenu()      				
 			});
 			
 			//new Ext.Viewport({layout: 'fit',items:[mainTab]});
		});
		
		var tabIndex=1;
		var tabCount=0;
		var maxTabCount=0;
		var enableSameFunctions=false;
		var closeWait=getStatus('tabs_closeWait',true);
		var reopenSameFunction=getStatus('tabs_reopenSameFunction',true);		
		var allTabs={};
		
		function getStatus(key,defaultValue){
			var result=defaultValue;
			var cookie=new Cookie(key);
			if(cookie.load()){
				if(cookie.data[0][0].length!=0){
					result = unescape(cookie.data[0][0]);
					result = eval(result);
				}
			}
			return result;	
		}	
		
		
		function setStatus(key,value){
			var cookie=new Cookie(key);
			if(typeof(value)!='undefined'){
				value=''+value;
			}else{
				value='';
			}
			cookie.setVals(escape(value));
			cookie.store();
		}
		
		function addTab(funcId,url,funcName,titleUrl) {
		 	
			var funcUrl='<c:url value="pages/workspace/main.jsp"/>?contentUrl='+escape(url)+"&titleUrl="+escape(titleUrl);	
		  
			if(tabCount==maxTabCount && maxTabCount>0){
				alert('最多只能打开'+maxTabCount+'个功能');
				return;
			}
			 
			
			var tabs = Ext.getCmp('mainTabs');			
			var tabId='w'+funcId;
			
			if(enableSameFunctions){
				tabId=tabId+'_'+tabIndex;
			}

			if(allTabs[tabId]){
				if(reopenSameFunction){
					//if((closeWait && window.confirm('确定重新打开['+funcName+']功能吗?'))||!closeWait){
						var oldCloseWait=closeWait;
						closeWait=false;	
						tabs.remove(tabId);
						closeWait=oldCloseWait;	
					//}else{
					//	return;
					//}				
				}else{
					if(closeWait){
						alert('功能['+funcName+']已打开');
					}
					tabs.activate(tabId);
					return;
				}
			}
			
			var tpl = new Ext.Template(
				'<div id="tabTemplate">',
					'<div id="tabDiv{tabId}"><iframe id="tabFrame{tabId}" src="'+'<c:url value="/pages/workspace/maincontent.jsp"/>'+'?menuId={menuId}&contentUrl={contentUrl}&titleUrl={titleUrl}" frameborder="0" scrolling="no" width="100%" height="100%"></iframe></div>',
				'</div>	'	
			);
			tpl.compile();
			tpl.append(Ext.getBody(),{tabId:tabIndex,contentUrl:escape(url),titleUrl:titleUrl});

			tabs.add({
				title:funcName,
				height:realHeight-35,
				id:tabId,
				contentEl:'tabDiv'+tabIndex,
				closable:true
			}).show();
 			 	
 
 			allTabs[tabId]=true; 		 
			tabIndex++;
			tabCount++;	
			
			Ext.getCmp('welcomeTab').setTitle('欢迎['+tabCount+']');	
		} 
		
		function beforeTabRemove(tabPanel, panel){
			if(!closeWait||window.confirm('确定要关闭['+panel.title+']吗?')){
				tabCount--;
				Ext.getCmp('welcomeTab').setTitle('欢迎使用系统['+tabCount+']');		
				allTabs[panel.id]=false;
				return true;
			}else{
				return false;
			}
		}
		
		Ext.ux.TabCloseMenu = function () {
			var tabs, menu, ctxItem;
			this.init = function (tp) {
				tabs = tp;
				tabs.on("contextmenu", onContextMenu);
			};	
			function onContextMenu(ts, item, e) {
				if (!menu) { // create context menu on first right click
					menu = new Ext.menu.Menu([{id:tabs.id + "-close", text:"关闭本页", handler:function () {
						tabs.remove(ctxItem);
					},tooltip: {text:'此操作将关闭当前页面(选项卡)', title:'说明', autoHide:true}}
					, {id:tabs.id + "-close-others", text:"关闭其他", handler:function () {
						if(!closeWait || window.confirm('确定要关闭其他页面吗?')){
							var oldCloseWait=closeWait;
							closeWait=false;
							tabs.items.each(function (item) {
								if (item.closable && item != ctxItem) {
									tabs.remove(item);
								}
							});
							closeWait=oldCloseWait;					
						}				
					},tooltip: {text:'此操作将关闭除当前页面之外的其他页面(选项卡)', title:'说明', autoHide:true}}
					,'-',{id:tabs.id + "-closeWait", text:"启用提示",checked:closeWait, checkHandler:function (item, checked) {
						alert(checked?"启用提示":"禁用提示");
						closeWait=checked;
						setStatus('tabs_closeWait',closeWait);
					},tooltip: {text:'此操作将启用或禁用操作提示，如提示是否关闭当前页面', title:'说明', autoHide:true}}
					,{id:tabs.id + "-reopenSameFunction", text:"启用重开相同功能",checked:reopenSameFunction, checkHandler:function (item, checked) {
						alert(checked?"启用重开相同功能":"禁用重开相同功能");
						reopenSameFunction=checked;
						setStatus('tabs_reopenSameFunction',reopenSameFunction);
					},tooltip: {text:'此操作将启用或禁用重开相同功能<br>启用:关闭原有打开功能并重新打开该功能<br>禁用:直接定位到原有打开的相同功能"', title:'说明', autoHide:true}}]);
				}
				ctxItem = item;
				var items = menu.items;
				items.get(tabs.id + "-close").setDisabled(!item.closable);
				var disableOthers = true;
				tabs.items.each(function () {
					if (this != item && this.closable) {
						disableOthers = false;
						return false;
					}
				});
				items.get(tabs.id + "-close-others").setDisabled(disableOthers);
				menu.showAt(e.getPoint());
			}	 
	};


//-->
		</script>
	</head>
	<body style="height:100%; margin:0; padding:0;">
	
	<div class="pages" id='test' ></div>
	</body>
</html>
