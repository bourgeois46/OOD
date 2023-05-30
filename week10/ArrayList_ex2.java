import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
// import java.util.*; 로 한번에 작성 가능

public class ArrayList_ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열만 삽입 가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받아서 ArrayList 컬렉션에 삽입
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String s = sc.next();
			a.add(s); 
		}
		
		// ArrayList 요소 출력
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i); 
			System.out.print(name + " ");			
		}
		
		int longestIndex = 0;
		for (int i = 1; i < a.size(); i++) {
			if (a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		
		System.out.println("\n가장 긴 이름은: "+a.get(longestIndex));
		sc.close();
	}

}
