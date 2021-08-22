package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList food = new ArrayList();
		food.add("설탕");
		food.add("소금");
		//food.add("설탕"+"소금");
		food.add("라면");
		food.add("계란");
		System.out.println(food);
		System.out.print("찾을 값 입력: ");
		String n= scanner.next();
		System.out.println(n+" 위치 "+food.indexOf(n));
		
		System.out.println("변경할 위치>");
		int num = scanner.nextInt();
		System.out.println("변경할 값>");
		n=scanner.next();
		System.out.println("변경 전\n"+food);
		food.set(num, n);
		System.out.println("변경 후\n"+food);
		
	}
}
