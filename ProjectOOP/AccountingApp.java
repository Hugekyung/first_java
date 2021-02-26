class Accounting {
	public double valueofsupply;
	public static double vatrate = 0.1;
	public Accounting(double valueofsupply) {
		this.valueofsupply = valueofsupply;
	}
	public double getVAT() {
		return valueofsupply * vatrate;
	}
	public double getTotal() {
		return valueofsupply + getVAT();
	}
}
public class AccountingApp {
	public static void main(String[] args) {
		Accounting a1 = new Accounting(10000.0);
		
		Accounting a2 = new Accounting(20000.0);
		
		System.out.println("value of supply: " + a1.valueofsupply);
		System.out.println("value of supply: " + a2.valueofsupply);
		
		System.out.println("VAT: " + a1.getVAT());
		System.out.println("VAT: " + a2.getVAT());
		
		System.out.println("Total: " + a1.getTotal());
		System.out.println("Total: " + a2.getTotal());

	}

}
