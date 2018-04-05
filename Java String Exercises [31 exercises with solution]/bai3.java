package baitapstring;

public class bai3 {

	public static void main(String[] args) {
		//trả về mã unicode của ký tự trước nó
		 String str = "khonghieu";
	      System.out.println("String = " + str);

	      int retval = str.codePointBefore(1);
	      System.out.println("Character(unicode point) = " + retval);
	      
	      retval = str.codePointBefore(5);
	      System.out.println("Character(unicode point) = " + retval);
	      
	}

}
