package allbaitap;

import java.util.Scanner;

public class bai55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 55======================\n");
		Scanner in = new Scanner(System.in);
        System.out.print("nhao giay: ");
		int giay = in.nextInt(); 
        int p1 = giay % 60;
        int p2 = giay / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
	}

}
