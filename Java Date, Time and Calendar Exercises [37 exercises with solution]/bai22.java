package quakhu;

import java.time.LocalDate;

public class bai22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate time = LocalDate.now();
		System.out.println("time hien tai la :"+time);
		System.out.println("time truoc  10 ngay la :"+time.plusDays(-10));
		System.out.println("time sau  10 ngay la :"+time.plusDays(10));
	}

}
