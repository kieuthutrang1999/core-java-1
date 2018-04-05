package baitapstring;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//so sánh độ dài của 2 chuổi dựa vào mã  unicode
		 String str1 = "rathieu";
	        String str2 = "khonghieu";
	        
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2); 
	       
	        // Compare the two strings.
	        int result = str1.compareTo(str2);

	        // Display the results of the comparison.
	        if (result < 0)
	        {
	            System.out.println("\"" + str1 + "\"" +
	                " is less than " +
	                "\"" + str2 + "\"");
	        }
	        else if (result == 0)
	        {
	            System.out.println("\"" + str1 + "\"" +
	                " is equal to " +
	                "\"" + str2 + "\"");
	        }
	        else // if (result > 0)
	        {
	            System.out.println("\"" + str1 + "\"" +
	                " is greater than " +
	                "\"" + str2 + "\"");
	        }
	}

}
