package java13_constructor_inheritance;

class Calc01{
	public Calc01(String s) {
		System.out.println(s + "�θ� ����");
	}
	public void disply() {
		System.out.println("����");
	}
}
class Computer extends Calc01{
	public Computer() {
		super("�� ����");
	}
	public void disply() {
		System.out.println("��ǻ��");
	}
	public void print() {
		System.out.println("�ڽ� ����");
	}
}

public class Ex05_Inheritance {

	public static void main(String[] args) {
		/*
		 ���
		 - Extends
		 - ���ο� ��� �߰�
		 // �θ� ���� ����� �� �ڽ�Ŭ���� ����
		 */
		Calc01 cal = new Calc01("���� ");
		Computer com = new Computer();
		com.disply(); // �ڽ�Ŭ������ ���ٸ� (extends��)�θ�Ŭ������ �ִ� �ɷ� ��ü��
		com.print();
	}
}
