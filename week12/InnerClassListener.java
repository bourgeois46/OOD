import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame {
  public InnerClassListener() {
    setTitle("Action 이벤트 리스너 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    
    JButton btn = new JButton("Action"); // 버튼 생성
    btn.addActionListener(new MyActionListener()); // 컴포넌트에 리스너 달기
    // 버튼에 이벤트 리스너 달기 -> 버튼을 클릭했을 때 실행될 동작 정의
    
    c.add(btn); // 컨테이너에 컴포넌트 달기 -> 해당 컴포넌트가 화면창에 표시되도록 하기 위해
    
    setSize(350, 150);
    setVisible(true);
  }
  
  private class MyActionListener implements ActionListener { // 리스너 구현 클래스
    public void actionPerformed(ActionEvent e) {
      JButton b = (JButton)e.getSource(); 
      
      if (b.getText().equals("Action"))
        b.setText("액션");
      else
        b.setText("Action");
      // InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
      
      InnerClassListener.this.setTitle(b.getText()); // 프레임 타이틀에 버튼 문자열을 출력한다
    }
  }
  
  public static void main(String[] args) {
    new InnerClassListener();
  }
}
