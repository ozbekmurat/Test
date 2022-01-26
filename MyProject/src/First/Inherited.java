
package First;

public class Inherited extends Inheritance implements Flying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inherited i = new Inherited();
		System.out.println(i.a);
		System.out.println(i.b);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flied!");
	}

	
}
