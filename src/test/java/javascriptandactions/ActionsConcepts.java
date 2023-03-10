package javascriptandactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcepts {
	
	/*
	 * alternative solution when selenium inbuilt methods are not support
	 * 
	 * 
	 */

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "res/drivers/chromedriver.exe");
		//open the browser
		driver = new ChromeDriver();
		
		driver.get("http://www.actimind.com");
		
		String xp = "//a[contains(text(),'AREAS OF EXPERTISE')]";
		
		WebElement menu = driver.findElement(By.xpath(xp));
		
		Actions actions = new Actions(driver);
		
		WebElement submenu = driver.findElement(By.linkText("Web Crawling"));
		
		actions.moveToElement(menu).click(submenu).build().perform();
		Thread.sleep(4000);
		
		
//		Thread.sleep(4000);
		
//		submenu.click();
		

	}

}
