package day07_Array;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		/*
		List
		- ArrayList
		- LinkedList
		- Stack... 등
		
		ArrayList
		- 데이터에 대한 순서O idex로 접근 가능
		- 중복된 데이터 저장 가능
		- 배열과 다르게 서로 다른 자료형 넣을 수 있음
		 */
		ArrayList arrayList = new ArrayList();
		arrayList.add("123"); //추가
		arrayList.add("456");
		System.out.println(arrayList.get(0)); //값 가져옴
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.size()); //length 같이 배열수
		System.out.println(arrayList.contains("123"));
		System.out.println(arrayList.remove("123"));
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		arrayList.clear(); //배열 삭제
		
	}
}
