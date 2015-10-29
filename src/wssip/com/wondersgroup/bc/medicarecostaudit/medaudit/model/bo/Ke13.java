package com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.BaseKe13;

/**
 * 医师费用情况分析
 * @author ltt
 * @version $Revision$ 2014-11-07
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "KE13")
public class Ke13 extends BaseKe13{

	
}
