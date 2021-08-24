package day16_overriding_interface;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println();
	}
	@Override //부모가 가진거랑 똑같은 걸 만들고 내마음대로 바꾸는 것
	public Object get(int i) {
		return "내가 만든 get기능";
	}
}
 class BB{//BB를 수정하는 것이 불가능. 상속도 불가능
	String s = new String();
	String ss;
	public void bb() {
		System.out.println("BB의 bb 기능");
	}
}
class CC extends BB{
	BB b = new BB();
	
	public void bb() {
		b.bb();
		System.out.println("CC의 bb 기능");
	}
}
public class Ex02_main {
	public static void main(String[] args) {
		AA a = new AA();
		a.add("안녕하세요");
		System.out.println(a.get(0));
		
		//ArrayList arr = new ArrayList(); 이것과 같음
	}
}
