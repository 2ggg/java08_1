package day15_Thread;

class A01 extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("A01: "+i);
		}
	}
}
class B01 extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("B01: "+i);
		}
	}
	
}
public class Ex01 {
/*
 * Thread
- 프로그램을 동작시키기 위한 최소 단위
- 동작 중인 프로그램을 process라 함
 */
	public static void main(String[] args) {
		//스레드가 하나이기 때문에 한 문장이 모두 끝난 다음에 다음 문장을 실행할 수 있음.
		//Thread를 상속 시킨 클래스에 스레드가 하나 만들어진다.
		//여러개의 스레드가 마치 동시에 실행되는 것처럼 번갈아가며 실행되는 걸 볼 수 있다.
		A01 a = new A01();
		B01 b = new B01();
		
		
		a.setDaemon(true);//메인이 종료하면 스레드를 종료시키는 명령어. 컴퓨터 처리속도에 따라 종료속도가 다름
		b.setDaemon(true);
		
		a.start();//스레드 실행 명령어. a와b를 번갈아가며 실행한다.
		b.start();
		
		System.out.println("프로그램 종료합니다.");
		System.out.println("프로그램 종료합니다.");
		System.out.println("프로그램 종료합니다.");
	}
}
