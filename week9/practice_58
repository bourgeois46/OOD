
@SuppressWarnings("serial")

public class MyException extends ArithmeticException {//예외 클래스 상속
//ArithmeticExceptio 클래스는 import문 x
	
	public MyException(String message) {
		super(message);
	}
}


public class Practice_58 {
	public static void checkNegative(int number) throws MyException {
		//예외 던지는 정적메소드
		
		if (number < 0) {//음수이면 객체를 생성하고 해당 예외 throw
			throw (new MyException("음수는 안됩니다."));//throw 객체
		}
		System.out.println("다행히 음수가 아니군요.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkNegative(1);//다행이 음수가 아니군요 출력
			checkNegative(-1);//음수는 안됩니다 & StackTrace 출력
		} 
		catch(MyException ex) {//예외 처리
			ex.printStackTrace();
		}

	}

}
