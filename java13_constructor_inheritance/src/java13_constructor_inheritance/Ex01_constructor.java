package java13_constructor_inheritance;

class Constructor01{
	public Constructor01(){//생성자. 이것도 하나의 메소드
		System.out.println("생성자 실행1");
	}
	public Constructor01(String s){//생성자. 이것도 하나의 메소드
		System.out.println(s+": 생성자 실행2");
	}
	public void test(String s) {
		System.out.println(s+": test 실행");
	}
}

public class Ex01_constructor {
/*
생성자
-보통 초기화 할때 사용
-객체 생성될 때 자동 호출
-굳이 메소드형태로 만들어놓지 않아도 자동으로 생성후 소멸하게 되어있음

생성자 만들시
-클래스 이름과 동일하게 만든다
-반환타입X

 */
	public static void main(String[] args) {
		Constructor01 constructor01 = new Constructor01();
		Constructor01 constructor02 = new Constructor01("생성자 적어보기");
		
		constructor01.test("테스트로 아무거나 적어놓기");
		constructor02.test("어쩌구");
	}
}
