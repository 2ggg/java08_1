package casting;
class parents{
	public void familyName() {
		System.out.print("���� ");
	}
	public void name() {
		familyName();
		System.out.println("�θ�");
	}
}
class Daughter extends parents{
	public void name() {
		familyName(); //�θ� �޼��� �ҷ�����
		System.out.println("��");
	}
}
class Son extends parents{
	public void name() {
		familyName();
		System.out.println("�Ƶ�");
	}
}


public class Ex02 {
	public static void main(String[] args) {
		parents parents = new parents();
		parents.name();
		parents = new Daughter();
		parents.name();
		parents = new Son();
		parents.name();
	}
}
