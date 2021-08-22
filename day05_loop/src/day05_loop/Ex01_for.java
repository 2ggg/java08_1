package day05_loop;

public class Ex01_for {
/*
 for(초기값; 조건식; 증감식){
 	종속문장
 }
 */
	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<10; i++) {
			sum++;
			System.out.println(sum);
		}
		//0부터 시작했을때 횟수 유념하기. 의도했던 횟수-1
	}
}
