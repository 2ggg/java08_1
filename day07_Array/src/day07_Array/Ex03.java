package day07_Array;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		/*
		List
		- ArrayList
		- LinkedList
		- Stack... ��
		
		ArrayList
		- �����Ϳ� ���� ����O idex�� ���� ����
		- �ߺ��� ������ ���� ����
		- �迭�� �ٸ��� ���� �ٸ� �ڷ��� ���� �� ����
		 */
		ArrayList arrayList = new ArrayList();
		arrayList.add("123"); //�߰�
		arrayList.add("456");
		System.out.println(arrayList.get(0)); //�� ������
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.size()); //length ���� �迭��
		System.out.println(arrayList.contains("123"));
		System.out.println(arrayList.remove("123"));
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		arrayList.clear(); //�迭 ����
		
	}
}
