package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
/*
예외 상황
- 개발 의도와 다르게 동작하는 것들
종류
- 강제예외 : throw
- 예외전가 : throws
- 예외처리 : try, catch
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, result;
		System.out.print("수 입력: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		try {
			result = x/y;
			System.out.println("x/y = "+result);
		} catch (ArithmeticException e) {//처리할 에러 입력. 
			//ArithmeticException : 프로그램 종료됐을때
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); //에러 발생 근원지 찾아 단계별로 에러 출력
			e.getMessage(); //에러 메세지 출력
			e.toString(); //간단한 에러 메세지 확인
			
		} catch (InputMismatchException e) {
			// 타입이 다를때
			System.out.println("문자를 입력할 수 없습니다.");
			
		} catch (NullPointerException e) {
			// NullPointerException : null 레퍼런스 참조할때
			System.out.println("정보가 없습니다.");
		
		
		}finally {
			System.out.println("finally는 무조건 실행되는 구간");
		}
		System.out.println("다음 문장");
	}
}
