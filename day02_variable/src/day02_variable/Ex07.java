package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String n1, n2;
		System.out.print("ù��° �� �Է�:");
		n1 = scanner.next();
		System.out.println("�ι�° �� �Է�:");
		n2 = scanner.next();
		System.out.println(n1 + n2);
		
		int age;
		String name;
		System.out.print("�̸� �Է�: ");
		name = scanner.next();
		System.out.println("���� �Է�:");
		age = scanner.nextInt();
		System.out.println("�̸�: "+name+"\n����: "+age);
	}
}
