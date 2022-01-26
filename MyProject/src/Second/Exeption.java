package Second;

public class Exeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] numbers = new int[10];
System.out.println("this is before exeption");
try {System.out.println(numbers[26]);

}catch (Throwable e) {
	// TODO: handle exeption
	System.out.println("The number index is not correct");
}

System.out.println("This is after exeption");
//Thread.sleep(6000);

	}

}
