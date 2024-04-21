package org.sk.seleniumjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsTest {
	@Test
	public void testName() {
		String name="Jenkins";
		Assert.assertEquals("Jenkins", name);
	}
	
	@Test
	public void testSeleniumInJenkinsAgent() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars");
//		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options); 
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		System.out.println("Logged in with User_ID: "+System.getProperty("uid", "none")+" and Password: " + System.getProperty("pwd", "none"));
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Google", pageTitle);
		driver.quit();
	}
}