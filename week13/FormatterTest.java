import java.util.Formatter;
import java.io.FileNotFoundException;

public class FormatterTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Formatter output = new Formatter("numbers.txt");
			for (int i = 0; i < 10; i++)
				output.format("%d\r\n", i); // 줄바꿈
			output.close();
		}
		
		catch (FileNotFoundException e) {
			System.err.println("cannot open");
			System.exit(1); // 비정상 종료: 0이 아닌 값
		}

	}

}
