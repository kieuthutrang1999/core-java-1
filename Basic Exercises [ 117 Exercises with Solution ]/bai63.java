package allbaitap;

import java.util.Scanner;

public class bai63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================B�I 63======================\n");
		 Scanner in = new Scanner(System.in);
	        System.out.print("Input the first number : ");
	        int x = in.nextInt();  
			System.out.print("Input the second number: ");
			int y = in.nextInt(); 
			System.out.print("Input the third number : ");
	        int z = in.nextInt(); 
	        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
	}

}
