package Third;

public class Araba {
	
	private String model; //Encapsulation
	public String renk;//Encapsulation
	private int motor;//Encapsulation
	private int kapilar;//Encapsulation
	
	
	
	public void setKapilar(int kapilar) {
		
		if (kapilar<0) { 
			System.out.println("Sifirdan kucuk deger kullanmayiniz"); //(Encapsule edilmis ozelliklere ulasmak icin bir metod altinda kosullar yaziyoruz. Bu ornekte ozellige deger atarken belli bir kosulu saglamasi gerektigini yazdiriyoruz)
		}
			
		else {
			   this.kapilar = kapilar; // "this" eger en tepedeki enkapsule edilmis ozelliklere ait degiskenlerle asagida kosul metodunda bulunan parametreler ayni olursa degiskeni parametreden ayirtedebilmek icin kullaniliyor. This sinifi temsil ediyor.
		}
	}

	public int getKapilar() {
		return kapilar;
		}

	
	public void setModel(String model) {
		this.model=model;
	}
	
		
	public String getModel () {
		return this.model;
		
		
		}
	
	public void kapiSaysi() {
		System.out.println("Arabanin kapi sayisi :"+ kapilar);
		
	}
		
	}
	


