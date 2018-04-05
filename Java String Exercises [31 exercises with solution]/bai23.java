package baitapstring;

public class bai23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xem chuỗi có trùng khớp 1 vùng nào  hay ko
			String str1  = "phan tan tinh";
			String str2 = "do thi kim ly ri hi";
			System.out.println(str1.regionMatches(0, str2, 2, 10));
			System.out.println(str1.regionMatches(0, str2, 8, 0));
			
	}

}
