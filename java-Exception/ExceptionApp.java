
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);

		int[] scores = {10, 20, 30};
		try {
			System.out.println(2);
//			System.out.println(scores[3]); // exception ������ ���Ĺ�����, ���� �߻��� ���� ó�� �� �Ʒ� �ڵ�� ���� ����
			System.out.println(3);
			System.out.println(2/0); // ���� �߻�!, try-catch������ ����ó�� �� ������ �ڵ� ����
			System.out.println(4);
		} catch(Exception e) {
			System.out.println("there is wrong items" + e.getMessage()); // Exception�� ����ϸ� � ���ܶ� �����ϰ� ó���Ѵ�.
			e.printStackTrace(); // ���� �޼��� ����ϱ�
		}
		
		// e.getMessage(): �߻��� ������ �������� ����Ѵ�.
		// e�� �ڵ� �� �߻��� ������ ���� ������ ��� �����̴�.		
//		catch(ArithmeticException e) {
//			System.out.println("Wrong input");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("there is not value"); // ���� �߻��� ���ܿ� ���� ó��
//		}
		
		
		System.out.println(5); // ���� �߻��� ���� ó�� �� try�� �ٱ��� �ִ� �ڵ尡 ����ȴ�.
		

//		for(int i=0; i<3; i++) {
//			System.out.println(i+1);
//		}
	}

}
