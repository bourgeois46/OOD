public class Rethrow {
  public static void main (String[] args) {
    try {
      f(); // 1) 
    }
    catch (Exception ex) { // 6) f() 메소드에서 재던진 예외 처리
      ex.printStackTrace(); //7) 출력: 예외가 발생한 위치와 예외를 호출한 메서드의 순서
    }
    System.out.println("This is main()."); // 8)  
  }
  
  static void f() throws Exception {
    try {
      g(); // 2)
    }
    catch (Exception ex) {
      System.out.println("Exception is caught in f()."); //4) 출력
      throws ex; // 5) 메서드에서 처리한 예외를 또 던짐
      // 현재 메소드에서 처리X -> 호출한 메소드로 예외 전달 & 처리
    }
  }
    
    static void g() throws Exception {
      throw new Exception("Exception generated in g()."); // 3) 
      // 이때 예외 객체를 던진 것(예외 발생) 출력은 X
      // 예외가 발생한 시점에서 출력되지 않고, 예외를 처리하는 단계에서 스택 추적 정보와 함께 출력
    }
  
}
