package casting;
class A01{
	public void getText() {
		System.out.println("A클래스");
	}
}
class B01 extends A01{
	public void getText() {
		System.out.println("B클래스");
	}
}
class C01 extends A01{
	public void getText() {
		System.out.println("C클래스");
	}
}
public class Ex01{
	
	public static void main(String[] args) {
		/*
		 * casting : 형 변환
		 up casting
		 - 자식 형태의 값 => 부모 형태로 변환하는 것
		 down casting
		 - 부모 형태 => 자식형태로 변환하는 것
		 
		 */
		B01 b01 = new B01();
		C01 c01 = new C01();
		
		b01.getText(); c01.getText();
		
		//up casting
		//같은 부모를 상속하고 있으므로 
		A01 a01 = new B01(); a01.getText();
		a01 = new C01();a01.getText();
		
	}
}
