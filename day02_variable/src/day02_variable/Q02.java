package day02_variable;

import java.util.Scanner;

public class Q02 {
	
	private void rep() {
		//=를 여러개 출력하는 메소드
		for(int i=0; i<=10; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	private int sum(int a, int b, int c) {
		//점수 3개를 더하는 메소드
		int sum = 0;
		sum = a+b+c;
		return sum;
	}
	public static void main(String[] args) {
		int lang, eng, math;
		String name;
		Scanner scanner = new Scanner(System.in);
		Q02 q02 = new Q02();
		
		System.out.print("이름: ");
		name = scanner.next();
		System.out.print("국어: ");
		lang = scanner.nextInt();
		System.out.print("영어: ");
		eng = scanner.nextInt();
		System.out.print("수학: ");
		math = scanner.nextInt();
		
		q02.rep();
		System.out.println("이름: "+name);
		q02.rep();
		System.out.println("국어: "+lang);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		q02.rep();
		int sum = q02.sum(lang, eng, math);
		System.out.println("합계: "+sum);
		q02.rep();
	}
}
