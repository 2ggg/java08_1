package day16_overriding_interface;

public class Ex01_main {
	public static void main(String[] args) {
		/*
		overriding
		- ��ӹ��� �ڽ��� �޼ҵ��� ������ �����ϴ� ��
		����
		- �θ� �޼ҵ��� ���İ� �����ϰ� �ڽĸ޼ҵ带 ����� ��
			1) ��ȯŸ�� ���ƾ� ��
			2) �Ű������� ������ Ÿ���� ���ƾ� ��
			3) ���� �����ڰ� �θ�� ���ų� Ŀ�� ��
			- private < package < protected < public
		
		 */
		Ferrari ferrari = new Ferrari(0, 0);
		ferrari.speed();
	}
}
