package day08_set_map_string;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("¿œ");
		hs.add("¿Ã");
		hs.add("ªÔ");
		System.out.println("set: "+hs);
		
		Iterator it = hs.iterator();
		
		/*
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		while(it.hasNext()) {
			//Object object = it.next();
			//String s = (String)object;
			String string = (String) it.next();
			System.out.println(string);
		}
	}
}
