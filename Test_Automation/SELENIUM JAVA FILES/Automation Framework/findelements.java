package automationFramework;
import java.util.List;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class findelements {

	public static void main(String[] args) {
		
		/* 
		 *Write a program to return all links on the facebook page
		 */
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/?_rdr");
		
		String S = driver.getTitle();
		System.out.println(S);

		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		
		System.out.println(totallinks.size());
		
		//System.out.println(totallinks.get(1));
		
		for(int i=0; i<totallinks.size();i++)

		{
			System.out.println(totallinks.get(i).getAttribute("id"));
		}
		
	}

}
