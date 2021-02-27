import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null;
		try {
			f = new FileWriter("data.txt");
			f.write("Hello");
		
		// 여기서는 close를 실행하기 전에 예외가 발생할 수 있다. finally를 통해 반드시 처리하는 코드를 작성한다.

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(f != null) {
				try {
					f.close(); // close도 예외가 발생할 수 있기 때문에 IOException 처리를 해야한다.
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
