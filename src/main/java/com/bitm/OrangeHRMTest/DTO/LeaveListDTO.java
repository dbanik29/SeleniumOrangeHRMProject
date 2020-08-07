package com.bitm.OrangeHRMTest.DTO;

public class LeaveListDTO {
	
	private String fromYear ;
	private String fromMonth;
	private String fromDay;
	private String toYear;
	private String toMonth;
	private String toDay;
	private String employee;
	private String subUnit;
	
	public String getFromYear() {
		return fromYear;
	}
	public void setFromYear(String fromYear) {
		this.fromYear = fromYear;
	}
	public String getFromMonth() {
		return fromMonth;
	}
	public void setFromMonth(String fromMonth) {
		this.fromMonth = fromMonth;
	}
	public String getFromDay() {
		return fromDay;
	}
	public void setFromDay(String fromDay) {
		this.fromDay = fromDay;
	}
	public String getToYear() {
		return toYear;
	}
	public void setToYear(String toYear) {
		this.toYear = toYear;
	}
	public String getToMonth() {
		return toMonth;
	}
	public void setToMonth(String toMonth) {
		this.toMonth = toMonth;
	}
	public String getToDay() {
		return toDay;
	}
	public void setToDay(String toDay) {
		this.toDay = toDay;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getSubUnit() {
		return subUnit;
	}
	public void setSubUnit(String subUnit) {
		this.subUnit = subUnit;
	}
	@Override
	public String toString() {
		return "LeaveListDTO [fromYear=" + fromYear + ", fromMonth=" + fromMonth + ", fromDay=" + fromDay + ", toYear="
				+ toYear + ", toMonth=" + toMonth + ", toDay=" + toDay + ", employee=" + employee + ", subUnit="
				+ subUnit + "]";
	}
	
}
