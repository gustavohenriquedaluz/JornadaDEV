package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A64Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A65Time;

public class A67JogadorTest03 {

	public static void main(String[] args) {
		A64Jogador jogador = new A64Jogador("Cafu");
		A65Time time = new A65Time("Brazil");
		A64Jogador[] jogadores = {jogador};
		
		jogador.setTime(time);
		
		time.setJogadores(jogadores);
		
		System.out.println("--- Jogador ---");
		jogador.imprime();

		System.out.println("--- Time ---");
		time.imprime();
	}

}
