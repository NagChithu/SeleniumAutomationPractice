package com.samplecart.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTests {
	
  WebDriver driver;
	
  @BeforeMethod
  public void TestSetup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void BasicLaunch() {	  
	  driver.get("http://automationpractice.com/index.php");
  }
  
  @AfterMethod
  public void TestTeardown() {
	 driver.quit(); 
  }
 }