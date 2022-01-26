package First;

public class Condition {

	public static void main(String[] args) {
		/*TODO Auto-generated method stub
		int d =6;
			if (d==6) {
			System.out.println("Condition is true");
        }if(d==6) {System.out.println("condition is true ."); } else {System.out.println("condition is false"); }} */
	
	
	int computer= 90;
	int linux= 80;
	int software= 60;
	int total= computer+linux+software;
	float avg = total/3;
	System.out.println(avg);
	if(avg>=90 && avg<=100) {
		System.out.println("The grade for Student A"); } 
	
	else if(avg>=80 && avg<=89) {
		System.out.println("The grade for Student B");}
	
	else if(avg>=70 && avg<=79){
		System.out.println("The grade for Student C"); }
	
	else if(avg>=60 && avg<=69){
		System.out.println("The grade for Student D"); }
	
	else {
		System.out.println("Coffee with Teacher"); }
	
        	}
	}
	
	
	
	
			
	

