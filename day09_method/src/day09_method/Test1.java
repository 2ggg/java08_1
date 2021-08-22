package day09_method;

import java.util.Scanner;

public class Test1 {
int n,n1,n2;
String s;

public void 큰수판별(int n1, int n2) {
	int max=0;
	if(n1>n2) {
		max = n1;
	}else if(n1<n2) {
		max = n2;
	}else {
		System.out.println("두 수는 같습니다.");
	}
	System.out.printf("%d,%d 중 큰 수는 %d",n1,n2,max);
}
	
public int 한수입력() {
	Scanner scanner = new Scanner(System.in);
	System.out.print("수 입력>>");
	n=scanner.nextInt();
	return n;
}
public String 짝홀결과(int n){
	
	if(n%2==0) {
		return "짝수";
	}else if(n%2==1) {
		return "홀수";
	}return null;
}
public int 배수3(int n) {
	if(n%3==0) {
		return n;
	}
	return 0;
}

public void 소수판별(int n) {
	
}
public int 절대값(int n) {
	if(n<0) {
		n=n*(-1);
		return n;
	}
	return n;
}
public void 거꾸로출력(int n) {
	while(true) {
		if(n%10<10) {
			
		}
	}
}



}
