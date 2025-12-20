package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.A41Professor;

public class A41ProfessorTest01 {
	public static void main(String[] args) {
		A41Professor professor = new A41Professor();
		professor.nome = "Mestre Kami";
		professor.idade = 140;
		professor.sexo = 'M';

		System.out.println("Nome " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);

	}
}
