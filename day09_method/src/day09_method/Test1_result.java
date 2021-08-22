package day09_method;

import java.util.Scanner;

public class Test1_result {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Test1 test1 = new Test1();
		
		//1번 두 수 입력, 큰 수 출력
		System.out.println("두 수 입력, 큰 수 출력");
		test1.n1=test1.한수입력();
		test1.n2=test1.한수입력();
		test1.큰수판별(test1.n1, test1.n2);
		
		//2번 수 입력받아 짝,홀 판별
		System.out.println("\n수 입력받아 짝,홀 판별");
		test1.n = test1.한수입력();
		test1.s = test1.짝홀결과(test1.n);
		System.out.println(test1.s);
		
		//3번 3의 배수 판별 main에서 3의 배수만 출력
		System.out.println("\n3의 배수 판별 main에서 3의 배수만 출력");
		//test1.n = test1.한수입력();
		int result = test1.배수3(test1.n);
		if(result!=0) {
			System.out.println(result+"는 3의 배수");
		}else {
			System.out.println(test1.n+"는 3의 배수 아님");
		}
		//4번 소수 판별
		System.out.println("\n소수 판별");
		//test1.n = test1.한수입력();
		
		
		//5번 절대값 구하기
		System.out.println("\n절대값 구함");
		//test1.n = test1.한수입력();
		test1.절대값(test1.n);
		System.out.println("절대값: "+test1.n);
		
		//6번 숫자가 거꾸로 출력되게 함
		System.out.println("숫자가 거꾸로 출력되게 함");
		
	}
}
