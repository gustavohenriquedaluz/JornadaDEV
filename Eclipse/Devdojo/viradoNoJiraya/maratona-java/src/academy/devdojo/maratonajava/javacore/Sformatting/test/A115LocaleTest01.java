package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class A115LocaleTest01 {
	public static void main(String[] args) {
		//pt-BR , letras minúsculas definem o idioma e maiúscula define o PAÍS
		
		//ISO 639, ISO 3166
		// pt-BR, pt-PT
		
		Locale localeItaly = new Locale("it", "IT");
		Locale localeCH = new Locale("it", "CH");
		Locale localeIndia = new Locale("hi", "IN");
		Locale localeJapao = new Locale("ja", "JP");
		Locale localeHolanda = new Locale("nl", "NL");
		Calendar calendar = Calendar.getInstance();
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly); //Italia = martedì 17 febbraio 2026
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH); // Suiça = martedì, 17 febbraio 2026
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia); // India = मंगलवार, 17 फ़रवरी 2026
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao); // Japao = 2026年2月17日火曜日
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda); // Holanda = dinsdag 17 februari 2026
		System.out.println("Italia = " + df1.format(calendar.getTime()));
		System.out.println("Suiça = " + df2.format(calendar.getTime()));
		System.out.println("India = " + df3.format(calendar.getTime()));
		System.out.println("Japao = " + df4.format(calendar.getTime()));
		System.out.println("Holanda = " + df5.format(calendar.getTime()));
		
		System.out.println(localeItaly.getDisplayCountry(localeJapao)); // イタリア (Italia em Japonês)
		System.out.println(localeCH.getDisplayCountry(localeHolanda)); // Zwitserland (Suiça em Holandês)
		System.out.println(localeItaly.getDisplayLanguage(localeJapao)); // イタリア語 (Italiano em Japonês)
		System.out.println(localeCH.getDisplayLanguage(localeHolanda)); // イタリア語 (Suiça em Holandês)
	}
}
