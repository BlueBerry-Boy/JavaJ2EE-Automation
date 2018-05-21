package automation_frameworkNG;

public class ForeachLoop {

	public static void main(String[] args) {
		
		/*
		 * Enhanced For Loop Syntax
		 * for(type iterationVariable : collection) statement block
		 */

		int nums [] = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
//	
//		for(int i=0; i<10; i++)  sum += nums[i];
//	
//		System.out.println(sum);
	
		for(int s : nums)   
		{
			System.out.println(s);
			sum += s;
		}
		
		System.out.println("The Total is " + sum);
	}

}
