package framesandalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "res/drivers/chromedriver.exe");	
				driver = new ChromeDriver();
				driver.get("file:///C:/Users/7J5711897/Desktop/Software%20Testing/Selenium/confirmationpopup.html");
				driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
				Thread.sleep(4000);
				
				Alert alert = driver.switchTo().alert();
				
				alert.accept();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
				Thread.sleep(4000);
				alert.dismiss();	
				Thread.sleep(4000);
				driver.close();

	}

}
