package com.bitm.OrangeHRMTest.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.OrangeHRMTest.Utils.ExcelUtils;

public class LoginDataProvider {
	@DataProvider(name="loginData")
	public static Object [][] getLoginData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getLoginData()
					},
				};
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}	        
    }
}
