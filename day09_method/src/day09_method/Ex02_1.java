package day09_method;

import java.util.Scanner;

public class Ex02_1 {
public void test() {
	System.out.println("�׽�Ʈ ��� ����");
	Scanner scanner = new Scanner(System.in);
	int num, su, sum;
	System.out.print("ù��° �� �Է�:");
	num=scanner.nextInt();
	System.out.print("�ι�° �� �Է�");
	su=scanner.nextInt();
	sum=num+su;
	System.out.println("�� ��:"+sum);
}
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01(); //��ü
		ex01.age = 12345;
		ex01.name = "�ȳ��ϼ���";
		System.out.println(ex01.name);
		System.out.println(ex01.age);
	}
}
