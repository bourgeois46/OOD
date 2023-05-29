public class ThrowException4 {
  public static void main(String [] args) {
    try { // 예외 던지는 메소드 호출
      f();
    }
    catch (Exception ex) { // 던져진 예외 객체 처리
      System.out.println("Exception is caught.");
    }
    System.out.println("This is main().");    
  } 
  
  static void f() throws Exception { // 예외 던지는 메소드
    Exception ex = new Exception(); // 예외 객체 생성
    throw ex; // 인위적으로 예외 던짐
  }  
}
