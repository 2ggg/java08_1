package day17;
class Print2<T>{//<T>를 붙이면 자료형이 가변적으로 바뀜. 제네릭
	public void test(T n1, T n2) {
		System.out.println(n1+","+n2);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Print2 dou = new Print2();
		dou.test(1.11, "abc"); //형변환에 제한이 없다.
		Print2<String> str = new Print2<String>(); //형을 지정할 때 <>로 넣어줌
		dou.test("aa", "bb"); //<클래스 타입>만 가능
		Print2<Integer> in = new Print2<Integer>();
		dou.test(10, 20);
		
		
	}
}
