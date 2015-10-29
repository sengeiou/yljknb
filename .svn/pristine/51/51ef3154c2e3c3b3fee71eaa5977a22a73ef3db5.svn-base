  var tl;
  

	function onLoad(timeline_id) {
	 var Dates= new Date();	 		
   var eventSource = new Timeline.DefaultEventSource();
   
   var theme = Timeline.ClassicTheme.create();
   theme.event.bubble.width = 320;
   theme.event.bubble.height = 320;
   theme.ether.backgroundColors[1] = theme.ether.backgroundColors[0];
   
   var bandInfos = [
     Timeline.createBandInfo({
         width:          "10%", 
         intervalUnit:   Timeline.DateTime.YEAR, 
         intervalPixels: 400
     }),
     Timeline.createBandInfo({
         eventSource:    eventSource,
         width:          "80%", 
         color:"#1A42E6",
         intervalUnit:   Timeline.DateTime.MONTH, 
         intervalPixels: 300
     }),
     Timeline.createBandInfo({
         overview:       true,
         eventSource:    eventSource,
         width:          "10%", 
         intervalUnit:   Timeline.DateTime.YEAR, 
         intervalPixels: 400
     })
   ];
   
   bandInfos[0].etherPainter = new Timeline.YearCountEtherPainter({
        startDate:  Dates,
        multiple:   1,
        theme:      theme
    });    
    bandInfos[0].decorators = [
        new Timeline.SpanHighlightDecorator({
            startDate:  "Jan 01 1900 00:00:00 GMT",
            endDate:    "Dec 31 2999 00:00:00 GMT",
            startLabel: "birth",
            endLabel:   "death",
            color:      "#166FC7",
            opacity:    60,
            theme:      theme
        })
    ];
    
    bandInfos[1].decorators = [
	               		        new Timeline.SpanHighlightDecorator({
	               		            startDate:  "Jan 01 0000 00:00:00 GMT",
	               		            endDate:    "Dec 31 2999 00:00:00 GMT",
	               		            startLabel: "birth",
	               		            endLabel:   "death",
	               		            color:      "#F9F9F8",
	               		            opacity:    100,
	               		            theme:      theme
	               		        })
	               		    ];
    
    bandInfos[2].decorators = [
	               		        new Timeline.SpanHighlightDecorator({
	               		            startDate:  "Jan 01 0000 00:00:00 GMT",
	               		            endDate:    "Dec 31 2999 00:00:00 GMT",
	               		            startLabel: "birth",
	               		            endLabel:   "death",
	               		            color:      "#FF8000",
	               		            opacity:    70,
	               		            theme:      theme
	               		        })
	               		    ];
    
    //设置三个时间条同步滑动
   bandInfos[0].syncWith = 1;
   bandInfos[0].highlight = true;
   bandInfos[2].syncWith = 1;
   bandInfos[2].highlight = true;
   
   tl = Timeline.create(document.getElementById(timeline_id), bandInfos);
   //Timeline.loadXML("example1.xml", function(xml, url) { eventSource.loadXML(xml, url); });
   
 }
		 
	 var resizeTimerID = null;
	 function onResize() {
	     if (resizeTimerID == null) {
	         resizeTimerID = window.setTimeout(function() {
	             resizeTimerID = null;
	             tl.layout();
	         }, 500);
	     }
	 }
  
	//加载人员数据（出生日期、死亡日期、时间轴DIV的id、XML临时文件名，未死亡传入29991231）
	function clickbtn(datestart,dateend,timeline_id,sjz){
		 
		// 转换日期格式
		//出生日期、死亡日期
	 var datestart= new Date(datestart.substr(0,4),datestart.substr(4,2)-1,datestart.substr(6,2));
	 var dateend= new Date(dateend.substr(0,4),dateend.substr(4,2)-1,dateend.substr(6,2));
	 var nowdate=new Date();		
		 	
		   var eventSource = new Timeline.DefaultEventSource();
   
		   var theme = Timeline.ClassicTheme.create();
		   theme.event.bubble.width = 320;
		   theme.event.bubble.height = 320;
		   theme.ether.backgroundColors[1] = theme.ether.backgroundColors[0];
		            
		            
		   var bandInfos = [
		     Timeline.createBandInfo({
		         date:           nowdate,
		         width:          "10%", 
		         intervalUnit:   Timeline.DateTime.YEAR, 
		         intervalPixels: 400
		     }),
		     Timeline.createBandInfo({
		         eventSource:    eventSource,
		         date:           nowdate,
		         width:          "80%", 
		         color:"#1A42E6",
		         intervalUnit:   Timeline.DateTime.MONTH, 
		         intervalPixels: 300
		     }),
		     Timeline.createBandInfo({
		         overview:       true,
		         eventSource:    eventSource,
		         date:           nowdate,
		         width:          "10%", 
		         intervalUnit:   Timeline.DateTime.YEAR, 
		         intervalPixels: 400
		     })
		   ];
		   //按照出生日期显示岁数
		   bandInfos[0].etherPainter = new Timeline.YearCountEtherPainter({
		        startDate:  datestart,
		        multiple:   1,
		        theme:      theme
		    });
		 
		   //设置人员出生及死亡日期
		    bandInfos[0].decorators = [
		        new Timeline.SpanHighlightDecorator({
		            startDate:  datestart,
		            endDate:    dateend,
		            startLabel: "birth",
		            endLabel:   "death",
		            color:      "rgb(139,170,234)",
		            opacity:    60,
		            theme:      theme
		        })
		    ];
		    
		    bandInfos[1].decorators = [
			               		        new Timeline.SpanHighlightDecorator({
			               		            startDate:  datestart,
			               		            endDate:    dateend,
			               		            startLabel: "birth",
			               		            endLabel:   "death",
			               		            color:      "#F9F9F8",
			               		            opacity:    100,
			               		            theme:      theme
			               		        })
			               		    ];
		    
		    bandInfos[2].decorators = [
		               		        new Timeline.SpanHighlightDecorator({
		               		            startDate:  datestart,
		               		            endDate:    dateend,
		               		            startLabel: "birth",
		               		            endLabel:   "death",
		               		            color:      "rgb(246,195,106)",
		               		            opacity:    70,
		               		            theme:      theme
		               		        })
		               		    ];
		    
		    
		  //设置三个时间条同步滑动
		   bandInfos[0].syncWith = 1;
		   bandInfos[0].highlight = true;
		   bandInfos[2].syncWith = 1;
		   bandInfos[2].highlight = true;
		   
		   tl = Timeline.create(document.getElementById(timeline_id), bandInfos);
		   
		   tl.loadJSON(sjz, function(json, url) { eventSource.loadJSON(json, url); });
		   //Wonders.Msg.info(sjz, '提示');
		   //tl.loadXML(urlweb+'/pages/inweb/business/fxbg/jsons.jsp?sjz='+encodeURI(encodeURI(sjz)), function(xml, url) { eventSource.loadXML(xml, url); });
		   
		}
	
	
	
	function clickbtn2(datestart,dateend,timeline_id){
		 
		// 转换日期格式
		//出生日期、死亡日期
	 var datestart= new Date(datestart.substr(0,4),datestart.substr(4,2)-1,datestart.substr(6,2));
	 var dateend= new Date(dateend.substr(0,4),dateend.substr(4,2)-1,dateend.substr(6,2));
	 var nowdate=new Date();		
		 	
		   var eventSource = new Timeline.DefaultEventSource();
   
		   var theme = Timeline.ClassicTheme.create();
		   theme.event.bubble.width = 320;
		   theme.event.bubble.height = 320;
		   theme.ether.backgroundColors[1] = theme.ether.backgroundColors[0];
		            
		            
		   var bandInfos = [
		     Timeline.createBandInfo({
		         date:           nowdate,
		         width:          "10%", 
		         intervalUnit:   Timeline.DateTime.YEAR, 
		         intervalPixels: 400
		     }),
		     Timeline.createBandInfo({
		         eventSource:    eventSource,
		         date:           nowdate,
		         width:          "80%", 
		         color:"#1A42E6",
		         intervalUnit:   Timeline.DateTime.MONTH, 
		         intervalPixels: 300
		     }),
		     Timeline.createBandInfo({
		         overview:       true,
		         eventSource:    eventSource,
		         date:           nowdate,
		         width:          "10%", 
		         intervalUnit:   Timeline.DateTime.YEAR, 
		         intervalPixels: 400
		     })
		   ];
		   //按照出生日期显示岁数
		   bandInfos[0].etherPainter = new Timeline.YearCountEtherPainter({
		        startDate:  datestart,
		        multiple:   1,
		        theme:      theme
		    });
		 
		   //设置人员出生及死亡日期
		    bandInfos[0].decorators = [
		        new Timeline.SpanHighlightDecorator({
		            startDate:  datestart,
		            endDate:    dateend,
		            startLabel: "birth",
		            endLabel:   "death",
		            color:      "rgb(139,170,234)",
		            opacity:    60,
		            theme:      theme
		        })
		    ];
		    
		    bandInfos[1].decorators = [
			               		        new Timeline.SpanHighlightDecorator({
			               		            startDate:  datestart,
			               		            endDate:    dateend,
			               		            startLabel: "birth",
			               		            endLabel:   "death",
			               		            color:      "#F9F9F8",
			               		            opacity:    100,
			               		            theme:      theme
			               		        })
			               		    ];
		    
		    bandInfos[2].decorators = [
		               		        new Timeline.SpanHighlightDecorator({
		               		            startDate:  datestart,
		               		            endDate:    dateend,
		               		            startLabel: "birth",
		               		            endLabel:   "death",
		               		            color:      "rgb(246,195,106)",
		               		            opacity:    70,
		               		            theme:      theme
		               		        })
		               		    ];
		    
		    
		  //设置三个时间条同步滑动
		   bandInfos[0].syncWith = 1;
		   bandInfos[0].highlight = true;
		   bandInfos[2].syncWith = 1;
		   bandInfos[2].highlight = true;
		   
		   tl = Timeline.create(document.getElementById(timeline_id), bandInfos);
		   
		   //tl.loadXML(sjz, function(xml, url) { eventSource.loadXML(xml, url); });
		   //Wonders.Msg.info(sjz, '提示');
		   //tl.loadXML(urlweb+'/pages/inweb/business/fxbg/jsons.jsp?sjz='+encodeURI(encodeURI(sjz)), function(xml, url) { eventSource.loadXML(xml, url); });
		   
		}