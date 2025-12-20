package academy.devdojo.maratonajava.introducao;

public class A26Aula05EstruturasCondicionais06 {
	public static void main(String[] args) {
		//Usando Switch: Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
		//Considerando 1 como domingo
		
		byte diaDaSemana = 6;
		String finalDeSemanaString = "Final de semana";
		String diaUtilString = "Dia útil";
		
		switch (diaDaSemana) {
		case 1:
			System.out.println("Domingo: " + finalDeSemanaString);
			break;
		case 2:
			System.out.println("Segunda-feira: "+ diaUtilString);
			break;
		case 3:
			System.out.println("Terça-feira: " + diaUtilString);
			break;
		case 4:
			System.out.println("Quarta-feira: " + diaUtilString);
			break;
		case 5:
			System.out.println("Quinta-feira: " + diaUtilString);
			break;
		case 6:
			System.out.println("Sexta-feira: " + diaUtilString);
			break;
		case 7:
			System.out.println("Sábado: " + finalDeSemanaString);
			break;
		default:
			System.out.println("Dia inválido!");
			break;
		}
		
		
		
		
		//Usando Switch: Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
		//Considerando 1 como domingo		
		//Professor:
		
		byte dia = 4;
		
		switch (dia) {
		case 1:
		case 7:
			System.out.println("FDS");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia útil");
			break;
		default:
			System.out.println("Dia inválido");
			break;
		}
		
		
		
		
		
		
		
	}
}
