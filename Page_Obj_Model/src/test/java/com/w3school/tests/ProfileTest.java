package com.w3school.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w3school.utils.*;

//This Class having Test Cases for W3Schools Profile  Related functionality
public class ProfileTest extends SeWrappers{
	W3Wrappers w3 = new W3Wrappers();
	Reports reports = new Reports();
	@Test
	public void enterProfileDetails() {
		try {

			reports.setTCDesc("Validating login in W3Schools with valid credentials");
			w3.profileW3Schools("Murugan", "Srini");

		} 
		catch (Exception e) {
			System.out.println("Proble arise because of unable to change the profile details");
		    e.printStackTrace();
		}
	}
}
