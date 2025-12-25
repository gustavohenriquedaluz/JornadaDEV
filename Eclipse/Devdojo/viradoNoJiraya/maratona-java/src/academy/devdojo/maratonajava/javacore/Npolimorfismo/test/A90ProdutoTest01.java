package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.A90CalculadoraImposto;

public class A90ProdutoTest01 {
	public static void main(String[] args) {
		A90Computador computador = new A90Computador("NUC10I7", 11000);
		A90Tomate tomate = new A90Tomate("Tomate Siciliano", 10);
		
		A90CalculadoraImposto.calcularImpostoComputador(computador);
		System.out.println("----------");
		A90CalculadoraImposto.calcularImpostoTomate(tomate);
	}
}
