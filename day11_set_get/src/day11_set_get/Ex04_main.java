package day11_set_get;

import java.util.Scanner;

public class Ex04_main {
/*
��ü ���� �� setter ���� ���� �� ����
�� ���̷� ����ϴ� �޼ҵ� ���� �� age����
����� �� getter ���� main ���
??�� ���̴� ??�� �Դϴ�.
 */
	public static void main(String[] args) {
		Ex04_set_get ex04 = new Ex04_set_get();
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		System.out.println("�̸� �Է�"); name = scanner.next();
		ex04.setName(name);
		System.out.println("���� �Է�"); age=scanner.nextInt();
		ex04.setAge(age);
		age=ex04.agee(age);
		System.out.println(ex04.getName()+"�� �� ���̴�"+ex04.getAge()+"��");
	}
}
