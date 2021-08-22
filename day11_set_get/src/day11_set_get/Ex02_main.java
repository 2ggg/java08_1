package day11_set_get;

import java.util.Scanner;

public class Ex02_main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ex02_this ex02 = new Ex02_this();
		System.out.println("³ªÀÌ´Â?");
		ex02.age = scanner.nextInt();
		ex02.agefunc(ex02.age);
		ex02.printAge();
	}
}
