package quakhu;

import java.util.Calendar;
import java.util.TimeZone;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ID = "";
		Calendar clnewyork = Calendar.getInstance();
				clnewyork.setTimeZone(TimeZone.getTimeZone(ID));
				System.out.println("thoi gian o new york la:  "+clnewyork.get(Calendar.HOUR)+":"+clnewyork.get(Calendar.MINUTE)+":"+clnewyork.get(Calendar.SECOND));
	}

}
