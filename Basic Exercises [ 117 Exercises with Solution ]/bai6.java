package allbaitap;

import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================BÀI 6=======================\n");
		int c,d;
		System.out.print("c = ");
		c = sc.nextInt();
		System.out.print("d = ");
		d = sc.nextInt();
		double sum = c+d;
		double sum1 = c-d;
		double sum2 = c*d;
		double sum3 = c/d;
		double sum4 = c%d;
		System.out.println("Sum= "+sum);
		System.out.println("Sum1= "+sum1);
		System.out.println("Sum2= "+sum2);
		System.out.println("Sum3= "+sum3);
		System.out.println("Sum4= "+sum4);
	}

}
