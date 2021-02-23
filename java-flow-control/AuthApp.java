
public class AuthApp {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		String id = "tkyang";
		String inputID = args[0];
		
		String password = "1234";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
		
		if(inputID.equals(id) && inputPass.equals(password)) {			
				System.out.println("Hi Master!");
			} else {
				System.out.println("Who are you?");
		}

	}

}
