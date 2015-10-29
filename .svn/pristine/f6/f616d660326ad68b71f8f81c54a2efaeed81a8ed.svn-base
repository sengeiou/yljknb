/***
*** 日期时间类工具类
*** author:xieguojun
**/

/**
***  获取
***/
function getSystemDate(now){

	return parseDate(now);			
}

/**
** 获取业务月度
**/
function getYYYYMM(now){
	var date =getSystemDate(now);
	
	var result ='';
	var month =date.getMonth();
	 
	result +=date.getYear();
	
	if(month.length==2)
		result +=month;
	else
		result +="0"+month;
	
	return result;	
}


/** 
**  将dateStr日期字符串转换为javascript日期
**   dateStr:日期字符串
**	 format:日期格式，默认值为Y-m-d H:i:s
**/
function parseDate(dateStr,format){
	
	if(typeof(dateStr) !='undefined'){
		if(typeof(format) !='undefined')
			return Date.parseDate(dateStr,format);
		else
			return Date.parseDate(dateStr,'Y-m-d H:i:s');	
	}
}

//取得日期字符串,返回YYYY-MM-DD   
function getDate(date)   
{   
    var thisYear = date.getFullYear();   
    var thisMonth = date.getMonth() + 1;   
    //如果月份长度是一位则前面补0   
    if(thisMonth<10) thisMonth = "0" + thisMonth;   
       
    var thisDay = date.getDate();   
    //如果天的长度是一位则前面补0   
    if(thisDay<10) thisDay = "0" + thisDay;   
       
    return thisYear + "-" + thisMonth + "-" + thisDay;   
} 
//取得日期字符串,返回YYYYMMDD   
function getDateYmd(date)   
{   
    var thisYear = date.getFullYear();   
    var thisMonth = date.getMonth() + 1;   
    //如果月份长度是一位则前面补0   
    if(thisMonth<10) thisMonth = "0" + thisMonth;   
       
    var thisDay = date.getDate();   
    //如果天的长度是一位则前面补0   
    if(thisDay<10) thisDay = "0" + thisDay;   
       
    return thisYear + thisMonth + thisDay;   
}
   
//取得日期时间字符串,返回YYYY-MM-DD HH:mm:SS   
function getDateTime(date)   
{   
    var thisYear = date.getFullYear();   
    var thisMonth = date.getMonth() + 1;   
    //如果月份长度是一位则前面补0   
    if(thisMonth<10) thisMonth = "0" + thisMonth;   
       
    var thisDay = date.getDate();   
    //如果天的长度是一位则前面补0   
    if(thisDay<10) thisDay = "0" + thisDay;   
   
    var thisHour = date.getHours();   
    //如果小时长度是一位则前面补0   
    if(thisHour<10) thisHour = "0" + thisHour;   
       
    var thisMinute = date.getMinutes();   
    //如果分钟长度是一位则前面补0   
    if(thisMinute<10) thisMinute = "0" + thisMinute;   
       
    var thisSecond = date.getSeconds();   
    //如果分钟长度是一位则前面补0   
    if(thisSecond<10) thisSecond = "0" + thisSecond;   
       
    return thisYear + "-" + thisMonth + "-" + thisDay + " " + thisHour + ":" + thisMinute + ":" + thisSecond;   
}   
   
//根据日期字符串生成日期对象,日期字符串格式为YYYY-MM-DD   
function setDate(strDate)   
{   
    var aDate = strDate.split("-");   
    return new Date(aDate[0],aDate[1]-1,aDate[2]);   
}   
   
//获得指定日期的临近日期   
//strDate:指定的日期,格式为yyyy-mm-dd  nDay:与指定日期相邻的天数 1为明天 -1为昨天   
function getNearDay(strDate,nDay)   
{   
    try  
    {   
        var oDate = setDate(strDate);   
        var newDate = new Date(oDate.valueOf() + nDay*24*60*60*1000);   
        return getDate(newDate);   
    }   
    catch(ex)   
    {   
        return "error";   
    }   
}  



//Ext.namespace('Yzsb.date');
//
//Yzsb.date.format =function(date,format){
//	
//	return date.format(format);	
//}
//
//Yzsb.date.parseMonth =function(months){
//	
//	var year =Math.floor(months / 12);
//	var month =months % 12;
//	
//	var result ='';
//	
//	if(year <10)
//		result +='0';
//	result +=year;
//	
//	if(month <10)
//		result +='0';
//	result +=month;
//	
//	return result;	
//}