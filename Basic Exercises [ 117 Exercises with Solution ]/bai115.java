package allbaitap;

import java.util.Scanner;

public class bai115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================B�I 115=======================\n");
		int num;
        Scanner in = new Scanner(System.in);	
        System.out.print("Input a positive integer: ");
        int n = in.nextInt(); 
        System.out.printf("Is %d is a palindrome number?\n",n);
		System.out.println(palindrome(n)); 
    }
    
private static boolean palindrome(int num) {
        String str = String.valueOf(num);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
	}

}
