package day11_set_get;

public class Ex01_mainClass {
/*
this 클래스 자기 자신의 위치 정보를 의미
멤버 메소드를 만들면 자동으로 생성
 */
	public static void main(String[] args) {
		Ex01_this ex01 = new Ex01_this();
		Ex01_this ex01_ = ex01;
		System.out.println("ex: "+ex01);
		ex01.a=777;
		ex01.func01(); ex01.func02();
	}
}
