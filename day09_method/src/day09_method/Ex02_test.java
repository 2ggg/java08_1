package day09_method;

import java.util.Scanner;

public class Ex02_test {
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
		
		Ex02 ex02 = new Ex02();
		System.out.println(ex02.test1(1,2));
		
		ex02.test2(1);
		String s = ex02.test3();
		System.out.println(s);
		
		ex02.reverse();
	}
}
