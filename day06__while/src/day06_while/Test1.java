package day06_while;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//1���� �Է��� ������ ��
		int num, sum=0, i=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� �Է�>>");
		num = scanner.nextInt();
		
		if(0<=num&&num<=10) {
			while(true) {
				i++;
				sum+=i;
				System.out.println("i="+i+"/ 1���� i���� ��="+sum);
				
				if(i==num) {
					break;
				}
			}
		}else {
			System.out.println("1~10 ���� ���� �Է��Ͻÿ�");
		}
		
	}
}
