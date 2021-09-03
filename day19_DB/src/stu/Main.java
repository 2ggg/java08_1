package stu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DBclass db = new DBclass();//��ü�� ����鼭 �ش� Ŭ���� �ڵ� ����
		int num;
		while(true) {
			System.out.println("1.��� 2.��ü���� 3.���� 4.����");
			num=scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("�й� �Է�>>");
				String stNum = scanner.next();
				System.out.println("�̸� �Է�>>");
				String name = scanner.next();
				System.out.println("���� �Է�>>");
				int age = scanner.nextInt();
				
				db.saveData(stNum, name, age);
				
				break;
			case 2:
				ArrayList<StudentDTO> list = db.getUsers();
				if(list.size()==0){
					System.out.println("����� �����Ͱ� �����ϴ�");
				}else {
					for(int i=0; i<list.size(); i++) {
						System.out.println("�й�: "+list.get(i).getStNum());
						System.out.println("�̸�: "+list.get(i).getName());
						System.out.println("����: "+list.get(i).getAge());
					}
				}
				break;

			default:
				break;
			}
		}
	}
}
