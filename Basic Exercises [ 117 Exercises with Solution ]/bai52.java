package allbaitap;

import java.util.Scanner;

public class bai52 {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("=======================BÀI 52======================\n");
			Scanner in = new Scanner(System.in);
	        System.out.print("nhap a : ");
	        int a = in.nextInt();  
			System.out.print("nhap b : ");
			int b = in.nextInt(); 
			System.out.print("nhap c : ");
	        int c = in.nextInt(); 
			System.out.print("\n");
			if ((a + b) == c || (a + c) == b || (b + c) == a) {
				System.out.print(true);
			}
			else System.out.print(false);
	    
	    
	        
	}

}
