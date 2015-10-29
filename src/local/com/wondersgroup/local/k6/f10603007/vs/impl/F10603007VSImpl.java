package com.wondersgroup.local.k6.f10603007.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10603007.vo.F10603007VO;
import com.wondersgroup.local.k6.f10603007.vs.F10603007VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;

public class F10603007VSImpl implements F10603007VS {
	private StatisticBS statisticBS;

	public StatisticBS getStatisticBS() {
		return statisticBS;
	}

	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}

	public Map<String, Object> queryYLJGFXTYFZQSWithPage(Page page,
			F10603007VO returnVO) {

		Page result = this.getStatisticBS().queryYLJGFXTYFZQSWithPage(page,
				returnVO);

		Map<String, Object> map = GridUtils.getGridData(result);

		return map;
	}

	public F10603007VO buildDate(F10603007VO f10603007vo) {
		return this.getStatisticBS().buildYLJGFXTYFZQSData(f10603007vo);
	}

	public F10603007VO queryMoveAverage(F10603007VO f10603007vo) {
		return this.getStatisticBS().queryYLJGFXTYFZQSMoveAverage(f10603007vo);
	}

}
