package com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.BaseKf28;

/**
 * 医疗服务机构费用情况分析
 * @author ltt
 * @version $Revision$ 2014-07-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "KF28")
public class Kf28 extends BaseKf28{
	
}
