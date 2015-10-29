package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.BaseAf58;
/**
 * 行政处理处罚执行结果
 * @author rhx
 * @version $Revision$ 2012-12-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "AF58")
public class Af58 extends BaseAf58 {

}
