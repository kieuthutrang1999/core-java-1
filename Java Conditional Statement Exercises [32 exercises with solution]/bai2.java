package bahai;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c, x1, x2;
		System.out.print("nhap a =");
		a = sc.nextDouble();
		System.out.print("nhap b =");
		b = sc.nextDouble();
		System.out.print("nhap c =");
		c = sc.nextDouble();
		if (a == 0)
			if (b == 0)
				if (c == 0)
					System.out.println("phuong trinh vo so nghiem");
				else
					System.out.println("phuong trinh vo nghiem");
			else
				System.out.println("phuong trinh co 1 nghiem" + (-c / a));
		else {
			double del = b * b - a * c * 4;
			if (del < 0)
				System.out.println("phuong trinh vo nghiem");
			else if (del == 0) {
				x1 = x2 = -b / 2 * a;
				System.out.println("phuong trinh co nghiem kep x1=x2= " + x1);
			} else {
				x1=(-b+Math.sqrt(del))/(2*a);
				x2=(-b-Math.sqrt(del))/(2*a);
				System.out.println("phuong trinh co hai nghiem phan biet");
				System.out.println("x1 = "+x1+"\tx2 = "+x2);
			}

		}

	}

}
