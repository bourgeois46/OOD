import javax.swing.*;
import java.awt.*;

public class NullComtainerEx extends JFrame {
  public NullContainerEx() {
    setTitle("Null Container Sample");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container c = getContentPane();
    c.setLayout(null); // 배치 관리자 제거
    
    JLabel la = new JLabel("Hello, Press, Buttons!"); // 컴포넌트
    la.setLocation(130, 50);
    la.setSize(200, 20);
    c.add(la); // 컨테이너에 컴포넌트 붙이기
    
    for (int i = 1; i <= 9; i++) {
      JButton b = new JButton(Integer.toString(i)); // 버튼 생성 // 컴포넌트
      b.setLocation(i*15, i*15);
      b.setSize(50, 20);
      c.add(b); // 버튼(컴포넌트)를 컨탠트팬(컨테이너)에 부착
    }
    
    setSize(300, 200);
    setVisible(true);    
  }
  
  public static void main(String[] args) {
    new NullContainerEx();
  }
  
}
