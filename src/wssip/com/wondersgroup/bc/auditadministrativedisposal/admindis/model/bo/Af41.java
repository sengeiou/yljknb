package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.BaseAf41;

/**
 * 
 * @ClassName: Af41 
 * @Description: 稽核案件台帐
 * @author chenlin
 * @date 2014-7-22 下午01:32:42 
 *
 */
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate=true)
@Table(name="af41")
public class Af41 extends BaseAf41 {

}
