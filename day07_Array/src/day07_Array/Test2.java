package day07_Array;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[]=new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.print("Â¦¼ö, È¦¼ö ÀÔ·Â:");
		odd_even = scanner.next();
		
		for(int i=0; i<arr.length; i++) {
			if(!(odd_even.equals("Â¦¼ö")||odd_even.equals("È¦¼ö"))) {
				System.out.println("Àß ¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù");
				break;
			}
			int num=arr[i];
			if(odd_even.equals("Â¦¼ö")&&num%2==0) {
				System.out.println("Â¦¼ö:"+num);
			}else if(odd_even.equals("È¦¼ö")&&num%2==1) {
					System.out.println("È¦¼ö:"+num);
			}
		}
		
	}
}
