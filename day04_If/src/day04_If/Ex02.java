package day04_If;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c,max=0,min=0;
		System.out.print("세 수 입력: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if(a>b) {
			max=a;
		}else if(a<b) {
			max=b;
		}else {
			max=a=b;
		}
		if (max<c) {
			max=c;
			System.out.println();
		}System.out.println("가장 큰 수는: "+max);

	}

}
