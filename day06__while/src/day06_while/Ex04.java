package day06_while;

public class Ex04 {
	public static void main(String[] args) {
		/*
		continue : 반복문 위로 돌려보낸다
		 */
		int num =0;
		while(num<5) {
			num++;
			System.out.println(num);
			if(num==3) {
				break;
			}
		}
	}
}
