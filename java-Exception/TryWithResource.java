import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		// try괄호 안에 close가 필요한 코드를 넣으면 자동으로 close를 실행한다. 따라서 close코드를 작성할 필요성이 없다.
		try (FileWriter f = new FileWriter("data.txt")) {
			f.write("Hello");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
