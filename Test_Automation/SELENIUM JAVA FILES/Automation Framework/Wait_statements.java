package automationFramework;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Wait_statements {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
	
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.h2kinfosys.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		TakesScreenshot tsh = (TakesScreenshot) driver;
		FileUtils.copyFile(tsh.getScreenshotAs(OutputType.FILE), new File("C:\\h2kinfosyshomepage.jpg"));

		
		

	}

}
