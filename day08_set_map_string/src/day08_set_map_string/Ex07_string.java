package day08_set_map_string;

import java.util.Scanner;

public class Ex07_string {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str; // : String str = new String();
		
		
		str="   JaVa Is Easy. �׸��� program";
		System.out.println(str.toUpperCase());//�빮��ȭ
		System.out.println(str.toLowerCase());//�ҹ���ȭ
		System.out.println(str.length());//���ڱ���
		System.out.println(str.charAt(2));//2��° ����(0���� ����)
		System.out.println(str.charAt(3));
		
		str+="�ȳ�";
		System.out.println(str);
		System.out.println(str.equals("�׸���"));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
		
		str = str.trim();//�¿� ���� ����
		System.out.println(str); 
		
		String[] split = str.trim().split(" ");//()�������� �߶󳻱�
		System.out.println(split[0]);
		System.out.println(split[1]);
		for(int i=0; i< split.length; i++) {
			System.out.println(split[i]);
		}
		
		System.out.println(str.replace(" ", "+"));
	}
}
