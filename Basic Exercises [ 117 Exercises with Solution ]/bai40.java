package allbaitap;

import java.nio.charset.Charset;

public class bai40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================B�I 40======================\n");
		System.out.println("List of available character sets: ");  
	    for (String str : Charset.availableCharsets().keySet()) {
	      System.out.println(str);
	    }
	}
}
