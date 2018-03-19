package allbaitap;

import java.util.Scanner;

public class bai19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("=======================BÀI 19=======================\n");
		  int sothapphan;
		 	System.out.print("so thap phan = ");
			sothapphan=sc.nextInt();
		    System.out.print("Hệ nhị phân của " + sothapphan +" là :");
		    System.out.print(Integer.toBinaryString(sothapphan));
	}

}
