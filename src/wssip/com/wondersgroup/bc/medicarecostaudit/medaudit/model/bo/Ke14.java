package com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.BaseKe14;

/**
 * 医师重点项目情况分析，除人工维护的重点项目外还包括贵重药品、抗微生物药品的使用情况
 * @author ltt
 * @version $Revision$ 2014-07-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "KE14")
public class Ke14 extends BaseKe14{

}
