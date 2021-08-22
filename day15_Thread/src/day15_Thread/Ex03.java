package day15_Thread;

import java.util.Scanner;

class A03 extends Thread{
	public void run() {
		for(;;) {//무한반복
			try {
				System.out.println("답글이 날아옴");
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
			System.out.println("전송 메세지: ");
			message = scanner.next();
			System.out.println(message);
			if(message.equals("exit"))
				break; //exit을 입력해야 멈춤
		}
		System.out.println("종료합니다.");
		System.out.println("종료합니다.");
		System.out.println("종료합니다.");
	}
}
