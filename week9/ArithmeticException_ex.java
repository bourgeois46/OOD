import java.util.Scanner;

public class ArithmeticException_ex {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //try~catch~finally 문이 무한 루프 안에서 작성되어 있다면 
    // try문에서 정상적인 코드 수행 후 무한 루프 벗어날 수 있도록 break; 써줘야됨
    
    while(true) {
      System.out.print("나뉨수를 입력하시오: ");
      int dividend = sc.nextInt();
      System.out.print("나눗수를 입력하시오: ");
      int divisor = sc.nextInt();
      
      try {
        System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
        break;// 정상적인 나누기 완료 후 while문 벗어나기
      }
      catch (ArithmeticException e){
        System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
      }
    }
    sc.close();
  }
  
}
