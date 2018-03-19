package allbaitap;

import java.util.Scanner;

public class bai34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================BÀI 34=======================\n");
		int canh;
		System.out.print ("canh = ");
		canh = sc.nextInt();
		double S = (double)(6*(canh*canh))/(4*Math.tan(Math.PI/6));
		System.out.println("dien tich = "+S);
	}

}
