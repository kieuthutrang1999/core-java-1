package allbaitap;

public class bai76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================B�I 76=======================\n");
		String str1 = "Python"; 
		String str2 = ""; 
		
		int length2 = str2.length();
		String result = "";
		result += (str1.length() >= 1) ? str1.charAt(0) : '#';
		result += (length2 >= 1) ? str2.charAt(length2-1) : '#';
		System.out.println(result);
	}

}
