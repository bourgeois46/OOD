import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyListenerEx extends JFrame {
  private JLabel [] keyMessage; // JLabel 배열 / 키 이벤트 정보를 표시하는데 사용
  
  public KeyListenerEx() {
    setTitle("keyListener 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    
    c.addKeyListener(new MyKeyListener()); // 컨테이너에 리스너 달기
    
    keyMessage = new JLabel[3];
    keyMessage[0] = new JLabel(" getKeyCode() ");
    keyMessage[1] = new JLabel(" getKeyChar() ");
    keyMessage[2] = new JLabel(" getKeyText() ");
    
    for (int i = 0; i < keyMessage.length; i++) {
      c.add(keyMessage[i]); // 컨테이너에 컴포넌트 달기 
      keyMessage[i].setOpaque(true); // 컴포넌트의 바탕색이 보이도록 하기 위해서 컴포넌트 불투명하게 지정
      keyMessage[i].setBackground(Color.YELLOW);      
    }
    
    setSize(300, 150);
    setVisible(true);
    
    // 포커스 : 컴포넌트가 키 이벤트 독점하는 권한
    // 사용자 입력(키 이벤트)을 특정 컴포넌트에 집중시키는 개념
    c.setFocusable(true); // 컨테이너 c에 포커스를 설정하겠다는 의미
    c.requesFocus(); // 프로그램 실행 시 c 컨테이너가 포커스를 받도록 요청    
  }
  
  class MyKeyListener extends KeyAdapter { // Inner Class 
    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      char keyChar = e.getKeyChar();
      
      keyMessage[0].setText(Integer.toString(keyCode)); // 모든 키에 대해 작동
      keyMessage[1].setText(Character.toString(keyChar)); // 문자인 경우에만 작동(유니코드 문자)
      keyMessage[2].setText(e.getKeyText(keyCode)); // 키 이름을 문자열로 리턴
    }    
  }
  
  public static void main (String[] args) {
    new KeyListenerEx();
  }
}
