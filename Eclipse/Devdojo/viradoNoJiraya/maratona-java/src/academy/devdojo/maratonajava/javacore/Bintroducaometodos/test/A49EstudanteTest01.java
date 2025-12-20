package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.A49Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.A49ImpressoraEstudante;

public class A49EstudanteTest01 {

	public static void main(String[] args) {
		A49Estudante estudante01 = new A49Estudante();
		A49Estudante estudante02 = new A49Estudante();
		A49ImpressoraEstudante impressora = new A49ImpressoraEstudante();
		
		estudante01.nome = "Midoriya";
		estudante01.idade = 15;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Sakura";
		estudante02.idade = 16;
		estudante02.sexo = 'F';		
		
		System.out.println(estudante01.nome);
		System.out.println(estudante01.idade);
		System.out.println(estudante01.sexo);
		
		System.out.println("------------------");
		
		System.out.println(estudante02.nome);
		System.out.println(estudante02.idade);
		System.out.println(estudante02.sexo);
		
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);
		
		
	}

}
