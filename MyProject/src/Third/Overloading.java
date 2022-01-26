package Third;

public class Overloading {
	
	public static void SkorHesapla (String isim, int puan) {
		
		System.out.println(isim + " adli oyuncunun " + puan+ " puani var ");
	
	}
	
	public static void SkorHesapla (int puan) {
		
		System.out.println(" Isimsiz oyuncunun " + puan+ " puani var ");
		
	}
	
	public static void SkorHesapla (String isim) {
		
		System.out.println(isim + " isimli oyuncunun puani yok ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SkorHesapla ("Murat", 1000);
		SkorHesapla (1000);
		SkorHesapla ("Murat");
	}

}
