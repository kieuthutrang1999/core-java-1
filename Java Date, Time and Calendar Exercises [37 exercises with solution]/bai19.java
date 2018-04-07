	package quakhu;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class bai19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate userday = LocalDate.of(2017, Month.FEBRUARY, 5);
		Period diff = Period.between(userday, today);
		System.out.println("\nDifference between "+ userday +" and "+ today +": " 
			     + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");
	}

}
