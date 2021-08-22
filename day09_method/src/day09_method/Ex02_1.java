package day09_method;

import java.util.Scanner;

public class Ex02_1 {
public void test() {
	System.out.println("테스트 기능 구현");
	Scanner scanner = new Scanner(System.in);
	int num, su, sum;
	System.out.print("첫번째 수 입력:");
	num=scanner.nextInt();
	System.out.print("두번째 수 입력");
	su=scanner.nextInt();
	sum=num+su;
	System.out.println("두 합:"+sum);
}
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01(); //객체
		ex01.age = 12345;
		ex01.name = "안녕하세요";
		System.out.println(ex01.name);
		System.out.println(ex01.age);
	}
}
