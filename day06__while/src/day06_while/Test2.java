package day06_while;

public class Test2 {
//첫 날 1원, 다음날부터 전날의 2배씩 증가한 금액을 예금
//30일째에 예금해야 하는 금액을 구하자
//5억 얼마
	public static void main(String[] args) {
		int  cnt=1;
		long won=1, sum=0;
		while(cnt<=30) {
			sum+=won;
			System.out.print(cnt+"일차 예금 금액: "+won);
			System.out.println("/ 총: "+sum+"원");
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
