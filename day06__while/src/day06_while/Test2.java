package day06_while;

public class Test2 {
//ù �� 1��, ���������� ������ 2�辿 ������ �ݾ��� ����
//30��°�� �����ؾ� �ϴ� �ݾ��� ������
//5�� ��
	public static void main(String[] args) {
		int  cnt=1;
		long won=1, sum=0;
		while(cnt<=30) {
			sum+=won;
			System.out.print(cnt+"���� ���� �ݾ�: "+won);
			System.out.println("/ ��: "+sum+"��");
			cnt++;
			won=won*2;
		}
		won=1; sum=0;
		for(int day=1; day<=30; day++) {
			if(day==1) {
				won =1;
			}else {
				won*=2;
			}
			System.out.println(day+":"+won);
		}
	}
}
