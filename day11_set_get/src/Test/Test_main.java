package Test;

import java.util.Scanner;

public class Test_main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Test_set_get test = new Test_set_get();
		int select;
		boolean a=true;
		while(a) {
			System.out.println("1.�α���\n2.����\n3.�α׾ƿ�\n>>>");
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
				System.out.println("�����մϴ�.");;
				a=false;
				break;

			default:
				break;
			}
		}
	}
}
