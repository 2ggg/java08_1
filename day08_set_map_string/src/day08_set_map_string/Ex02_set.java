package day08_set_map_string;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_set {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		Iterator it = arr.iterator();
		//bof(����) | �� | �� | �� | eof(��)
		/*
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		*/
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
