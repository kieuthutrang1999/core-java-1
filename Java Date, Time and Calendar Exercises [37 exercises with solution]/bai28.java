package quakhu;

import java.time.LocalDateTime;

public class bai28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateTime = LocalDateTime.now().minusHours(7).minusMinutes(30);
	      System.out.println("\nCurrent Date and Time:  " + LocalDateTime.now());  
	      System.out.println("Before 7 houres and 30 minutes: " + dateTime+"\n");  
	}

}
