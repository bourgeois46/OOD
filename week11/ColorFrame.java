import java.awt.*;
import javax.swing.*;

// JLabel 16개 생성, 각각 색깔 지정, JFrame에 추가 -> 화면에 표시
public class Hw1 extends JFrame {
	
	public Hw1() { //생성자
		
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 4));// 4x4 그리드 생성
		
		// 그리드랑 라벨 별개
		JLabel[] jl = new JLabel[16]; // 배열 16짜리 라벨만들기
		
		for (int i = 0; i < 16; i++) { // 번호 지정
			jl[i] = new JLabel("" + i + "");
		}
		
		jl[0].setBackground(Color.RED); // 색깔 지정
		jl[1].setBackground(Color.ORANGE);
		jl[2].setBackground(Color.YELLOW);
		jl[3].setBackground(Color.GREEN);
		jl[4].setBackground(Color.CYAN);
		jl[5].setBackground(Color.BLUE); 
		jl[6].setBackground(Color.MAGENTA);
		jl[7].setBackground(Color.GRAY);
		jl[8].setBackground(Color.PINK);
		jl[9].setBackground(Color.LIGHT_GRAY);
		jl[10].setBackground(Color.WHITE);
		jl[11].setBackground(Color.DARK_GRAY);
		jl[12].setBackground(Color.BLACK);
		jl[13].setBackground(Color.ORANGE);
		jl[14].setBackground(Color.BLUE);
		jl[15].setBackground(Color.MAGENTA);

        for(int i = 0; i < 16; i++) {
            jl[i].setOpaque(true); // 불투명 속성을 활성화해야 배경색이 표시됨
            add(jl[i]);    // JLabel을 JFrame에 추가
        }
        
        setSize(500, 200); // 프레임 사이즈 설정
        setVisible(true); // 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hw1();
	}

}
