package day06_while;

public class Test3 {
//1~1000���� ���� ���Ҷ� 
//������ 3�� ����� �տ��� ����, 
//�̶� 5�� ����� �������� �ʴ´�
//3�� ��
	public static void main(String[] args) {
		int cnt=1, sum=0;
		while(1<=cnt&&cnt<=1000) {
			
			if(cnt%3==0&&cnt%5==0) {
				sum+=cnt;
				System.out.println(cnt+"/ ��:"+sum);
				cnt++;
				continue;
			}else if(cnt%3==0) {
				cnt++;
				continue;
			}
			
			sum+=cnt;
			System.out.println(cnt+"/ ��:"+sum);
			cnt++;
			
		}
		sum=0; int sum1=0;
		for(int i=1; i<=1000; i++) {
			if(i%3==0&&i%5!=0) {
				sum1+=i;
			}
			sum+=i;
				
			sum = sum-sum1;
		}
	}
}
