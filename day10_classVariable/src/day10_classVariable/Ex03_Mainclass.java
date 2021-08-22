package day10_classVariable;

public class Ex03_Mainclass {
/*
클래스 변수
- 프로그램 동작시 생성(메모리에 올라갈 때)
- 모든 곳에서 사용 가능(public)

인스턴스(객체) 변수
- new로 인스턴스 생성될 때

지역변수
- 특정 범위 지정되면 해당 범위에서 사용 가능
- 해당 범위에 종속돼 있는 곳까지 사용 가능
 */
	public static void main(String[] args) {
		int cnt=0;//전역변수
		if(cnt==0) {
			int test=1000;//지역변수
			System.out.println(cnt);
			System.out.println(test);
		}
		
		Ex03_variable ex03 = new Ex03_variable();
		int a = ex03.variable01();
		ex03.variable02(a);
		
	}
}
