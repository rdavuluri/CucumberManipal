package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		//setting path for the chrome driver
		System.setProperty("webdriver.chrome.driver", "res/drivers/chromedriver.exe");
		
		//launching chrome driver
			driver = new ChromeDriver();
			
			//to maximize the window
			driver.manage().window().maximize();
			Thread.sleep(5000);
		
		//load the url
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		

		//this will navigate to particular page
		driver.navigate().to("https://www.google.com");		
		Thread.sleep(5000);
		
		//to refresh a page
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		// navigate back
		driver.navigate().back();
		Thread.sleep(5000);
		
		// navigate forward
		driver.navigate().forward();	
		Thread.sleep(5000);
		
		
		//this will gives the page source
		System.out.println(driver.getPageSource());
		Thread.sleep(5000);
		
		
		//it gives the title of the page
		System.out.println("title of the page: "+ driver.getTitle());
		Thread.sleep(5000);

		//it gives the current url of the page
		System.out.println("current url: "+ driver.getCurrentUrl());
		Thread.sleep(5000);
		
		//to switch to different windows
//		driver.switchTo();
		
		
		//to handle number of parant and child window
//		driver.getWindowHandle();	//this will return the window
//		
//		driver.getWindowHandles(); //this will return set of elements i.e., all windows
//		
//		
//		driver.findElement(By.xpath("")); // returns webelement expection if not element found
//		driver.findElements(By.xpath("")); // returns list of webelements [] 
		
	    	
		//closing the browser
//				driver.close(); //this close active window/broswer
				driver.quit(); // this will close all browser/windows
				
		
	}

}
