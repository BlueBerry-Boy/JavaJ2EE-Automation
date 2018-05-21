package automation_frameworkNG;





		public class Reverse_string {
		
			public static void main(String[] args) {
				
				
				String s = "Bank";
				String t = "";
							
				for(int i=s.length()-1; i>=0; i--)
				{
					t= t + s.charAt(i);
				}
				
				System.out.println(t);
			}
			
		
		}
