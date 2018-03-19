package allbaitap;

import java.util.Scanner;

public class bai60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 60======================\n");
		 Scanner in = new Scanner(System.in);
	     System.out.print("Input a Sentence: ");
		 String line = in.nextLine();
		 String[] words = line.split("[ ]+");
		 System.out.println("Penultimate word: "+words[words.length - 2]);

	}
}
