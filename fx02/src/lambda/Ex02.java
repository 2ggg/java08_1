package lambda;
interface Lambda02{
	public void lam(Object o);
}
public class Ex02 {
	public static void main(String[] args) {
		Lambda02 lam01 = (aaa)->{//여기 aaa가 object o
			System.out.println(aaa+"출력");
			System.out.println("여러줄 사용 가능");
		};
		lam01.lam("안녕하세요");
	}
}
