package day06_while;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i=0, sum=0;
		while(true) {
			System.out.println("�� �Է�(1~100)>>");
			i = scanner.nextInt();
			if(i>=10 && i<=20) {
				break;
			}
			System.out.println("�ٽ� �Է�");
		}
		for(int j=1; j<=i; j++) {
			sum+=j;
		}
		System.out.println("�Է¹��� ������ ��: "+sum);
	}
}
