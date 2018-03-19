package allbaitap;

import java.util.Scanner;

public class bai54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 54======================\n");
		Scanner in = new Scanner(System.in);
        System.out.print("nhap a : ");
        int a = in.nextInt();  
		System.out.print("nhap b : ");
		int b = in.nextInt(); 
		System.out.print("nhap c : ");
        int c = in.nextInt(); 
		System.out.print("\n");
		if( (a % 10 == b % 10) || (a % 10 == c % 10) ||(b % 10 == c % 10) && (a>0) && (b>0) && (c>0)  ) {
			System.out.print(true);
		}
		else System.out.print(false);
	}

}
