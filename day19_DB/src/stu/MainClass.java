package stu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
   public static void main(String[] args)  {
   		Scanner scanner = new Scanner(System.in);
       DBclass db = new DBclass();
       Scanner input = new Scanner(System.in);
       int num;
       while(true) {
          System.out.println("1.��� 2.��ü���� 3.���� 4.����");
          num = input.nextInt();
          switch(num) {
          case 1:
             System.out.println("�й� �Է�");
             String stNum = input.next();
             System.out.println("�̸� �Է�");
             String name = input.next();
             System.out.println("���� �Է�");
             int age = input.nextInt();
             
             //int result = db.saveData(stNum, name, age);
             int result = db.saveData2(stNum, name, age);
             if(result == 1) {
                     System.out.println("���������� ����");
             }else {
                     System.out.println("������ ���̵� �����մϴ�");
             }
             break;
          case 2:
          	ArrayList<StudentDTO> list = db.getUsers();
          	if(list.size()==0) {
          		System.out.println("����� �����Ͱ� �����ϴ�");
          	}else {
          		for(int i=0;i<list.size();i++) {
          			System.out.println("�й� : "+list.get(i).getStNum());
          			System.out.println("�̸� : "+list.get(i).getName());
          			System.out.println("���� : "+list.get(i).getAge());
          			System.out.println("---------------------------");
          		}
          	}
          	break;
          case 3:
          	String userNum = scanner.next();
          	int re = db.delete(userNum);
          	if() {
          		
          	}
          	break;
          case 4:
          	
          	break;
          }
           }
   }
}



