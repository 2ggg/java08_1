package day04_If;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1,2,3 �� ����>>");
		int select= scanner.nextInt();
		switch(select) {
		case 1:System.out.println("1����");break;
		case 2:System.out.println("2����");break;
		case 3:System.out.println("3����");break;
		default:System.out.println("1,2,3 ���� �ٸ� �� �Է�");
		}
	}
	
}
