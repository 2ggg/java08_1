package day03_operator;

import java.util.Scanner;

public class Q02 {
private void result(int num) {
	
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� �Է�:");
		int a = scanner.nextInt();
		String numResult = (a%3==0)?"=¦��":"=3�� ����� �ƴ�";
		System.out.println(a+numResult);
		
		System.out.print("�� �� �Է�:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		numResult = (num1>num2)?"num1�� num2���� ũ��":"num1�� num2���� �۴�";
		System.out.println("num1:"+num1+", num2:"+num2);
		System.out.println(numResult);
	}
}
