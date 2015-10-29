package com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.BaseKc63;
/**
 * 违规单据统计表
 * @author rhx
 * @version $Revision$ 2014-07-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "KC63")
public class Kc63 extends BaseKc63{
	
}
