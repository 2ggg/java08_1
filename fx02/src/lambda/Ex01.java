package lambda;
interface Lambda01{
	public void lam();//추상화. 꼭 람다식의 메소드는 하나여야 함
}
class Test01 implements Lambda01{
	@Override
	//부모에 존재하니까 오버라이드
	public void lam() {
		System.out.println("람다01 실행");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 test01 = new Test01();
		test01.lam();
		//
		Lambda01 lambda01 = new Lambda01() {//추상화돼있어서 실체화시켜야함
			@Override
			public void lam() {
				System.out.println("인터페이스 객체 생성");
			}
		};
		lambda01.lam();
		//같음
		Lambda01 lam2=()-> System.out.println("인터페이스 객체 생성");
		lam2.lam();
	}
}
