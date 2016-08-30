package com.lnt.framework.suite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestSuite {
	@Test
	public void firstTest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
}
