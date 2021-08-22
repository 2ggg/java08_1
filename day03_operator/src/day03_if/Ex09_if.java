package day03_if;

import java.util.Scanner;

public class Ex09_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력:");
		num = sc.nextInt();
		if(num>10) {
			System.out.println("종속 문장 실행");
		}
		System.out.println("다음 문장 실행");
	}
}
