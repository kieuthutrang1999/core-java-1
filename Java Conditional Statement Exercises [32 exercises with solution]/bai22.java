package bahai;

import java.util.Scanner;

public class bai22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = sc.nextInt();
		int pacl = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0)
					pacl = 1;
				else
					pacl = pacl * (i - j + 1) / j;
				System.out.print(" " + pacl);
			}
			System.out.print("\n");
			
		}
	}

}
