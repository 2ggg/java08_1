package day03_if;

import java.util.Scanner;

public class Ex08_if {
	public static void main(String[] args) {
		/*
		 ��� : ���α׷� �帧 ����
		 if(���ǽ�){
		 	���ǽ��� ���϶� ����
		 }else if(���ǽ�2){
		 	���ǽ�2�� ���϶� ����
		 }else{
		 	��� ������ ��� ����
		 }
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ���� ����");
		System.out.println("2. ����� ����");
		System.out.println("3. ����");
		System.out.print(">>>");
		int num = sc.nextInt();
		if(num==1) {
			System.out.println("���� ���� ����");
		}else if(num==2) {
			System.out.println("����� ���� ����");
		}else {
			System.out.println("������ �����մϴ�.");
		}
	}
}
