package Test;

import java.util.Scanner;

public class Test_main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Test_set_get test = new Test_set_get();
		int select;
		boolean a=true;
		while(a) {
			System.out.println("1.로그인\n2.가입\n3.로그아웃\n>>>");
			select = scanner.nextInt();
			switch (select) {
			case 1:
				test.input();
				test.compare();
				break;
			case 2:
				test.change();
				break;
				
			case 3:
				System.out.println("종료합니다.");;
				a=false;
				break;

			default:
				break;
			}
		}
	}
}
