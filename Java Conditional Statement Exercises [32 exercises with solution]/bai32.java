package bahai;

import java.util.Scanner;

public class bai32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a = ");
		int a = sc.nextInt();
		System.out.print("nhap b = ");
		int b = sc.nextInt();
		
		
		if (Math.abs(a - b) <= 0.01) { 
		     System.out.println("Nhung con so nay giong nhau."); 
		 } 
		 else { 
		     System.out.println("Nhung con so nay khác nhau."); 
		 } 
	}

}
