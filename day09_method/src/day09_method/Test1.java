package day09_method;

import java.util.Scanner;

public class Test1 {
int n,n1,n2;
String s;

public void ū���Ǻ�(int n1, int n2) {
	int max=0;
	if(n1>n2) {
		max = n1;
	}else if(n1<n2) {
		max = n2;
	}else {
		System.out.println("�� ���� �����ϴ�.");
	}
	System.out.printf("%d,%d �� ū ���� %d",n1,n2,max);
}
	
public int �Ѽ��Է�() {
	Scanner scanner = new Scanner(System.in);
	System.out.print("�� �Է�>>");
	n=scanner.nextInt();
	return n;
}
public String ¦Ȧ���(int n){
	
	if(n%2==0) {
		return "¦��";
	}else if(n%2==1) {
		return "Ȧ��";
	}return null;
}
public int ���3(int n) {
	if(n%3==0) {
		return n;
	}
	return 0;
}

public void �Ҽ��Ǻ�(int n) {
	
}
public int ���밪(int n) {
	if(n<0) {
		n=n*(-1);
		return n;
	}
	return n;
}
public void �Ųٷ����(int n) {
	while(true) {
		if(n%10<10) {
			
		}
	}
}



}
