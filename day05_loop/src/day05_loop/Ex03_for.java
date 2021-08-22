package day05_loop;

import java.util.Iterator;

public class Ex03_for {
	public static void main(String[] args) {
		
		int a=1, b=2, c=3;
		System.out.println("¾îÂ¼±¸"+a+b+c);
		for(int i=1; i<=10; i++) {
			System.out.print("\n"+i+".\t");
			for(int y=1; y<=5; y++) {
				System.out.print(y);
				if(y<5) {
					System.out.print(", ");
				}
			}
		}
	}
}
