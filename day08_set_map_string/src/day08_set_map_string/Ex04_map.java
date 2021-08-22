package day08_set_map_string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04_map {
/*
Map
- HashMap
- TreeMap
- HashTable
HashMap
- 키와 값의 쌍
- 순서 유지 X
 - 키 중복 X
 */
	public static void main(String[] args) {
		HashMap map = new HashMap();
		LinkedHashMap link = new LinkedHashMap();
		
		map.put("선풍기", "1000만");
		map.put("자동차", "10만");
		map.put("에어컨", "30만");
		
		System.out.println(map);
		
		System.out.println(map.get("선풍기"));
		System.out.println(map.containsKey("선풍기"));
		System.out.println(map.get("자동차"));
		System.out.println(map.get("에어컨"));
		System.out.println(map.containsValue("에어컨"));
		System.out.println(map.remove("에어컨"));
		System.out.println(map.get("no"));
		System.out.println(map.containsKey("no"));
		System.out.println(map.keySet());
		map.replace("선풍기", "333");
		System.out.println(map);
		Set s = map.keySet();
		Iterator itt = s.iterator();
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+":"+map.get(key));
		}
		
	}
}
