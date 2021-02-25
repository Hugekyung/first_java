import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(Math.PI)); // 내림
		System.out.println(Math.ceil(Math.PI)); // 올림
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("hello");
		f1.write(" java!");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("hello");
		f2.write(" java2 !");
		f2.close();

	}

}
