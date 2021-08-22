package day10_classVariable;

import java.util.Scanner;

public class Ex07_ST {
	public int age; public String name;
	
	public void display() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 입력");
		name=scanner.next();
		System.out.println("나이 입력");
		age = scanner.nextInt();
		print_(); //같은 클래스 내에선 객체 생성 없이 호출 가능
	}
	public void print_() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}
