package day09_method;

import java.util.Scanner;

public class Ex01 {
/*
class
- 사용자 정의 자료형(사용자가 만들고 싶은대로 만들어 사용)
- 재사용 가능

객체
- 변수 = 객체
- class 자료형으로 변수 만듬

메소드
- () 있는 기능
- 기능
- 메소드 또는 함수라 부름
- 클래스 내부에서 정의
- 클래스 없이 독립적으로 사용 가능

접근 제한자
- public : 외부, 내부 접근 모두 허용
- private : 외부 접근 제한. 내부에서만 사용 가능
- protected : 상속받은 자식
- default(접근제한자 X) : 동일한 패키지에서만 접근 가능
 */

public String name, addr, phNum, birthString;
public int age, stNum;

	public static void main(String[] args) {
		
		Ex01 ex01 = new Ex01(); //객체
		ex01.age = 12345;
		ex01.name = "안녕하세요";
		System.out.println(ex01.name);
		System.out.println(ex01.age);
	}
}
