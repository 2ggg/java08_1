package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex04 {
	public static void main(String[] args) {
		//JFrame â�� ��� �� �ִ� ��ɾ�
		JFrame frame = new JFrame("TEST"); //����
		Container container = frame.getContentPane(); //�⺻������ ����ִ� �ٴ�
		JLabel label = new JLabel("Hello GUI"); //�� ���� �Է�
		JPanel panel = new JPanel(); //������Ʈ���� ����ȭ(����)
		panel.add(new JLabel("Welcome"));
		
		container.add(label); //���� �߰��ϱ�
		
		frame.setLocationRelativeTo(null);//â ��� ��ġ ����1. null�� �θ� ȭ�� ����� ��
		//frame.setLocation(1000,200); //â�� �� ��ġ ����2
		//frame.setResizable(false);//false�϶�, â ũ�� ���� �Ұ�
		frame.setPreferredSize(new Dimension(500,200)); //â(������) ũ�� ����
		frame.pack(); //���� �͵��� �����ض�
		
		Font font = new Font(null, Font.ITALIC, 32); //��Ʈ�� (�۲�, ��Ÿ��, ũ��) ����
		label.setFont(font); //��Ʈ ����
		label.setHorizontalAlignment(JLabel.CENTER); //â ���� ��Ʈ ��ġ ����
		
		frame.setVisible(true); //â ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�� ������ ���μ����� �����
		
		label.setText("�ȳ��ϼ���");//���� ����
		
		for(int i=0; i<=100; i++) {
			label.setText(i+"�ݰ�����"); //�̷� �͵� ����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
