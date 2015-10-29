package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.BaseKc22;


/**
 * 
 * @Description:就诊回传信息--费用明细
 *
 */
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate=true)
@Table(name="KC22")
public class Kc22 extends BaseKc22 {

}
