package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathtest {

	public static void main(String[] args) {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com/?_rdr");
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg _5dba _2ph-')])[3]")).sendKeys("kamal_adif@yahoo.com");

	}

}
