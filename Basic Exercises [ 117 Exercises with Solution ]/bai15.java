package allbaitap;

import java.util.Scanner;

public class bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("\n\n=======================BÀI 15=======================\n");
			double D,E,tam;
			System.out.print("D = ");
			D=sc.nextDouble();
			System.out.print("E = ");
			E=sc.nextDouble();
			tam = D ;
			D = E;
			E = tam;
			System.out.println("D   = "+D);
			System.out.println("E   = "+E);
	}

}
