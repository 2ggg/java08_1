package day05_loop;

public class Ex02_for {
	public static void main(String[] args) {
		int su=1, sum=0;
		//�����ݷи� ���� ������ ���� ������
		for(; su<=10; ) {
			sum+=su;
			su++;
			System.out.println(su);
			System.out.println(sum);
		}
		//������ �ݺ���
		for(; ; ) {
			System.out.println("����");
		}
		
	}
}
