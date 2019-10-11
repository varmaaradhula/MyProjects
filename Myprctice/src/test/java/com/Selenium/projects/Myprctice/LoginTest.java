package com.Selenium.projects.Myprctice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	public String username;
	public String password;
	
	@Test
	public void logintest() throws InterruptedException {
		System.setProperty("ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY", "true");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("disable-infobars");
		options.addArguments("--start-maximized");
		options.addArguments("user-data-dir=C:\\Users\\RKVarma\\AppData\\Local\\Google\\Chrome\\User Data\\");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("rkvarmaa");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='identifierNext']/span")).click();
		driver.findElement(By.name("password")).sendKeys("varmaswinton123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='passwordNext']/span")).click();
		Thread.sleep(8000);
		String title = driver.getTitle();
		System.out.println("Inbox page title is "+title);
		if(!title.contains("rkvarmaa@gmail.com")) {
		Assert.fail("Login not successfull");
		
		wishingall();
		
			
		}
	}
		@Test
		public void wishingall() {
			
			System.out.println("hello All");
		}
		
		@Test
		
		public void preesha() {
			
			System.out.println("Hello preesha bangaru");
		}
		
	}
	


