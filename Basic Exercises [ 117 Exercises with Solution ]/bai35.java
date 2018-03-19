package allbaitap;

import java.util.Scanner;

public class bai35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================BÀI 35=======================\n");
		int mattren,caccanh;
		System.out.print ("mat tren = ");
		mattren = sc.nextInt();
		System.out.print ("cac canh = ");
		caccanh = sc.nextInt();
		double T = (double)(mattren * (caccanh * caccanh)) / (4.0 * Math.tan((Math.PI / mattren)));
		System.out.println("dien tich = "+T);
	}

}
