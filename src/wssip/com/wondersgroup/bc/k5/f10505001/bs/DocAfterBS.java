package com.wondersgroup.bc.k5.f10505001.bs;

import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;

public interface DocAfterBS {
	/**
	 * 查询代医师申述的单据列表 baz031='04' and baz101='2'
	 * **/
	Page queryKc63WithPage(Page page, Kc63DTO dto);

	/**
	 * 查询代医师申述的单据对应的 待申述明细 baz031='04' and baz101='2'
	 * **/
	Page queryKc62sWithPage(Page page, Kc62DTO queryDto);

	/**
	 * 保存附件信息ke02
	 * */
	Ke02DTO saveKe02(Ke02DTO ke02DTO);

	/**
	 * 保存日志信息kc81
	 * */
	public Kc81DTO saveKc81(Kc81DTO kc81DTO);

	/**
	 * 通过kc62主键查询 对应kc63 的主键
	 * */
	public String getKc63Id(String Kc62id);

	/**
	 * 更新kc63
	 * */
	public Kc63DTO updateKc63(String Kc63id);
	/**
	 * 更新kc62
	 * */
	public Kc62DTO updateKc62(String Kc62id);
	/**
	 * 根据一组kc62主键获得kc62对象
	 * */
	public List<Kc62DTO> getKc62s(String kc62ids);
	/**
	 * 查询代医师申述的单据列表 baz031='04' and baz101='2'  不返回Page 返回list
	 * */
	public List<Kc63DTO> queryKc63ByHosptl( Kc63DTO kc63Dto);
}
