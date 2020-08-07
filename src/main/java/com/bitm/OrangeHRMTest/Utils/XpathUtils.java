package com.bitm.OrangeHRMTest.Utils;

public class XpathUtils {

	public static class LoginModule{
		
		public static final String user_name= "//*[@id=\"txtUsername\"]";
		public static final String password= "//*[@id=\"txtPassword\"]";
		public static final String signIN_BTN="//*[@id=\"btnLogin\"]";
	}
	
	/*public static class DashBoardModule{
		
		public static final String assignLeaveimg="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img";
	}*/
	
public static class AssignLeaveModule{
		
		public static final String EmployeeName = "//*[@id=\"assignleave_txtEmployee_empName\"]";
		public static final String Leave_Type = "//*[@id=\"assignleave_txtLeaveType\"]";
		public static final String From_Date ="//*[@id=\"assignleave_txtFromDate\"]";
		public static final String FromDate_Month ="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]";
		public static final String FromDate_Year ="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";
		public static final String To_Date = "//*[@id=\"assignleave_txtToDate\"]";
		public static final String ToDate_Month ="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]";
		public static final String ToDate_Year ="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";
		public static final String Comment ="//*[@id=\"assignleave_txtComment\"]";
		public static final String Assign_BTN ="//*[@id=\"assignBtn\"]";
	}

public static class LeaveListModule{
	public static final String FromDate ="//*[@id=\"calFromDate\"]";
	public static final String FromMonth ="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]";
	public static final String FromYear ="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";
	public static final String To_Date = "//*[@id=\"calToDate\"]";
	public static final String ToMonth ="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]";
	public static final String ToYear ="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";	
	public static final String LeaveStatus = "//*[@id=\"leaveList_chkSearchFilter_checkboxgroup_allcheck\"]";
	public static final String employee = "//*[@id=\"leaveList_txtEmployee_empName\"]";
	public static final String SubUnit = "//*[@id=\"leaveList_cmbSubunit\"]";
	public static final String PastEmployees ="//*[@id=\"leaveList_cmbWithTerminated\"]";
	public static final String Search_BTN ="//*[@id=\"btnSearch\"]";
}
}
