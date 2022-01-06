package testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.homepage;
import resources.baseclass;

public class numberone extends baseclass {
	public WebDriver driver;
	
	@BeforeTest
	public void prereq() throws IOException {
	driver = launchbrowser();
    driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void hp() throws InterruptedException {
		homepage lpg = new homepage(driver);
		Thread.sleep(10000);
		lpg.nothanks().click();
	}
	
	@Test
	@AfterTest
	public void quitbrowser() {
		
		driver.close();
		driver.quit();
	}
	

}
