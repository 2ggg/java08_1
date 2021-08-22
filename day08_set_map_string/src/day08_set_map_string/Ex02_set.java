package day08_set_map_string;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_set {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("¿œ");
		arr.add("¿Ã");
		arr.add("ªÔ");
		
		Iterator it = arr.iterator();
		//bof(Ω√¿€) | ¿œ | ¿Ã | ªÔ | eof(≥°)
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
