package exercicios.aulas.domain;

import java.util.Iterator;

public class A63BlocosDeInicializacaoEstaticosGeradorDeDados {

	private static int[] numerosGerados = new int[15];

	static {
		System.out.println("BLOCO ESTÁTICO: Calculando e armazenando números pares...");

		int contador = 0;
		for (int i = 2; contador < 15; i++) {
			if (i % 2 == 0) {
				System.out.println("Numero " + (contador + 1) + ": " + i);
				A63BlocosDeInicializacaoEstaticosGeradorDeDados.numerosGerados[contador] = i;
				contador++;
			}
		}
	}

	public A63BlocosDeInicializacaoEstaticosGeradorDeDados() {
		System.out.println("CONSTRUTOR: Nova instância de GeradorDeDados criada.");
	}

	public static void getNumerosGerados() {
		int contador = 1;
		for (int i : A63BlocosDeInicializacaoEstaticosGeradorDeDados.numerosGerados) {
			System.out.println("Numero " + contador + ": " + i);
			contador++;
		}

	}

}
