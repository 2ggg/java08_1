package day09_method;

import java.util.Scanner;

public class Test1_result {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Test1 test1 = new Test1();
		
		//1�� �� �� �Է�, ū �� ���
		System.out.println("�� �� �Է�, ū �� ���");
		test1.n1=test1.�Ѽ��Է�();
		test1.n2=test1.�Ѽ��Է�();
		test1.ū���Ǻ�(test1.n1, test1.n2);
		
		//2�� �� �Է¹޾� ¦,Ȧ �Ǻ�
		System.out.println("\n�� �Է¹޾� ¦,Ȧ �Ǻ�");
		test1.n = test1.�Ѽ��Է�();
		test1.s = test1.¦Ȧ���(test1.n);
		System.out.println(test1.s);
		
		//3�� 3�� ��� �Ǻ� main���� 3�� ����� ���
		System.out.println("\n3�� ��� �Ǻ� main���� 3�� ����� ���");
		//test1.n = test1.�Ѽ��Է�();
		int result = test1.���3(test1.n);
		if(result!=0) {
			System.out.println(result+"�� 3�� ���");
		}else {
			System.out.println(test1.n+"�� 3�� ��� �ƴ�");
		}
		//4�� �Ҽ� �Ǻ�
		System.out.println("\n�Ҽ� �Ǻ�");
		//test1.n = test1.�Ѽ��Է�();
		
		
		//5�� ���밪 ���ϱ�
		System.out.println("\n���밪 ����");
		//test1.n = test1.�Ѽ��Է�();
		test1.���밪(test1.n);
		System.out.println("���밪: "+test1.n);
		
		//6�� ���ڰ� �Ųٷ� ��µǰ� ��
		System.out.println("���ڰ� �Ųٷ� ��µǰ� ��");
		
	}
}
