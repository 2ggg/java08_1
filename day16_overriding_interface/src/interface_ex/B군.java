package interface_ex;
class B지상군 implements A공방{
	public void attack() {
		System.out.println("B지상군 공격");
	}
	public void defense() {
		System.out.println("B지상군 방어");
	}
}
class B공군 implements A공방{
	public void attack() {
		System.out.println("B공군 공격");
	}
	public void defense() {
		System.out.println("B공군 방어");
	}
}

public class B군 {
	public static void main(String[] args) {
		//B지상군 지상군 = new B지상군();
		//B공군 공군 = new B공군();
		A공방 공방 = null;

		공방 = new B공군();
		공방.attack(); 공방.defense();
		공방 = new B지상군();
		공방.attack(); 공방.defense();
	}
}
