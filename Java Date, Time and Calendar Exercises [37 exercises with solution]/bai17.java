package quakhu;

import java.util.Calendar;
import java.util.Date;

import javafx.scene.chart.PieChart.Data;

public class bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		 Date namhientai = cl.getTime();
		 cl.add(Calendar.YEAR, 1);
		 Date namsauhientai = cl.getTime();
		 cl.add(Calendar.YEAR, -2);
		 Date namtruochientai = cl.getTime();
		 System.out.println(namhientai);
		 System.out.println(namtruochientai);
		 System.out.println(namsauhientai);
	}

}
