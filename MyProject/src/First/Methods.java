
package First;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//ProfitOfMonth(100000,60000, "January");
//ProfitOfMonth(20000,60000, "February");
//ProfitOfMonth(300000,26000, "March");
		
int ProfitBeforeTax=ProfitOfMonthTax(100000, 6000, "January");
System.out.println("This is profit before tax = "+ProfitBeforeTax);
	}
	
/*Access-modifier static void NameOfMethod(){}
	public static void Addition() {
		int Income = 100000;
		int Expense = 60000;
		int Profit=Income-Expense;
		System.out.println(Profit);
	   }*/
	

/*public static void ProfitOfMonth(int Income, int Expense, String Name) {
	int Profit = Income=Expense;
	System.out.println("Profit of "+Name+ "="+Profit);
       }*/

public static int ProfitOfMonthTax(int Income, int Expense, String Name) {
	int Profit = Income=Expense;
	System.out.println("Profit of "+Name+ "="+Profit);
	return Profit;

}
	}
	
	

