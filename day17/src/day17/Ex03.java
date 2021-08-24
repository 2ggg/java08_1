package day17;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("test");
		arr.add(1234);
		arr.add(1.123);
		arr.add('a'); 
		//원래는 타입 지정없이 모든 값 저장 가능
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("test");
		//String만 저장 가능
		
	}
}
