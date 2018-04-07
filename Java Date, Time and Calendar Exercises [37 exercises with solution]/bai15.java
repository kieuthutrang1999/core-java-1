package quakhu;

import java.time.LocalTime;

public class bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalTime time = LocalTime.now(); 
	      // adding four hours
	      LocalTime newTime = time.plusHours(2);
	      System.out.println();
	      System.out.println("Time after 2 hours : " + newTime);
	      System.out.println();
	}

}
