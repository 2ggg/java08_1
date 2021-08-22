package day06_while;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//1부터 입력한 수까지 합
		int num, sum=0, i=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("수 입력>>");
		num = scanner.nextInt();
		
		if(0<=num&&num<=10) {
			while(true) {
				i++;
				sum+=i;
				System.out.println("i="+i+"/ 1부터 i까지 합="+sum);
				
				if(i==num) {
					break;
				}
			}
		}else {
			System.out.println("1~10 사이 수만 입력하시오");
		}
		
	}
}
