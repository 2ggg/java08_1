package day06_while;

public class Test4 {
//for(int i )
//1���� Ȧ������ ���� ���ϸ鼭 ���� 10000�� ���� �ʴ� ������ �� ���
//199 / 197
	public static void main(String[] args) {
		int num=0, sum=0;
		while(sum<10000) {
			num++;
			if(num%2==1) {
				sum+=num;
			}
		}
		System.out.println(num);
	}
}
