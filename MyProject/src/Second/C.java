package Second;

import First.A;

public class C implements Addition, Subtract {
	private int d;
	private int k;

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A();
		obj.addition();
		C object= new C();
		
		object.setD(100);
		int t= object.getD();
		System.out.println("This is t=" + t);
		
		
		

	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void solution() {
		// TODO Auto-generated method stub
		
	}

}
