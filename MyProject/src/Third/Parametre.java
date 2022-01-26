package Third;

public class Parametre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hello("Murat");
		HowAreYou("Selin");
		add(1, 2, 3);
	}
	
	public static void hello (String isim){
		
		System.out.println("Hello " + isim);
	}

	public static void HowAreYou (String isim) {
		
		System.out.println("How are you  " + isim);
	}
		
	public static void add (int a, int b, int c) {
		
		System.out.println("Addition results "+ (a+b+c));
	}
		
	}


	
	


