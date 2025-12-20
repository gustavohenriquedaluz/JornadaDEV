package exercicios.aulas.A77FinalA1EX02.test;

import exercicios.aulas.A77FinalA1EX02.domain.Comprador;

public class MainTest01 {
	public static void main(String[] args) {
		final double VELOCIDADE_LIMITE = 250;
		// VELOCIDADE_LIMITE = 280; The final local variable VELOCIDADE_LIMITE cannot be assigned. It must be blank and not using a compound assignment

		final Comprador c = new Comprador();
		c.setNome("Junior");
		System.out.println(c.getNome());
		// c = new Comprador(); The final local variable c cannot be assigned. It must be blank and not using a compound assignment
		
		c.setNome("Senior");
		System.out.println(c.getNome());
		
		
		//The type FakeFerrari cannot subclass the final class Ferrari
	}
	}

