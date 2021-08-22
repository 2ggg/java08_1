package day05_loop;

public class Ex02_for {
	public static void main(String[] args) {
		int su=1, sum=0;
		//세미콜론만 들어가도 실행이 됨을 보여줌
		for(; su<=10; ) {
			sum+=su;
			su++;
			System.out.println(su);
			System.out.println(sum);
		}
		//영원히 반복됨
		for(; ; ) {
			System.out.println("실행");
		}
		
	}
}
