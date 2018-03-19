package allbaitap;

import java.util.Scanner;

public class bai32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================BÀI 32=======================\n");
		int x,y;
		System.out.print ("x = ");
		x = sc.nextInt();
		System.out.print ("y = ");
		y = sc.nextInt();
		if(x!=y)
			System.out.println(x+" != "+y);
		if(x<y)
			System.out.println(x+" < "+y);
		if(x<=y)
			System.out.println(x+" <= "+y);
	}

}
