package day06_while;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.가 2나. 3.종료");
			int select = scanner.nextInt();
			switch (select) {
			case 1:System.out.println("가");	
				break;
			case 2:System.out.println("나");
				break;
			case 3: System.out.println("종료");
				System.exit(1);//강제종료
				
			}
		}
	}
	
}
