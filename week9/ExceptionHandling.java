import java.util.*;

public class ExceptionHandling {
  public static int quotient(int a, int b) throws ArithmeticException { // 예외를 던지는 메소드 -> try문에서 호출
	  return a/b;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(true) {
      try {
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        
        System.out.println("Quotient is " + quotient(dividend, divisor));
        break; // 무한 루프문 try문에서 써줘야 됨
      }
      
      catch (ArithmeticException e) {
        System.out.println("Cannot divide by 0. Try agin.");
      }
      
      catch (IputMismatchException e) {
         System.out.println("You must enter integers. Try agin.");
         sc.next(); // 잘못된 입력 제거하기
      }
    }
    sc.close();
  } 
}
