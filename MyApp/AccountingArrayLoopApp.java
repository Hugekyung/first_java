
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueofsupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofsupply * vatRate;
		double total = valueofsupply + vat;
		double expense = valueofsupply * expenseRate;
		double income = valueofsupply - expense;
		
		
		System.out.println("Value of supply : "+valueofsupply);
		System.out.println("VAT : "+ vat );
		System.out.println("Total : "+ total );
		System.out.println("Expense : "+ expense );		
		System.out.println("Income : "+ income );
		
		
		
		double[] dividendRates = new double[3]; // double타입의 배열 3개를 담을 수 있는 Array 생성
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend: " + (income * dividendRates[i]));
			i = i + 1;
		}

	}

}
