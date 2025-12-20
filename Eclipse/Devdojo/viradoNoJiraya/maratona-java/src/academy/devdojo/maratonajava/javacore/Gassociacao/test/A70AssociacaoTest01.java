package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A66Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A70Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A70Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.A70Seminario;

public class A70AssociacaoTest01 {
	public static void main(String[] args) {
		A70Local local = new A70Local("Rua das laranjeiras");
		A70Aluno aluno = new A70Aluno("Luffy", 17);
		A66Professor professor = new A66Professor("Barba Branca", "Pirata");
		A70Aluno[] alunosParaSeminario = { aluno };
		
		A70Seminario seminario = new A70Seminario("Onde achar o one piece", alunosParaSeminario, local);
		
		A70Seminario[] seminariosDisponivei = {seminario}; 
		
		professor.setSeminarios(seminariosDisponivei);
		
		
		professor.imprime();
	}
}
