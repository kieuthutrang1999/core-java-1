package baitapstring;

public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xat định các chuỗi có giống nhâu hay ko true false
				String str1 = "what you name are ";
				String str2 = "what you name are ahihi ";
				CharSequence cs = "what you name are ";
				System.out.println(str1.contentEquals(cs));
				System.out.println(str2.contentEquals(cs));
	}

}
