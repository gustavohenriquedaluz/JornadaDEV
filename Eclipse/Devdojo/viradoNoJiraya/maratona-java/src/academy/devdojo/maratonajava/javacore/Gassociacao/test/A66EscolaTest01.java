package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A66Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A66Professor;

public class A66EscolaTest01 {

	public static void main(String[] args) {
		A66Professor professor1 = new A66Professor("Jiraya Sensei");
		A66Professor professor2 = new A66Professor("Kakashi Sensei");
		A66Professor[] professores = { professor1, professor2 };

		A66Escola escola = new A66Escola("Konoha", professores);

		escola.imprime();
	}

}
