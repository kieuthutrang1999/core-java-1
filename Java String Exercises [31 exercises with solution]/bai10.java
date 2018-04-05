package baitapstring;

public class bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xat định  chuỗi có bộ đệm chỉ định hay ko true false
				String str1 = "what you name are ";
				String str2 = "WHAT YOU NAME ARE ";
				StringBuffer sb = new StringBuffer(str1);
				System.out.println(str1+""+sb+""+str1.contentEquals(sb));
				System.out.println(str2+""+sb+""+str2.contentEquals(sb));
				
	}

}
