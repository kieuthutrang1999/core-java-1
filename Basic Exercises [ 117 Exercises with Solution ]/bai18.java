package allbaitap;

import java.util.Scanner;

public class bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 18=======================\n");
		 long a, b;
		  int[] sum = new int[20];
		  Scanner sc = new Scanner(System.in);

		  System.out.print("nhap so nhi phan thu 1 : ");
		  a = sc.nextLong();
		  System.out.print("nhap so nhi phan thu 2 : ");
		  b = sc.nextLong();
		  String S = String.valueOf(a);
		  String S1 = String.valueOf(b);
		  System.out.println(a);
		  System.out.println(b);
		  int valueOf1 = Integer.parseInt(S,2);
		  int valueOf2 = Integer.parseInt(S1,2);
		  int tong = valueOf1 * valueOf2 ;
		  String kq = Integer.toBinaryString(tong);
		  System.out.println(kq);
		  
		  
		  
	}

}
