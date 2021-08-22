package java13_constructor_inheritance;

import java.util.Scanner;

class constructor02{
	private int age;
	public constructor02(int age) {
		this.age = age-1;
	}
	public int getAge() {
		return age;
	}
}
public class Ex02_constructor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("나이 입력>>");
		int age = input.nextInt();
		constructor02 constructor02 = new constructor02(age);
		System.out.println("나이: "+constructor02.getAge());
	}
}
