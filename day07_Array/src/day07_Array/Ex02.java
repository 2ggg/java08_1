package day07_Array;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name[] = new String[3];
		
		for(int i=0; i<name.length; i++) {
			System.out.print(i+"��° �̸� �Է�:");
			name[i]=scanner.next();
		}
		for(int i=0; i<name.length; i++) {
			System.out.println(i+"��° �̸�:"+name[i]);
		}
	}
}
