package day12_OOP;

public class Ex02 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); //1000 = 1초
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("다음 문장 실행!");
	}
}
