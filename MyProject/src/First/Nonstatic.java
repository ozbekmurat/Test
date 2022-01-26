

package First;

class Student{
	//PROPERTY (OZELLIKLER, ORN GOZ RENGI, SAC RENGI, AD GIBI)
	public String name;
	public String surname;
	public String ID;
	
	// CONSTRUCTOR METOD
	public Student() {
		
	}
	public Student(String name, String surname, String ID) {
		this.name = name;
		this.surname = surname;
		this.ID = ID;
	}
	
	//METOD
	public void tamAdYazdir() {
		System.out.println(this.name + " " + this.surname + " " + this.ID);
	}
	
	public static void changeID(String ID) {
        ID = ID;
	}
	
	public static void notHesapla(int yazili, int sozlu) {
		System.out.println((yazili + sozlu)/2);
	}
	
	public void notHesapla(int yazili, int sozlu, int finall) {
		System.out.println((yazili + sozlu + finall)/3);
	}

}

public class Nonstatic {
	public String generatedDate = "2021-11-22";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//How to create object of the class -- ClassName  NameOfObject = new ConstructorOfTheClass
		
		Nonstatic obj=new Nonstatic("PeopleNTech");
		obj.Addition();
		
		
		
		obj.ProfitOfMonth(100000, 200000, "January");
		
		Student person = new Student();
		
		System.out.println(Math.pow(2, 3));
		
		person.name = "Firat"; person.surname = "Keler"; person.ID = "1020203008";
		
		//firat.changeID("2040406016");
		 
		person.tamAdYazdir();
		
		Student selin = new Student("Selin", "Ozbek", "123");
		
		selin.notHesapla(10, 50, 100);
		
		Student.notHesapla(50, 80);
		
	    Student.changeID(null);
		
		Student murat = new Student("Murat", "Ozbek", "123456");
		murat.tamAdYazdir();
	}
	
	
    public void Addition() {
		int Income = 100000;
		int Expense = 60000;
		int Profit=Income-Expense;
		System.out.println(Profit);
	   }
	

    public void ProfitOfMonth(int Income, int Expense, String Name) {
	int Profit = Income-Expense;
	int Profit1 = 3;
	System.out.println("Profit of "+Name+ "="+Profit);
       }

    public int ProfitOfMonthTax(int Income, int Expense, String Name) {
	int Profit = Income-Expense;
	System.out.println("Profit of "+Name+ "="+Profit);
	return Profit;
	
    }	
    
    public Nonstatic() {
    	
    }
    
    public Nonstatic(String message) {
    System.out.println(message);
    }
}

