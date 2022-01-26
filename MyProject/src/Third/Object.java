package Third;

public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Araba araba1 = new Araba();  
		araba1.renk= "Mavi";   //objeye direk renk degiskeni ozelligi atayabiliyorum cunku renk degiskien ozelligi public
		System.out.println("Arabanin rengi " +  araba1.renk);
		
				
		araba1.setModel("Renault");    //objeye direk model degiskeni ozelligi atayamiyorum set kullanarak yapiyorum cunku model degiskien ozelligi private
		System.out.println("Arabanin modeli  " + araba1.getModel());
		
	
		araba1.setKapilar(5);
		System.out.println( "Arabanin kapi sayisi " + araba1.getKapilar());
		
		Araba araba2 = null; //new Araba();
		araba2.setKapilar(4);
		System.out.println( "Arabanin kapi sayisi " + araba2.getKapilar());
		

	}

}
