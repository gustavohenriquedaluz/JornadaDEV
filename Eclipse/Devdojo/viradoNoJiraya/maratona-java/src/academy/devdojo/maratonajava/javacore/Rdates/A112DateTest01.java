package academy.devdojo.maratonajava.javacore.Rdates;

import java.util.Date;

public class A112DateTest01 {
	public static void main(String[] args) {
		Date date = new Date(1771208457536L); // "Data atual" contada em milisegundos, que para o Java, é apenas um LONG
												// encapsulado
		date.setTime(date.getTime() + 3_600_000); // Adicionando 1h, ou seja 3_600_000 milisegundos
		System.out.println(date);

	}
}
