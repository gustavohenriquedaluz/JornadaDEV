package exercicios.aulas.A115Date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class A115Date {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Data original: " + c.getTime());
		c.set(Calendar.MONTH, 9);
		c.set(Calendar.DAY_OF_MONTH, 20);
		c.set(Calendar.YEAR, 2025);
		System.out.println("Data alterada para 20/10/2025: "+ c.getTime()); // Mon Oct 20 22:15:40 BRT 2025
		c.add(Calendar.DAY_OF_MONTH, 15);
		c.add(Calendar.HOUR, 4);
		System.out.println("+15d e 4hrs em cima de 20/10/2025: " + c.getTime());

		Locale localeUS = new Locale("en", "US"); // Definido o local para o padrão do USA
		Locale localeIT = new Locale("it", "IT"); // Definido o local para o padrão da ITA
		Locale localeJP = new Locale("ja", "JP"); // Definido o local para o padrão do JAP
		Locale localeBR = new Locale("pt", "BR"); // Definido o local para o padrão BR

		// Criando vários formatadores de data, definido o estilo para FULL e a
		// localidade que havia criado acima
		DateFormat dfUS = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.SHORT, localeUS);
		DateFormat dfIT = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.SHORT, localeIT);
		DateFormat dfJP = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.SHORT, localeJP);
		DateFormat dfBR = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.SHORT, localeBR);

		// Imprimindo no console, utilizando o "molde" de formatador do país específico,
		// baseado na instância do calendário que havia editado anteriormente
		System.out.println("Padrão USA: " + dfUS.format(c.getTime()));
		System.out.println("Padrão ITA: " + dfIT.format(c.getTime()));
		System.out.println("Padrão JP: " + dfJP.format(c.getTime()));
		System.out.println("Padrão BR: " + dfBR.format(c.getTime()));

		
//		Data original: Wed Feb 18 23:05:43 BRT 2026
//		Data alterada para 20/10/2025: Mon Oct 20 23:05:43 BRT 2025
//		+15d e 4hrs em cima de 20/10/2025: Wed Nov 05 03:05:43 BRT 2025
//		Padrão USA: Wednesday, November 5, 2025, 3:05 AM
//		Padrão ITA: mercoledì 5 novembre 2025, 03:05
//		Padrão JP: 2025年11月5日水曜日 3:05
//		Padrão BR: quarta-feira, 5 de novembro de 2025 03:05
		
	}

}
