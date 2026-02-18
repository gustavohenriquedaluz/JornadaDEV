package academy.devdojo.maratonajava.javacore.Rdates;

import java.util.Calendar;
import java.util.Date;

public class A113CalendarTest01 {

	public static void main(String[] args) {
		// Calendar calendar = new Calendar(); Classe abstrata, não se pode instanciar
		Calendar c = Calendar.getInstance();
		if (c.getFirstDayOfWeek() == Calendar.SUNDAY) { //Teste se o primeiro dia do mês é domingo, baseado no calendário criado
			System.out.println("Domingão é o primeiro dia da semana");
		} else if (c.getFirstDayOfWeek() == Calendar.MONDAY) {
			System.out.println("Segundona é o primeiro dia da semana");
		}
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		c.add(Calendar.DAY_OF_MONTH, 2); // Adiciona 2 dias do Mês
		c.roll(Calendar.HOUR, 12); // Adiciona 12 horas, mas se ultrapassar o dia, ao usar o roll ele mantém o
									// mesmo dia e "rola" o relógio
		Date date = c.getTime();
		System.out.println(date);
	}

}
