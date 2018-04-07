 package quakhu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		cl.set(Calendar.DATE, Calendar.MONDAY);
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(cl.getTime()));
		for(int i=1; i<=6; i++) {
			cl.add(Calendar.DATE, 1);
		}
		System.out.println(df.format(cl.getTime()));
	}
}
