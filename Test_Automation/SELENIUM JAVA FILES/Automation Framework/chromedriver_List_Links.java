package automationFramework;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver_List_Links {

	/* Write a program to return all the links on google page 
	 * 
	 */
	
	public static void main(String[] args) {
		
		File f = new File("chromedriver.exe");
	     //Setting the System Property
	     System.setProperty("webdriver.chrome.driver",f.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/webhp?ei=n6-IVYy4GoLdsAWB_6N4&ved=0CAUQqS4oAw");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i= 0; i<links.size(); i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
			
		}
		
	}

}
