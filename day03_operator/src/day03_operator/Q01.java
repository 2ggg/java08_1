package day03_operator;

import java.util.Scanner;

public class Q01 {
private void result(int num) {
	if(num%2==0) {
			System.out.println(num+"�� ¦��");
		}else {
			System.out.println(num+"�� Ȧ��");
		}
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��Ͻÿ�:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a="+a+"/b="+b);
		Q01 q01 = new Q01();
		q01.result(a);
		q01.result(b);

	}

}
