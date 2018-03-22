package bahai;

import java.util.Scanner;

public class bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,sum=0;
		System.out.print("nhap a = ");
		a = sc.nextInt();
		System.out.println("so dau vao = "+a);
		for(int i=1; i<=a; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("tong cac so tu nhien toi da = "+sum);

	}

}
