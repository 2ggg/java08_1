package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int num;
		String addNum, printNum;
		System.out.print("���� ���� �� �Է�>");
		num=scanner.nextInt();
		for(int i=0; i<num; i++) {
			System.out.print("�߰��� �� �Է�>");
			addNum=scanner.next();
			arr.add(addNum);
			
		}
		System.out.println("---���---");
		for(int i=0; i<arr.size(); i++) {
			Object object = arr.get(i);
			//String s = (String)obj;
			String s = (String)arr.get(i);
			System.out.println(arr.get(i)+s);
		}
	}
}
