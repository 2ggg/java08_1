package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex04 {
	public static void main(String[] args) {
		//JFrame 창을 띄울 수 있는 명령어
		JFrame frame = new JFrame("TEST"); //제목
		Container container = frame.getContentPane(); //기본적으로 깔아주는 바닥
		JLabel label = new JLabel("Hello GUI"); //들어갈 내용 입력
		JPanel panel = new JPanel(); //컴포넌트들을 조직화(묶음)
		panel.add(new JLabel("Welcome"));
		
		container.add(label); //내용 추가하기
		
		frame.setLocationRelativeTo(null);//창 띄울 위치 설정1. null로 두면 화면 가운데에 뜸
		//frame.setLocation(1000,200); //창이 뜰 위치 설정2
		//frame.setResizable(false);//false일때, 창 크기 조절 불가
		frame.setPreferredSize(new Dimension(500,200)); //창(프레임) 크기 설정
		frame.pack(); //위의 것들을 적용해라
		
		Font font = new Font(null, Font.ITALIC, 32); //폰트의 (글꼴, 스타일, 크기) 지정
		label.setFont(font); //폰트 세팅
		label.setHorizontalAlignment(JLabel.CENTER); //창 내에 폰트 위치 설정
		
		frame.setVisible(true); //창 띄우기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫으면 프로세스도 종료됨
		
		label.setText("안녕하세요");//내용 변경
		
		for(int i=0; i<=100; i++) {
			label.setText(i+"반가워요"); //이런 것도 가능
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
