package allbaitap;

import java.util.Scanner;

public class bai22 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================B�I 22=======================\n");
		Scanner sc = new Scanner(System.in);
		 int nhiphan;
		 	System.out.print("so nhi phan = ");
			nhiphan=sc.nextInt();
			
		    System.out.print("He  thap phan cua " + nhiphan +" l� :");
		    System.out.print(Integer.lowestOneBit(nhiphan));
	}

}
