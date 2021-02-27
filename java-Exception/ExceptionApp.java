
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);

		int[] scores = {10, 20, 30};
		try {
			System.out.println(2);
//			System.out.println(scores[3]); // exception 구문을 합쳐버리면, 먼저 발생한 예외 처리 후 아래 코드는 실행 안함
			System.out.println(3);
			System.out.println(2/0); // 예외 발생!, try-catch문으로 예외처리 후 나머지 코드 실행
			System.out.println(4);
		} catch(Exception e) {
			System.out.println("there is wrong items" + e.getMessage()); // Exception을 사용하면 어떤 예외라도 동일하게 처리한다.
			e.printStackTrace(); // 에러 메세지 출력하기
		}
		
		// e.getMessage(): 발생한 문제가 무엇인지 출력한다.
		// e는 코드 상 발생한 문제에 대한 내용을 담는 변수이다.		
//		catch(ArithmeticException e) {
//			System.out.println("Wrong input");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("there is not value"); // 먼저 발생한 예외에 대한 처리
//		}
		
		
		System.out.println(5); // 먼저 발생한 예외 처리 후 try문 바깥에 있는 코드가 실행된다.
		

//		for(int i=0; i<3; i++) {
//			System.out.println(i+1);
//		}
	}

}
