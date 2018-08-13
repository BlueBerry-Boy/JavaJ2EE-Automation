package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlelinks {

	public static void main(String[] args) {
		
		/* Write a Java program that returns all the links on the Google Page */
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		String s = driver.getTitle();
		System.out.println(s);
		
		List<WebElement> googlelinks = driver.findElements(By.tagName("a"));
		
		System.out.println("There are" +  googlelinks.size()  + "Links");
		
		for(int i=0; i<googlelinks.size(); i++)
			
		{
			System.out.println(googlelinks.get(i).getAttribute("href"));
		}
		
		
		
		

	}

}
