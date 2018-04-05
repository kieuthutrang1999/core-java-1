package baitapstring;

public class bai20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bai tap";
		String s1 = new StringBuffer("bai").append(" tap").toString();
		String s2 = s1.intern();
		System.out.println(str==s1);
		System.out.println(str==s2);
	}

}
