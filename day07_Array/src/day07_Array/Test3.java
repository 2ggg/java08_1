package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList arrName = new ArrayList();
		ArrayList arrPhone = new ArrayList();
		
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 찾기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print("선택>>");
			int select = scanner.nextInt();
			if(select==1) {
				System.out.print("이름 입력: ");
				String name = scanner.next();
				
				System.out.print("연락처 입력: ");
				String phone = scanner.next();
				
				if(arrName.contains(name)||arrPhone.contains(phone)) {
					System.out.println("이미 존재합니다.");
				}else {
					arrName.add(name);
					arrPhone.add(phone);
					System.out.println("등록되었습니다.");
				}
				
			}else if(select==2) {
				System.out.print("찾을 이름: ");
				String search = scanner.next();
				boolean result = arrName.contains(search);
				if(result) {
					int num = arrName.indexOf(search);
					System.out.println(search+"의 연락처: "+arrPhone.get(num));
				}else {
					System.out.println("정보가 존재하지 않습니다.");
				}
			}else if(select==3) {
				System.out.print("삭제할 이름: ");
				String rmv = scanner.next();
				boolean result = arrName.contains(rmv);
				if(result) {
					int num = arrName.indexOf(rmv);
					arrName.remove(rmv);
					arrPhone.remove(num);
					System.out.println(rmv+"의 정보가 삭제되었습니다.");
				}else {
					System.out.println("정보가 존재하지 않습니다.");
				}
			}else if(select==4) {
				System.out.println(arrName);
				System.out.println(arrPhone);
			}else {
				System.out.println("종료합니다.");
				break;
			}
			
		}
	}
}
