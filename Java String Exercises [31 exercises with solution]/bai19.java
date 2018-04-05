package baitapstring;

public class bai19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int indexOf(int ch) //Trả về vị trị của giá trị Char đã cho.
		int indexOf(int ch, int fromIndex) //Trả về vị trị của giá trị Char đã cho tính từ vị trí fromIndex.
		int indexOf(String substring) //Trả về vị trị của chuỗi con.
		int indexOf(String substring, int fromIndex) //Trả về vị trị của chuỗi con đã cho tính từ vị trí fromIndex.*/
		// ko tìm thấy sẽ trả về -1///
		String str = "phan tie keo";
		int s1 = str.indexOf("t");
		int s2 = str.indexOf("a", 2);
		int s3 = str.indexOf("n",3);
		int s4 = str.indexOf("k", 1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
