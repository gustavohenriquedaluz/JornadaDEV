package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Tomate;

public class A91ProdutoTest02 {
	public static void main(String[] args) {
		A90Produto produto = new A90Computador("Ryzen 9", 3000);
		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		System.out.println(produto.calcularImposto());
		System.out.println("--------------------");
		
		A90Produto produto2 = new A90Tomate("Americano", 20);
		System.out.println(produto2.getNome());
		System.out.println(produto2.getValor());
		System.out.println(produto2.calcularImposto());
		
	}


}
