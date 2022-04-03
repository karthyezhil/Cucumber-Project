package org.helper;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.pojo.PolicyBazaarHomeInsurancePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static PolicyBazaarHomeInsurancePage p;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maxBrowser() {
		driver.manage().window().maximize();
	}
	
	public static String toGetPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String toGetCurrentUrl() {
		String pageUrl = driver.getCurrentUrl();
		return pageUrl;
	}
	
	public static void toImplicitlyWait(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	public static void toGetText(String message, WebElement e) {
		String text = e.getText();
		System.out.println("" + message + "" + text);

	}

	public static String toGetTextWithReturn(WebElement e) {
		String text = e.getText();
		return text;

	}

	public static void toMoveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void jsClick(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", e);
	}

	public static void jsGetAttribute(String message, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object f = js.executeScript("returnarguments[0].getAttribute('value')", e);
		String v=(String)f;
		//String v = String.valueOf(executeAsyncScript);
		System.out.println("" + message + "" + v);

	}

	public static void jsSetAttribute(WebElement e,String val ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '" +val+ "' )", e);
	}

	public static void jsScrollDown(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}

	public static void toHandleWindows() {
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		for (String eachWindowId : allWindowId) {
			if (!eachWindowId.equals(parentWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
		}
	}

	public static void policyContent(String name) {
		p = new PolicyBazaarHomeInsurancePage();
		System.out.println("\nAvaliable content Under " + name + " :  \n" + toGetTextWithReturn(p.getPrivacypolicy())
				+ "\n" + toGetTextWithReturn(p.getTermsOfUse()) + "\n"
				+ toGetTextWithReturn(p.getIntellectualPropertyPolicy()) + "\n" + toGetTextWithReturn(p.getDisclaimer())
				+ "\n" + toGetTextWithReturn(p.getIsnp()));

	}

	public static void toGetDateAndTime() {
		Date d = new Date();
		System.out.println(d);
	}

	public static void toCloseTab() {
		driver.quit();
	}

	public static void toCloseBrowser() {
		driver.close();
	}

}
