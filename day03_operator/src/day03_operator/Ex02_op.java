package day03_operator;

public class Ex02_op {

	public static void main(String[] args) {
		/*
		 ���� ���� ������
		 a=10;
		 a=a+3; => a+=3;
		 a=a*3; => a*=3;
		 */
		int a,b;
		a=b=5;
		System.out.println(a+=1);
		System.out.println(a-=1);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
	}

}
