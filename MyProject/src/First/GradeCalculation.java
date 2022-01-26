package First;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Math = 60;
		int Science =80;
		int Geography = 90;
		int History =80;
		int Total = Math+Science+Geography+History;
		double Avg = Total/4;
		System.out.println("Students got " + Avg + " points");
		
		if (Avg>= 90 && Avg<=100) {
			System.out.println("The Grade of the Student is" + " = " + "A" );
		}
		else if (Avg>= 80 && Avg<=89) {
			System.out.println("The Grade of the Student is" + " = " + "B" );
		}
		else if (Avg>= 70 && Avg<=79) {
			System.out.println("The Grade of the Student is" + " = " + "C" );
		}
		else if (Avg>= 60 && Avg<=69) {
			System.out.println("The Grade of the Student is" + " = " + "D" );
		}
	
	}
	
}

