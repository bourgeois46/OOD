import java.util.*;

public class HashMapDicEx {
  public static void main (String[] args) {
    HashMap <String, String> javaScore = new HashMap <String, String> ();
    
    javaScore.put("이창섭", 97);
    javaScore.put("김범", 88);
    javaScore.put("이주헌", 98);
    javaScore.put("장경민", 70);
    javaScore.put("에릭남", 99);
    
    System.out.println("HashMap의 요소 개수: " + javaScore.size());
    
    // javaScore의 모든 쌍 출력
    // key 문자열을 가진 집합 Set 컬렉션 리턴
    Set<String> keys = javaScore.keySet();
    
    // key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
    Iterator<String> it = keys.iterator();
    
    while (it.hasNext()) {
      String name = it.next(); // 다음 요소 리턴
      int score = javaScore.get(name); // 키로 값 찾음
      
      System.out.println(name + " : " + score);
    }
  } 
  
}
