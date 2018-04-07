package quakhu;

import java.time.Year;

public class bai25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Year yr  = Year.now();
		System.out.println("nam  " +yr);
		boolean isLeap = yr.isLeap();
		System.out.println("la nam nhuan  "+isLeap);
		int length = yr.length();
		System.out.println("co "+length+" days");
	}

}
