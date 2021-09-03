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
            System.out.println("1.등록 2.확인");
            int num = scanner.nextInt();
            switch(num) {
            case 1:
                    StInfo s = new StInfo();
                    System.out.println("이름 입력");
                    name = scanner.next();
                    System.out.println("나이 입력");
                    age = scanner.nextInt();
                    
                    s.setAge(age); s.setName(name);
                    
                    arr.add(s);
                    System.out.println("등록 되었습니다");
                    break;
            case 2:
                    for(int i=0; i < arr.size() ; i++) {
                            StInfo ss = arr.get(i);
                            System.out.println("이름 : "+ss.getName());
                            System.out.println("나이 : "+ss.getAge());
                            System.out.println("--------------------");
                    }
                    break;
            }
    }
	}
}
