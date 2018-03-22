package baitapnext;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
	    int n, soDu, tong = 0;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.print("Nhập vào số nguyên dương bất kỳ: ");
	    n = scanner.nextInt();
	      if(n>0&&n<1000) {   
	    while (n > 0) {
	        soDu = n % 10;
	        n = n / 10;
	        tong += soDu;
	    }
	         
	    System.out.println("tong cac chu so nguyen = " + tong);
	      }
	      else System.out.println("Nhap ko hop le");
	}
}