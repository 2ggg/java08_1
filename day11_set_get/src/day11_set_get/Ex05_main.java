package day11_set_get;

import java.util.Scanner;

public class Ex05_main {
/*
��ü ���� �� ���� ���� 
 */
	public static void main(String[] args) {
		int k=100, e=90, m=80, sum; 
		double avg;
		//��ü ���� �� �� ���� ����, ����϶�
		Ex05_set_get ex05 = new Ex05_set_get();
		ex05.setKor(k); ex05.setEng(e); ex05.setMath(m);
		ex05.setSum();
		sum=ex05.getSum();
		ex05.setAvg();
		avg= ex05.getAvg();
		
		System.out.println("�� "+sum+"��, ����� "+avg);
		
		
	}
}
