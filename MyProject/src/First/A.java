
package First;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new A();
		obj.addition();
		obj.substraction();
		obj.multiply();
			
	}
public void addition() {
	System.out.println("This is public");
	substraction();
}
	
private void substraction() {
System.out.println("This is private method");
}

protected void multiply() {
	
}
}
