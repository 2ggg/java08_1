package day11_set_get;

import java.util.Scanner;

public class Ex05_main {
/*
객체 생성 후 각각 값을 
 */
	public static void main(String[] args) {
		int k=100, e=90, m=80, sum; 
		double avg;
		//객체 생성 후 각 값을 저장, 출력하라
		Ex05_set_get ex05 = new Ex05_set_get();
		ex05.setKor(k); ex05.setEng(e); ex05.setMath(m);
		ex05.setSum();
		sum=ex05.getSum();
		ex05.setAvg();
		avg= ex05.getAvg();
		
		System.out.println("총 "+sum+"점, 평균은 "+avg);
		
		
	}
}
