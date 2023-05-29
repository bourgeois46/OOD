import java.util.Scanner;
import java.util.InputMistmatchException;// java.util 패키지에 저장되어있음

public class InputMismatchException_ex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 3개를 입력하세요");
    int sum = 0, n = 0;
    
    for (int i = 0; i < 3; i++) {
      try {
        System.out.print(i + ">>");
        n = sc.nextInt(); // 잘못된 값이 입력되면 catch문으로 감
        sum += n; // 이 코드에는 정상적인 값만 들어감
      }
      
      catch (InputMismatchException e) { // 잘못된 값이 입력된 경우 수행
        System.out.println("정수가 아닙니다. 다시 입력하세요!");
        sc.next(); // 잘못된 입력값을 제거하기 위해 호출(버퍼에 있는 잘못된 입력값 제거)
        i--; // 해당 인덱스에서 정수 다시 입력받기 위해
      }
    }
    System.out.println("합은 "+sum);
    sc.close();
  }
}

