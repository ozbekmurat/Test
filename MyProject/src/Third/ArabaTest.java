package Third;

public class ArabaTest {

    public static void main(String[] args) {
        
        Araba araba1 = new Araba();
        
        
        araba1.setModel("Renault");
        
        System.out.println("Arabanın modeli " + araba1.getModel());
        
        
        araba1.setKapilar(-3);
        
        
        Araba araba2 = new Araba();
        
        araba2.setKapilar(10);
        
        System.out.println("Arabanin kapi sayisi :" + araba2.getKapilar());  // asagidaki mile ayni
        
        araba2.kapiSaysi(); //yukardaki ile ayni
        
        
        //Araba araba3 = null;
        
       // araba3.setModel("Renault");
        
}
}