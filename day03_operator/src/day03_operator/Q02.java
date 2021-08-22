package day03_operator;

import java.util.Scanner;

public class Q02 {
private void result(int num) {
	
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수 입력:");
		int a = scanner.nextInt();
		String numResult = (a%3==0)?"=짝수":"=3의 배수가 아님";
		System.out.println(a+numResult);
		
		System.out.print("두 수 입력:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		numResult = (num1>num2)?"num1이 num2보다 크다":"num1이 num2보다 작다";
		System.out.println("num1:"+num1+", num2:"+num2);
		System.out.println(numResult);
	}
}
