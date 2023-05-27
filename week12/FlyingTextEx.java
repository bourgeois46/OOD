// 상하좌우 키로 "HELLO" 문자열 마음대로 움직이기
// "HELLO" 문자열은 JLabel 컴포넌트로 만들어 컨탠트팬에 부착
// 상하좌우 키를 움직이면 키 방향으로 한 번에 10 픽셀씩 움직인다이 -> 컨탠트팬의 배치 관리자를 삭제
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame {
  private final int FLYING_UNIT = 10;
  private JLabel la = new JLabel("HELLO");
  
  public FlyingTextEx() {
    setTitle("상, 하, 좌, 우 키를 이용하여 텍스트 움직이기");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container c = getContentPane();
    c.setLayout(null); // 컴포넌트들을 수동으로 위치 및 크기 설정
    c.addKeyListener(mew MyKeyListener());
    
    la.setLocation(50, 50); // 문자열 초기 위치
    la.setSize(100, 20);
    c.add(la);
    
    setSize(300, 300);
    setVisible(true);
    
    // 컨탠트팬에 포커스 설정 -> 컨탠트팬이 키 이벤트를 받을 수 있도록 함
    c.setFocusable(true);
    c.requestFocus();
    
    // MouseListener로 마우스 클릭 이벤트 처리
    c.addMouseListener(new MouseAdapter() { // Anonymous class
      public void mouseClicked(MouseEvent e) {
        Component com = (Component)e.getSource();
        
        // 마우스 클릭 이벤트가 발생한 컴포넌트에 포커스 설정
        // 사용자가 마우스로 컨탠트팬을 클릭하여 키 이벤트를 받을 수 있음
        com.setFocusable(true);
        com.requestFocus();
      }
    });    
  }
  
  class MyKeyListener extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode(); // 모든 키에 대해 작동 // 눌린 키의 코드 값
      
      switch(keyCode) {
        case KeyEvent.VK_UP:
          la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
          break;
        case KeyEvent.VK_DOWN:
          la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
          break;
        case KeyEvent.VK_LEFT:
          la.setLocation(la.getX()-FLYING_UNIT, la.getY());
          break;
        case KeyEvent.VK_RIGHT:
          la.setLocation(la.getX()+FLYING_UNIT, la.getY());
          break;         
      }
    }    
  }
  
  public static void main(String[] args) {
    new FlyingTextEx();
  }
}
