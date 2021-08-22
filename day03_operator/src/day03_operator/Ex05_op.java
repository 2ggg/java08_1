package day03_operator;

public class Ex05_op {
	public static void main(String[] args) {
		/*
		 a++/++a : 출력 후 a+1 / a+1 후 출력
		 a--/--a : 출력 후 a-1 / a-1 후 출력
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
