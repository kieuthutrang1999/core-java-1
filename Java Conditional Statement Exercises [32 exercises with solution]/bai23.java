package bahai;

import java.util.Scanner;

public class bai23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n = ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) 
        {
            for (int spc = n - i; spc > 0; spc--) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
