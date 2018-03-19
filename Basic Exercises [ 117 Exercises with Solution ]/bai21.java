package allbaitap;

import java.util.Scanner;

public class bai21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 21=======================\n");
		Scanner sc = new Scanner(System.in);
		 int sothapphan;
		 	System.out.print("so thap phan = ");
			sothapphan=sc.nextInt();
			
		    System.out.print("He  bac phan cua " + sothapphan +" là :");
		    System.out.print(Integer.toOctalString(sothapphan));
	}

}
