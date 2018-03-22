package bahai;

import java.util.Scanner;

public class bai29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number;
		int count = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhập vào 1 số nguyên dương bất kỳ: ");
        number = scanner.nextLong();
 
        while (number >= 10000000000l ) {
            System.out.println("Số nhập vào phải nhỏ hơn 10000000000. Mời bạn nhập lại: ");
            number = scanner.nextInt();
        }
         
        while (number <= 0 ) {
            System.out.println("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
            number = scanner.nextInt();
        }
         
        while (number > 0) {
            number /= 10;
            count++;    // tăng biến count lên 1
        }
         
        System.out.println("Số các chữ số = " + count);
      
        
	}

}
