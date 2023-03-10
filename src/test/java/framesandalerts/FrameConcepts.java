package framesandalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcepts {
   /*
    * 
    * Webpage present inside another webpage is called embedded webpage.
    * 
    * 
    */
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "res/drivers/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/7J5711897/Desktop/Software%20Testing/Selenium/page2.html");
		//using index of the frame - [ int value] [ index of frames starts with zero]
				
//		driver.switchTo().frame(0);
//		
//		driver.findElement(By.id("t1")).sendKeys("a");
//		Thread.sleep(4000);
//		driver.switchTo().defaultContent();		
//		driver.findElement(By.id("t2")).sendKeys("b");
//		Thread.sleep(4000);
		
		
		//using id att 
		driver.switchTo().frame("f1"); //by id
//		driver.switchTo().frame("n1"); //by name
		
//		WebElement f = driver.findElement(By.className("c1")); // by webelement
//		driver.switchTo().frame(f);
		
		Thread.sleep(4000);
		driver.findElement(By.id("t1")).sendKeys("b");
		
	    driver.switchTo().defaultContent();
	    		driver.findElement(By.id("t2")).sendKeys("b");
	    		Thread.sleep(4000);
		driver.close();
		
		
		
		

	}

}
