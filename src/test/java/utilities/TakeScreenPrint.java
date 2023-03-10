package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenPrint extends Setup {
	
	public void getScreenShot() throws IOException {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("res\\Screenshots\\screenshot"+timeStamp()+".png"));
	}

}
