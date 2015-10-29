package com.wondersgroup.local.k4.f10402007.vo;

import java.util.ArrayList;
import java.util.List;

public class DxzbUploadResultVO {

	private String bsz005_suc;

	private String bsz005_fail;

	private Integer succCount;
	
	private Integer failCount;
	
	private List<DxzbDetailVO> successList = new ArrayList<DxzbDetailVO>();

	private List<DxzbDetailVO> failerList = new ArrayList<DxzbDetailVO>();

	public String getBsz005_suc() {
		return bsz005_suc;
	}

	public void setBsz005_suc(String bsz005Suc) {
		bsz005_suc = bsz005Suc;
	}

	public String getBsz005_fail() {
		return bsz005_fail;
	}

	public void setBsz005_fail(String bsz005Fail) {
		bsz005_fail = bsz005Fail;
	}

	public List<DxzbDetailVO> getSuccessList() {
		return successList;
	}

	public void setSuccessList(List<DxzbDetailVO> successList) {
		this.successList = successList;
		setSuccCount(successList.size());
	}

	public List<DxzbDetailVO> getFailerList() {
		return failerList;
	}

	public void setFailerList(List<DxzbDetailVO> failerList) {
		this.failerList = failerList;
		setFailCount(failerList.size());
	}

	public Integer getSuccCount() {
		return succCount;
	}

	private void setSuccCount(Integer succCount) {
		this.succCount = succCount;
	}

	public Integer getFailCount() {
		return failCount;
	}

	private void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}
}
