package day07_Array;

public class Ex01 {
	public static void main(String[] args) {
		/*
		�迭
		- ���� �ڷ������� ������ ������ ����� ���
		- �ڷ���[] ������(�迭��)
		- �ڷ��� �迭��(������)[]
		- index(÷��) : 0��° ���� ����
		 */
		int[] arr=new int[5];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		System.out.printf("%d, %d, %d, %d, %d\n",arr[0],arr[1],arr[2],arr[3],arr[4]);
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(i+1)*100;
			System.out.println(arr[i]);
		}
		//int arr01[]=new int[] {10,20,30,40,50};
		int arr01[]= {10,20,30,40,50};
		for(int i=0; i<arr01.length; i++) {
			System.out.println(arr01[i]);
		}
	}
}
