package exercicios.aulas.test;

import exercicios.aulas.domain.A52Ferramentas;

public class A52FerramentasTest01 {

	public static void main(String[] args) {
		A52Ferramentas ferramentas = new A52Ferramentas();
		
		double mediaAritmetica = ferramentas.calculadoraMediaAritmetic(1,0);
		
		System.out.println("A media aritmética é: " + mediaAritmetica);

		
		
		
		System.out.println(ferramentas.juntadorDePalavaras("-", "Amanda","Pedro","Paloma","Jubileu"));
		
		
	}

	
	
	
}
