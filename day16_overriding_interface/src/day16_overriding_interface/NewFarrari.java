package day16_overriding_interface;

public class NewFarrari extends Ferrari {
	public NewFarrari(int ye, int speed) {
		super(ye, speed);
	}
	public void autoSystem() {
		System.out.println("자동운전 모드");
	}
	public void speed() {
		System.out.println(getYe()+"년 페라리 속도 "+getSpeed()+"km입니다.");
		System.out.println("터보 엔진 작동");
	}
	public static void main(String[] args) {
		
	}
}
