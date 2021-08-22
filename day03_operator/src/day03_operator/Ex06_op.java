package day03_operator;

public class Ex06_op {
	public static void main(String[] args) {
		/*
		 삼항연산자(조건연산자)
		 	변수 = (식)?"A"(true일 때):"B"(false일 때);
		 	이를 출력했을때 A가 나오면 true, B가 나오면 false 
		 */
		int a = 8;
		String s = (a%2==0)?"짝수":"홀수";
		System.out.println(s);
		
		a=9;
		s=(a%2==0)?"짝수":"홀수";
		System.out.println(s);
	}
}
