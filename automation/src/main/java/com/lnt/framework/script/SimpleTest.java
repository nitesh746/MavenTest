package com.lnt.framework.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lnt.framework.application.pages.GoogleSearchPage;

public class SimpleTest {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		GoogleSearchPage obj = new GoogleSearchPage(driver);
		obj.searchText("Hello");
//		driver.quit();
	}
}