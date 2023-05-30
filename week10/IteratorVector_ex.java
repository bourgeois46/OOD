import java.util.*;

// 순회 중 요소를 삭제할 때 인덱스와 for문을 이용하면 문제 발생 -> Iterator<E> 객체 사용
public class IteratorVector {
  public static void main(String[] args) {
    Vector<Integer> v = new Vector<Integer>();    
    v.add(5);
    v.add(-1);
    v.add(-2);
    v.add(10);
    System.out.println("before: " + v);
    
    Iterator<Integer> it = v.iterator();
    while (it.hasNext()) { // 방문할 요소 남아있으면
      if (it.next() < 0)
        it.remove();
    }
    
    System.out.println("after: " + v);    
  }  
}
