package java13_constructor_inheritance;
class Calc06{
	public int n = 12345;
	public String s = "�θ� ���ڿ�";
	private String ss = "private ����";
	protected String sss = "protected ����";
	
	public Calc06(String s) {
		System.out.println(s+"�θ� ������");
	}
	public void test() {
		System.out.println("�θ� test ����");
	}
}
class Computer06 extends Calc06{
	public int n = 777;
	public Computer06(String ss) {
		super(ss);
		System.out.println(s+": �ڽ� ������");
		test();
		System.out.println("this.n: "+n);
		System.out.println("super.n : "+super.n);
		System.out.println("super.s : "+s);
		//System.out.println("super private ss : "+super.ss);
		System.out.println("super private sss : "+super.sss);
		
	}
	
}
public class Ex06 {
	public static void main(String[] args) { //ù��° ����
		Computer06 com = new Computer06("���� / ");
	}
}
