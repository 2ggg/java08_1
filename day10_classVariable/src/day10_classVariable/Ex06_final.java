package day10_classVariable;

import java.util.Scanner;

public class Ex06_final {
	public final String korea = "대한민국"; //수정 불가
	public static final String koreaa = "대한"; //
	public void func() {
		System.out.println("변경전 korea:"+korea);
		Scanner scanner= new Scanner(System.in);
		System.out.println("입력");
		//korea = scanner.next(); //에러뜸
		//korea = "만세"; //에러뜸
		System.out.println("변경후:"+korea);
	}
}
