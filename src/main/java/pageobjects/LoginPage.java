package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
		By logintext = By.xpath("//h1[contains (text(),'Log In to WebServices Testing using SoapUI')]");
		By email = By.xpath("//input[@id='user_email']");
		By password = By.xpath("//input[@id='user_password']");
		By loginbutton = By.xpath("//input[@name='commit']");
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public WebElement logintext() {
			return driver.findElement(logintext);
		}
		
		public WebElement email() {
			return driver.findElement(email);
		}
		public WebElement password() {
			return driver.findElement(password);
		}
		public WebElement loginbutton() {
			return driver.findElement(loginbutton);
		}

}
