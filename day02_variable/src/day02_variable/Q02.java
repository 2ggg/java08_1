package day02_variable;

import java.util.Scanner;

public class Q02 {
	
	private void rep() {
		//=�� ������ ����ϴ� �޼ҵ�
		for(int i=0; i<=10; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	private int sum(int a, int b, int c) {
		//���� 3���� ���ϴ� �޼ҵ�
		int sum = 0;
		sum = a+b+c;
		return sum;
	}
	public static void main(String[] args) {
		int lang, eng, math;
		String name;
		Scanner scanner = new Scanner(System.in);
		Q02 q02 = new Q02();
		
		System.out.print("�̸�: ");
		name = scanner.next();
		System.out.print("����: ");
		lang = scanner.nextInt();
		System.out.print("����: ");
		eng = scanner.nextInt();
		System.out.print("����: ");
		math = scanner.nextInt();
		
		q02.rep();
		System.out.println("�̸�: "+name);
		q02.rep();
		System.out.println("����: "+lang);
		System.out.println("����: "+eng);
		System.out.println("����: "+math);
		q02.rep();
		int sum = q02.sum(lang, eng, math);
		System.out.println("�հ�: "+sum);
		q02.rep();
	}
}
