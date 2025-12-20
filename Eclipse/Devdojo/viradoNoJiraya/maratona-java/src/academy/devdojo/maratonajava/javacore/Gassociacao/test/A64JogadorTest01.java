package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A64Jogador;

public class A64JogadorTest01 {

	public static void main(String[] args) {
		A64Jogador jogador1 = new A64Jogador("Pelé");
		A64Jogador jogador2 = new A64Jogador("Romário");
		A64Jogador jogador3 = new A64Jogador("Cafu");

		A64Jogador[] jogadores = { jogador1, jogador2, jogador3 };

		for (A64Jogador jogador : jogadores) {
			jogador.imprime();
		}
	}

}
