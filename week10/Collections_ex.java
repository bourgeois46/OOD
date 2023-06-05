import java.util.*;

public class Collections_ex {
  static void printList (LinkedList<String> l) { // 컬렉션을 매개변수로 받는 메소드
    Iterator<String> iterator = l.iterator(); // 순차탐색
    
    while (iterator.hasNext()) {
      String e = iterator.next();
      String seperator;
      
      if (iterator.hasNext())
        seperator = "->";
      else
        seperator = "\n";
      
      System.out.print(e+seperator);      
    }
    
    public static void main (String[] args) {
      LinkedList<String> myList = new LinkedList<String>();
      
      myList.add("트랜스포머");
      myList.add("스타워즈");
      myList.add("매트릭스");
      myList.add(0, "터미네이터");
      myList.add(2, "아바타");
      
      // 요소 정렬하고 메소드 호출해서 출력
      Collections.sort(myList); // static 메소드 -> 메인에서 클래스.메소드() 형식으로 호출
      printList(myList); 
      
      Collections.reverse(myList);
      printList(myList);
      
      int index = Collections.binarySearch(myList, "아바타") + 1;
      System.out.println("아바타는 " + index + "번째 요소입니다.");  
    }    
  }



}
