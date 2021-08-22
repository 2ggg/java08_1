package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String n1, n2;
		System.out.print("첫번째 값 입력:");
		n1 = scanner.next();
		System.out.println("두번째 값 입력:");
		n2 = scanner.next();
		System.out.println(n1 + n2);
		
		int age;
		String name;
		System.out.print("이름 입력: ");
		name = scanner.next();
		System.out.println("나이 입력:");
		age = scanner.nextInt();
		System.out.println("이름: "+name+"\n나이: "+age);
	}
}
