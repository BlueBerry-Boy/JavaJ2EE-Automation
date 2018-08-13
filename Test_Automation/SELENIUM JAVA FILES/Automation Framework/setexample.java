package automationFramework;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class setexample  {

	public static void main(String[] args)  {
	
		String s1 = new String("Selenium");
		String s2 = new String("Selenium");
		String s3 = new String("Webdriver");
		String s4 = new String("ChromeDriver"); 
	
		
		Set set = new HashSet();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println(set.size());
		
		for(Object o : set)//for each loop
		{
			System.out.println(o);
		}
			
		
		
		
	}

}
