package day10_classVariable;

public class Ex03_Mainclass {
/*
Ŭ���� ����
- ���α׷� ���۽� ����(�޸𸮿� �ö� ��)
- ��� ������ ��� ����(public)

�ν��Ͻ�(��ü) ����
- new�� �ν��Ͻ� ������ ��

��������
- Ư�� ���� �����Ǹ� �ش� �������� ��� ����
- �ش� ������ ���ӵ� �ִ� ������ ��� ����
 */
	public static void main(String[] args) {
		int cnt=0;//��������
		if(cnt==0) {
			int test=1000;//��������
			System.out.println(cnt);
			System.out.println(test);
		}
		
		Ex03_variable ex03 = new Ex03_variable();
		int a = ex03.variable01();
		ex03.variable02(a);
		
	}
}
