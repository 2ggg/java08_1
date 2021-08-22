package day04_If;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1,2,3 중 선택>>");
		int select= scanner.nextInt();
		switch(select) {
		case 1:System.out.println("1선택");break;
		case 2:System.out.println("2선택");break;
		case 3:System.out.println("3선택");break;
		default:System.out.println("1,2,3 제외 다른 값 입력");
		}
	}
	
}
