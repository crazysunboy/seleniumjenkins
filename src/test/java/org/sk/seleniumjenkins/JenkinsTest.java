package org.sk.seleniumjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Google", pageTitle);
		driver.quit();
	}
}