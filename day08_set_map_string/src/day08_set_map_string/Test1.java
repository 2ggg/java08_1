package day08_set_map_string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap manu = new HashMap();
		String key = null;
		int select, price = 0;
		
		boolean result = true;
		while(result) {
			System.out.println("1. �޴� ���");
			System.out.println("2. �޴��� ���� ����");
			System.out.println("3. ����");
			System.out.print("����>>");
			select = scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println("������ �޴�>>");
				key = scanner.next();
				System.out.print("����>>");
				price = scanner.nextInt();

				manu.put(key, price);
				System.out.println("��ϵǾ����ϴ�.");
				break;
				
			case 2:
				System.out.println(manu);
				Iterator it = new manu.iterator();
				while(true) {
					
				}
				
				System.out.print("1. ����\t2. ����\n>>");
				select = scanner.nextInt();
				
				if(select==1) {//����
					System.out.print("������ �޴�>>");
					key=scanner.next();
					if(manu.containsKey(key)) {//�޴��� ������
						System.out.print("���� ���� �Է�>>");
						price=scanner.nextInt();
						
						manu.replace(key, price);
						System.out.println("����Ǿ����ϴ�.");
					}else {
						System.out.println("�ش� �޴��� �������� �ʽ��ϴ�.");
					}
				}else if(select==2) {//����
					System.out.print("������ �޴�>>");
					key=scanner.next();
					if(manu.containsKey(key)) {//�޴��� ������
						manu.remove(key);
						System.out.println(key+"(��)�� �����Ǿ����ϴ�.");
					}else {
						System.out.println("�ش� �޴��� �������� �ʽ��ϴ�.");
					}
				}
				break;
				
			case 3:
				result = false;
				System.out.println("�����ϰڽ��ϴ�...");
				break;

			default:
				break;
			}
			
		}
		
		
	}
}
