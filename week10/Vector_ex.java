import java.util.Vector;

public class Vector_ex {
  public static void main (String[] args) {
    // 정수값만 다루는 제너릭 벡터 생성
    Vector<Integer> v = new Vector<Integer>();
    
    v.add(5);
    v.add(4);
    v.add(-1);
    
    v.add(2, 100); // 4와 -1 사이에 삽입
    
    System.out.println("벡터 내의 요소 객체 수: " + v.size());
    System.out.println("벡터 내의 현재 용량: " + v.capacity());
    
    // 모든 요소 정수 출력하기
    for (int i = 0; i < v.size(); i++) {
      int n = v.get(i); // Integer 타입이 int 타입으로 자동 언박싱
      System.out.println(n);      
    }
    
    // 벡터 속의 모든 정수 더하기
    int sum = 0;
    for (int i = 0; i < v.size(); i++) {
      int n = v.elementAt(i); // 인덱스의 요소 리턴하는 메소드
      // Integer 타입이 int 타입으로 자동 언박싱
      sum += n;
    }
    
    System.out.println("벡터에 있는 정수 합: " + sum);
  }
}
