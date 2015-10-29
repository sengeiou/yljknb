package com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.BaseKb41;

/**
 * 医疗机构信息维护事件表
 * 
 * @version $Revision$ 2014-09-15
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "KB41")
public class Kb41 extends BaseKb41{

}
