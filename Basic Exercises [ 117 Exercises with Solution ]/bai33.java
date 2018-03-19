package allbaitap;

import java.util.Scanner;

public class bai33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================BÀI 33=======================\n");
		int z,TONG=0;
		System.out.print ("z = ");
		z = sc.nextInt();
		while(z>0) {
			TONG+=z%10;
			z/=10;
		}
		 System.out.println("tong cac chu so cua z la: "+TONG);

	}

}
