package bahai;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double m, n;
		System.out.print("nhap m = ");
		m = sc.nextDouble();
		System.out.println("gia tri cua m = "+m);
		if (m > 0) {
			n = 1;
			System.out.println("gia tri cua n = " + n);
		} else if (m < 0) {
			n = -1;
			System.out.println("gia tri cua n = " + n);
		} else {
			n = 0;
			System.out.println("g ia tri cuan = " + n);
		}
	}

}
