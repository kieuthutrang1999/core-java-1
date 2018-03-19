package allbaitap;

import java.util.Scanner;

public class bai56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 56======================\n");
		Scanner sc = new Scanner(System.in);
		int x ,y,p;
		System.out.print("nhap x = ");
		x = sc.nextInt();
		System.out.print("nhap y = ");
		y = sc.nextInt();
		System.out.print("nhap p = ");
		p = sc.nextInt();
		if((x> p) && (y>p) && ((x%p==0) || (y%p==0)) || (x>y) && (p>y) && ((x%y==0) || (p%y==0)) || (y>x) && (p>x) && ((y%x==0) || (p%x==0)) ) {
			System.out.println(true);
		}
		else System.out.println(false);
	}

}
