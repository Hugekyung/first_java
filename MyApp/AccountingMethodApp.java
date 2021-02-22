
public class AccountingMethodApp {
	public static double valueofsupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		
		valueofsupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
		print();
		

	}

	public static void print() {
		System.out.println("Value of supply : "+valueofsupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());		
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend 1 : "+ getDividend1());
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}

	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return valueofsupply - getExpense();
	}

	private static double getExpense() {
		return valueofsupply * expenseRate;
	}

	private static double getTotal() {
		return valueofsupply + getVAT();
	}

	private static double getVAT() {
		return valueofsupply * vatRate;
	}

}
