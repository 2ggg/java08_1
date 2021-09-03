package day17;

import java.util.ArrayList;

class Test{
	private String test;
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	public void display() {
		System.out.println(test+": test 출력");
	}
	
}
public class Ex04 {
	public static void main(String[] args) {
		ArrayList<Test> tst = new ArrayList<Test>();
		Test t = new Test();
		t.setTest("문자열");
		tst.add(t);
		
		Test a = tst.get(0);
		a.display();
		
	}
}
