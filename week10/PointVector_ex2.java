import java.util.Vector;

class Point {
  private int x, y;
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public String toString() {
    return "("+x+","+y+")";
  }
  
  public Boolean equals(Object o) { // equals 재정의
    Point p = (Point) o; // 객체를 Point 타입으로 downcasting
    return (x == p.x && y == p.y);
  }
}

public class PointVector_ex {
  public static void main(String[] args) {
    // Point 객체를 요소로만 가지는 벡터 생성
    Vector<Point> v = new Vector<Point>();
    
    // 3개의 Point 객체 삽입
    v.add(new Point(2, 3));
    v.add(new Point(-5, 20));
    v.add(new Point(30, -8));
    
    System.out.println("contains (-5, 20)?" + v.contains(new Point(-5, 20));  
    // 서로 다른 객체이지만 equals 재정의를 통해 컬렉션은 동일한 데이터로 판별     
  }  
}
