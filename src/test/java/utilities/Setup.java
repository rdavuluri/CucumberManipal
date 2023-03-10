package utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Setup {
	
	public static WebDriver driver;
	public static final Logger logger = LoggerFactory.getLogger(Setup.class);
	
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "res/drivers/chromedriver.exe");
		driver = new ChromeDriver();//(options);
		return driver;
	}
	
	
	public String timeStamp() {
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return now.format(formatter);
	}
	
	
	

}
