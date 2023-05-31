import java.io.*;

public class FileReaderEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		
		try {
			fin = new FileReader(""); // 비워둠?
			int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char)c); // int -> char
			}
			fin.close();		
		}
		
		// catch 블록 순서 중요
		// IOException가 FileNotFoundException의 상위 클래스
		catch (FileNotFoundException e) {
			System.out.println("파일오픈 오류");
		}
		
		catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
