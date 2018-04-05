package baitapstring;

public class bai4 {

	public static void main(String[] args) {
		//xát định số mã của unicode
		String str = "khonghieu";
		System.out.println("String = " + str);

		int retval = str.codePointCount(1, 5);
		System.out.println("Character(unicode point) = " + retval);
	}

}
