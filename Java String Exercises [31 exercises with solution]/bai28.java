package baitapstring;

public class bai28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//toCharArray() được sử dụng để chuyển đổi chuỗi thành các mảng ký tự. Nó trả về một mảng ký từ có độ dài tương đương độ dài của chuỗi
		String str = "phantantinh";
		char[] s1 = str.toCharArray();
		for(int i=0; i<s1.length; i++)
		System.out.println(s1[i]);

	}

}
