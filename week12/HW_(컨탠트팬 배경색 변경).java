import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// MouseMotionListener
// 드래그 멈추면 초록색으로 다시 변경 

public class HW_1 extends JFrame {
	 JPanel contentPane = new JPanel(); // JPanel을 통해서 컨탠트팬 생성
	
	 public HW_1() { // 생성자
		 setTitle("드래깅동안 YELLOW로 변경");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setContentPane(contentPane); // 프레임에 팬 부착   
		 
		 contentPane.setBackground(Color.GREEN); // 컨탠트팬의 배경색 초록색
		 contentPane.addMouseMotionListener(new MyMouseListener()); // 컨탠트팬에 리스너 부착
		    
		 contentPane.setBackground(Color.green);// 팬 색깔 초기화 (그린)
		 
		 setSize(300, 150);
		 setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter { 
		// implements MouseListener -> 추상메소드 전부 구현
		
		// 드래깅 동안 노란색
		public void mouseDragged(MouseEvent e) {
			JPanel contentPane = (JPanel)e.getSource();  // 현재 소스 얻어냄
	        contentPane.setBackground(Color.yellow);   // 팬 색깔 (옐로우)
		}
		
		// 드래깅 멈추면(= 마우스를 움직이면) 초록색
		public void mouseMoved(MouseEvent e) {
			JPanel contentPane = (JPanel)e.getSource();  // 현재 소스 얻어냄
	        contentPane.setBackground(Color.green);   // 팬 색깔 (그린)
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HW_1();
	}

}
