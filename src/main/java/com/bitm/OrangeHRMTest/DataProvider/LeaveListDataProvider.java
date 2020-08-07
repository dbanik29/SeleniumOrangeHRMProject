package com.bitm.OrangeHRMTest.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.OrangeHRMTest.Utils.ExcelUtils;

public class LeaveListDataProvider {
	@DataProvider(name="LeaveListData")
	public static Object[][] getLeaveListData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getLeaveListData()
					},
				};
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}	        
    }
}
