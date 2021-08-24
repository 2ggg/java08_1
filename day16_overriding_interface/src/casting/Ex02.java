package casting;
class parents{
	public void familyName() {
		System.out.print("성씨 ");
	}
	public void name() {
		familyName();
		System.out.println("부모");
	}
}
class Daughter extends parents{
	public void name() {
		familyName(); //부모 메서드 불러오기
		System.out.println("딸");
	}
}
class Son extends parents{
	public void name() {
		familyName();
		System.out.println("아들");
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
