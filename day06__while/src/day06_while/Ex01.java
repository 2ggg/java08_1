package day06_while;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 while(조건식){
		 	실행문;
		 }
		 */
		int i=1;
		int sum=0;
		//for(; i<=10; ){
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1~10까지 합: "+sum);
	}
}
