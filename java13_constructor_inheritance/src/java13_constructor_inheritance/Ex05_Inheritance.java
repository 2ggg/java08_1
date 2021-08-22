package java13_constructor_inheritance;

class Calc01{
	public Calc01(String s) {
		System.out.println(s + "부모 계산기");
	}
	public void disply() {
		System.out.println("계산기");
	}
}
class Computer extends Calc01{
	public Computer() {
		super("값 전달");
	}
	public void disply() {
		System.out.println("컴퓨터");
	}
	public void print() {
		System.out.println("자식 계산기");
	}
}

public class Ex05_Inheritance {

	public static void main(String[] args) {
		/*
		 상속
		 - Extends
		 - 새로운 기능 추가
		 // 부모가 먼저 실행된 후 자식클래스 실행
		 */
		Calc01 cal = new Calc01("몰라 ");
		Computer com = new Computer();
		com.disply(); // 자식클래스에 없다면 (extends된)부모클래스에 있는 걸로 대체됨
		com.print();
	}
}
