package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.BaseKa44;
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
/**
 * 规则
 * @author wjz
 * @version $Revision$ 2014-07-14
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Table( name = "KA44")
public class Ka44 extends BaseKa44{
	private String count;
	private String ake070;
	
	@Transient
	public String getAke070() {
		return ake070;
	}

	public void setAke070(String ake070) {
		this.ake070 = ake070;
	}

	@Transient
	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}
}
