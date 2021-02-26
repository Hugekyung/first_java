class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); // Error
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar); // Ok
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // class�̱� ������ ����
//		System.out.println(Foo.instanceVar); // Error, instance�̹Ƿ� �ҷ��� �� ����
		Foo.classMethod();
//		Foo.instanceMethod(); // ���ٺҰ�
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println("================");
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar);
		System.out.println(f2.classVar);
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar);
		System.out.println(f2.instanceVar);

	}

}
