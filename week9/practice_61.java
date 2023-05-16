
@SuppressWarnings("serial")
public class InvalidInputException extends IllegalArgumentException {
	public InvalidInputException(String message) {
        super(message);
    }
	
}

import java.util.Scanner;
import java.util.Random;

public class Practice_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String[] options = {"가위", "바위", "보"};
		
		System.out.print("컴퓨터의 생성: ");
		int index = rd.nextInt(options.length);
        String randomOption = options[index];
        System.out.println(randomOption);
        
		System.out.print("당신의 입력: ");				
		String str = getValidInput();//예외처리가 메소드 안에서 수행
		
		int n = whoswin(randomOption, str);
		
		if (n == -1)
			System.out.println("컴퓨터가 이겼습니다.");
		else if (n == 1) 
			System.out.println("당신이 이겼습니다.");
		else
			System.out.println("비겼습니다.");
		
		sc.close();
	}
	
	//사용자가 제대로된 값을 입력할때까지 계속 입력받기
	//내부에서 getInput 호출
	public static String getValidInput() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				return getInput(sc);//바로 문자열 리턴
			}
			catch (InvalidInputException ex) {
				System.out.print(ex.getMessage());
			}
		}
	}
	
	public static String getInput(Scanner s) throws InvalidInputException {
		String[] options = {"가위", "바위", "보"};
		
		 String input = s.next();

		 for (String o : options) {
		     if (o.equals(input)) {//가위, 바위, 보 -> 리턴
		         return input;
		     }
		  }
		 
		 //for문 다돌았는데 없으면
         throw new InvalidInputException("잘못된 입력입니다.다시 입력하세요\n당신의 입력: ");				
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
