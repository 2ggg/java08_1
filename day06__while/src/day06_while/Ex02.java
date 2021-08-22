package day06_while;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i=0, sum=0;
		while(true) {
			System.out.println("수 입력(1~100)>>");
			i = scanner.nextInt();
			if(i>=10 && i<=20) {
				break;
			}
			System.out.println("다시 입력");
		}
		for(int j=1; j<=i; j++) {
			sum+=j;
		}
		System.out.println("입력받은 수까지 합: "+sum);
	}
}
