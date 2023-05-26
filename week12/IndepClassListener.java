import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IndepClassListener extends JFrame {
  public IndepClassListener() { // 생성자
    setTitle("Action 이벤트 리스너 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout()); // 배치 관리자 설정
   
    JButton btn = new JButton("Action");
    btn.addActionListener(new MyActionListener()); // 컴포넌트에 Action 리스너 달기
    c.add(btn); // 컨텐트팬에 컴포넌트 달기
    
    setSize(350, 150);
    setVisible(true);    
  }
  
  public static void main(String[] args) {
    new IndepClassListener();
  }
}

class MyActionListener implements ActionListener { // 리스너(인터페이스) 구현 클래스
  public void actionPerformed(ActionEvent e) { // 리스너의 추상 메소드
    JButton b = (JButton)e.getSource(); // 이벤트 소스 알아내기 -> downcasting
    
    if (b.getText().equals("Action"))
      b.setText("액션"); // 설정자 -> 내용 변경
    else
      b.setText("Action");  
  }
}
