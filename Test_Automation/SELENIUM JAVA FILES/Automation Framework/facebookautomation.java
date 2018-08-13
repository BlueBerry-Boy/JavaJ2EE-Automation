package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class facebookautomation {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		/*
		driver.get("https://www.facebook.com/?_rdr");
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("seleniumuser");
		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("selenium");
		*/
		
		driver.get("file:///C:/Users/BlueBerryBwoy/Desktop/Selenium/H2Kinfosys/HTML/MultipleCheckbox.html");
		driver.findElement(By.xpath("html/body/input[1]")).click();
		driver.findElement(By.xpath("html/body/input[3]")).click();
		driver.close();
		
		/*
		driver.findElement(By.id("u_0_5")).sendKeys("anonymousprof@outlook.com");
		driver.findElement(By.id("u_0_8")).sendKeys("anonymousprof@outlook.com");
		driver.findElement(By.id("u_0_a")).sendKeys("killuminati2015");
		driver.close();
		
		
		
		/*
		driver.get("https://www.facebook.com/?_rdr");
		driver.findElement(By.linkText("Create a Page")).click();
		
		
		/*
		String expected = "https://www.facebook.com/pages/create/?ref_type=registration_form";
		String actual = driver.getCurrentUrl();
		
		if(expected.equals(actual))
		{
		System.out.println("Test case has Passed");
		}
		else
		{
		System.out.println("The Test case has failed");	
		}
		*/
	
	}

}
