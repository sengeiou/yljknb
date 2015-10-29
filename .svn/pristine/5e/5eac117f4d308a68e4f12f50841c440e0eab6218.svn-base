package com.wondersgroup.bc.k3.f10301002.bs.impl;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Aa10;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301002.bs.F10301002BS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;

public class F10301002BSImpl implements F10301002BS{
	
	public String getMaxAbz001(){
		 StringBuffer sql = new StringBuffer(" select max(substr(nvl(a.abz001,'0000000'),-7,7)) as abz001 from af53 a ");
		 
		 Af53DTO af53Dto = CommonJdbcDaoUtils.getFirst(sql.toString(),Af53DTO.class);
		 
		 String abz001 = af53Dto.getAbz001();
		 
		 return abz001;
	}

	public String getValueByAaa027(String aaa027) {
		
		StringBuffer sql = new StringBuffer(" select * from aa10 a where a.aaa100 = 'AAA027' and a.aaa102 = " + aaa027);
		
		Aa10 aa10 = CommonJdbcDaoUtils.get(sql.toString(), Aa10.class);
		
		String aaa105 = aa10.getAaa105();
		
		return aaa105;
	}

}
