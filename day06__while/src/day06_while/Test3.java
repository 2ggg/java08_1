package day06_while;

public class Test3 {
//1~1000까지 합을 구할때 
//순수한 3의 배수는 합에서 제외, 
//이때 5의 배수는 제외하지 않는다
//3만 얼마
	public static void main(String[] args) {
		int cnt=1, sum=0;
		while(1<=cnt&&cnt<=1000) {
			
			if(cnt%3==0&&cnt%5==0) {
				sum+=cnt;
				System.out.println(cnt+"/ 합:"+sum);
				cnt++;
				continue;
			}else if(cnt%3==0) {
				cnt++;
				continue;
			}
			
			sum+=cnt;
			System.out.println(cnt+"/ 합:"+sum);
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
