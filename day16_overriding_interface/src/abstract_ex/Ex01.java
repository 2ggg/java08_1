package abstract_ex;

abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num = num;
		
	}
	public abstract void combo(); 
	//�ʿ��Ҷ� Ŀ�����ؼ� ����� �̸��� �����ִ� ��. �̷��� ��ü�� ���� �޼ҵ��� abstract�� �߻�ȭ�Ѵٰ� ��
}
class NewAbstract extends Abstract{
	@Override
	public void combo() {//�������̵�� ǥ���� ������
		System.out.println(num+"�� �޺� ����");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		
	}
}
