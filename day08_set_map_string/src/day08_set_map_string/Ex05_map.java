package day08_set_map_string;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		//Ű, ���� String���θ� ����
		Scanner scanner = new Scanner(System.in);
		String key = null, value = null;
		System.out.println("������ Ű �Է�");
		key = scanner.next();
		System.out.print("������ �� �Է�");
		value = scanner.next();

		map.put(key, value);
		
		System.out.println(map);
	}
}
