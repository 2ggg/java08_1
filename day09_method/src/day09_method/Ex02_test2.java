package day09_method;

import java.util.Scanner;

public class Ex02_test2 {
/*
int ��ȯŸ��
test �޼ҵ�
int n �Ű�����(arg)
public int test(int n){
	��� �ڵ� ����
	return n; //�������� ������. �޼ҵ� ������ ���
}
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Ex02 ex02 = new Ex02();
		ex02.test(1, 2);
	}
}
