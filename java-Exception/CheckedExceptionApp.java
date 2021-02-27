import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null;
		try {
			f = new FileWriter("data.txt");
			f.write("Hello");
		
		// ���⼭�� close�� �����ϱ� ���� ���ܰ� �߻��� �� �ִ�. finally�� ���� �ݵ�� ó���ϴ� �ڵ带 �ۼ��Ѵ�.

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(f != null) {
				try {
					f.close(); // close�� ���ܰ� �߻��� �� �ֱ� ������ IOException ó���� �ؾ��Ѵ�.
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
