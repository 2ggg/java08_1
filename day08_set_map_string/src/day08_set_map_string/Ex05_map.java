package day08_set_map_string;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		//키, 값을 String으로만 구성
		Scanner scanner = new Scanner(System.in);
		String key = null, value = null;
		System.out.println("저장할 키 입력");
		key = scanner.next();
		System.out.print("저장할 값 입력");
		value = scanner.next();

		map.put(key, value);
		
		System.out.println(map);
	}
}
