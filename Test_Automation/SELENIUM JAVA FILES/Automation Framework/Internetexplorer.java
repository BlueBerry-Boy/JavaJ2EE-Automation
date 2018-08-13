package automationFramework;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internetexplorer {

	public static void main(String[] args) {


		File f = new File("IEDriverServer.exe");
	     //Setting the System Property
	     System.setProperty("webdriver.ie.driver",f.getAbsolutePath());  
	     
		  WebDriver driver = new InternetExplorerDriver();  
		  driver.get("https://www.facebook.com/?_rdr");
		  
		  driver.findElement(By.id("u_0_b")).sendKeys("Anonymous");
		  driver.close();
	}

}
