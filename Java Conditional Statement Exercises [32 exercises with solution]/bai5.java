package bahai;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int day = 0;
		System.out.print( "nhap  = ");
		day = sc.nextInt();
		switch (day) {
		case 1:   System.out.println("monday"); break;
		case 2:   System.out.println("tuesday"); break;
		case 3:   System.out.println("wednesday"); break;
		case 4:   System.out.println("thursday"); break;
		case 5:   System.out.println("friday"); break;
		case 6:   System.out.println("saturday"); break;
		case 7:   System.out.println("sunday"); break;
		default:  System.out.println("khong hop le");break;
			
		}

	}

}
