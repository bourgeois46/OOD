import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// 폰트 크기 키우고 줄이기
// + : shift + '+'
// - : -

public class HW_2 extends JFrame {
	JPanel contentPane = new JPanel(); // 팬으로 사용할 패널
    JLabel KeyMessage;  // 1개의 컴포넌트
    
	public HW_2() { // 생성자
		setTitle("+-키로 폰트 크기 바꾸기");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setContentPane(contentPane); // 프레임에 팬 부착 및 등록
	    
	    contentPane.addKeyListener(new MyKeyListener()); // 팬에 리스너 달기
	    KeyMessage = new JLabel("Love Java"); // 라벨 초기화 // 위에서 한번에 해도 됨   
	    KeyMessage.setFont(new Font("Arial", Font.PLAIN, 10)); // 폰트 사이즈 10으로 초기화 
	    // 폰트 초기화: 라벨.setFont(new Font("Arial", Font.PLAIN, 10));
	    contentPane.add(KeyMessage); // 팬에 라벨 부착
	    
	    setSize(300, 150);
	    setVisible(true);
	    
	    // 사용자 입력
	    contentPane.setFocusable(true);
	    contentPane.requestFocus();    
	}
	
	class MyKeyListener extends KeyAdapter {
		// implements keyListener 사용하면 추상메소드 바디 다 구현해야
		public void keyPressed(KeyEvent e) {
            char keyChar = e.getKeyChar(); 

            if (keyChar == '+' ) {// 1) 폰트 가져오기 2) 폰트 크기 가져오기
            	 Font f = KeyMessage.getFont(); // 라벨에서 폰트 가져와서 f에 넣기
                 int size = f.getSize(); // 라벨에서 가져온 폰트 사이즈를 size에 넣기
                 KeyMessage.setFont(new Font("Arial",Font.PLAIN, size+5));
            }
            
             else if (keyChar == '-') {
            	 Font f = KeyMessage.getFont();
                 int size = f.getSize();
                 
                 if(size > 5)    // 단, 5 이하에서는 줄어들지 않도록 함
                     KeyMessage.setFont(new Font("Arial",Font.PLAIN, size-5));
                }
            }
        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HW_2();
	}
}
