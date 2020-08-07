package com.bitm.OrangeHRMTest.Test;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.bitm.OrangeHRMTest.DataProvider.AssignLeaveDataProvider;
import com.bitm.OrangeHRMTest.Utils.DriverManager;
import com.bitm.OrangeHRMTest.Utils.UrlTextUtils;
import com.bitm.OrangeHRMTest.Utils.XpathUtils;
import com.bitm.OrangeHRMTest.DTO.AssignLeaveDTO;

public class AssignLeaveTest {
	private WebDriver driver =null;
	
	@Test
	public void checkAssignLeavePageTitle()
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.AssignLeave_URL);
	}
	
	@Test(dependsOnMethods = "checkAssignLeavePageTitle", dataProvider = "AssignLeaveData", dataProviderClass = AssignLeaveDataProvider.class)
	public void AssignLeaveTest(List<AssignLeaveDTO> assignleavedata){
		//driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.EmployeeName)).sendKeys("Tanni");
	for(AssignLeaveDTO AssignLeave : assignleavedata )
	{
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.EmployeeName)).sendKeys(AssignLeave.getEmployeeName());
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.Leave_Type)).sendKeys(AssignLeave.getLeaveType());
		
		// From Date using Date Time Picker 
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.From_Date)).click();
		
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.FromDate_Month)).sendKeys(AssignLeave.getMonthFrom());
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.FromDate_Year)).sendKeys(AssignLeave.getYearFrom());
		// Select Date
		WebElement dateWidget = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));				
		for (WebElement cell : columns) {
			if(cell.getText().equals(AssignLeave.getDayFrom()))
			{
				cell.findElement(By.linkText(AssignLeave.getDayFrom())).click();
				break;
			}
		}
		
		//To Date using Date Time Picker 
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.To_Date)).click();
		
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.ToDate_Month)).sendKeys(AssignLeave.getMonthTo());
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.ToDate_Year)).sendKeys(AssignLeave.getYearTo());
 
		WebElement dateWidgetTo = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> columns1 = dateWidgetTo.findElements(By.tagName("td"));				
		for (WebElement cell1 : columns1) {
		if (cell1.getText().equals(AssignLeave.getDayTo())) {
		cell1.findElement(By.linkText(AssignLeave.getDayTo())).click();
		break;
		}	
		}
		
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.Comment)).sendKeys(AssignLeave.getComment());
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.Assign_BTN)).click();

		
		/*driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.EmployeeName)).sendKeys(AssignLeave.getEmployeeName());
		//Leave Type Select
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.Leave_Type)).click();
		Select LeaveType = new Select(driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.Leave_Type)));
		LeaveType.selectByVisibleText("Vacation US");	
		
		// From Date using Date Time Picker 
				driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.From_Date)).click();
				// Select Month
				driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.FromDate_Month)).click();
				Select From_Month = new Select(driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.FromDate_Month)));
				From_Month.selectByVisibleText("Jan");
				// Select Year
				driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.FromDate_Year)).click();
				Select From_year = new Select(driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.FromDate_Year)));
				From_year.selectByVisibleText("2020");
				// Select Date
				WebElement dateWidget = driver.findElement(By.className("ui-datepicker-calendar"));
				List<WebElement> columns = dateWidget.findElements(By.tagName("td"));				
				for (WebElement cell : columns) {
				// Select 10th Date
				if (cell.getText().equals("10")) {
				cell.findElement(By.linkText("10")).click();
				break;
				}
				}

		//To Date using Date Time Picker 
				driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.To_Date)).click();
				// Select Month
				driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.ToDate_Month)).click();
				Select To_Month = new Select(driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.ToDate_Month)));
				To_Month.selectByVisibleText("Jan");
				// Select Year
				driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.ToDate_Year)).click();
				Select yearTo = new Select(driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.ToDate_Year)));
				yearTo.selectByVisibleText("2020");		
				// Select Date 
				WebElement dateWidgetTo = driver.findElement(By.className("ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"));
				List<WebElement> columns1 = dateWidgetTo.findElements(By.tagName("td"));				
				for (WebElement cell1 : columns1) {
				// Select 14th Date
				if (cell1.getText().equals("14")) {
				cell1.findElement(By.linkText("14")).click();
				break;
				}	
				}
			
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.Comment)).sendKeys(AssignLeave.getComment());
		driver.findElement(By.xpath(XpathUtils.AssignLeaveModule.Assign_BTN)).click();*/
	}	
	}
}
