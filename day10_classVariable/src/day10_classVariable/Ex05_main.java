package day10_classVariable;

public class Ex05_main {
	public static void main(String[] args) {
		Ex05_variable ex05 = new Ex05_variable();
		ex05.cnt = 999;
		Ex05_variable.cnt = 888;
		System.out.println(Ex05_variable.cnt);
	}
}
