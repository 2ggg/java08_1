package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class StInfoMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<StInfo> arr = new ArrayList<StInfo>();
		String name;
		int age;
		
		/*
		ArrayList<String> str = new ArrayList<String>();
		
		String str2 = "Test";
		str.add(str2);
		StInfo str3 = new StInfo();
		arr.add(str);
		arr.add(str2);
		*/
		while(true) {
            System.out.println("1.��� 2.Ȯ��");
            int num = scanner.nextInt();
            switch(num) {
            case 1:
                    StInfo s = new StInfo();
                    System.out.println("�̸� �Է�");
                    name = scanner.next();
                    System.out.println("���� �Է�");
                    age = scanner.nextInt();
                    
                    s.setAge(age); s.setName(name);
                    
                    arr.add(s);
                    System.out.println("��� �Ǿ����ϴ�");
                    break;
            case 2:
                    for(int i=0; i < arr.size() ; i++) {
                            StInfo ss = arr.get(i);
                            System.out.println("�̸� : "+ss.getName());
                            System.out.println("���� : "+ss.getAge());
                            System.out.println("--------------------");
                    }
                    break;
            }
    }
	}
}
