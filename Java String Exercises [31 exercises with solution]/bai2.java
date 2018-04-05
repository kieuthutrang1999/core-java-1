package baitapstring;

public class bai2 {

	public static void main(String[] args) {
		//trả về mã unicode 
		 String str = "khonghieu";
	      System.out.println("String = " + str);

	      int retval = str.codePointAt(1);
	      System.out.println("Character(unicode point) = " + retval);
	      
	      retval = str.codePointAt(5);
	      System.out.println("Character(unicode point) = " + retval);
	      
	      
	}

}
