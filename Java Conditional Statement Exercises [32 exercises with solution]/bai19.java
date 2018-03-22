package bahai;

import java.util.Scanner;

public class bai19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n = ");
		int n = sc.nextInt();
		int s = n + 4 - 1, x;
		for (int i = 1; i <= n; i++) {
			for (x = s; x != 0; x--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
			s--;
		}

	}

}
