package automationFramework;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;



public class linktextlocator {
	// For login page html, finding the hyperlink on the page 

	public static void main(String [] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
				
				driver.get("file:///C:/Users/BlueBerryBwoy/Desktop/Selenium/H2Kinfosys/HTML/LoginPage.html");
				driver.findElement(By.linkText("Sign In")).click();
				
				driver.close();
	
	}

}
