package day15_Thread;
class A{
	public void start() {//�θ� Ŭ�������� ����
		System.out.println("�θ� start ����");
		run();
	}
	public void run() {//�ڽİ� ��ħ
		System.out.println("�θ� run ����");
	}
	
}
class B extends A{
	public void run() {//�θ� �ִ� �޼ҵ�� ��ġ�� �ڽ� �޼ҵ尡 ������
		System.out.println("�ڽ� run ����");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		B b = new B();
		b.start(); //�ڽĿ� ���⶧���� �θ� Ŭ�������� ����.
	}
}
