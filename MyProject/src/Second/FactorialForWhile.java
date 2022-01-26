package Second;

import java.util.Scanner;

public class FactorialForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int factorial = 1;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int i = 1;
		for (; i<=sayi; i++) {
		//factorial  *= i;	
		factorial = factorial * i;
		}
		System.out.println("Factorial operation equals to =" + factorial);*/
		
		
		int factorial = 1;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		while (sayi>0) {
		factorial *= sayi;
		sayi--;
		}
		System.out.println("Factorial operation equals to =" + factorial);
		
	}

}
