package H2kinfosys.accessmodifiers;

public class Accessmodifiers {

	// try methodname.variablename

		private String name;
		private int age;

		private void method(String name) {

			this.name = name;
			System.out.println(name);
		}

		public static void main(String args[]) {

			Accessmodifiers mod = new Accessmodifiers();

			mod.method("Adif");

		}
	
	
	
}
