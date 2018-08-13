package automationFramework;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoolgEx {
	public static void main(String[] args) {
		
		 
		//1. Open FF.
		FirefoxDriver driver = new FirefoxDriver();
		
		//2. Enter the url http://www.google.com
		driver.get("http://www.google.com");
		
		String expected = "Google";
		
		String actual = driver.getTitle();
		
		if(expected.equals(actual))
		{
			System.out.println("TC_001 is passed");
		}
		else
		{
			System.out.println("TC_001 is failed");
		}
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl is " + currentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println("ps" + pageSource);
		
		//close the browser
		driver.close();
		
		
	}
}
