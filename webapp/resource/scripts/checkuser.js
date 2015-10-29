
function checkUser(){
	return true;//测试库上需要，正式库上不需要
		if (!checknewusb()){
			  window.location.replace('http://168.100.7.163:9080/shybQxpt/login.jsp');
			  return false;
		}else{
			  return true;
		}			
}
		
function checknewusb(){	 
	 //检查驱动有没有安装，用棒子加密、签名随机数
		if(SafeEngineCtl==null){
			alert('USB卡驱动程序安装不正确，请重新安装。');
			return false;
			
		}
		//取密码		
 		if("" == password){
					return false;
		}
 		//初始化环境
		SafeEngineCtl.SEH_InitialSession(30,"com1",password,0,30,"com1","");
		if(SafeEngineCtl.ErrorCode!=0){
			SafeEngineCtl.SEH_InitialSession(9,"com1",password,0,9,"com1","");
			if(SafeEngineCtl.ErrorCode!=0){
				alert("USB卡初始化失败,请检查USB KEY是否插好，密码是否正确");
				return false;					
			}
		}
		// 获取自己证书

		var strCert = SafeEngineCtl.SEH_GetSelfCertificate(30, "com1", password);
		if(SafeEngineCtl.ErrorCode!=0){
			strCert = SafeEngineCtl.SEH_GetSelfCertificate(9, "com1", password);
			if(SafeEngineCtl.ErrorCode!=0){
					alert("获取用户证书出错。");
					SafeEngineCtl.SEH_ClearSession();
					return false;
			}
		}
		var strUniqueid = SafeEngineCtl.SEH_GetCertUniqueID(strCert);
		
		/* 释放 */
		SafeEngineCtl.SEH_ClearSession();
		
		if (strUniqueid!=pkiid) 
		{
		  alert("当前用户与USB卡信息不匹配!");
		  return false;
		}

		return true;		
}
