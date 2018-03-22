package bahai;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c, max;
		System.out.print("nhap a =");
		a = sc.nextDouble();
		System.out.print("nhap b =");
		b = sc.nextDouble();
		System.out.print("nhap c =");
		c = sc.nextDouble();
		if (a < b && b > c) {
			System.out.println("max la " + b);
		} else if (a < c && c > b) {
			System.out.println("max la " + c);
		} else {
			System.out.println("max la " + a);
		}

	}

}
