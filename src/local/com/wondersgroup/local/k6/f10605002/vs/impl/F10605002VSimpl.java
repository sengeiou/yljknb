package com.wondersgroup.local.k6.f10605002.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k6.f10605002.bs.F10605002BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k6.f10605002.vo.F10605002VO;
import com.wondersgroup.local.k6.f10605002.vs.F10605002VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;

public class F10605002VSimpl implements F10605002VS {
	private F10605002BS f10605002BS;

	public F10605002BS getF10605002BS() {
		return f10605002BS;
	}

	public void setF10605002BS(F10605002BS f10605002bs) {
		f10605002BS = f10605002bs;
	}

	public Map<String, Object> queryHosWithPage(Page page,
			F10605002VO f10605002VO) {
		if (f10605002VO==null) {
			throw new BusinessException("F10605020VS-00:传入参数对象为空");
		}
		if (f10605002VO.getAkc194s1()==null||f10605002VO.getAkc194e1()==null) {
			throw new BusinessException("F10605020VS-01:传入开始时间或结束时间为空");
		}
		if (f10605002VO.getAaa027()==null) {
			throw new BusinessException("F10605020VS-02:传入统筹区为空");
		}
		String akc194s=f10605002VO.getAkc194s1().replaceAll("-", "");
		String akc194e=f10605002VO.getAkc194e1().replaceAll("-", "");
		f10605002VO.setAkc194s1(akc194s);
		f10605002VO.setAkc194e1(akc194e);
		Page result=this.getF10605002BS().queryHosWithPage(page,f10605002VO);
		return GridUtils.getGridData(result);
	}

	public List<F10605002VO> queryDocOfHos(F10605002VO f10605002VO) {
		if (f10605002VO==null) {
			throw new BusinessException("F10605020VS-04:传入参数对象为空");
		}
		if (f10605002VO.getAkc194s1()==null||f10605002VO.getAkc194e1()==null) {
			throw new BusinessException("F10605020VS-05:传入开始时间或结束时间为空");
		}
		if (f10605002VO.getAaa027()==null) {
			throw new BusinessException("F10605020VS-06:传入统筹区为空");
		}
		if (f10605002VO.getAkb021()==null) {
			throw new BusinessException("F10605020VS-07:传入药店名称为空");
		}
		String akc194s=f10605002VO.getAkc194s1().replaceAll("-", "");
		String akc194e=f10605002VO.getAkc194e1().replaceAll("-", "");
		f10605002VO.setAkc194s1(akc194s);
		f10605002VO.setAkc194e1(akc194e);
		List<F10605002VO> list=this.getF10605002BS().queryDocOfHos(f10605002VO);
		return list;
	}

	public Map<String, Object> queryDrugWithPage(Page page,
			F10605002VO f10605002VO) {
		if (f10605002VO==null) {
			throw new BusinessException("F10605020VS-08:传入参数对象为空");
		}
		if (f10605002VO.getAkc194s2()==null||f10605002VO.getAkc194e2()==null) {
			throw new BusinessException("F10605020VS-09:传入开始时间或结束时间为空");
		}
		if (f10605002VO.getAaa027()==null) {
			throw new BusinessException("F10605020VS-10:传入统筹区为空");
		}
		
		String akc194s=f10605002VO.getAkc194s2().replaceAll("-", "");
		String akc194e=f10605002VO.getAkc194e2().replaceAll("-", "");
		f10605002VO.setAkc194s2(akc194s);
		f10605002VO.setAkc194e2(akc194e);
		Page result=this.getF10605002BS().queryDrugWithPage(page,f10605002VO);
		return GridUtils.getGridData(result);
	}

	public List<F10605002VO> queryDocOfDrug(F10605002VO f10605002VO) {
		if (f10605002VO==null) {
			throw new BusinessException("F10605020VS-11:传入参数对象为空");
		}
		if (f10605002VO.getAkc194s2()==null||f10605002VO.getAkc194e2()==null) {
			throw new BusinessException("F10605020VS-12:传入开始时间或结束时间为空");
		}
		if (f10605002VO.getAaa027()==null) {
			throw new BusinessException("F10605020VS-13:传入统筹区为空");
		}
		if (f10605002VO.getAke002()==null) {
			throw new BusinessException("F10605020VS-14:传入药品名称为空");
		}
		String akc194s=f10605002VO.getAkc194s2().replaceAll("-", "");
		String akc194e=f10605002VO.getAkc194e2().replaceAll("-", "");
		f10605002VO.setAkc194s2(akc194s);
		f10605002VO.setAkc194e2(akc194e);
		List<F10605002VO> list=this.getF10605002BS().queryDocOfDrug(f10605002VO);
		return list;
	}
}
