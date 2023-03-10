package javascriptandactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcepts {

	/*
	 * alternative solution when selenium inbuilt methods are not support
	 * 
	 * 
	 * 
	 */
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "res/drivers/chromedriver.exe");	
		driver = new ChromeDriver();	
		driver.get("file:///C:/Users/7J5711897/Desktop/Software%20Testing/Selenium/disabledTextBox.html");
		//Typecast the driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		//enter "admin" in first textbox using javascript
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		//clear the value in second textbox using javascript
		js.executeScript("document.getElementById('t2').value=''");
		//enter "manager" in second textbox using javascript
		js.executeScript("document.getElementById('t2').value='manager'");
		//change the second text box to button type using Javascript
		js.executeScript("document.getElementById('t2').type='button'");
		Thread.sleep(4000);
		
//		for (int i = 1; i < 4; i++) {
//			//scroll up on the webpage
//			js.executeScript("window.scrollBy(0, -1000)");
//			Thread.sleep(3000);
//			}
//		
//		for (int i = 1; i < 4; i++) {
//			//scroll down on the webpage
//			js.executeScript("window.scrollBy(0, 1000)");
//			Thread.sleep(3000);
//			}
//		
//		for (int i = 1; i < 4; i++) {
//			//scroll up on the webpage
//			js.executeScript("window.scrollBy(0, -1000)");
//			Thread.sleep(3000);
//			}
		
		WebElement ele = driver.findElement(By.id("t3"));
		// get the X-coordinate and store in a variabl+e
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		System.out.println(x+","+y);
		js.executeScript("window.scrollBy("+x+", "+y+")");
		Thread.sleep(3000);
		
		

	}

}
