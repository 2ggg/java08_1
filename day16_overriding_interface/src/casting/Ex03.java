package casting;

import java.util.ArrayList;

class BBB{
	public void bbb() {
		
	}
}
class AAA extends BBB{
	public String getText() {return "AAAŬ����";}
}
public class Ex03 {
	public static void main(String[] args) {
		Object aaa = new AAA(); //�θ�: object
		AAA aaa2 = (AAA)aaa; //
		aaa2.getText();
		
		ArrayList arr = new ArrayList(); //�θ�
		arr.add("test"); //�θ� ���� �ִ� add��� ���
		arr.get(0); //�θ� ���� �ִ� get�̶�� ���
		String string = (String)arr.get(0);
		//�θ�(ArrayList)�� �ڽ�(String)�� ��ȯ�� ��
	}
}
