package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Setup;
import utilities.TakeScreenPrint;

public class BMIPage extends Setup{
	
	TakeScreenPrint ss = new TakeScreenPrint();
	
	
	public WebElement getTextBoxAge() {
		return driver.findElement(By.cssSelector("#cage"));
	}
	
	public WebElement getTextBoxHeight() {
		return driver.findElement(By.cssSelector("#cheightfeet"));
	}
	
	public WebElement getTextBoxWeight() {
		return driver.findElement(By.cssSelector("#cpound"));
	}
	
	public WebElement getButtonCalculator() {
		return driver.findElement(By.xpath("//input[@value='Calculate']"));
	}
		
	
	public WebElement getTextResult() {
		return driver.findElement(By.xpath("//h2[@class='h2result']//following-sibling::div/b"));
	}
		
		
	public String getBMIPageTitle() {
		return driver.getTitle();
	}
	
	public void setAge(String age) {
		getTextBoxAge().clear();
		getTextBoxAge().sendKeys(age);
	}
	
	public void setHeight(String height) {
		getTextBoxHeight().clear();
		getTextBoxHeight().sendKeys(height);
	}
	
	public void setWeight(String weight) {
		getTextBoxWeight().clear();
		getTextBoxWeight().sendKeys(weight);
        logger.info("Weight value is set successfully");
	}
	
	public void clickOnCalculator() throws Exception {
		getButtonCalculator().click();
		Thread.sleep(2000);
		ss.getScreenShot();
	}
	
	public void showBMIIndex() {
		System.out.println(getTextResult().getText());
	}

}
