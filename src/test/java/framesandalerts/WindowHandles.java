package framesandalerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "res/drivers/chromedriver.exe");
		//open the browser
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://www.plus2net.com/javascript_tutorial/window-parent.php");
		
		WebElement button = driver.findElement(By.xpath("//input[@value='Open Window']"));
		
		js.executeScript("arguments[0].click();", button);
		
			
		Thread.sleep(2000);
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Thread.sleep(4000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		int count = allWindowHandles.size();
		System.out.println("count "+count);
		
		Thread.sleep(4000);
		
		for (String winHandle : allWindowHandles) {
			driver.switchTo().window(winHandle);
			String title = driver.getTitle();
//			System.out.println("Window handle id of page -->"+ title +" --> is : "+winHandle);
			//close child window
			if (winHandle.equals(parentwindow)) {
//				System.out.println("Displayed "+driver.findElement(By.xpath("//input[@value='Close this window']")).isDisplayed());
				driver.close();
				System.out.println("Child Browser window with title -->"+ title +" --> is closed");
			}
		}
	driver.quit();	
				
		
	}

}
