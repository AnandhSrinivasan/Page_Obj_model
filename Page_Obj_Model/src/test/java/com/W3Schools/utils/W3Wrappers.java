package com.W3Schools.utils;

import org.openqa.selenium.support.PageFactory;
import com.W3Schools.pages.LoginPage;

//This Class Having Method for all the Re-usable methods in W3Schools Applications
//This is methods are specific for W3Schools only 
public class W3Wrappers extends SeWrappers{

	public void loginW3Schools(){
		
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.setUserName("devanandh2902@gmail.com");
		loginpage.setPassword("Batman12@#");
		loginpage.clickLoginButton();
		
		
	}
	
	
	
}
