package allbaitap;

import java.util.Scanner;

public class bai36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================BÀI 36=======================\n");
		double x1,x2,y1,y2;
		System.out.print ("x1 = ");
		x1 = sc.nextDouble();
		System.out.print ("x2 = ");
		x2 = sc.nextDouble();
		System.out.print ("y1 = ");
		y1 = sc.nextDouble();
		System.out.print ("y2 = ");
		y2 = sc.nextDouble();
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		double bankinhtraidat = 6371.01 *  Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
			System.out.println("D = "+bankinhtraidat);
	}

}
