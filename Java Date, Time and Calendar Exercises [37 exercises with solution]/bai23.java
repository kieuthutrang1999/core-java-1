package quakhu;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class bai23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate time = LocalDate.now();
		LocalDate lastday = time.with(TemporalAdjusters.lastDayOfYear());
		Period pd = time.until(lastday);
		System.out.println("Months remaining in the year: "+pd.getMonths());	
	}

}
