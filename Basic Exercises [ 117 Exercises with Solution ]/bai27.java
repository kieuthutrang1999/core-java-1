package allbaitap;

import java.util.Scanner;

public class bai27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 27=======================\n");

        String octal_num, hex_num;
        int decnum;
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a octal number : ");
        octal_num = in.nextLine();
		
        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);
		
        System.out.print("Equivalent hexadecimal number: "+ hex_num+"\n");
	}

}
