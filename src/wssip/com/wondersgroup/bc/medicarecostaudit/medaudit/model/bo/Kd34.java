package com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.BaseKd34;
/**
 * 单据违规信息表
 * @author rhx
 * @version $Revision$ 2014-07-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "KD34")
public class Kd34 extends BaseKd34{

}
