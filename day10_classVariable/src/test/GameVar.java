package test;

import java.util.Scanner;

public class GameVar {
	public int select, userNum, ran, i=0, max=i;
	
	Scanner scanner = new Scanner(System.in);
	public void print() {
		while(true) {
			System.out.println("1.게임 시작\n2.게임 전적\n3.게임 종료\n>>>>");
			select = scanner.nextInt();
			if(select==1) {
				ran = random();
				System.out.println(ran);
				updown();
			}else if(select==2) {
				System.out.println(i);
				if(max==0&&i==0) {
					System.out.println("아직 하지 않았습니다.");
				}else if(max==0&&i>0) {
					max=i;
					System.out.println(max+"번");
				}else {
					System.out.println(max+"번");
				}
				
			}else if(select==3) {
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public int random() {
		ran = (int)(Math.random()*100);
		return ran;
	}
	public void updown() {
		
		boolean a = true;
		i=0;
		
		while(a) {
			System.out.print("숫자 입력>>>");
			userNum = scanner.nextInt();
			if (userNum>ran) {
				System.out.println("Down");
				i++;
			}else if(userNum<ran) {
				System.out.println("Up");
				i++;
			}else {
				System.out.println(i+"번 만에 맞췄습니다!");
				if(i<max) {
					max=i;
				}
				a=false;
				break;
			}
		}
		
	}
}
