package allbaitap;

import java.util.Scanner;

public class bai116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================BÀI 116=======================\n");
		for(int i=1; i<=100; i++) {
			if( i%5==0 && i%3==0 ) {
				System.out.println("fizz buzz : "+i);
			}
			else if( i%3==0) {
				System.out.println("Fizz : "+i);
			}
			else if( i%5==0) {
				System.out.println("Buzz : "+i);
			}
		}
	}

}
