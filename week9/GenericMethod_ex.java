public class GenericMethodExample {
  // T가 타입 매개변수인 제너릭 메소드
  public static<T> GStack<T> reverse(GStack<T>a) {
    GStack<T> s = new GStack<T>();
    
    while(true) {
      T tmp;
      tmp = a.pop(); // 원래 스택에서 요소 하나 꺼내서 삭제
      
      if (tmp == null)
        break;
      else
        s.push(tmp); // 새 스택에 요소를 삽입      
    }
    return s; // 새 스택 반환
  }
  
  public static void main(String[] args) { // 구체적인 타입은 메인 메소드에서 명시
    GStack<Double> gs = new GStack<Double>();
    
    for (int i = 0; i < 5; i++) {
      gs.push(new Double(i));
    }
    
    gs = reverse(gs);
    
    for (int i = 0; i < 5; i++) {
      System.out.println(gs.pop());
    }
  }
}
