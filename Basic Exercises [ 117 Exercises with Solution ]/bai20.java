package allbaitap;

import java.util.Scanner;

public class bai20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================BÀI 20======================\n");
		 int sothapphan;
		 	System.out.print("so thap phan = ");
			sothapphan=sc.nextInt();
			
		    System.out.print("Hệ thap luc phan cua " + sothapphan +" là :");
		    System.out.print(Integer.toHexString(sothapphan));
	}

}
