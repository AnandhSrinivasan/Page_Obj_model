package com.W3Schools.tests;

import org.testng.annotations.Test;

import com.W3Schools.utils.SeWrappers;
import com.W3Schools.utils.W3Wrappers;

//This Class having Test Cases for W3Schools Login Realted functionality
public class LoginTest extends SeWrappers{
W3Wrappers w3 = new W3Wrappers();

	@Test
	public void loginWithValidData() {
		try {
			launcBrowser("https://profile.w3schools.com/");
			w3.loginW3Schools();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
