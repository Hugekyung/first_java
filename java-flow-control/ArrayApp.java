
public class ArrayApp {

	public static void main(String[] args) {
		
//		String users = "tk, haechan, yang";
		String[] users = new String[3];
		users[0] = "tk";
		users[1] = "haechan";
		users[2] = "yang";
		
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
		int[] scores = {10, 100, 100}; // 배열을 만들면서 바로 값을 지정할 수 있다
		System.out.println(scores[1]);
		System.out.println(scores.length);

	}

}
