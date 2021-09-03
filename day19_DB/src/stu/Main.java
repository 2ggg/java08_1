package stu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DBclass db = new DBclass();//객체를 만들면서 해당 클래스 자동 실행
		int num;
		while(true) {
			System.out.println("1.등록 2.전체보기 3.삭제 4.수정");
			num=scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("학번 입력>>");
				String stNum = scanner.next();
				System.out.println("이름 입력>>");
				String name = scanner.next();
				System.out.println("나이 입력>>");
				int age = scanner.nextInt();
				
				db.saveData(stNum, name, age);
				
				break;
			case 2:
				ArrayList<StudentDTO> list = db.getUsers();
				if(list.size()==0){
					System.out.println("저장된 데이터가 없습니다");
				}else {
					for(int i=0; i<list.size(); i++) {
						System.out.println("학번: "+list.get(i).getStNum());
						System.out.println("이름: "+list.get(i).getName());
						System.out.println("나이: "+list.get(i).getAge());
					}
				}
				break;

			default:
				break;
			}
		}
	}
}
