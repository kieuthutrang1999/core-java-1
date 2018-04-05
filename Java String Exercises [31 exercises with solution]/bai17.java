package baitapstring;

public class bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = new String("hello Java how are you?");
	        char[] ch = new char[4];
	        try {
	            str.getChars(10, 14, ch, 0);
	            System.out.println(ch);
	        } catch (Exception ex) {
	            System.out.println(ex);
	        }

	}

}
