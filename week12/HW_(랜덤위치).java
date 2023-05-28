import java.awt.event.*;
import javax.swing.*;
 
public class HW_3 extends JFrame{
    JPanel contentPane = new JPanel(); // 팬으로 사용할 패널
    JLabel KeyMessage; // 1개의 컴포넌트
    
    HW_3() {
        setTitle("클릭 연습용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        contentPane.setLayout(null);    // 패널 레이아웃 초기화
        setContentPane(contentPane);    // 프레임에 팬 부착 1)
        contentPane.addMouseListener(new MyMouseListener()); // 컨탠트팬에 리스너 등록
        
        KeyMessage = new JLabel("C"); // 라벨 초기화
        KeyMessage.setLocation(100, 100);  // 초기 위치 100, 100
        KeyMessage.setSize(20, 20);    // null일경우 setLocation, setSize 초기화 필수
        contentPane.add(KeyMessage);    // 팬에 라벨 부착 2)
        
        setSize(300,300);
        setVisible(true);
    }
    
    class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) { // 마우스 클릭 시
            int x = (int)(Math.random()*200);    
            int y = (int)(Math.random()*200);
            // Math.random()은 0 이상 1 미만의 값을 반환하므로 좌표값 범위 너무 제한적 -> 임의의 수 곱함
            KeyMessage.setLocation(x, y); // 라벨에 랜덤 좌표 출력
        }        
    }
    
    public static void main(String[] args) {
        new HW_3();
    }    
}
