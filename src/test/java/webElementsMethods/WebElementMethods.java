package webElementsMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementMethods {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "res/drivers/chromedriver.exe");		
		//launching chrome driver
		driver = new ChromeDriver();		
		//load the url
		driver.get("https://gcreddy.com/project/create_account.php");
		
		driver.manage().window().maximize();
		
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //se-v3.0
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//css value
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'My Account Information')]")).getCssValue("color"));
		
		//radio button and xpath		
		driver.findElement(By.xpath("//input[@value='m']")).click();
		Thread.sleep(5000);
		
		//input and name
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Rahul");
		Thread.sleep(5000);
		
		//link and link text
//		driver.findElement(By.linkText("login page")).click();
//		Thread.sleep(5000);
//		
//		driver.navigate().back();
//		
//		
//		Thread.sleep(5000);
		
//		Explicit wait
//		WebDriverWait wait = new WebDriverWait(driver,30);  //se-v3.0
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='country']")));
		
		//fluent wait
//	    Wait<WebDriver> fluentWait = (Wait<WebDriver>) new FluentWait<WebDriver>(driver)
//	            .withTimeout(Duration.ofSeconds(30))
//	            .pollingEvery(Duration.ofSeconds(3))
//	            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='country']")));
//				
	    
	    //Select
		Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		System.out.println(country.getFirstSelectedOption().getText());
		country.selectByVisibleText("India");
	    
	    System.out.println(country.isMultiple());
	    
	    
	    driver.findElement(By.cssSelector("[name=newsletter]")).click();
	    System.out.println(driver.findElement(By.cssSelector("[name=newsletter]")).getAttribute("type")); //to get attribute
	    
	    
	    
	    System.out.println(driver.findElement(By.cssSelector("button#tdb4")).isEnabled());
	    
	    assertTrue(driver.findElement(By.cssSelector("[name=newsletter]")).isSelected());
	    
	    if(driver.findElement(By.cssSelector("button#tdb4")).isDisplayed()) {
	    	driver.findElement(By.cssSelector("button#tdb4")).click();
	    }
	    
	    
	    
//	    Thread.sleep(10000);
	    driver.quit();
	    
		
		
		

	}

}
