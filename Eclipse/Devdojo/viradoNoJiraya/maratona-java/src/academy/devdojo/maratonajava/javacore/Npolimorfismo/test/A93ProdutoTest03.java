package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.A90CalculadoraImposto;

public class A93ProdutoTest03 {
	public static void main(String[] args) {

		A90Produto produto = new A90Computador("Ryzen 9", 3000);

		A90Tomate tomate = new A90Tomate("Americano", 20);
		tomate.setDateValidade("11/12/2021");
		
		A90CalculadoraImposto.calcularImposto(tomate);
		
		A90CalculadoraImposto.calcularImposto(produto);
	}
}
