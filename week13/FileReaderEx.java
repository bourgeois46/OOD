import java.io.*;

public class FileReaderEx {
	// 파일을 읽어서 화면에 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			
			while ((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽기
				// 끝에 도달하면 -1 리턴
				System.out.print((char)c);	
			}
			fin.close();			
		}
		
		// FileNotFoundException과 IOExceptin을 모두 catch
		catch (IOException e){
			System.out.println("입출력 오류");
		}
	}

}
