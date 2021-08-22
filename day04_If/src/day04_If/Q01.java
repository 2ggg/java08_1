package day04_If;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("날짜 입력>>");
		int date = scanner.nextInt();
		int result = date%7;
		String day = "";
		
		if(date<=31) {
			switch (result) {
			case 1: day="월요일";break;
			case 2: day="화요일";break;
			case 3: day="수요일";break;
			case 4: day="목요일";break;
			case 5: day="금요일";break;
			case 6: day="토요일";break;
			case 0: day="일요일";break;
			}
		}
		
		System.out.println(date+"일은 "+day+"입니다.");
		
	}
}
