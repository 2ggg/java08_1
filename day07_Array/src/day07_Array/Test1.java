package day07_Array;

public class Test1 {
/*
�ݺ����� �̿��� arr�� ����� ¦�� ��, Ȧ������ ���� ���
 */
	public static void main(String[] args) {
		int arr[]=new int[] {10,54,13,17,25,30};
		for(int i=0; i<arr.length; i++) {
			int num=arr[i];
			
			if(num%2==0) {
				System.out.println("¦��:"+num);
			}else {
				System.out.println("Ȧ��:"+num);
			}
		}
		
		
	}
}
