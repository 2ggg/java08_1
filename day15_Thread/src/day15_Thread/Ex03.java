package day15_Thread;

import java.util.Scanner;

class A03 extends Thread{
	public void run() {
		for(;;) {//���ѹݺ�
			try {
				System.out.println("����� ���ƿ�");
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message = null;
		A03 a03 = new A03();
		a03.setDaemon(true);
		a03.start();
		for(;;) {
			System.out.println("���� �޼���: ");
			message = scanner.next();
			System.out.println(message);
			if(message.equals("exit"))
				break; //exit�� �Է��ؾ� ����
		}
		System.out.println("�����մϴ�.");
		System.out.println("�����մϴ�.");
		System.out.println("�����մϴ�.");
	}
}
