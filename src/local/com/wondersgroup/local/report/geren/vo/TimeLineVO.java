package com.wondersgroup.local.report.geren.vo;

public class TimeLineVO {

	private String start;//开始时间
	
	private String end;//结束时间
	
	private String durationEvent;//是否时间段
	
	private String title;//标题
	
	private String icon;//图片路径
	
	private String color;//颜色
	
	private String description;//说明

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getDurationEvent() {
		return durationEvent;
	}

	public void setDurationEvent(String durationEvent) {
		this.durationEvent = durationEvent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
