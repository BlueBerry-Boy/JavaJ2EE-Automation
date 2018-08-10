package practice;

public class ReverseWordsInaString {
	
//	public static void main (String [] args) {
//
//	String Reverse = "I am a coder";
//
//	String arr[] = Reverse.split(" ");
//
//	for(int x = arr.length-1; x>=0; x--)
//	{
//
//		System.out.print(arr[x] + " ");
//	}
//
// }


	
	private String Reverse;

	public void ReverseWordsInaString(String Reverse) {

		this.Reverse = Reverse;

		String arr[] = Reverse.split(" ");

		for(int x = arr.length-1; x>=0; x--)
		{

			System.out.print(arr[x] + " ");
		}
		
	}
	
}
	

