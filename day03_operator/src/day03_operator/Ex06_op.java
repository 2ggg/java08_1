package day03_operator;

public class Ex06_op {
	public static void main(String[] args) {
		/*
		 ���׿�����(���ǿ�����)
		 	���� = (��)?"A"(true�� ��):"B"(false�� ��);
		 	�̸� ��������� A�� ������ true, B�� ������ false 
		 */
		int a = 8;
		String s = (a%2==0)?"¦��":"Ȧ��";
		System.out.println(s);
		
		a=9;
		s=(a%2==0)?"¦��":"Ȧ��";
		System.out.println(s);
	}
}
