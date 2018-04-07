package quakhu;

import java.time.LocalTime;
import java.util.Calendar;

public class bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalTime time = LocalTime.now();
		 System.out.println(time);
		Calendar cl = Calendar.getInstance();
		System.out.println(cl.get(Calendar.HOUR_OF_DAY)+" gio "+cl.get(Calendar.MINUTE)
		+" phut "+cl.get(Calendar.SECOND)+"."+cl.get(Calendar.MILLISECOND)+" giay");
	}

}
