package allbaitap;

import java.util.Scanner;

public class bai65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 65=======================\n");
		Scanner in = new Scanner(System.in);
		System.out.print("Input the second number: ");
        int a = in.nextInt();  
        System.out.print("Input the first number : ");
		int b = in.nextInt(); 
        int divided = a / b;
		int result = a - (divided * b);
		System.out.println(result); 
	}

}
