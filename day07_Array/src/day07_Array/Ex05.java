package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList food = new ArrayList();
		food.add("����");
		food.add("�ұ�");
		//food.add("����"+"�ұ�");
		food.add("���");
		food.add("���");
		System.out.println(food);
		System.out.print("ã�� �� �Է�: ");
		String n= scanner.next();
		System.out.println(n+" ��ġ "+food.indexOf(n));
		
		System.out.println("������ ��ġ>");
		int num = scanner.nextInt();
		System.out.println("������ ��>");
		n=scanner.next();
		System.out.println("���� ��\n"+food);
		food.set(num, n);
		System.out.println("���� ��\n"+food);
		
	}
}
