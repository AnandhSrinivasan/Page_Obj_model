package com.W3Schools.utils;
/*
 * This Class is Extent Report library
 * This is common for all projects like SeWrappers
 */
/*
 * Three Extents Reports are available
 * ExtentSparkReporter ===> It is used to generate the Output in HTML file
 * ExtentReports ===> It is used to generate the Test in the HTML file
 * ExtentTest ==> It is used to generate the logs for the Test cases
 */

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentSparkReporter sparkReporter;
	
	public static ExtentReports extentReports;
	
	public static ExtentTest extentTest;
	
	@BeforeSuite(alwaysRun = true)
	public void startReport() {
		try {
			sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/WebAutomationReport.html");
			sparkReporter.config().setReportName("W3 School Report");
			sparkReporter.config().setDocumentTitle("Web Automation Report");
			
			extentReports = new ExtentReports();
			extentReports.attachReporter(sparkReporter);
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of Report not generated");
			e.printStackTrace();
		}
	}
	
	public void setTCDesc(String testcaseName) {
		try {
			extentTest= extentReports.createTest(testcaseName);
		} 
		catch (Exception e) {
			System.out.println("Problem arise beacuse of Testcasename not defined");
		e.printStackTrace();
		}
	}
	
	public static void reportStep(String status, String Desc) {
		if (status.toUpperCase().equals("PASS")) {
			extentTest.log(Status.PASS, Desc);
		}
		else if (status.toUpperCase().equals("FAILS")) {
			extentTest.log(Status.FAIL, Desc);
		}
		else if (status.toUpperCase().equals("INFO")) {
			extentTest.log(Status.INFO, Desc);
		}
	}
	@AfterSuite(alwaysRun = true)
	public void endReport() {
		try {
			extentReports.flush();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
