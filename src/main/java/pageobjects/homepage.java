package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	public WebDriver driver;
		By tabs = By.xpath("//body[@id='homepage']/header/div[2]/div/nav/ul");
		By subscribe = By.xpath("//button[contains (text(),'Subscribe Now')]");
		By nothanks = By.xpath("//button[contains (text(),'NO THANKS')]");
		By practice = By.xpath("//a[contains(text(),'Practice')]");
		By login = By.xpath("//div[@class='tools']/div/nav/ul/li[4]/a");
		
	public homepage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement subscribe() {
		return driver.findElement(subscribe);
	}
	public WebElement nothanks() {
		return driver.findElement(nothanks);
	}
	public WebElement practice() {
		return driver.findElement(practice);
	}
	public WebElement login() {
		return driver.findElement(login);
	}
	public WebElement tabs() {
		return driver.findElement(tabs);
	}


}
