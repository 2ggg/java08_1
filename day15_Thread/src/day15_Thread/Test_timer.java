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
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss");
		
		Calendar calendar = Calendar.getInstance();
		String timeString = dateFormat.format(calendar.getTime());
		return timeString;
		
		//System.out.println(dateFormat.format(date));
	}
}

class Frame extends Thread{
	public void frame() {
		Timer timer = new Timer();
		
		JFrame frame = new JFrame("Ÿ�̸�");
		Container container = frame.getContentPane();
		JButton btn = new JButton("����"); //��ư
		JButton btn2 = new JButton("����");
		JPanel btnpanel = new JPanel(); //�г�
		JTextArea txtArea = new JTextArea(); //�ۻ���(����x)
		//JTextField txtfield = new JTextField(200); //�� ���� �� ����
		
		frame.setPreferredSize(new Dimension(500,200));//âũ�� ����
		frame.setLocationRelativeTo(null);//��� ����
		
		JLabel label = new JLabel("�ð� ���");
		container.add(label);
		container.add(btn);
		container.add(btn2);
		container.add(txtArea);
		
		btnpanel.add(btn, BorderLayout.SOUTH);
		
		Font font = new Font(null, Font.BOLD, 32);//��Ʈ ����
		label.setFont(font);//��Ʈ�� �� �����Ű��
		label.setHorizontalAlignment(JLabel.CENTER);//��Ʈ ��ġ
		
		
		container.setLayout(new BorderLayout()); //��ġ ������ ���̾ƿ� ���� ����
		container.add(label, BorderLayout.CENTER); //�� ��ġ
		container.add(btn, BorderLayout.SOUTH); //��ư ��ġ
		container.add(btn2, BorderLayout.SOUTH);
		container.add(txtArea, BorderLayout.NORTH);
		
		frame.pack(); //���� �͵� �����ϱ�
		
		frame.setVisible(true); //â ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x������ ���μ��� ����Ǳ�
		
		String timeString = timer.timer();//�ð� ��������
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
