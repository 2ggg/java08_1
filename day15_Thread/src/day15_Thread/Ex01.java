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
- ���α׷��� ���۽�Ű�� ���� �ּ� ����
- ���� ���� ���α׷��� process�� ��
 */
	public static void main(String[] args) {
		//�����尡 �ϳ��̱� ������ �� ������ ��� ���� ������ ���� ������ ������ �� ����.
		//Thread�� ��� ��Ų Ŭ������ �����尡 �ϳ� ���������.
		//�������� �����尡 ��ġ ���ÿ� ����Ǵ� ��ó�� �����ư��� ����Ǵ� �� �� �� �ִ�.
		A01 a = new A01();
		B01 b = new B01();
		
		
		a.setDaemon(true);//������ �����ϸ� �����带 �����Ű�� ��ɾ�. ��ǻ�� ó���ӵ��� ���� ����ӵ��� �ٸ�
		b.setDaemon(true);
		
		a.start();//������ ���� ��ɾ�. a��b�� �����ư��� �����Ѵ�.
		b.start();
		
		System.out.println("���α׷� �����մϴ�.");
		System.out.println("���α׷� �����մϴ�.");
		System.out.println("���α׷� �����մϴ�.");
	}
}
