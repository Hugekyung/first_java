
public class AccountingApp {
	// 공급가액
	public static double valueofsupply = 10000.0;
			
	// 부가가치세율
	public static double vatrate = 0.1;
	
	public static double getVAT() {
		return valueofsupply * vatrate;
	}
	
	public static double getTotal() {
		return valueofsupply + getVAT();
	}

	public static void main(String[] args) {
		
		System.out.println("value of supply: " + valueofsupply);
		System.out.println("VAT: " + getVAT());
		System.out.println("Total: " + getTotal());

	}

}
