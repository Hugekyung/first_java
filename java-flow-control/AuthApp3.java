
public class AuthApp3 {

	public static void main(String[] args) {
		
//		String[] users = {"yang", "tk", "haechan"};
		String[][] users = {
				{"yang", "1111"},
				{"tk", "2222"},
				{"haechan", "3333"}
		};
		String inputID = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(
					current[0].equals(inputID) &&
					current[1].equals(inputPass)
			) {
				isLogined = true;
				break;
			}
		}
		
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you??");
		}

	}

}
