package bahai;

import java.util.Scanner;

public class bai27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n = ");
		int n = sc.nextInt();
		if(n>0) System.out.println(n+ " la so duong");
		else
			if(n<0) System.out.println(n+ " la so am");
			else System.out.println(n+ " la so khong");
	}

}
