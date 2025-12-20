package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A64Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A65Time;

public class A65JogadorTest02 {

	public static void main(String[] args) {
		A64Jogador jogador1 = new A64Jogador("Pelé");

		A65Time time = new A65Time("Seleção Brasileira");
		
		jogador1.setTime(time);
		jogador1.imprime();
	}

}
