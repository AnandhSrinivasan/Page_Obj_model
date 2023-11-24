package com.W3Schools.utils;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//Se means Selenium
// Wrappers means Customized method for all Selenium_methods

public class SeWrappers {

	public static WebDriver driver = null;

	// 1.Launching Browser 
	public void launcBrowser(String URL){
		try {
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println("Browser Launched successfully");
		} 
		catch (Exception e) {
			System.out.println("Probelm arise due to launching the browser");
			e.printStackTrace();
		}
	}

	//2.Close the Browser
	public void closecurrentBrowser() {
		try {
			driver.close();
			System.out.println("Current Browser Closed Successfully");
		} 
		catch (Exception e) {
			System.out.println("Problem arise while closing the current browser");
			e.printStackTrace();
		}
	}

	//3.Close the All the Webpage
	public void quitAllBrowser() {
		try {
			driver.quit();
			System.out.println("All Webpage Closed Successfully");
		} 
		catch (Exception e) {
			System.out.println("Problem arise while quit all the Webpage");
			e.printStackTrace();
		}
	}

	//4.Method to type text in webpage
	public void typeText(WebElement element, String text) {
		try {
			element.sendKeys(text);
			element.clear();
		} 
		catch (Exception e) {
			System.out.println("Probelm arise due to typing the text");
			e.printStackTrace();
		}
	}

	//5.Method to click on the webelement in the webpage 
	public void clickElement(WebElement element) {
		try {
			element.click();
		} 
		catch (Exception e) {
			System.out.println("Probelm arise because of unable to click the webelement");
			e.printStackTrace();
		}
	}

	//6.Methods to Select DropDowns by index 
	public void selectByindex(WebElement element, int index) {
		try {
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		catch (Exception e) {
			System.out.println("Probelm arise because of unable to select the index");
			e.printStackTrace();
		}
	}

	//7.Methods to Select DropDowns by value 
	public void selectByValue(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.selectByValue(value);
		}
		catch (Exception e) {
			System.out.println("Probelm arise because of unable to select the value");
			e.printStackTrace();
		}
	}

	//8.Methods to Select DropDowns by value 
	public void selectByVisibletext(WebElement element, String Visibletext) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(Visibletext);
		} 
		catch (Exception e) {
			System.out.println("Probelm arise because of unable to select the visisbletext");
			e.printStackTrace();
		}
	}

	//9.Method for ExplicitWait	
	public void waitforelementExplicitwait(WebElement element, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.visibilityOf(element)); 
		} 
		catch (Exception e) {
			System.out.println("(Expleicitwait)Probelm arise because of unable to wait for visibilty of element");
			e.printStackTrace();
		}
	}
	//10.Method for FluentWait  	
	public void waitforelementFluentwait(WebElement element, int pollingfrequency, int timeout ) {
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.pollingEvery(Duration.ofSeconds(pollingfrequency))
					.withTimeout(Duration.ofSeconds(timeout));

		} 
		catch (Exception e) {
			System.out.println("(Fluentwait)Probelm arise because of unable to wait for element");
			e.printStackTrace();
		}
	}

	//11. Method for Action Doubleclick
	public void actionsDoubleclickElement(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			actions.doubleClick(element).build().perform();
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to Doubleclick");
			e.printStackTrace();
		}
	}
	//12. Method for Action RightClick
	public void actionsRightclickElement(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			actions.contextClick(element).build().perform();
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to Rightclick");
			e.printStackTrace();
		}
	}	

	//13. Method for Action Move to Element
	public void actionsMovetoElement(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(element).build().perform();
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to MovetoElement");
			e.printStackTrace();
		}
	}

	//14.Method for Action Drag and Drop
	public void actionsDragandDropElement(WebElement source, WebElement target) {
		try {
			Actions actions = new Actions(driver);
			actions.dragAndDrop(source,target).build().perform();
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to DragandDrop");
			e.printStackTrace();
		}
	}

	//15.Method for Action Click
	public void actionsClickElement(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			actions.click(element).build().perform();
			actions.clickAndHold(element).build().perform();
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to Click");
			e.printStackTrace();
		}
	}

	//16.Method for Action Clickandhold
	public void actionsClickandholdElement(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			actions.clickAndHold(element).build().perform();
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to ClickandHold");
			e.printStackTrace();
		}
	}	

	//17.Method for FramebyIndex
	public void frameByindex(int index) {
		try {
			driver.switchTo().frame(index);
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to switch to frame index");
			e.printStackTrace();
		}
	}

	//18.Method for Frame by NameorID
	public void frameByNameorID(int nameid) {
		try {
			driver.switchTo().frame(nameid);
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to switch to frame Name or ID");
			e.printStackTrace();
		}
	}

	//19.Method for Frame by WebElement
	public void frameByWebElement(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to switch to frame WebElement");
			e.printStackTrace();
		}
	}

	//20.Method for Window Handle
	public void windowhandle() {
		try {
			String parentwindow = driver.getWindowHandle();
			Set<String> allwindow = driver.getWindowHandles();
			for (String eachwindows : allwindow) {
				driver.switchTo().window(eachwindows);
			}
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to switch to window");
			e.printStackTrace();
		}
	}

	//21.Method for SwitchParentWindow
	public void parentwindow(String parentWindow) {
		try {
			driver.switchTo().window(parentWindow);
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to switch to Parentwindow");
			e.printStackTrace();
		}
	}

	//21.Method for SwitchDefaultWindow
	public void DefaultcontentWindow(String DefaultWindow) {
		try {
			driver.switchTo().defaultContent();
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to switch to DefaultWindow");
			e.printStackTrace();
		}
	}

	//22. Method for JavaScriptExecutor	Scrolldown
	public void javascriptexecScrollDown(int scrollDownValue) {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,"+ scrollDownValue +");");
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to (JavaScriptexec) scrolldown");
			e.printStackTrace();
		}
	}

	//22. Method for JavaScriptExecutor	scroll up
	public void javascriptexecScrollUp(int scrollUpValue) {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+ scrollUpValue +", 0);"); 
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to (JavaScriptexec) Scrollup");
			e.printStackTrace();
		}
	}

	//23.Method for JavaScriptExecutor Endcontent
	public void javascriptexecEndContent() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to (JavaScriptexec) EndContent");
			e.printStackTrace();
		}
	}

	//24.Method for JavaScriptExecutor Startingcontent
	public void javascriptexecStartingContent() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to (JavaScriptexec) Startingcontent");
			e.printStackTrace();
		}
	}

	//25.Method for JavaScriptExecutor ScrollRight
	public void javascriptexecScrollRight() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(document.body.scrollWidth, 0);");
			System.out.println(js.executeScript("return document.title;"));
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to (JavaScriptexec) ScrollRight");
			e.printStackTrace();
		}
	}	

	//26.Method for JavaScriptExecutor click particularWebElement
	public void javascriptexecScrollWebElement(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",element);
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to (JavaScriptexec) click Particular WebElement");
			e.printStackTrace();
		}
	}

	//27.Method for JavaScriptExecutor TypeText
	public void javascriptexecTypeText(WebElement element, String text) {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].value='"+ text +"';",element);
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to (JavaScriptexec) typetext");
			e.printStackTrace();
		}
	}


	//28.Method for JavaScriptExecutor DocumentTitle
	public void javascriptexecDocumentTitle() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			System.out.println(js.executeScript("return document.title;"));
		} 
		catch (Exception e) {
			System.out.println("(JavaScriptexec) Problem arise because of unable to Get the Document title");
			e.printStackTrace();
		}
	}	

	//29.Method for Accept alert
	public void Acceptalert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to accept the alert");
			e.printStackTrace();
		}
	}

	//30.Method for Dismiss alert
	public void Dismissalert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to Dismiss the alert");
			e.printStackTrace();
		}
	}

	//31.Method for TypeTextinalert
	public void TypeTextinalert(String text) {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
		} 
		catch (Exception e) {
			System.out.println("Problem arise because of unable to TypeText in alert");
			e.printStackTrace();
		}
	}

	//32.Method for verifySelect
	public boolean verifySelect(WebElement element) {

		boolean returnvalue = false;
		try {
			if (element.isSelected()) {
				returnvalue = true;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return returnvalue;
	}

	//33.Method for verifyDisplayed
	public boolean verifyDisplayed(WebElement element) {

		boolean returnvalue = false;
		try {
			if (element.isDisplayed()) {
				returnvalue = true;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return returnvalue;
	}

	//34.Method for verifyEnabled
	public boolean verifyEnabled(WebElement element) {

		boolean returnvalue = false;
		try {
			if (element.isEnabled()) {
				returnvalue = true;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return returnvalue;
	}

}
