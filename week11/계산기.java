import java.awt.*;
import javax.swing.*;

public class Hw2 extends JFrame {

    public Hw2() {
    	
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        // 수식 입력 
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        
        JLabel inputLabel = new JLabel("수식 입력");
        JTextField inputField = new JTextField(15); // 입력 필드 크기 조정
        inputPanel.setBackground(Color.LIGHT_GRAY);
        
        // JFrame에 추가
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        // JButton
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 3, 3)); // 버튼 사이 간격 조정
        // buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // 버튼 패널 주위 여백 조정
        
        buttonPanel.add(new JButton("0"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("2"));
        buttonPanel.add(new JButton("3"));
        buttonPanel.add(new JButton("4"));
        buttonPanel.add(new JButton("5"));
        buttonPanel.add(new JButton("6"));
        buttonPanel.add(new JButton("7"));
        buttonPanel.add(new JButton("8"));
        buttonPanel.add(new JButton("9"));
        buttonPanel.add(new JButton("CE"));
        buttonPanel.add(new JButton("계산"));
        
        // + 버튼
        JButton plusButton = new JButton("+");
        plusButton.setBackground(Color.CYAN);
        // JFrame에 추가
        buttonPanel.add(plusButton);

        // - 버튼
        JButton minusButton = new JButton("-");
        minusButton.setBackground(Color.CYAN);
        buttonPanel.add(minusButton);

        // x 버튼
        JButton multiplyButton = new JButton("x");
        multiplyButton.setBackground(Color.CYAN);
        buttonPanel.add(multiplyButton);

        // / 버튼
        JButton divideButton = new JButton("/");
        divideButton.setBackground(Color.CYAN);
        
        divideButton.setPreferredSize(new Dimension(50, 50)); // 가로세로 길이 조절
        //버튼 중 하나만 넣어주면 원하는 크기로 전체 조절됨
        buttonPanel.add(divideButton);

        
        // 계산 결과
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout());
        
        JLabel resultLabel = new JLabel("계산 결과");
        JTextField resultField = new JTextField(15); // 출력 필드 크기 조정
        resultPanel.setBackground(Color.YELLOW);
        
        resultPanel.add(resultLabel);
        resultPanel.add(resultField);

        c.add(inputPanel, BorderLayout.NORTH);
        c.add(buttonPanel, BorderLayout.CENTER);
        c.add(resultPanel, BorderLayout.SOUTH);

        pack(); // 컴포넌트 크기에 맞게 창 크기 조정
        //setLocationRelativeTo(null); // 화면 중앙에 프레임 표시(추가적인 기능)
        setVisible(true); // 출력
    }

    public static void main(String[] args) {
        new Hw2();
    }
}
