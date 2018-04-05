package baitapstring;

public class bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tre về chuôi - Mảng ký tự Offset ban đầu của mảng phụ. Độ dài của mảng phụ.
				  char[] Str1 = {'L', 'e', 'i', 'k', 'z', ' ', 'w', 'o', 'r', 'm', 'd',' ', '1', '2', '3'};
			      String Str2 = "";

			      Str2 = Str2.copyValueOf( Str1 );
			      System.out.println("Chuoi duoc tra ve la: " + Str2);

			      Str2 = Str2.copyValueOf(Str1, 1, 3);
			      System.out.println("Chuoi duoc tra ve la: " + Str2);
			    
			      
			      
			      
				
	}

}
