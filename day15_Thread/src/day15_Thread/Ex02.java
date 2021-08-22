package day15_Thread;
class A{
	public void start() {//부모 클래스에만 존재
		System.out.println("부모 start 실행");
		run();
	}
	public void run() {//자식과 겹침
		System.out.println("부모 run 실행");
	}
	
}
class B extends A{
	public void run() {//부모에 있는 메소드와 겹치면 자식 메소드가 실행함
		System.out.println("자식 run 실행");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		B b = new B();
		b.start(); //자식에 없기때문에 부모 클래스에서 실행.
	}
}
