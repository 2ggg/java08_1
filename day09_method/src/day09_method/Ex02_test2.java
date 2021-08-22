package day09_method;

import java.util.Scanner;

public class Ex02_test2 {
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
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Ex02 ex02 = new Ex02();
		ex02.test(1, 2);
	}
}
