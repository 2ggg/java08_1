package day01;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println(100+200);
		System.out.println("문자열"+100);
		System.out.println("문자열"+100+500); //문자열로 인식
		System.out.println("문자열"+(100+500)); //괄호로 분류해야 계산됨
		System.out.println("100"+100+500);
	}

}
