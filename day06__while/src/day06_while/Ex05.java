package day06_while;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.�� 2��. 3.����");
			int select = scanner.nextInt();
			switch (select) {
			case 1:System.out.println("��");	
				break;
			case 2:System.out.println("��");
				break;
			case 3: System.out.println("����");
				System.exit(1);//��������
				
			}
		}
	}
	
}
