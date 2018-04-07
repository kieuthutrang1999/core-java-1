package quakhu;

import java.time.YearMonth;

public class bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YearMonth ym = YearMonth.of(2018, 4);
		String firstday = ym.atDay(1).getDayOfWeek().name();
		String lastday = ym.atEndOfMonth().getDayOfWeek().name();
		System.out.println("ngay dau tien cua thang  "+firstday);
		System.out.println("ngay cuoi cung cua thang  "+lastday);
	}

}
