package java13_constructor_inheritance;

import java.util.Calendar;

class singleton01{
	public int num;
}
public class Ex03_singleton {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		singleton01 sin = new singleton01();
		singleton01 sin2 = sin;
		
		sin.num = 12345;
		sin2.num = 444;
		System.out.println("sin.num: "+sin.num);
		System.out.println("sin2.num: "+sin2.num);
		
		System.out.println("sin: "+sin);
		System.out.println("sin2: "+sin2);
	}
}
