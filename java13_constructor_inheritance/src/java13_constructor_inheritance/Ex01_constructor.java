package java13_constructor_inheritance;

class Constructor01{
	public Constructor01(){//������. �̰͵� �ϳ��� �޼ҵ�
		System.out.println("������ ����1");
	}
	public Constructor01(String s){//������. �̰͵� �ϳ��� �޼ҵ�
		System.out.println(s+": ������ ����2");
	}
	public void test(String s) {
		System.out.println(s+": test ����");
	}
}

public class Ex01_constructor {
/*
������
-���� �ʱ�ȭ �Ҷ� ���
-��ü ������ �� �ڵ� ȣ��
-���� �޼ҵ����·� �������� �ʾƵ� �ڵ����� ������ �Ҹ��ϰ� �Ǿ�����

������ �����
-Ŭ���� �̸��� �����ϰ� �����
-��ȯŸ��X

 */
	public static void main(String[] args) {
		Constructor01 constructor01 = new Constructor01();
		Constructor01 constructor02 = new Constructor01("������ �����");
		
		constructor01.test("�׽�Ʈ�� �ƹ��ų� �������");
		constructor02.test("��¼��");
	}
}
