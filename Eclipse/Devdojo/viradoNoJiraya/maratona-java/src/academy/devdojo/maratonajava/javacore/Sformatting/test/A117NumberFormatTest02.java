package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class A117NumberFormatTest02 {

	public static void main(String[] args) {
		Locale localeBR = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		
		NumberFormat[] nfa = new NumberFormat[4]; // Array de nfa
		System.out.println(Locale.getDefault()); // en_US
		nfa[0] = NumberFormat.getCurrencyInstance(); // Padrão do PC
		nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
		nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
		nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
		
		double value = 1234.1234;
		
		for (NumberFormat numberFormat : nfa) {
			System.out.println(numberFormat.getMaximumFractionDigits());
			numberFormat.setMaximumFractionDigits(2);
			System.out.println(numberFormat.format(value));
		}
		
		String stringValue = "$1,234.12";
		try {
			System.out.println(nfa[0].parse(stringValue));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
