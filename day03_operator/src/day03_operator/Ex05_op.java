package day03_operator;

public class Ex05_op {
	public static void main(String[] args) {
		/*
		 a++/++a : ��� �� a+1 / a+1 �� ���
		 a--/--a : ��� �� a-1 / a-1 �� ���
		 */
		int a,b,c;
		a=10;
		System.out.println(a);
		b=++a;
		System.out.println(b);
		a=10;
		c=a++;
		System.out.println(c);
	}
}
