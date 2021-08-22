package java13_constructor_inheritance;
class Calc06{
	public int n = 12345;
	public String s = "부모 문자열";
	private String ss = "private 변수";
	protected String sss = "protected 변수";
	
	public Calc06(String s) {
		System.out.println(s+"부모 생성자");
	}
	public void test() {
		System.out.println("부모 test 실행");
	}
}
class Computer06 extends Calc06{
	public int n = 777;
	public Computer06(String ss) {
		super(ss);
		System.out.println(s+": 자식 생성자");
		test();
		System.out.println("this.n: "+n);
		System.out.println("super.n : "+super.n);
		System.out.println("super.s : "+s);
		//System.out.println("super private ss : "+super.ss);
		System.out.println("super private sss : "+super.sss);
		
	}
	
}
public class Ex06 {
	public static void main(String[] args) { //첫번째 실행
		Computer06 com = new Computer06("전달 / ");
	}
}
