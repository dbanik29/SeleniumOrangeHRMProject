package com.bitm.OrangeHRMTest.DTO;

public class AssignLeaveDTO {
	private String employeeName ;
	private String leaveType;
	private String yearFrom ;
	private String monthFrom;
	private String dayFrom;
	private String yearTo;
	private String monthTo;
	private String dayTo;
	private String comment ;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getYearFrom() {
		return yearFrom;
	}
	public void setYearFrom(String yearFrom) {
		this.yearFrom = yearFrom;
	}
	public String getMonthFrom() {
		return monthFrom;
	}
	public void setMonthFrom(String monthFrom) {
		this.monthFrom = monthFrom;
	}
	public String getDayFrom() {
		return dayFrom;
	}
	public void setDayFrom(String dayFrom) {
		this.dayFrom = dayFrom;
	}
	public String getYearTo() {
		return yearTo;
	}
	public void setYearTo(String yearTo) {
		this.yearTo = yearTo;
	}
	public String getMonthTo() {
		return monthTo;
	}
	public void setMonthTo(String monthTo) {
		this.monthTo = monthTo;
	}
	public String getDayTo() {
		return dayTo;
	}
	public void setDayTo(String dayTo) {
		this.dayTo = dayTo;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "AssignLeaveDTO [employeeName=" + employeeName + ",leaveType=" + leaveType + ", yearFrom=" + yearFrom + ",monthFrom= " + monthFrom+ ", dayFrom = " + dayFrom +","
				+ "yearTo= "+ yearTo +",monthTo= "+ monthTo +",dayTo= "+ dayTo +", comment=" + comment + "]";
	}
}
