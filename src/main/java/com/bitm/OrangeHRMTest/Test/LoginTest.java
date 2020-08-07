package com.bitm.OrangeHRMTest.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.OrangeHRMTest.DTO.LoginDTO;
import com.bitm.OrangeHRMTest.DataProvider.LoginDataProvider;
import com.bitm.OrangeHRMTest.Utils.DriverManager;
import com.bitm.OrangeHRMTest.Utils.UrlTextUtils;
import com.bitm.OrangeHRMTest.Utils.XpathUtils;

public class LoginTest {

	private WebDriver driver =null;

	@Test
	public void checkLoginPageTitle()
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
	}
	
	@Test(dependsOnMethods = "checkLoginPageTitle", dataProvider = "loginData", dataProviderClass = LoginDataProvider.class )
	public void logintest(List<LoginDTO> logdata){
	for(LoginDTO login : logdata)	{
		driver.findElement(By.xpath(XpathUtils.LoginModule.user_name)).sendKeys(login.getUsername());
		driver.findElement(By.xpath(XpathUtils.LoginModule.password)).sendKeys(login.getPassword());
		driver.findElement(By.xpath(XpathUtils.LoginModule.signIN_BTN)).click();		
	}
	}
}
