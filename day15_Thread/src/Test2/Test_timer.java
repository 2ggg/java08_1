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
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss");
		
		Calendar calendar = Calendar.getInstance();
		String timeString = dateFormat.format(calendar.getTime());
		return timeString;
		
		//System.out.println(dateFormat.format(date));
	}
}

class Frame extends Thread{
	
		JFrame frame = new JFrame("Ÿ�̸�");
		
		JButton btn = new JButton("����"); //��ư
		JButton btn2 = new JButton("����");
		
		JTextArea txtArea = new JTextArea(); //�ۻ���(����x)
		JTextField txtfield = new JTextField(200); //���� ���� �� ����(���⼱ 200��)
		
		JLabel label = new JLabel("�ð� ���");
		int i=0;
		
	public void btnFunction() {//����,���� ��ư ���
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				String stringI = String.valueOf(i);
				txtArea.append(stringI); //txtarea�� �� ����(String�� ����)
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//���� ���
			}
		});
	}
	
	public void frameDefault() {//���� ���� + â ����
		frame.setPreferredSize(new Dimension(500,200));//âũ�� ����
		frame.setLocationRelativeTo(null);//��� ����
		Font font = new Font(null, Font.BOLD, 32);//��Ʈ ����
		label.setFont(font);//��Ʈ�� �� �����Ű��
		label.setHorizontalAlignment(JLabel.CENTER);//�� ��ġ
		
		frame.pack(); //���� �͵� �����ϱ�
		frame.setVisible(true); //â ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x������ ���μ��� ����Ǳ�
	}
	
	public void panelFrame() {//�г� ����
		JPanel panel = new JPanel(); //�г�
		JPanel btnpanel = new JPanel(); //��ư �г�
		
		btnFunction();
		
		panel.setLayout(new BorderLayout()); //�гη� ���̾ƿ� ����
		btnpanel.add(btn);
		btnpanel.add(btn2);
		
		panel.add(label, BorderLayout.CENTER);
		panel.add(btnpanel, BorderLayout.SOUTH);
		panel.add(txtArea, BorderLayout.NORTH);
		
		frame.add(panel); //�����ӿ� �г� �߰�. �̰� �� �־�� �г� �۵�
		
		frameDefault();
		getTime();
	}
		
	public void containerFrame() {//�����̳� ����
		Container container = frame.getContentPane();
		
		container.add(label);
		container.add(txtArea);
		
		container.setLayout(new BorderLayout()); //��ġ ������ ���̾ƿ� ���� ����
		container.add(label, BorderLayout.CENTER); //�� ��ġ
		container.add(txtArea, BorderLayout.NORTH);
		
		frameDefault();
		getTime();
	}
	
	public void getTime() {//�ð� ���
		Timer timer = new Timer();
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
