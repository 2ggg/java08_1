package day08_set_map_string;

import java.util.Scanner;

public class Ex07_string {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str; // : String str = new String();
		
		
		str="   JaVa Is Easy. 그리고 program";
		System.out.println(str.toUpperCase());//대문자화
		System.out.println(str.toLowerCase());//소문자화
		System.out.println(str.length());//문자길이
		System.out.println(str.charAt(2));//2번째 글자(0부터 시작)
		System.out.println(str.charAt(3));
		
		str+="안녕";
		System.out.println(str);
		System.out.println(str.equals("그리고"));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
		
		str = str.trim();//좌우 공백 없앰
		System.out.println(str); 
		
		String[] split = str.trim().split(" ");//()기준으로 잘라내기
		System.out.println(split[0]);
		System.out.println(split[1]);
		for(int i=0; i< split.length; i++) {
			System.out.println(split[i]);
		}
		
		System.out.println(str.replace(" ", "+"));
	}
}
