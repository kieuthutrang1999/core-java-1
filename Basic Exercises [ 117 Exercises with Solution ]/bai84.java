package allbaitap;

public class bai84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================B�I 84=======================\n");
		 String string1 = "Python";
		    int slength = 3;
		    if (slength > string1.length()) {
		      slength = string1.length();
		    }

		    String subpart = string1.substring(string1.length()-3);
		    System.out.println(subpart + string1 + subpart);
	}

}
