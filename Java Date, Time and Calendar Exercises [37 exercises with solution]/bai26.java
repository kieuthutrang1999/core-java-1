package quakhu;

import java.time.LocalDate;
import java.time.Month;

public class bai26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.of(2018, Month.FEBRUARY, 1);
		Month  mt = ld.getMonth();
		int month = mt.getValue();
		int min = mt.minLength();
		int max = mt.maxLength();
		Month thefirst = mt.firstMonthOfQuarter();
		System.out.println("time "+ld);
		System.out.println("month "+mt);
		System.out.println("min cua month "+min);
		System.out.println("max cua month "+max);
		System.out.println("month the first cu year "+thefirst);
		
		
		
	}

}
