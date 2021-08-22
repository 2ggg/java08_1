package day09_method;

import java.util.Scanner;

public class Ex02_test {
/*
int 반환타입
test 메소드
int n 매개변수(arg)
public int test(int n){
	기능 코드 구현
	return n; //마지막에 돌려줌. 메소드 끝날때 사용
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
