package allbaitap;

import java.util.Scanner;

public class bai109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 109=======================\n");
		Scanner in = new Scanner(System.in);	
	       System.out.print("Input a positive integer: ");
	        int n = in.nextInt(); 
			if (n>0)
			{
	           System.out.println("Number of rows: "+((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));	
			} 
	}

}
