package bahai;

import java.util.Scanner;

public class bai31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a = ");
		int a = sc.nextInt();
		System.out.print("nhap b = ");
		int b = sc.nextInt();
		System.out.print("nhap c = ");
		int c = sc.nextInt();
		if (a < b && b < c ) {
			System.out.println(" so " + a + " va " + b + " va " + c + " dang tang dan");
		} else if (a > b && b > c) {
			System.out.println(" so " + a + " va " + b + " va " + c + " dang giam dan");
		} else
			System.out.println(" so " + a + " va " + b + " va " + c + " khong tang cung khong giam theo thu tu");
	}

}
