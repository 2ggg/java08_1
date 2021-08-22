package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat s=
				new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String string = s.format(time);
		System.out.println(string);
		
		Date d = new Date();
		System.out.println("date:"+d);
		System.out.println("format(d):"+s.format(d));
		
		Calendar calendar = Calendar.getInstance();
		System.out.println("cal:"+calendar);
		System.out.println(calendar.get(calendar.YEAR));
		System.out.println(calendar.get(calendar.MONTH)+1);
		//0부터 시작하기때문에 1을 더해줌
		System.out.println(calendar.get(calendar.DATE));
	}
}
