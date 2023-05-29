import java.lang.IllegalArgumentException;

@SuppressWarnings("serial")
public class InvalidInputException extends IllegalArgumentException {
	public InvalidInputException(String message) {
        super(message);
    }
	
}
//RuntimeException은 자동적으로 스택트레이스 출력함
//IllegalArgumentException 메소드의 매개변수가 잘못된 경우 발생

import java.util.Scanner;
import java.util.Random;

//throws -> try catch 
public class Practice_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String[] options = {"가위", "바위", "보"};
		
		System.out.print("컴퓨터의 생성: ");
		int index = rd.nextInt(options.length);//인덱스를 먼저 랜덤하게 뽑기
        String randomOption = options[index];
        System.out.println(randomOption);
        
		System.out.print("당신의 입력: ");			
		String str;
		
		try {
			str = getInput(sc);//사용자 입력(예외발생 가능성)
		}
		catch (InvalidInputException ex) {
			System.out.println(ex.getMessage());
			
	        return;//메인 메소드 중간에 프로그램을 종료시키기 위해(문제조건)*
	        //해당 상황에서 메소드 실행을 중단하고 예외를 처리한 후에 추가적인 코드를 실행하지 않도록 하기 위해
		}
		
		int n = whoswin(randomOption, str);
		
		if (n == -1)
			System.out.println("컴퓨터가 이겼습니다.");
		else if (n == 1) 
			System.out.println("당신이 이겼습니다.");
		else
			System.out.println("비겼습니다.");
		
		sc.close();
	}
	
	//입력한 값이 가위바위보가 아닐 경우 예외 발생/s는 스캐너 클래스 타입
	public static String getInput(Scanner s) throws InvalidInputException {
		String[] options = {"가위", "바위", "보"};
		
		 String input = s.next();

		 for (String o : options) {
		     if (o.equals(input)) {//가위, 바위, 보 -> 리턴
		         return input;
		     }
		  }
		 
		 //for문 다돌았는데 없으면
         throw new InvalidInputException("잘못된 입력입니다.");				
	}
	
	public static int whoswin(String com, String you) {
	//컴퓨터가 이기면 -1, 사용자가 이기면 1, 비기면 0
		int p = 0;
		
		if (com.equals("가위")) {
			if (you.equals("보"))
				p = -1;
			else if (you.equals("바위"))
				p =  1;
			else
				p =  0;		
		}
		
		else if (com.equals("바위")) {
			if (you.equals("가위"))
				p = -1;
			else if (you.equals("보"))
				p =  1;
			else
				p =  0;		
		}
		
		else if (com.equals("보")) {
			if (you.equals("바위"))
				p = -1;
			else if (you.equals("가위"))
				p =  1;
			else
				p =  0;		
		}
		
		return p;
		
	}
	
}
