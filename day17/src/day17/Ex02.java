package day17;
class Print2<T>{//<T>�� ���̸� �ڷ����� ���������� �ٲ�. ���׸�
	public void test(T n1, T n2) {
		System.out.println(n1+","+n2);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Print2 dou = new Print2();
		dou.test(1.11, "abc"); //����ȯ�� ������ ����.
		Print2<String> str = new Print2<String>(); //���� ������ �� <>�� �־���
		dou.test("aa", "bb"); //<Ŭ���� Ÿ��>�� ����
		Print2<Integer> in = new Print2<Integer>();
		dou.test(10, 20);
		
		
	}
}
