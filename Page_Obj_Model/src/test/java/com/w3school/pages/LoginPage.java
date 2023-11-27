package com.w3school.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3school.utils.*;
//This Class having Login related WebElement
public class LoginPage extends SeWrappers{

	@FindBy(id="modalusername")
	public WebElement username;
	
	@FindBy(id="current-password")
	public WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	public WebElement loginbutton;
	
	public void setUserName(String name) {
		waitforelementExplicitwait(username, 10);
		typeText(username, name);
	}
	public void setPassword(String pwd) {
		waitforelementExplicitwait(password, 10);
		typeText(password, pwd);
	}
	public void clickLoginButton() {
		waitforelementExplicitwait(loginbutton, 10);
		clickElement(loginbutton);
	}
}
