package allbaitap;

import java.util.Scanner;

public class bai25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================B�I 25=======================\n");
		Scanner in = new Scanner(System.in);
		   long octal_num, decimal_num = 0;
		     int i = 0;
		     System.out.print("Input any octal number: ");
		    octal_num = in.nextLong();
		    while (octal_num != 0) 
		     {
		      decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
		      octal_num = octal_num / 10;
		     }
		    System.out.print("Equivalent decimal number: " + decimal_num+"\n");
	}

}