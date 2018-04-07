package quakhu;

import java.util.Calendar;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1999;
	     int month = 29; 
	     int date = 4;
	     int minute = 34;
	     int  second = 59;
	     int hour = 23;
		Calendar cl = Calendar.getInstance();
		cl.clear();
		System.out.println();
		cl.add(Calendar.YEAR, year);
		cl.add(Calendar.MONTH, month);
		cl.add(Calendar.DATE, date);
		cl.add(Calendar.MINUTE, minute);
		cl.add(Calendar.SECOND, second);
		cl.add(Calendar.HOUR, hour);
		System.out.println(cl.getTime());
		System.out.println();

	}

}
