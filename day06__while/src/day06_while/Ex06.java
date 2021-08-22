package day06_while;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("비교할 두 문자열 입력>>");
		String str1 = scanner.next();
		String str2 = scanner.next();
		int i = 12345;
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(String.valueOf(i).length());
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str1));
		
		String str3=null;
		System.out.println(str1.equals(str3));
	}
}
