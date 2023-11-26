package com.W3Schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.W3Schools.utils.SeWrappers;

//This Class having Login related WebElement
public class ProfilePage extends SeWrappers{
	@FindBy(id="top-nav-bar-iframe")
    public WebElement frameid;
	
	@FindBy(xpath = "//a[@id='profile-link']")
	public WebElement profileMenu;
	
	@FindBy(xpath = "//input[@placeholder='Add your first name']")
	public WebElement firstname;
	
	@FindBy(xpath = "//input[@placeholder='Add your last name']")
	public WebElement lastname;
	
	@FindBy(xpath = "//button[@class='Button_button__F-5UA Button_primary__nC-4W Profile_btn_width__rkjGA']")
	public WebElement saveButton;
	
	public void profileFrame(){
		waitforelementExplicitwait(frameid,20);
		frameByWebElement(frameid);
	}
	public void enterClickProfile() {
		waitforelementExplicitwait(profileMenu, 10);
		clickElement(profileMenu);
	}
	
	public void enterFirstname(String firstName) {
		waitforelementExplicitwait(firstname, 10);
		typeText(firstname, firstName);
	}
	public void enterLastname(String lastName) {
		waitforelementExplicitwait(lastname, 10);
		typeText(lastname, lastName);
	}
	public void enterClicksave() {
		waitforelementExplicitwait(saveButton, 10);
		clickElement(saveButton);
	}

}
