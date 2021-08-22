package day10_classVariable;
class User1{
	public Ex06_final userEx06_final = new Ex06_final();
	public void func1() {
		System.out.println("korea:"+userEx06_final.koreaa);
	}
}
class User2{
	public Ex06_final userEx06_final = new Ex06_final();
	public void func1() {
		System.out.println("korea:"+userEx06_final.koreaa);
	}
}
public class Ex06_main {
	public static void main(String[] args) {
		Ex06_final ex06 = new Ex06_final();
		ex06.func();
	}
}
