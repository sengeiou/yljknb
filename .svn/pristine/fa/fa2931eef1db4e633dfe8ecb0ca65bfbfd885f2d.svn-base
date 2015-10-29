/**
*** 工具类
*** author:xieguojun
***
**/
Ext.namespace('Yzsb.util');
/**
*** 将Ext.data.Record 转换成 Arrary
*** record:Ext.data.Record
*** key:record的主键
*** value:值
***/
Yzsb.util.recordToArray =function(record,key,value){
	var result =[];
	
	result.push(record.get(key));
	result.push(record.get(value));
	
	return result;
}

/**
***  将Ext.data.Record 数组 转换成 Arrary 数组
***/
Yzsb.util.recordsToArrays=function(records,key,value){
	
	if(!Ext.isArray(records)){
		return null;
	}
	
	var result =[];
	for(var i=0;i<records.length;++i){
		var r =records[i];
		
		var d =[];
		
		d.push(r.get(key));
		d.push(r.get(value));
		result.push(d);
	}
	return result;	
}

/**
*** 转化身份证，将15位或者18位的身份证转换为正确的18为身份证
**/
Yzsb.util.idCardTo18 =function(idcard) {
	var arrInt = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2);
	var arrCh = new Array('1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2');
	var sum = 0;
	 
	if(idcard.length != 15 &&idcard.length != 18) {
		return idcard;
	}

	if (idcard.length == 15) {
		idcard = idcard.substr(0, 6) + '19'+ idcard.substr(6, idcard.length - 6);
	} else {
		idcard = idcard.substr(0, 17);
	}

	for (var i = 0; i < idcard.length; i++) {
		sum += idcard.substr(i, 1) * arrInt[i];
	}

	idcard += arrCh[sum % 11];

	return idcard;
}

/**
**  校验身份证是否合法
**/	
Yzsb.util.validateIdCard = function(value) {
	
	if(typeof value =='undefined' || !value || value ==''){
		return "身份证号码为空!";	
	}	
	
	if (value.length != 15 && value.length != 18) {
		return '身份证号码长度应该为15位或者18位!';
	}
	
	var patten1 = "^\\d{15}$";
	var patten2 = "^\\d{17}[0123456789Xx]$";

	if (!new RegExp(patten1, "g").test(value)&& !new RegExp(patten2, "g").test(value)) {
		return '身份证号码只能包含数字和X';
	}
	
	var id18 = Yzsb.util.idCardTo18(value);

	var csrqstr = id18.substr(6, 8);
	var year = parseInt(csrqstr.substr(0, 4), 10);
	var month = parseInt(csrqstr.substr(4, 2), 10) - 1;
	var date = parseInt(csrqstr.substr(6, 2), 10);
	
	var csrq = new Date(year, month, date);
	
	if (year != csrq.getFullYear() || month != csrq.getMonth()|| date != csrq.getDate()) {
		return '身份证中的出生日期['+csrqstr +']非法!';
	}

	if(value !=id18){
		return "身份证不正确，正确的身份证号码为:["+id18+"]";
	}	
	
	return true; 
}

/**
*** 将身份证转换为 出生日期和性别
*** 返回：错误身份证返回空
*** 返回：正确身份证，返回数据，第一个为Date类型的生日，第二个为整形的性别(0:男,1:女)
**/
Yzsb.util.idcardToDateAndSex =function(idcard){
	
	var id18 =Yzsb.util.idCardTo18(idcard);
	
	var dateAndSex =[];
	
	if(Yzsb.util.validateIdCard(id18) !==true){
		return dateAndSex;
	}
	
	var csrqstr = id18.substr(6, 8);
	var year = parseInt(csrqstr.substr(0, 4), 10);
	var month = parseInt(csrqstr.substr(4, 2), 10) - 1;
	var date = parseInt(csrqstr.substr(6, 2), 10);
	var csrq = new Date(year, month, date);
	
	dateAndSex[0] =csrq;
	
	var sexInt = parseInt(id18.substr(16, 1));
	
	if(sexInt % 2 ===0)
		dateAndSex[1] =0;
	else
		dateAndSex[1] =1;	 
		
	return dateAndSex;
	
}

/**
 * targetUrl:提交的action
 * params:附加参数
 * method:POST 或者GET
 * completeFunction：成功回调
 * failureFunction：失败回调
 * waitMsg:等待信息
 * timeout:超时设置 ms数
 */
Yzsb.util.request = function(targetUrl, params, method, completeFunction,failureFunction,waitMsg,timeout) {
	if (typeof(waitMsg) != 'undefined') {
		var percentage = 0;
		Ext.MessageBox.show({
			title : '\u8fdb\u5ea6\u6761',
			msg : waitMsg,
			progressText : 'Initializing...',
			width : 300,
			progress : true,
			closable : false
		});
		var progressTask = {
			run : function() {
				var progress = percentage / 100;
				if (progress >= 1) {
					progress = 1;
				}
				Ext.MessageBox.updateProgress(progress, (progress * 100) + "%");
				percentage = percentage + 10;
			},
			interval : 1000
				// 1 second
		}
		var taskRunner = new Ext.util.TaskRunner();
		taskRunner.start(progressTask);
	}

	if (timeout) {
		Ext.Ajax.timeout = timeout;
	}
	Ext.Ajax.request({
		url : targetUrl,
		params : (typeof(params) != 'undefined') ? params : {},
		method : (typeof(method) != 'undefined') ? method : 'post',
		waitMsg : (typeof(waitMsg) != undefined) ? waitMsg : 'Waiting...',
		isUpload :false,
		success : function(response, options) {
			
			if (typeof(waitMsg) != 'undefined') {
				taskRunner.stop(progressTask);
				Ext.MessageBox.hide();
				percentage = 0;
			}
			
			var form ={}; 
			form.response=response;
			if (!Wonders.utils.handleError(response.responseText, true, true)) {
				if (completeFunction) {
					completeFunction(response,form);
				}
			}
		},
		failure:function(response,options){
			
			if (typeof(waitMsg) != 'undefined') {
				taskRunner.stop(progressTask);
				Ext.MessageBox.hide();
				percentage = 0;
			} 
			
			var form ={}; 
			form.response=options;
			if (failureFunction) {
				failureFunction(response,form);
			}
		}
	});
}
