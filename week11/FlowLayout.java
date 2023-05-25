import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() { // 생성자
		setTitle("Flowlayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // 왼쪽 정렬
		c.setBackground(Color.YELLOW);
		
    // 컨텐드팬(컨테이너)에 컴포넌트 달기
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
				
	   setSize(300, 200);
	   setVisible(true);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();
	}
