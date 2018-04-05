package baitapstring;

public class bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xat định  cac chuỗi có giống chỉ định hay ko true false ko phân biệt hoa với thường
				String str1 = "what you name are ";
				String str2 = "WHAT YOU NAME ARE ";
				String str3 = "what you name are ";
				String str4 = "my name is ahihi ";
				
				System.out.println(str1.equalsIgnoreCase(str2));
				System.out.println(str1.equalsIgnoreCase(str3));
				System.out.println(str1.equalsIgnoreCase(str4));
				
	}

}
