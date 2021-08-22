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
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print("선택>>");
			select = scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println("저장할 메뉴>>");
				key = scanner.next();
				System.out.print("가격>>");
				price = scanner.nextInt();

				manu.put(key, price);
				System.out.println("등록되었습니다.");
				break;
				
			case 2:
				System.out.println(manu);
				Iterator it = new manu.iterator();
				while(true) {
					
				}
				
				System.out.print("1. 수정\t2. 삭제\n>>");
				select = scanner.nextInt();
				
				if(select==1) {//수정
					System.out.print("변경할 메뉴>>");
					key=scanner.next();
					if(manu.containsKey(key)) {//메뉴가 있을때
						System.out.print("가격 새로 입력>>");
						price=scanner.nextInt();
						
						manu.replace(key, price);
						System.out.println("변경되었습니다.");
					}else {
						System.out.println("해당 메뉴가 존재하지 않습니다.");
					}
				}else if(select==2) {//삭제
					System.out.print("삭제할 메뉴>>");
					key=scanner.next();
					if(manu.containsKey(key)) {//메뉴가 있으면
						manu.remove(key);
						System.out.println(key+"(이)가 삭제되었습니다.");
					}else {
						System.out.println("해당 메뉴가 존재하지 않습니다.");
					}
				}
				break;
				
			case 3:
				result = false;
				System.out.println("종료하겠습니다...");
				break;

			default:
				break;
			}
			
		}
		
		
	}
}
