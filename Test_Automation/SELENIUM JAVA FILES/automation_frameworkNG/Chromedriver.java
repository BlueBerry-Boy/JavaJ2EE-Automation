package automation_frameworkNG;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



		public class Chromedriver {

	
			public static void main(String[] args) {
				
				File f = new File("chromedriver.exe");
			    System.setProperty("webdriver.chrome.driver",f.getAbsolutePath());  
			     
				 WebDriver driver = new ChromeDriver();
				
				 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				 
				 String url= "https://www.google.com/?gws_rd=ssl";
				 driver.get(url);
				
		
			}
		
		}
