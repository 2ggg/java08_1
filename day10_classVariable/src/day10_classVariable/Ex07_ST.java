package day10_classVariable;

import java.util.Scanner;

public class Ex07_ST {
	public int age; public String name;
	
	public void display() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸� �Է�");
		name=scanner.next();
		System.out.println("���� �Է�");
		age = scanner.nextInt();
		print_(); //���� Ŭ���� ������ ��ü ���� ���� ȣ�� ����
	}
	public void print_() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
}
