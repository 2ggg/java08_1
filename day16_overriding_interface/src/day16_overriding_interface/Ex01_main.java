package day16_overriding_interface;

public class Ex01_main {
	public static void main(String[] args) {
		/*
		overriding
		- 상속받은 자식의 메소드의 내용을 변경하는 것
		조건
		- 부모 메소드의 형식과 동일하게 자식메소드를 만드는 것
			1) 반환타입 같아야 함
			2) 매개변수의 개수와 타입이 같아야 함
			3) 접근 제한자가 부모와 같거나 커야 함
			- private < package < protected < public
		
		 */
		Ferrari ferrari = new Ferrari(0, 0);
		ferrari.speed();
	}
}
