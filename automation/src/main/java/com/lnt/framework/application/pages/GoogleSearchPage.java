package com.lnt.framework.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	
	@FindBys(@FindBy(xpath="//input[@name='q']"))
	private WebElement searchBox;
	
	@FindBys(@FindBy(xpath="//input[@name='Google Search']"))
	private WebElement searchBtn;
	
	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchText(String strSearchText) {
		searchBox.sendKeys(strSearchText);
		searchBtn.click();
	}
	
}