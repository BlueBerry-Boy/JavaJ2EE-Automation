package automation_frameworkNG;

public class Exceptionhandling {

	public static void main(String[] args) {

		int i[] = { 1, 2, 3, 4, 5 };

		try {
				System.out.println(i[5]);
		
		}catch (ArrayIndexOutOfBoundsException aioobe)
		
		{		
			aioobe.printStackTrace();
			System.out.println("Here is your number");
		}
	
	 }
	
 }
	

