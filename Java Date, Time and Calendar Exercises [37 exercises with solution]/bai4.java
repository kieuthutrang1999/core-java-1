package quakhu;

import java.util.Calendar;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		System.out.println("lich hien tai :"+cl.getTime());
		System.out.println("min cua year  "+cl.getActualMinimum(Calendar.YEAR));
		System.out.println("min cua month  "+cl.getActualMinimum(Calendar.MONTH));
		System.out.println("min cua cac tuan trong thang  "+cl.getActualMinimum(Calendar.WEEK_OF_MONTH));
		System.out.println("min cac tuan trong nam  "+cl.getActualMinimum(Calendar.WEEK_OF_YEAR));
		System.out.println("min cac ngay trong tuan  "+cl.getActualMinimum(Calendar.DAY_OF_WEEK));
		System.out.println("min date  "+cl.getActualMinimum(Calendar.DATE));
		System.out.println("min cua cac day trong Month  "+cl.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println("min cua cac day trong year  "+cl.getActualMinimum(Calendar.DAY_OF_YEAR));
		System.out.println("min cua minute  "+cl.getActualMinimum(Calendar.MINUTE));
		System.out.println("min cua hour  "+cl.getActualMinimum(Calendar.HOUR));
		System.out.println("min cua hour trong day  "+cl.getActualMinimum(Calendar.HOUR_OF_DAY));
		System.out.println("min cua second  "+cl.getActualMinimum(Calendar.SECOND));
	}

}
