package day11_set_get;

public class Ex01_mainClass {
/*
this Ŭ���� �ڱ� �ڽ��� ��ġ ������ �ǹ�
��� �޼ҵ带 ����� �ڵ����� ����
 */
	public static void main(String[] args) {
		Ex01_this ex01 = new Ex01_this();
		Ex01_this ex01_ = ex01;
		System.out.println("ex: "+ex01);
		ex01.a=777;
		ex01.func01(); ex01.func02();
	}
}
