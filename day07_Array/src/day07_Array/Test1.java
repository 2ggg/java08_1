package day07_Array;

public class Test1 {
/*
반복문을 이용해 arr에 저장된 짝수 값, 홀수값을 따로 출력
 */
	public static void main(String[] args) {
		int arr[]=new int[] {10,54,13,17,25,30};
		for(int i=0; i<arr.length; i++) {
			int num=arr[i];
			
			if(num%2==0) {
				System.out.println("짝수:"+num);
			}else {
				System.out.println("홀수:"+num);
			}
		}
		
		
	}
}
