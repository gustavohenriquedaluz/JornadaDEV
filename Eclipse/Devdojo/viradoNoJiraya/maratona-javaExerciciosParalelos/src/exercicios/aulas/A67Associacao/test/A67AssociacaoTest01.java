package exercicios.aulas.A67Associacao.test;

import exercicios.aulas.A67Associacao.domain.Aluno;
import exercicios.aulas.A67Associacao.domain.Local;
import exercicios.aulas.A67Associacao.domain.Professor;
import exercicios.aulas.A67Associacao.domain.Seminario;

public class A67AssociacaoTest01 {

	public static void main(String[] args) {
		//Locais
		Local local1 = new Local("AV Paulista", "São Paulo");
		Local local2 = new Local("AV  Brasil", "Amazonas");
		Local local3 = new Local("Rua Java Doido", "Liberdade");
		
		//Professores
		Professor professor1 = new Professor("Elon Musk", "Inovação");
		Professor professor2 = new Professor("Steve Jobs", "Design de produtos");
		Professor professor3 = new Professor("Nikola Tesla", "Transformação");
		
		//Seminarios criados com os requisitos solicitados
		Seminario seminario1 = new Seminario("Inovação", local1, professor1);
		Seminario seminario2 = new Seminario("Criatividade", local2, professor2);
		Seminario seminario3 = new Seminario("Empreendedorismo", local3, professor2);
		
		//Alunos
		Aluno aluno1 = new Aluno("Michael Jackson", 13);
		Aluno aluno2 = new Aluno("Axl Rose", 20);
		Aluno aluno3 = new Aluno("Monark", 25);
		Aluno aluno4 = new Aluno("Kaká", 14);
		Aluno aluno5 = new Aluno("Tim Cook", 50);
		
		//Criar arrays para setar nos seminarios
		Aluno[] alunos1 = {aluno1, aluno2, aluno3};
		Aluno[] alunos2 = {aluno3, aluno4, aluno5};
		Aluno[] alunos3 = {aluno1, aluno3, aluno5};
		
		//Setar alunos nos seminarios
		seminario1.setAlunos(alunos1);
		seminario2.setAlunos(alunos2);
		seminario1.setAlunos(alunos3);

		Seminario[] seminariosProfessor1 = {seminario1};
		Seminario[] seminariosProfessor2 = {seminario2,seminario3};
		
		//Setar seminarios nos professores
		professor1.setSeminarios(seminariosProfessor1);
		professor2.setSeminarios(seminariosProfessor2);
	
		
		System.out.println("Resumo dos seminários:");	
		seminario1.imprimeResumo();
		System.out.println("\n");
		seminario2.imprimeResumo();
		System.out.println("\n");
		seminario3.imprimeResumo(); //Teste sem alunos cadastrados
		
		System.out.println("\nResumo dos professores:");
		professor1.imprimeSeminarios();
		professor2.imprimeSeminarios();
		professor3.imprimeSeminarios(); // Teste sem seminarios cadastrados
		
		
		System.out.println(seminario1.getLocal()); //Teste get local, e não referência da memória
	}

}
