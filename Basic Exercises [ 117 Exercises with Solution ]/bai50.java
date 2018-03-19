package allbaitap;


public class bai50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 42======================\n");
		System.out.println("\ncac so chia het cho 3 la: ");		
		for (int i=1; i<100; i++) {
			if (i%3==0) 
			System.out.print(i +", ");			
		}			
				
		System.out.println("\n\ncac so chia het cho 5 la: ");
		for (int i=1; i<100; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}
				
		System.out.println("\n\ncac so chia het cho 3 va 5 la: ");			
		for (int i=1; i<100; i++) {
			if (i%3==0 && i%5==0) System.out.print(i +", ");			
		}
		System.out.println("\n");

		
	}

}
