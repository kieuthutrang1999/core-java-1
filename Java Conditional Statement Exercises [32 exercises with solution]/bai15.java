package bahai;

import java.util.Scanner;

public class bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n = ");
		int n = sc.nextInt();
		int sum = 0;
		System.out.print("cac so le gom\n ");
		for (int i = 1; i <= n; i++) {
			System.out.println(2*i-1);
				sum +=2*i-1;
			}
		
		System.out.println("tong cac so le = "+sum);
	}

}
