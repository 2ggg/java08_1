package casting;
class A01{
	public void getText() {
		System.out.println("AŬ����");
	}
}
class B01 extends A01{
	public void getText() {
		System.out.println("BŬ����");
	}
}
class C01 extends A01{
	public void getText() {
		System.out.println("CŬ����");
	}
}
public class Ex01{
	
	public static void main(String[] args) {
		/*
		 * casting : �� ��ȯ
		 up casting
		 - �ڽ� ������ �� => �θ� ���·� ��ȯ�ϴ� ��
		 down casting
		 - �θ� ���� => �ڽ����·� ��ȯ�ϴ� ��
		 
		 */
		B01 b01 = new B01();
		C01 c01 = new C01();
		
		b01.getText(); c01.getText();
		
		//up casting
		//���� �θ� ����ϰ� �����Ƿ� 
		A01 a01 = new B01(); a01.getText();
		a01 = new C01();a01.getText();
		
	}
}
