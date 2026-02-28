package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class A116NumberFormatTest01 {
	public static void main(String[] args) {
		Locale localeBR = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		
		NumberFormat[] nfa = new NumberFormat[4]; // Array de nfa
		System.out.println(Locale.getDefault()); // en_US
		nfa[0] = NumberFormat.getInstance(); // Padrão do PC
		nfa[1] = NumberFormat.getInstance(localeBR);
		nfa[2] = NumberFormat.getInstance(localeJP);
		nfa[3] = NumberFormat.getInstance(localeIT);
		
		double value = 100_000_000.2130;
		
		for (NumberFormat numberFormat : nfa) {
			System.out.println(numberFormat.getMaximumFractionDigits());
			System.out.println(numberFormat.format(value));
		}
		
		System.out.println(Locale.getDefault()); // en_US
		
		String stringValue = "1234,1234";
		try {
			System.out.println(nfa[2].parse(stringValue));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
