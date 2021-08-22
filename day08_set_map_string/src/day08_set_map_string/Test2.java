package day08_set_map_string;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		String str = "김개똥 -2017년\n홍길똥구리 -2015년\n선우선녀 -2018년";
		System.out.println(str);
		System.out.println(str.replace("-", ":").replace("2017", "1999").replace("2018", "1999").replace("2015", "1999"));
		
		str="Have a nice day Have a nice day Have a nice day";
		System.out.println(str.replace(" ", ""));
		
		
		String[] arr = str.split("");
		ArrayList arr1 = new ArrayList();
		//a가 있는 위치를 배열로 출력
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				arr1.add(i);
			}
			
		}System.out.println(arr1);
		
		
		//a와 g의 개수 구함
		str = "It is a fun java programming";
		int a=0, g=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				a++;
			}else if(str.charAt(i)=='g') {
				g++;
			}
			
		}System.out.printf("글자는 총 %d개. a는 %d개, g는 %d개\n",str.length(),a,g);
		
		//단어 첫번째 글자만 대문자, 나머지는 소문자로
		str = "tESt sTring   change     first";
		str= str.toLowerCase();
		String[] arr2 = str.split("\\s+"); //하나 이상의 공백을 기준으로 자른다
		String str2=null;
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i].charAt(0)>='a' && arr2[i].charAt(0)<='z') {
				str2 += (char)(arr2[i].charAt(0)-32);
			}else {
				str2 += (char)(arr2[i].charAt(0));
			}
		}
		System.out.println(str2);
		
		
		/*
		
		
		
		System.out.println(str);
		
		ArrayList arr4 = new ArrayList();
		
		for(int i=0; i < arr3.length; i++) {
			if(arr3[i]==" ") {
				
				continue;
			}
			str=arr3[i];
			arr4.add(str);
			System.out.println(arr4);
			
		}
		*/
		
		
		
		
		
	
	}
}
