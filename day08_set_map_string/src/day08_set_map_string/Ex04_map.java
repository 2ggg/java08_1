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
- Ű�� ���� ��
- ���� ���� X
 - Ű �ߺ� X
 */
	public static void main(String[] args) {
		HashMap map = new HashMap();
		LinkedHashMap link = new LinkedHashMap();
		
		map.put("��ǳ��", "1000��");
		map.put("�ڵ���", "10��");
		map.put("������", "30��");
		
		System.out.println(map);
		
		System.out.println(map.get("��ǳ��"));
		System.out.println(map.containsKey("��ǳ��"));
		System.out.println(map.get("�ڵ���"));
		System.out.println(map.get("������"));
		System.out.println(map.containsValue("������"));
		System.out.println(map.remove("������"));
		System.out.println(map.get("no"));
		System.out.println(map.containsKey("no"));
		System.out.println(map.keySet());
		map.replace("��ǳ��", "333");
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
