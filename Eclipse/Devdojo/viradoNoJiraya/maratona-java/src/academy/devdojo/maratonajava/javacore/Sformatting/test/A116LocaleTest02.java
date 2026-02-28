package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.util.Iterator;
import java.util.Locale;

public class A116LocaleTest02 {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault()); // en_US
		String[] isoCountries = Locale.getISOCountries(); // Todos os países suportados
		String[] isoLanguages = Locale.getISOLanguages(); //Todos as linguas suportadas
		
		//Retorna todas as linguas
		
		for (String isoLanguage : isoLanguages) {
			System.out.print(isoLanguage+ " ");
		}
		
		System.out.println();
		
		for (String isoCountry : isoCountries) {
			System.out.print(isoCountry+ " ");
		}
		

	}

}
