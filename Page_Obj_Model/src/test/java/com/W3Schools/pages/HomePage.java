package com.W3Schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.W3Schools.utils.SeWrappers;

public class HomePage extends SeWrappers{

	@FindBy(xpath="//div[contains(text(),'My learning')]")
	public WebElement myLearning;
	
	public void waitformyLearning() {
		
		waitforelementExplicitwait(myLearning,10);
	
	}
}
