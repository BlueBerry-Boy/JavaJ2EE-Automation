package practice;

public class ExceptionHandling {

	//throws Exception
	
	
	 public void calcSpeed (String name, int distance, float time)  {
		 
		 name = null;
		 
		 float Speed = distance / time;
		 
		 System.out.println( "The Speed is " + Speed );
		 
		 
		 System.out.println("The End");
		 
	 }
	
	
	 
	 public static void main (String [] args) {
		 
		 ExceptionHandling velocity = new ExceptionHandling();
		 
		 velocity.calcSpeed("Merc", 89, 0);
		 
	 }
	 
}
