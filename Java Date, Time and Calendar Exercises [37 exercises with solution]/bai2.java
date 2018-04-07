package quakhu;

import java.util.Calendar;

public class bai2 {

	public static void main(String[] args) {
		 Calendar cal = Calendar.getInstance();
	       // Get and display information of current date from the calendar:
		    System.out.println();
	        System.out.println("Year: " + cal.get(Calendar.YEAR));
	        System.out.println("Month: " + cal.get(Calendar.MONTH));
	        System.out.println("Day: " + cal.get(Calendar.DATE));
	        System.out.println("Hour: " + cal.get(Calendar.HOUR));
	        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
	        System.out.println("Second: " + cal.get(Calendar.SECOND));
		    System.out.println();
	}

}
