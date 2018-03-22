package baitapnext;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double Fahrenheit; 
		System.out.print("Nhap  Fahrenheit = ");
		Fahrenheit =sc.nextDouble();
		double Celsius =  ((Fahrenheit-32)*5)/9 ;
		System.out.println("Celsius = "+Celsius);

	}

}
