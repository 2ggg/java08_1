package day05_loop;

public class Q01 {
	public static void main(String[] args) {
		//1. hello 4�� ���
		for(int i=1; i<=4; i++) {
			System.out.println("hello");
		}
		
		//2. 1~100���� �� �� �� ���� 528�϶� i �� ���
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			System.out.println(sum+"/"+i);
			if (sum==528) {
				break;
			}
		}
		
		//3. 1~25���� �����ϵ� ��� tab�� �ְ�, 5���� ���� �ٷ� ���� ���·� ���
		for(int i=1; i<=25; i++) {
			System.out.print(i+"\t");
			if(i%5==0) {
				System.out.println();
			}
		}
		
		
	}
}
