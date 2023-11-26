package com.W3Schools.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.W3Schools.utils.Reports;
import com.W3Schools.utils.SeWrappers;
import com.W3Schools.utils.W3Wrappers;

//This Class having Test Cases for W3Schools Login Realted functionality
public class LoginTest extends SeWrappers{
	W3Wrappers w3 = new W3Wrappers();
	Reports reports = new Reports();

	@Test
	public void loginWithValidData() {
		try {
			reports.setTCDesc("Validating login in W3Schools with valid credentials");
			launcBrowser("https://profile.w3schools.com/");
			w3.loginW3Schools("devanandh2902@gmail.com","Batman12@#");

			//Validation for checking the Title of the Page	
			Assert.assertTrue(driver.getTitle().equals("My learning | W3Schools"));
			Reports.reportStep("INFO", "Assertion passed by title");
		} 
		catch (Exception e) {
			System.out.println("Problem arise Login with Valid Credentials");
			e.printStackTrace();
		}
	}
}
