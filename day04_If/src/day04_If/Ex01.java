package day04_If;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 if(���ǽ�) : ���ΰ�� ���ӹ��� ����
		 else : if�� ������ �����̸� ������ ���ӹ��� ����
		 else�� if�� ���ӹ��� ������ ������ ���;� ������ ����X
		 */
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("�� �Է�: ");
		num = scanner.nextInt();
		if(num %3==0) {
			System.out.println(num+"�� 3�� ���");
		}else {
			System.out.println(num+"�� 3�� ��� �ƴ�");
		}
		System.out.println("���� ���� ���� ����");
	}

}
