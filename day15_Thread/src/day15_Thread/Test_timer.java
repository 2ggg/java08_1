package day15_Thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Timer extends Thread{
	public void sleep() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public String timer() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		
		Calendar calendar = Calendar.getInstance();
		String timeString = dateFormat.format(calendar.getTime());
		return timeString;
		
		//System.out.println(dateFormat.format(date));
	}
}

class Frame extends Thread{
	public void frame() {
		Timer timer = new Timer();
		
		JFrame frame = new JFrame("타이머");
		Container container = frame.getContentPane();
		JButton btn = new JButton("시작"); //버튼
		JButton btn2 = new JButton("종료");
		JPanel btnpanel = new JPanel(); //패널
		JTextArea txtArea = new JTextArea(); //글상자(제한x)
		//JTextField txtfield = new JTextField(200); //글 제한 수 지정
		
		frame.setPreferredSize(new Dimension(500,200));//창크기 설정
		frame.setLocationRelativeTo(null);//가운데 띄우기
		
		JLabel label = new JLabel("시간 출력");
		container.add(label);
		container.add(btn);
		container.add(btn2);
		container.add(txtArea);
		
		btnpanel.add(btn, BorderLayout.SOUTH);
		
		Font font = new Font(null, Font.BOLD, 32);//폰트 생성
		label.setFont(font);//폰트와 라벨 연결시키기
		label.setHorizontalAlignment(JLabel.CENTER);//폰트 위치
		
		
		container.setLayout(new BorderLayout()); //위치 세팅할 레이아웃 새로 만듬
		container.add(label, BorderLayout.CENTER); //라벨 위치
		container.add(btn, BorderLayout.SOUTH); //버튼 위치
		container.add(btn2, BorderLayout.SOUTH);
		container.add(txtArea, BorderLayout.NORTH);
		
		frame.pack(); //위에 것들 적용하기
		
		frame.setVisible(true); //창 띄우기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 프로세스 종료되기
		
		String timeString = timer.timer();//시간 가져오기
		while(true) {
			timeString = timer.timer();
			label.setText(timeString);
			timer.sleep();
		}
	}
}

public class Test_timer {

	public static void main(String[] args) {
		Timer timer = new Timer();
		System.out.println(timer.timer());
		
		/*
		String timeString = timer.timer();
		
		while(true) {
			timeString = timer.timer();
			System.out.println(timeString);
			timer.sleep();
		}
		*/
		
		
		Frame frame = new Frame();
		frame.frame();
	}
}
