package bahai;

import java.util.Scanner;

public class bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n = ");
		int n = sc.nextInt();
		for(int i=0; i<=n; i++) {
			double tich = (float)(5*i);
			System.out.println("5 * "+i+ " = " +tich);
		}
	}

}
