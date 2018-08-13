package automationFramework;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandles {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/?_rdr");
		driver.findElement(By.linkText("Cookie Use")).click();
		
		String Parent = driver.getWindowHandle();
		System.out.println("1.The parent page is" + Parent);  // Print the name of the parent window
		
		Set <String> windw = driver.getWindowHandles();  //Stores names of parent and child page
		
				for(String child : windw)
				{
					if(!(Parent.equals(child)))
					driver.switchTo().window(child);

					//Print the name of the child window
					String W = driver.getTitle();
					System.out.println("2.This page is" + W);
				}
				
					String actual = driver.findElement(By.xpath("//h2[text()='Cookies, Pixels & Similar Technologies']")).getText();
				    String expected = "Cookies, Pixels & Similar Technologies";
				
				    		if(actual.equals(expected))
				    		{
				    			System.out.println("3.You are on the child page");
				    		}	
				    		else
				    		{
				    			System.out.println("You are not on the child page, the test case has Failed");
				    		}
				    		
					driver.close();
				

				driver.switchTo().window(Parent);
				
			String Homepage =	driver.getTitle();
			System.out.println( "4.You are back on this page" + Homepage);
				
				driver.close();
	}

}
