package bahai;

import java.util.Scanner;

public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("nhap nam = ");
		int nam = in.nextInt();
		if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
			System.out.println(nam + " la nam nhuan");
		} else {
			System.out.println(nam + " la nam khong nhuan");
		}
	}

}
