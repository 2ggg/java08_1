package abstract_ex;

abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num = num;
		
	}
	public abstract void combo(); 
	//필요할때 커스텀해서 쓰라고 이름만 지어주는 것. 이렇게 실체가 없는 메소드을 abstract로 추상화한다고 함
}
class NewAbstract extends Abstract{
	@Override
	public void combo() {//오버라이드로 표현해 재정의
		System.out.println(num+"단 콤보 공격");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		
	}
}
