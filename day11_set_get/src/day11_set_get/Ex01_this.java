package day11_set_get;

public class Ex01_this {
	public int a=10;
	public void func01() {
		int a = 12345;
		
		System.out.println("01 a:"+a+this.a);
		System.out.println("this:"+this);
		
		this.func02();
		func02();
	}
	public void func02() {
		System.out.println("02 a:"+a);
	}
}
