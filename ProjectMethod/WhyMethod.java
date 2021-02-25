import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {
		
		// "a"와 "@" 값은 argument라고 한다
		printTwoTimes("a", "@");
		printTwoTimes("b", "#");
		
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
		
		System.out.println(twoTimes("a", "-"));

	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	
	// text, delimiter: 매개변수, parameter
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
