package quakhu;

import java.util.Calendar;

public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		cl.set(Calendar.DAY_OF_MONTH,cl.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(cl.getTime());
	}

}
