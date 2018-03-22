package baitapnext;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nhapphut;
		System.out.print("nhap so phut = ");
		nhapphut = sc.nextInt();
		int sophuttrong1nam = 365*24*60 ; 
		int nam = nhapphut/sophuttrong1nam;
		int ngay = (nhapphut / 60 / 24) % 365;
		System.out.println("" + nam + "nam\t" + ngay + "ngay");
	}

}
