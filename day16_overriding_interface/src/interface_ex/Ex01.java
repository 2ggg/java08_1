package interface_ex;
class A����{
	public void ����() {
		System.out.println("����");
	}
	public void ���() {
		System.out.println("���");
	}
}
class A����{
	public void �̻��ϰ���() {
		System.out.println("����Ⱑ �����մϴ�");
	}
	public void �̻��Ϲ��() {
		System.out.println("����Ⱑ ����մϴ�");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A���� army = new A����();
		army.����(); army.���();
		A���� air = new A����();
		air.�̻��ϰ���(); air.�̻��Ϲ��();
				
	}
}
