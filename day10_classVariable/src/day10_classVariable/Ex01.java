package day10_classVariable;

public class Ex01 {
/*
�����ε�
- �޼ҵ� �̸��� �����ϰ� ����� ��
- �̸��� ���� ���� �ٸ� �޼ҵ�� �ν��ϱ� ����
�Ű�����(�ƱԸ�Ʈ)�� ������ Ÿ��(�ڷ���)�� �޶�� ��

 */
	public static void main(String[] args) {
		Ex01_overloading ex01 = new Ex01_overloading();
		System.out.println(ex01.sumFunc(10,20));
		System.out.println(ex01.SumFunc(10,20,30));
		System.out.println(ex01.sumFunc(10.2,20));
		System.out.println(ex01.sumFunc("�ȳ��ϼ���","�����ؿ�"));
	}
}
