package casting;

import java.util.ArrayList;

class BBB{
	public void bbb() {
		
	}
}
class AAA extends BBB{
	public String getText() {return "AAA클래스";}
}
public class Ex03 {
	public static void main(String[] args) {
		Object aaa = new AAA(); //부모: object
		AAA aaa2 = (AAA)aaa; //
		aaa2.getText();
		
		ArrayList arr = new ArrayList(); //부모
		arr.add("test"); //부모가 갖고 있는 add라는 기능
		arr.get(0); //부모가 갖고 있는 get이라는 기능
		String string = (String)arr.get(0);
		//부모(ArrayList)를 자식(String)로 변환한 것
	}
}
