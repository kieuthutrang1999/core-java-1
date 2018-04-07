package quakhu;

import java.util.Calendar;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar time = Calendar.getInstance();
		System.out.println("ngay "+time.get(Calendar.DATE)+" thang "+(time.get(Calendar.MONTH)+1)
				+" nam "+time.get(Calendar.YEAR)+" vao luc "+time.get(Calendar.HOUR_OF_DAY)
				+" gio "+time.get(Calendar.MINUTE)+" phut "+time.get(Calendar.SECOND)
				+"."+time.get(Calendar.MILLISECOND)+" giay");
	}

}
