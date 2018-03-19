package allbaitap;

import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================BÀI 7=======================\n");  
		 int Q;
		 System.out.print("Q = ");
		 Q = sc.nextInt();
		 int W=0;
		 for(int i=1; i<=10; i++) {
			 W+=Q;
			 System.out.println(Q+"*"+i+"=" +W);
		 }
	}

}
