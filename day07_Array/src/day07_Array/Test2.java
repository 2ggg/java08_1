package day07_Array;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[]=new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.print("¦��, Ȧ�� �Է�:");
		odd_even = scanner.next();
		
		for(int i=0; i<arr.length; i++) {
			if(!(odd_even.equals("¦��")||odd_even.equals("Ȧ��"))) {
				System.out.println("�� �� �Է��ϼ̽��ϴ�");
				break;
			}
			int num=arr[i];
			if(odd_even.equals("¦��")&&num%2==0) {
				System.out.println("¦��:"+num);
			}else if(odd_even.equals("Ȧ��")&&num%2==1) {
					System.out.println("Ȧ��:"+num);
			}
		}
		
	}
}
