package day16_overriding_interface;

public class NewFarrari extends Ferrari {
	public NewFarrari(int ye, int speed) {
		super(ye, speed);
	}
	public void autoSystem() {
		System.out.println("�ڵ����� ���");
	}
	public void speed() {
		System.out.println(getYe()+"�� ��� �ӵ� "+getSpeed()+"km�Դϴ�.");
		System.out.println("�ͺ� ���� �۵�");
	}
	public static void main(String[] args) {
		
	}
}
