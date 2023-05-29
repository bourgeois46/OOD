public class ThrowException1 {
  public static void main (String[] agrs) {
    f();
    System.out.println("This is main().");    
  }
  
  static void f() {
    Exception ex; // 예외 클래스의 예외 객체 생성
    
    ex = new Exception();
    ex.printStackTrace();
    
    ex = new Exception("test exception");
    ex.printStackTrace();
    
    ex = new ArithmeticException();
    ex.printStackTrace();
    
    ex = new ArithmeticException("+=*/");
    ex.printStackTrace();
  } 
  
}
