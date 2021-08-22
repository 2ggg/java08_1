package java13_constructor_inheritance;
class Singleton04{
	private static Singleton04 sin;
	private Singleton04() {
		System.out.println("기본 생성자 실행");
	}
	public static Singleton04 getInstance() {
		
		sin = new Singleton04();
		System.out.println("sin : "+sin);
		if(sin ==null)
			sin=new Singleton04();
		return sin;
	}
}
public class Ex04_singleton {
	public static void main(String[] args) {
		Singleton04 sin04 = Singleton04.getInstance();
		System.out.println("sin01 : "+sin04);
		Singleton04 sin04_2 = Singleton04.getInstance();
		System.out.println("sin01 : "+sin04_2);
	}
}
