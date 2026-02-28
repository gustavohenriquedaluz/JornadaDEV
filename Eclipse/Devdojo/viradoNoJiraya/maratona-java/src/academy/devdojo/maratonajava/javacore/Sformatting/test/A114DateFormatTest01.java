package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;

public class A114DateFormatTest01 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // Pega meu calendário gregoriano
		DateFormat[] df = new DateFormat[7]; // Array de dateFormat, um "estilista" 
		df[0] = DateFormat.getInstance(); // 2/16/26, 11:29 PM
		df[1] = DateFormat.getDateInstance(); // Feb 16, 2026
		df[2] = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG); // Feb 16, 2026, 11:29:09 PM
		df[3] = DateFormat.getDateInstance(DateFormat.SHORT); //2/16/26
		df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); //Feb 16, 2026
		df[5] = DateFormat.getDateInstance(DateFormat.LONG); //February 16, 2026
		df[6] = DateFormat.getDateInstance(DateFormat.FULL); // Monday, February 16, 2026
		
		for (DateFormat dateFormat : df) {
			System.out.println(dateFormat.format(calendar.getTime()));
		}
	}
}
