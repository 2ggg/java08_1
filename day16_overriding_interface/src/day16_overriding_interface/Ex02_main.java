package day16_overriding_interface;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println();
	}
	@Override //�θ� �����Ŷ� �Ȱ��� �� ����� ��������� �ٲٴ� ��
	public Object get(int i) {
		return "���� ���� get���";
	}
}
 class BB{//BB�� �����ϴ� ���� �Ұ���. ��ӵ� �Ұ���
	String s = new String();
	String ss;
	public void bb() {
		System.out.println("BB�� bb ���");
	}
}
class CC extends BB{
	BB b = new BB();
	
	public void bb() {
		b.bb();
		System.out.println("CC�� bb ���");
	}
}
public class Ex02_main {
	public static void main(String[] args) {
		AA a = new AA();
		a.add("�ȳ��ϼ���");
		System.out.println(a.get(0));
		
		//ArrayList arr = new ArrayList(); �̰Ͱ� ����
	}
}
