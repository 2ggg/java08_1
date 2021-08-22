package day11_set_get;

import java.util.Scanner;

public class Ex04_main {
/*
객체 생성 후 setter 통해 각각 값 저장
만 나이로 계산하는 메소드 저장 후 age저장
저장된 값 getter 통해 main 출력
??님 나이는 ??살 입니다.
 */
	public static void main(String[] args) {
		Ex04_set_get ex04 = new Ex04_set_get();
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름 입력"); name = scanner.next();
		ex04.setName(name);
		System.out.println("나이 입력"); age=scanner.nextInt();
		ex04.setAge(age);
		age=ex04.agee(age);
		System.out.println(ex04.getName()+"의 만 나이는"+ex04.getAge()+"살");
	}
}
