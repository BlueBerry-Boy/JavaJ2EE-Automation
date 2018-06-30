package automation_frameworkNG;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Firefxdriver {
	
		@Test
		public static void OpenUrl() throws Exception {
			File f = new File("geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", f.getAbsolutePath());
			
			
			WebDriver driver;
			driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			String url= "www.instagram.com";
			driver.get(url);
			
			System.out.println(driver.getCurrentUrl());
			
			
		}
	}
