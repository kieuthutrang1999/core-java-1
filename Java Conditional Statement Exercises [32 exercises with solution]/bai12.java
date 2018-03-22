package bahai;

import java.util.Scanner;

public class bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a = ");
		int a = sc.nextInt();
		System.out.print("nhap b = ");
		int b = sc.nextInt();
		System.out.print("nhap c = ");
		int c = sc.nextInt();
		System.out.print("nhap d = ");
		int d = sc.nextInt();
		System.out.print("nhap e = ");
		int e = sc.nextInt();
		double Tong = a+b+c+d+e;
		double tbc = (a+b+c+d+e)/5;
		System.out.println("Tong = "+Tong);
		System.out.println("tbc = "+tbc);
	}

}
