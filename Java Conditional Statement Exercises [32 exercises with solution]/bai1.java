package bahai;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n = ");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("la so tich cuc");
		} else if (n < 0) {
			System.out.println("la so tieu cuc");
		} else {
			System.out.println("la so zero");
		}

	}

}
