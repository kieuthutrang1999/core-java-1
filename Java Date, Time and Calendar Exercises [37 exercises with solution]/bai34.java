package quakhu;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class bai34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
	      cal.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
	      cal.set(Calendar.MINUTE, 0);
	      cal.set(Calendar.SECOND, 0);
	      System.out.println("\n"+cal.getTime()+"\n");
	}

}
