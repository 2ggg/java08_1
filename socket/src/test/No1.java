package test;

class TestThread extends Thread {
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print("1");
		}
	}
}
class TestThread2 extends Thread{
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print("0");
		}
	}
}
class TimeSleep extends Thread{
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			/*
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
		}
		
	}
}
public class No1 {
	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		TestThread2 testThread2 = new TestThread2();
		TimeSleep timeSleep = new TimeSleep();
		testThread.setPriority(5); //우선순위 8로 세팅 1~10까지 가능
		testThread2.setPriority(5);
		System.out.println(testThread.getPriority());
		System.out.println(testThread2.getPriority());
		timeSleep.start();
		testThread2.start();
		testThread.start();
		
		
		
		
	}
}
