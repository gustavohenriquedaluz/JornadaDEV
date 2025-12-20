package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.A49Estudante;

public class A51EstudanteTest02 {
	public static void main (String[]args) {
		A49Estudante estudante01 = new A49Estudante();
		A49Estudante estudante02 = new A49Estudante();
		
		estudante01.nome = "Midoriya";
		estudante01.idade = 15;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Sakura";
		estudante02.idade = 16;
		estudante02.sexo = 'F';			
		
		estudante01.imprime();
		estudante01.imprime();
		
	}
}
