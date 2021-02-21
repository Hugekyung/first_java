
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b); // 정수형을 실수형으로 인버팅한다
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // int로 강제 인버팅, 0.1의 손실이 일어난다, 명시적으로 적어줘야 변형이 가능하다
		System.out.println(e);
		
		String f = Integer.toString(1); // 정수 1을 String 타입으로 변형한다
		System.out.println(f);
		System.out.println(f.getClass()); // 데이터 타입이 무엇인지 알려준다
	}

}
