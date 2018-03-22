package bahai;

import java.util.Scanner;

public class bai30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a = ");
		int a = sc.nextInt();
		System.out.print("nhap b = ");
		int b = sc.nextInt();
		System.out.print("nhap c = ");
		int c = sc.nextInt();
		if (a == b && a == c) {
			System.out.println(" so " + a + " va " + b + " va " + c + " deu bang nhau");
		} else if (a == b || a == c || c == b) {
			System.out.println(" so " + a + " va " + b + " va " + c + " dong thoi khong bang nhau");
		} else
			System.out.println(" so " + a + " va " + b + " va " + c + " deu khac nhau");
	}

}
