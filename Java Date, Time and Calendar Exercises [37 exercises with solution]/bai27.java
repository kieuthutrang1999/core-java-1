package quakhu;

import java.time.LocalTime;

public class bai27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.of(23, 59, 59, 999999999);
		System.out.println("time "+time);
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time .getSecond();
		System.out.println("hour "+hour);
		System.out.println("minute "+minute);
		System.out.println("second "+second);
	}

}
