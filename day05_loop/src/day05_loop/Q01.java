package day05_loop;

public class Q01 {
	public static void main(String[] args) {
		//1. hello 4번 출력
		for(int i=1; i<=4; i++) {
			System.out.println("hello");
		}
		
		//2. 1~100까지 합 중 그 합이 528일때 i 값 출력
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			System.out.println(sum+"/"+i);
			if (sum==528) {
				break;
			}
		}
		
		//3. 1~25까지 나열하되 모두 tab을 넣고, 5마다 다음 줄로 보낸 형태로 출력
		for(int i=1; i<=25; i++) {
			System.out.print(i+"\t");
			if(i%5==0) {
				System.out.println();
			}
		}
		
		
	}
}
