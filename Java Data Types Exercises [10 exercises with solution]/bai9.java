package baitapnext;

import java.util.Scanner;

public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a = ");
		int a = sc.nextInt();
		System.out.print("nhap b = ");
		int b = sc.nextInt();
		System.out.println("tong = "+(a+b));
		System.out.println("hieu = "+(a-b));
		System.out.println("tich = "+(a*b));
		System.out.println("tbc = "+(a+b)/2);
		System.out.println("khoangcanh = "+Math.abs(a-b));
		System.out.println("max = "+Math.max(a, b));
		System.out.println("min = "+Math.min(a, b));
	}

}
