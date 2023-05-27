// <F1> 키를 입력 -> 컨탠트팬의 배경으로 초록색으로
// % 키를 입력 -> 노란색으로 변경
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
  private JLabel la = new JLabel();
  
  public KeyCodeEx() {
    setTitle("Key Code 예제 : F1키: 초록색, %키: 노란색");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    
    c.addKeyListener(new MyKeyListener());
    c.add(la);
    
    setSize(300, 150);
    setVisible(true);
    
    // 키 입력을 받을 수 있도록 포커스를 준다 // 사용자 입력을 받으려면 포커스 필요
    c.setFocusable(true);
    c.requestFocus();    
  }
  
  class MyKeyListener extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
      la.setText(e.getKeyText(e.getKeyCode())); 
      // e.getKeyText(e.getKeyCode()) : 눌린 키의 이름을 가져옴(문자열)
      // la.setText : JLabel인 la에 키 이름을 설정 -> 사용자가 어떤 키를 눌렀는지 JLabel 에 표시할 수 있음
      
      if (e.getKeyChar() == '%') // 눌린 키의 문자 코드 // 문자인 경우에만 작동
        getContentPane.setBackground(Color.YELLOW);
      
      else if (e.getKeyCode() == KeyEvent.VK_F1)
        getContentPane.setBackground(Color.GREEN);      
    }    
  }
  
  public static void main(String[] args) {
    new KeyCodeEx();
  }
}
