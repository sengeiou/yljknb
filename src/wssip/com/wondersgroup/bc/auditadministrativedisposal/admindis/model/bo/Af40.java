package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.BaseAf40;

/**
 * 
 * @ClassName: Af40 
 * @Description: 登记问题台帐
 * @author chenlin
 * @date 2014-7-22 下午01:31:26 
 *
 */

@Entity
@org.hibernate.annotations.Entity(dynamicUpdate=true)
@Table(name="af40")
public class Af40 extends BaseAf40 {

}
