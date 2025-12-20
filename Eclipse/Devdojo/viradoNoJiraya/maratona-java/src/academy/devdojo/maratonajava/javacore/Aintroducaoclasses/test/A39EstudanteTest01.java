package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.A39Estudante;

public class A39EstudanteTest01 {
	public static void main(String[] args) {
		A39Estudante estudante = new A39Estudante();
		estudante.nome = "Luffy";
		estudante.idade = 21;
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		System.out.println(estudante);
	}
}
