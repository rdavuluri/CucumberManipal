package pageObjects;


import org.openqa.selenium.By;
import com.rd.actions.Click;

import utilities.Setup;

import org.openqa.selenium.WebElement;


public class CalculatorPage extends Setup{

	
  /**Get Link for BMI
  **/
  public WebElement getLinkBMI(){
	  return driver.findElement(By.xpath("//a[contains(text(),'BMI Calculator')]"));
  }
  /**
   * Opening url
   */
  public void openUrl() {
	  driver.get("https://www.calculator.net/");
  }
  
  public String getCalculatorPageTitle() {
	  return driver.getTitle();
  }
  
  public void clickOnBMILink() throws Exception {
	 
//	  getLinkBMI().click();	  
	  Click.clickElement(getLinkBMI(),true);
//	  Click.clickElementByJS(getLinkBMI());
	  Thread.sleep(2000);
  }
  
  
	
	
}
