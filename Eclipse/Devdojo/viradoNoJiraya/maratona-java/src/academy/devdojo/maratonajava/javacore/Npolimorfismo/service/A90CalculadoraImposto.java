package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.A90Tomate;

public class A90CalculadoraImposto {
	public static void calcularImpostoComputador(A90Computador computador) {

	}
//		System.out.println("Relatório de imposto do computador");
//		double imposto = computador.calcularImposto();
//		System.out.println("Computador " + computador.getNome());
//		System.out.println("Valor " + computador.getValor());
//		System.out.println("Imposto a ser pago " + imposto);
//	}
//	
//	public static void calcularImpostoTomate(A90Tomate tomate) {
//		System.out.println("Relatório de imposto do computador");
//		double imposto = tomate.calcularImposto();
//		System.out.println("Tomate " + tomate.getNome());
//		System.out.println("Valor " + tomate.getValor());
//		System.out.println("Imposto a ser pago " + imposto);
//	}

	// Método com polimorfismo
	public static void calcularImposto(A90Produto produto) {
		System.out.println("Relatório de imposto");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço: " + produto.getNome());
		System.out.println("Imposto a ser pago: " + imposto);

		if (produto instanceof A90Tomate) {
//			A90Tomate tomate = (A90Tomate) produto;
//			System.out.println(tomate.getDateValidade());
			
			String dataValidade = ((A90Tomate)produto).getDateValidade();
			System.out.println(dataValidade);
		}
	}
}
