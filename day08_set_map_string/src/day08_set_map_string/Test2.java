package day08_set_map_string;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		String str = "�谳�� -2017��\nȫ��˱��� -2015��\n���켱�� -2018��";
		System.out.println(str);
		System.out.println(str.replace("-", ":").replace("2017", "1999").replace("2018", "1999").replace("2015", "1999"));
		
		str="Have a nice day Have a nice day Have a nice day";
		System.out.println(str.replace(" ", ""));
		
		
		String[] arr = str.split("");
		ArrayList arr1 = new ArrayList();
		//a�� �ִ� ��ġ�� �迭�� ���
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				arr1.add(i);
			}
			
		}System.out.println(arr1);
		
		
		//a�� g�� ���� ����
		str = "It is a fun java programming";
		int a=0, g=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				a++;
			}else if(str.charAt(i)=='g') {
				g++;
			}
			
		}System.out.printf("���ڴ� �� %d��. a�� %d��, g�� %d��\n",str.length(),a,g);
		
		//�ܾ� ù��° ���ڸ� �빮��, �������� �ҹ��ڷ�
		str = "tESt sTring   change     first";
		str= str.toLowerCase();
		String[] arr2 = str.split("\\s+"); //�ϳ� �̻��� ������ �������� �ڸ���
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
