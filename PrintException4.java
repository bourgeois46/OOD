public class PrintException4 {
  public static void main (String[] args) {
    f();    
  }
  static void f() {
    g();
  }
  static void g() {
    h();
  }
  static void h() {
    try {
      int a = 100 / 0;    
    } 
    catch (ArithmeticException ex) {
      // StackTraceElement : 자바 내장 클래스로, 스택 추적 정보를 나타냄
      StackTraceElement [] arr; // 스택 추적 정보를 저장할 배열
      arr = ex.getStackTrace(); // getStackTrace()는 현재 예외의 스택 추적 정보 반환
      // 배열 원소 하나씩 수행되므로 이렇게 작성
      
      for (StackTraceElement ele : arr) {
        System.out.printf("%s\t%s\t%s\t%d\n", 
                          ele.getClassName(),
                          ele.getMethodName()
                          ele.getFileName(),
                          ele.getLineNumber() );
      }
    }  
  }    
}
