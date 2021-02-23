
public class LoopApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		
		int i = 0;
		while(i < 3) {
			System.out.println(2);
			System.out.println(3);
			i += 1; // i++ 와 같다
			
		}
		System.out.println("for문===============================");
		for(int j=0; j < 3; j++) {
			System.out.println(2);
			System.out.println(3);
		}
		System.out.println(4);

	}

}
