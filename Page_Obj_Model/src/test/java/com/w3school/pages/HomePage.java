package com.w3school.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3school.utils.*;
public class HomePage extends SeWrappers{

	@FindBy(xpath="//div[contains(text(),'My learning')]")
	public WebElement myLearning;
	
	public void waitformyLearning() {
		
		waitforelementExplicitwait(myLearning,10);
	
	}
}
