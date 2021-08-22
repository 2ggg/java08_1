package day03_if;

import java.util.Scanner;

public class Ex08_if {
	public static void main(String[] args) {
		/*
		 제어문 : 프로그램 흐름 제어
		 if(조건식){
		 	조건식이 참일때 실행
		 }else if(조건식2){
		 	조건식2가 참일때 실행
		 }else{
		 	모두 거짓일 경우 실행
		 }
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 쉬운 게임");
		System.out.println("2. 어려운 게임");
		System.out.println("3. 종료");
		System.out.print(">>>");
		int num = sc.nextInt();
		if(num==1) {
			System.out.println("쉬운 게임 시작");
		}else if(num==2) {
			System.out.println("어려운 게임 시작");
		}else {
			System.out.println("게임을 종료합니다.");
		}
	}
}
