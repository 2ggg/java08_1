package Test2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	
		JFrame frame = new JFrame("타이머");
		
		JButton btn = new JButton("시작"); //버튼
		JButton btn2 = new JButton("종료");
		
		JTextArea txtArea = new JTextArea(); //글상자(제한x)
		JTextField txtfield = new JTextField(200); //글자 제한 수 지정(여기선 200자)
		
		JLabel label = new JLabel("시간 출력");
		int i=0;
		
	public void btnFunction() {//시작,종료 버튼 기능
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				String stringI = String.valueOf(i);
				txtArea.append(stringI); //txtarea로 글 보냄(String만 가능)
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//정지 기능
			}
		});
	}
	
	public void frameDefault() {//설정 적용 + 창 띄우기
		frame.setPreferredSize(new Dimension(500,200));//창크기 설정
		frame.setLocationRelativeTo(null);//가운데 띄우기
		Font font = new Font(null, Font.BOLD, 32);//폰트 생성
		label.setFont(font);//폰트와 라벨 연결시키기
		label.setHorizontalAlignment(JLabel.CENTER);//라벨 위치
		
		frame.pack(); //위에 것들 적용하기
		frame.setVisible(true); //창 띄우기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 프로세스 종료되기
	}
	
	public void panelFrame() {//패널 적용
		JPanel panel = new JPanel(); //패널
		JPanel btnpanel = new JPanel(); //버튼 패널
		
		btnFunction();
		
		panel.setLayout(new BorderLayout()); //패널로 레이아웃 설정
		btnpanel.add(btn);
		btnpanel.add(btn2);
		
		panel.add(label, BorderLayout.CENTER);
		panel.add(btnpanel, BorderLayout.SOUTH);
		panel.add(txtArea, BorderLayout.NORTH);
		
		frame.add(panel); //프레임에 패널 추가. 이걸 꼭 넣어야 패널 작동
		
		frameDefault();
		getTime();
	}
		
	public void containerFrame() {//컨테이너 적용
		Container container = frame.getContentPane();
		
		container.add(label);
		container.add(txtArea);
		
		container.setLayout(new BorderLayout()); //위치 세팅할 레이아웃 새로 만듬
		container.add(label, BorderLayout.CENTER); //라벨 위치
		container.add(txtArea, BorderLayout.NORTH);
		
		frameDefault();
		getTime();
	}
	
	public void getTime() {//시간 출력
		Timer timer = new Timer();
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
		Frame frame = new Frame();
		/*
		String timeString = timer.timer();
		
		while(true) {
			timeString = timer.timer();
			System.out.println(timeString);
			timer.sleep();
		}
		*/
		
		frame.panelFrame();
	}
}
