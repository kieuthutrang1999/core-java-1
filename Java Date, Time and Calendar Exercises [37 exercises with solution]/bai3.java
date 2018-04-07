package quakhu;

import java.util.Calendar;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		System.out.println("lich hien tai :"+cl.getTime());
		System.out.println("max cua year  "+cl.getActualMaximum(Calendar.YEAR));
		System.out.println("max cua month  "+cl.getActualMaximum(Calendar.MONTH));
		System.out.println("max cua cac tuan trong thang  "+cl.getActualMaximum(Calendar.WEEK_OF_MONTH));
		System.out.println("max cac tuan trong nam  "+cl.getActualMaximum(Calendar.WEEK_OF_YEAR));
		System.out.println("max cac ngay trong tuan  "+cl.getActualMaximum(Calendar.DAY_OF_WEEK));
		System.out.println("max date  "+cl.getActualMaximum(Calendar.DATE));
		System.out.println("max cua cac day trong Month  "+cl.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("max cua cac day trong year  "+cl.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("max cua minute  "+cl.getActualMaximum(Calendar.MINUTE));
		System.out.println("max cua hour  "+cl.getActualMaximum(Calendar.HOUR));
		System.out.println("max cua hour trong day  "+cl.getActualMaximum(Calendar.HOUR_OF_DAY));
		System.out.println("max cua second  "+cl.getActualMaximum(Calendar.SECOND));
	}

}
