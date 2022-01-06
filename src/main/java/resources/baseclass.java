package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public WebDriver driver;
	public Properties prop;
	public WebDriver launchbrowser() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\deves\\eclipse-workspace\\seleniumall\\src\\main\\java\\resources\\reference.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\deves\\Documents\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
		
	}

}
