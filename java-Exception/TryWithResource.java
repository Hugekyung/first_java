import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		// try��ȣ �ȿ� close�� �ʿ��� �ڵ带 ������ �ڵ����� close�� �����Ѵ�. ���� close�ڵ带 �ۼ��� �ʿ伺�� ����.
		try (FileWriter f = new FileWriter("data.txt")) {
			f.write("Hello");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
