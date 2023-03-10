package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.Setup;

public class Hooks {
	
	
	static WebDriver driver;
	Setup setup;
	
	@Before
	public void doSetUp() throws Exception {
		Setup setup = new Setup();
		setSetUp(setup);
		driver = setup.launchBrowser();
		driver.manage().window().maximize();
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	public void setSetUp(Setup setup) {
		this.setup = setup;
	}
	

}
