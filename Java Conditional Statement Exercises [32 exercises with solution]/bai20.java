package bahai;

import java.util.Scanner;

public class bai20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, a, b;
		System.out.print("nhap n = ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				a = 1;
				b = 0;
			} else {
				a = 0;
				b = 1;
			}
			for (int j = 1; j <= i; j++)
				if (j % 2 == 0)
					System.out.print(a);
				else
					System.out.print(b);
			System.out.println("");
		}
	}

}
