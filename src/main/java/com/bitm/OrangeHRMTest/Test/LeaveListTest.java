package com.bitm.OrangeHRMTest.Test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.bitm.OrangeHRMTest.DTO.LeaveListDTO;
import com.bitm.OrangeHRMTest.DataProvider.LeaveListDataProvider;
import com.bitm.OrangeHRMTest.Utils.DriverManager;
import com.bitm.OrangeHRMTest.Utils.UrlTextUtils;
import com.bitm.OrangeHRMTest.Utils.XpathUtils;

public class LeaveListTest {
private WebDriver driver =null;
	
	/*@Test
	public void checkLeaveListPageTitle()
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.LeaveList_URL);
	}*/
	
	//@Test(dependsOnMethods = "checkLeaveListPageTitle()", dataProvider = "LeaveListData", dataProviderClass = LeaveListDataProvider.class)
	@Test(dataProvider = "LeaveListData", dataProviderClass = LeaveListDataProvider.class)
	public void LeaveListTest(List<LeaveListDTO> leavelistdata){
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.LeaveList_URL);
	for(LeaveListDTO LeaveList : leavelistdata )
	{
		// From Date using Date Time Picker 
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.FromDate)).click();
		
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.FromMonth)).sendKeys(LeaveList.getFromMonth());
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.FromYear)).sendKeys(LeaveList.getFromYear());
 
		WebElement dateWidgetFrom = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));				
		for (WebElement cell1 : columns) {
		if (cell1.getText().equals(LeaveList.getFromDay())) {
		cell1.findElement(By.linkText(LeaveList.getFromDay())).click();
		break;
		}	
		}
		
		//To Date using Date Time Picker 
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.To_Date)).click();	
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.ToMonth)).sendKeys(LeaveList.getToMonth());
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.ToYear)).sendKeys(LeaveList.getToYear()); 
		WebElement dateWidgetTo = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> columns1 = dateWidgetTo.findElements(By.tagName("td"));				
		for (WebElement cell1 : columns1) {
		if (cell1.getText().equals(LeaveList.getToDay())) {
		cell1.findElement(By.linkText(LeaveList.getToDay())).click();
		break;
		}	
		}
	
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.LeaveStatus)).click();
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.employee)).sendKeys(LeaveList.getEmployee());
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.SubUnit)).sendKeys(LeaveList.getSubUnit());
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.PastEmployees)).click();
		driver.findElement(By.xpath(XpathUtils.LeaveListModule.Search_BTN)).click();

	}
	}
}
