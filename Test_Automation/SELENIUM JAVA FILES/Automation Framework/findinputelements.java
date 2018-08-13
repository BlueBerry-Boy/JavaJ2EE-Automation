package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findinputelements {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/BlueBerryBwoy/Desktop/Selenium/H2Kinfosys/Videos/HTML/LoginPage.html");
		
		List<WebElement> inputs = driver.findElements(By.tagName("input"));
		
		System.out.println(inputs.size());
		
		inputs.get(0).sendKeys("selenium");
		inputs.get(1).sendKeys("selenium");
		inputs.get(2).click();
		
		for(int i=0;i<inputs.size(); i++)
		
		{
			System.out.println(inputs.get(i).getAttribute("id"));
		}
		
		
	

	}

}
