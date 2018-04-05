package baitapstring;


public class bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//trả về mảng byte của chuỗi.
		String str1 = "phan tan tinh";
		byte[] arr = str1.getBytes();
		String byte_arr = new String(arr);
		System.out.println(byte_arr);
		
	}

}
