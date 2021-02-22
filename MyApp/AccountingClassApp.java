class Accounting{
	public double valueofsupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : "+valueofsupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());		
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend 1 : "+ getDividend1());
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}

	public double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return valueofsupply - getExpense();
	}

	private double getExpense() {
		return valueofsupply * expenseRate;
	}

	private double getTotal() {
		return valueofsupply + getVAT();
	}

	private double getVAT() {
		return valueofsupply * vatRate;
	}
}

public class AccountingClassApp {
	
	public static void main(String[] args) {
		
//		Accounting1.valueofsupply = 10000.0;
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;
//		Accounting1.print();
//		
//		Accounting2.valueofsupply = 20000.0;
//		Accounting2.vatRate = 0.05;
//		Accounting2.expenseRate = 0.2;
//		Accounting2.print();
		
		Accounting a1 = new Accounting(); // new를 붙여 Accounting이라는 클래스를 복사한 것이 인스턴스이다
		a1.valueofsupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		System.out.println("\n");
		
		Accounting a2 = new Accounting();
		a2.valueofsupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();

	}
}
