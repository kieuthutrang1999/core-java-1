package allbaitap;

import java.util.Scanner;

public class bai51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 51======================\n");
		Scanner in = new Scanner(System.in);
        System.out.print("\r\n" + "Nhap mot so(string): ");
        String str1 = in.nextLine();
		int kq = Integer.parseInt(str1);
        System.out.printf("Gia tri so nguyen la: %d",kq);
		System.out.printf("\n");
	}

}
