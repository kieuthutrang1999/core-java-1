package bahai;

import java.util.Scanner;

public class bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = sc.nextInt();
		int dem=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(dem++);
			}
			System.out.println("");
		}
	}

}
