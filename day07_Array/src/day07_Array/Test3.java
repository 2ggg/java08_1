package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList arrName = new ArrayList();
		ArrayList arrPhone = new ArrayList();
		
		while(true) {
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ã��");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.print("����>>");
			int select = scanner.nextInt();
			if(select==1) {
				System.out.print("�̸� �Է�: ");
				String name = scanner.next();
				
				System.out.print("����ó �Է�: ");
				String phone = scanner.next();
				
				if(arrName.contains(name)||arrPhone.contains(phone)) {
					System.out.println("�̹� �����մϴ�.");
				}else {
					arrName.add(name);
					arrPhone.add(phone);
					System.out.println("��ϵǾ����ϴ�.");
				}
				
			}else if(select==2) {
				System.out.print("ã�� �̸�: ");
				String search = scanner.next();
				boolean result = arrName.contains(search);
				if(result) {
					int num = arrName.indexOf(search);
					System.out.println(search+"�� ����ó: "+arrPhone.get(num));
				}else {
					System.out.println("������ �������� �ʽ��ϴ�.");
				}
			}else if(select==3) {
				System.out.print("������ �̸�: ");
				String rmv = scanner.next();
				boolean result = arrName.contains(rmv);
				if(result) {
					int num = arrName.indexOf(rmv);
					arrName.remove(rmv);
					arrPhone.remove(num);
					System.out.println(rmv+"�� ������ �����Ǿ����ϴ�.");
				}else {
					System.out.println("������ �������� �ʽ��ϴ�.");
				}
			}else if(select==4) {
				System.out.println(arrName);
				System.out.println(arrPhone);
			}else {
				System.out.println("�����մϴ�.");
				break;
			}
			
		}
	}
}
