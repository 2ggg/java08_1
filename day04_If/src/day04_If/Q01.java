package day04_If;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��¥ �Է�>>");
		int date = scanner.nextInt();
		int result = date%7;
		String day = "";
		
		if(date<=31) {
			switch (result) {
			case 1: day="������";break;
			case 2: day="ȭ����";break;
			case 3: day="������";break;
			case 4: day="�����";break;
			case 5: day="�ݿ���";break;
			case 6: day="�����";break;
			case 0: day="�Ͽ���";break;
			}
		}
		
		System.out.println(date+"���� "+day+"�Դϴ�.");
		
	}
}
