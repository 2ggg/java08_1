package day08_set_map_string;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01_set {
/*
Set
- HashSet
- TreeSet

Hash Set
- ���� ����X
- ������ �ߺ�X
 */
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("���");
		hs.add("���");
		hs.add("����");
		hs.add("���");
		System.out.println("hs: "+hs);
		hs.remove("���");
		System.out.println("��� ����:"+hs);
		
		ArrayList arr = new ArrayList();
		arr.add("���");
		arr.add("���");
		arr.add("����");
		arr.add("���");
		System.out.println("arr: "+arr);
		
	}
}
