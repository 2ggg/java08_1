package day04_If;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String home="", company ="";
		
		while(true) {
			System.out.println("1. �츮�� ���");
			System.out.println("2. ȸ�� ���");
			System.out.println("3. ��� ����");
			
			System.out.print("����>>");
			int select = scanner.nextInt();
			
			
			switch (select) {
			case 1:System.out.print("�츮��: ");
				home= scanner.next();break;
			case 2:System.out.print("ȸ��: ");
				company = scanner.next();break;
			case 3:System.out.println("�츮��: "+home+"\nȸ��: "+company);break;
	
			default:System.out.println("1,2,3 �߿� �ٽ� �������ּ���");break;
			}
			
			/*
			if(select==1) {
				System.out.print("�츮��: ");
				home= scanner.next();
			}else if(select==2) {
				System.out.print("ȸ��: ");
				company = scanner.next();
			}else if(select==3) {
				System.out.println("�츮��: "+home+"\nȸ��: "+company);
			}else {
				System.out.println("1,2,3 �߿� �ٽ� �������ּ���");
				break;
			}*/
		}
		
		
	}
}
