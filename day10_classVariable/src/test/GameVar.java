package test;

import java.util.Scanner;

public class GameVar {
	public int select, userNum, ran, i=0, max=i;
	
	Scanner scanner = new Scanner(System.in);
	public void print() {
		while(true) {
			System.out.println("1.���� ����\n2.���� ����\n3.���� ����\n>>>>");
			select = scanner.nextInt();
			if(select==1) {
				ran = random();
				System.out.println(ran);
				updown();
			}else if(select==2) {
				System.out.println(i);
				if(max==0&&i==0) {
					System.out.println("���� ���� �ʾҽ��ϴ�.");
				}else if(max==0&&i>0) {
					max=i;
					System.out.println(max+"��");
				}else {
					System.out.println(max+"��");
				}
				
			}else if(select==3) {
				System.out.println("�����մϴ�");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	public int random() {
		ran = (int)(Math.random()*100);
		return ran;
	}
	public void updown() {
		
		boolean a = true;
		i=0;
		
		while(a) {
			System.out.print("���� �Է�>>>");
			userNum = scanner.nextInt();
			if (userNum>ran) {
				System.out.println("Down");
				i++;
			}else if(userNum<ran) {
				System.out.println("Up");
				i++;
			}else {
				System.out.println(i+"�� ���� ������ϴ�!");
				if(i<max) {
					max=i;
				}
				a=false;
				break;
			}
		}
		
	}
}
