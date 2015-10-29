package com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.BaseAf48;
/**
 * 调度日志查询表
 * @author dmq
 * @version $Revision$ 2014-07-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "AF48")
public class Af48  extends BaseAf48{
	private String aaa201;
	@Transient
	public String getAaa201() {
		return aaa201;
	}

	public void setAaa201(String aaa201) {
		this.aaa201 = aaa201;
	}
	

}
