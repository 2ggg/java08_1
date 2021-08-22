package day02_variable;

public class Ex01 {
	
	/*
	 변수 : 데이터 저장 공간
	 변수 작성 방법
	 - 자료형(type) 변수명;
	 - 자료형 변수명 = 값;
	 변수명 작성 규칙
	 - 되도록 영어
	 - 첫글자 : 소문자
	 - 합성어가 있으면 합성어 첫 글자 : 대글자
	 ex) numSum
	 
	 자료형
	 - 정수
	 short : 2byte(음수 양수 표현)
	 int : 4byte(음수 양수 표현)
	 - 실수
	 float : 4byte (값 뒤에 f 붙여야 함)
	 double : 8byte
	 - 문자
	 byte : 1byte(음수/양수)
	 char : 2byte(양수)
	 - 논리형
	 boolean : 1byte(true/false)
	 bit < byte < Kbyte < Mbyte < Gbyte < Tbyte
	 */
	public static void main(String[] args) {
		int age = 25;
		double weight = 50.0;
		double height = 158.5;
		System.out.println("나이는 "+age+"입니다.");
		System.out.println("몸무게는 "+weight+"kg 입니다.");
		System.out.println("키는 "+height+"cm 입니다.");

	}

}
