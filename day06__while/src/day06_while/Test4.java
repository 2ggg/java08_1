package day06_while;

public class Test4 {
//for(int i )
//1부터 홀수들의 합을 구하면서 합이 10000을 넘지 않는 마지막 수 출력
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
