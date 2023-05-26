import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {
  public AnonymousClassListener() {
    setTitle("Action 이벤트 리스너 작성");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    
    JButtin btn = new JButton("Action"); // 버튼 컴포넌트 만들기
    c.add(btn); // 화면에 출력되게 하기 위해서 컨테이너에 부착
    
    btn.addActionListener(new ActionListener() { // 익명 클래스 형식 // 컴포넌트에 리스너 달기
      public void actionPerformed(ActionEvent e) { // 리스너의 추상 메소드
        JButtin b = (JButton)e.getSource(); // 이벤트 소스 알아내기 (컴포넌트)
        
        if (b.getText().equals("Action"))
          b.setText("액션");
        else
          b.setText("Action");
        
        setTitle(b.getText()):
      }
    });      
    
    setSize(350, 150);
    setVisible(true);    
  }
                          
  public static void main(String [] args) {
    new AnonymousClassListener();
  }  
}
