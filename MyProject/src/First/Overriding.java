

package First;

public class Overriding {


	// A Simple Java program to demonstrate
	// Overriding and Access-Modifiers

	class First {
		// private methods are not overridden
		private void m1()
		{
			System.out.println("From parent m1()");
		}

		protected void m2()
		{
			System.out.println("From parent m2()");
		}
	}

	class Second extends First {
		// new m1() method
		// unique to Child class
		private void m1()
		{
			System.out.println("From child m1()");
		}

		// overriding method
		// with more accessibility
		@Override
		public void m2()
		{
			System.out.println("From child m2()");
		}
	}

	// Driver class
	class Main {
		public static void main(String[] args)
		{
			Inherited i  = new Inherited();
			i.fly();

		}
	}
	
	public class Parent {
		void m2() {
			
		}
	}

	
	
	
	
}
