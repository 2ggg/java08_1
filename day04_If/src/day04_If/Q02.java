package day04_If;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String home="", company ="";
		
		while(true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			
			System.out.print("선택>>");
			int select = scanner.nextInt();
			
			
			switch (select) {
			case 1:System.out.print("우리집: ");
				home= scanner.next();break;
			case 2:System.out.print("회사: ");
				company = scanner.next();break;
			case 3:System.out.println("우리집: "+home+"\n회사: "+company);break;
	
			default:System.out.println("1,2,3 중에 다시 선택해주세요");break;
			}
			
			/*
			if(select==1) {
				System.out.print("우리집: ");
				home= scanner.next();
			}else if(select==2) {
				System.out.print("회사: ");
				company = scanner.next();
			}else if(select==3) {
				System.out.println("우리집: "+home+"\n회사: "+company);
			}else {
				System.out.println("1,2,3 중에 다시 선택해주세요");
				break;
			}*/
		}
		
		
	}
}
