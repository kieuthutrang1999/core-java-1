package baitapnext;

import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int trongluong,chieucao;
		System.out.println("trong luong = ");
		trongluong = sc.nextInt();
		System.out.println("chieu cao = ");
		chieucao = sc.nextInt();
		double chiso = (double)(trongluong * 0.45359237 / (chieucao * 0.0254 * chieucao * 0.0254));
		System.out.println("chi so hoi cua co the nguoi la = "+chiso);
	}

}
