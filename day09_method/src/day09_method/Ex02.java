package day09_method;

import java.util.Scanner;

public class Ex02 {
public int test1(int num1, int num2) {
	System.out.println("�׽�Ʈ ��� ����");
	int sum = num1+num2;
	return sum;
}
public void test2(int n) {
	if(n==1) {
		System.out.println("if");
	}else {
		System.out.println("else");
	}
	System.out.println("�޼ҵ� ����");
}
public String test3() {
	return "�ȳ��ϼ���";
}
public void display() {
	Scanner scanner = new Scanner(System.in);
	int n1=scanner.nextInt();
	int n2=scanner.nextInt();
	int sum=n1+n2;
	printSum(n1, n2, sum);
}
public int test(int n, int n2) { return n+n2;}
public void printSum(int n1,int n2, int s) {
	System.out.println(n1+"+"+n2+"="+s);
}

public void reverse() {
	Scanner scanner = new Scanner(System.in);
	int su=0, temp=0;
	System.out.println("�� �Է�");
	su=scanner.nextInt();
	while(true) {
		temp=su%10;
		su=su/10;
		System.out.print(temp+", ");
		if(su==0) {
			break;
		}
	}
}

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01(); //��ü
		ex01.age = 12345;
		ex01.name = "�ȳ��ϼ���";
		System.out.println(ex01.name);
		System.out.println(ex01.age);
	}
}
