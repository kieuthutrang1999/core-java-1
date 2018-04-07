package quakhu;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DateFormatSymbols weekday = DateFormatSymbols.getInstance();
	       String [] arr  = weekday.getWeekdays();
	       for(int i=1; i<arr.length; i++) {
	    	   System.out.println(arr[i]);
	       }
	}

}
