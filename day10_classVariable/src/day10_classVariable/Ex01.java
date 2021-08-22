package day10_classVariable;

public class Ex01 {
/*
오버로딩
- 메소드 이름을 동일하게 만드는 것
- 이름이 같아 서로 다른 메소드로 인식하기 위해
매개변수(아규먼트)의 개수나 타입(자료형)이 달라야 함

 */
	public static void main(String[] args) {
		Ex01_overloading ex01 = new Ex01_overloading();
		System.out.println(ex01.sumFunc(10,20));
		System.out.println(ex01.SumFunc(10,20,30));
		System.out.println(ex01.sumFunc(10.2,20));
		System.out.println(ex01.sumFunc("안녕하세요","감사해요"));
	}
}
