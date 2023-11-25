package com.W3Schools.utils;

import org.openqa.selenium.support.PageFactory;

import com.W3Schools.pages.HomePage;
import com.W3Schools.pages.LoginPage;

//This Class Having Method for all the Re-usable methods in W3Schools Applications
//This is methods are specific for W3Schools only 
public class W3Wrappers extends SeWrappers{

	public void loginW3Schools(String username, String password){
		
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		
		//Login Methods
		loginpage.setUserName(username);
		loginpage.setPassword(password);
		loginpage.clickLoginButton();
		
		//Check Login success by verifying page title
		homepage.waitformyLearning();
		
		
	}
	
	
	
}
