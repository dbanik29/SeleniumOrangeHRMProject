package com.bitm.OrangeHRMTest.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	static {

		System.setProperty("webdriver.chrome.driver",
				"F:\\SELENIUM\\Selenium WebDriver\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
	}

	public static WebDriver driver = new ChromeDriver();

	private DriverManager() {

	}

}
