// impements Calculable: interface에서 정한 규칙을 DummyCal에서 지켜야 하도록 규격을 만든 것이다.
// class의 형태를 규정하는 것이라고 봐도 된다.
// 하나의 클래스는 여러개의 인터페이스를 구현할 수 있다.
// 인터페이스의 메서드는 구현을 가질 수 없다.

interface Calculable{
	double PI = 3.14; // 변수 자체는 직접 값을 지정한다.
	int sum(int v1, int v2);
}
interface Printable{
	void print();
}
class RealCal implements Calculable, Printable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public void print() {
		System.out.println("This is RealCal!!");
	}
	
}
class DummyCal implements Calculable{
	public int sum(int v1, int v2) {
		return 3;
	}
}
public class InterfaceApp {

	public static void main(String[] args) {
		
		RealCal c = new RealCal();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);

	}

}
