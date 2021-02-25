
public class OutputMethod {
	public static String a() {
		return "a";
	}
	
	public static int one() {
		return 1; // return에서 메소드는 끝난다
	}
	
	
	// void: 리턴값이 없는 메소드를 쓸 때 사용한다
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());
		
	}

}
