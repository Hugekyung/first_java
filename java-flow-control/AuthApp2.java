
public class AuthApp2 {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		String id = "tkyang";
		String inputID = args[0];
		
		String password = "1111";
		String password2 = "2222";
		String inputPass = args[1];
		
		
				
		System.out.println("Hi.");
		boolean isRightPass = (inputPass.equals(password) || inputPass.equals(password2));
		
		if(inputID.equals(id) && isRightPass) {
				System.out.println("Hi Master!");
			} else {
				System.out.println("Who are you?");
		}

	}

}
