package exercicios.aulas.A105Exception04;

public class A105Main04 {

	public static void main(String[] args) {
		int teste1 = A105CalculadoraFinanceira.somarValores("500", "200");
		System.out.println(teste1);
		
		int teste2 = A105CalculadoraFinanceira.somarValores("500", "x");
		System.out.println(teste2);
	}

}
