package quakhu;

import java.util.Scanner;

public class bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("nhap nam = ");
		year = sc.nextInt();
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " la nam nhuan");
		else
			System.out.println("Year " + year + " la nam khong nhuan");

	}

}
