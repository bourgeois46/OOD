// 마우스로 문자열 이동시키기
// 컨탠트팬의 아무 위치에 마우스 버튼을 누르면 마우스 포인트가 있는 위치로 "hello" 문자열을 옮기는 스윙 프로그램

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame {
  private JLabel la = new JLabel("Hello"); // 레이블 컴포넌트 // 마우스 이벤트에 따라 레이블의 위치가 변경됨
  
  public MouseListenerEx() { // 생성자
    setTitle("Mouse 이벤트 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container c = getContentPane();
    c.addMouseListner(new MyMouseListener()); // 컨탠트팬(컨테이너)에 리스너 달기
    // 이 리스너는 마우스 이벤트가 발생했을 때 실행될 코드를 정의함
    
    c.setLayout(null); // 컴포넌트의 위치와 크기를 직접 지정 
    la.setSize(50, 20); // 레이블의 크기
    la.setLocation(30, 30); // 레이블의 위치
    c.add(la); // 컨탠트팬(컨테이너)에 컴포넌트(레이블) 달기 -> 화면창에 출력되게 하기 위해서
    
    setSize(250, 250); // 창의 크기
    setVisible(true);
  } 
  
  class MyMouseListener implements MouseListener { // Inner class
    public void mousePressed(MouseEvent e) { // 마우스 버튼이 눌렸을 때 호출되는 메소드
      int x = e.getX();
      int y = e.getY(); // 마우스 이벤트의 좌표
      la.setLocation(x, y); // 레이블의 위치 변경
   }
    
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
  }
  
  public static void main(String[] args) {
    new MouseListenerEx();
  }
}
