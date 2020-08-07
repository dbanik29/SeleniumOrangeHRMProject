package com.bitm.OrangeHRMTest.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DateTimePickerTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SELENIUM\\Selenium WebDriver\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
		
		// Date Time Picker
		
		//From
		driver.findElement(By.xpath("//*[@id=\"calFromDate\"]")).click();
		// Select Month
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		Select Month = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		Month.selectByVisibleText("Jan");
		// Select Year
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
		year.selectByVisibleText("2030");

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
		
		//To
		driver.findElement(By.xpath("//*[@id=\"calToDate\"]")).click();
		// Select Month
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		Select MonthTo = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		MonthTo.selectByVisibleText("Jan");
		// Select Year
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();
		Select yearTo = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
		yearTo.selectByVisibleText("2030");
		
		// Select Date 
		WebElement dateWidgetTo = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> columns1 = dateWidgetTo.findElements(By.tagName("td"));
				
		for (WebElement cell1 : columns1) {
		// Select 15th Date
		if (cell1.getText().equals("15")) {
		cell1.findElement(By.linkText("15")).click();
		break;
		}
	
}
}
}