package bahai;

import java.util.Scanner;

public class bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n = ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("So La: " +i+ " va khoi cua " +i+ " la: " +Math.pow(i,3));
		}

	}

}
