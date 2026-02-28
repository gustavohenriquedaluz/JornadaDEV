package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A118SimpleDateFormatTest01 {

	public static void main(String[] args) {
		//String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";  2026.02.27 AD at 22:25:47 BRT
		String pattern = "'Amsterdam' dd 'of' MMMM 'of' yyyy"; // Amsterdam 27 of February of 2026
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(simpleDateFormat.format(new Date()));
		
		try {
			System.out.println(simpleDateFormat.parse("Amsterdam 27 of February of 2026"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
