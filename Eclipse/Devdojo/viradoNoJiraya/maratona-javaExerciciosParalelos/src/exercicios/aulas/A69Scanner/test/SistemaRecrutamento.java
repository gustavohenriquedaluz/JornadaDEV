package exercicios.aulas.A69Scanner.test;

import java.util.Scanner;

import exercicios.aulas.A69Scanner.domain.Candidato;

public class SistemaRecrutamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Instanciando o scanner
		
		Candidato candidato1 = new Candidato();
		
		
		System.out.println("Digite a idade do candidato:");
		candidato1.setIdade(scanner.nextInt());
		
		System.out.println("Digite o nome completo do candidato:");
		scanner.nextLine(); // Limpando buffer, devido a transição de int para line
		candidato1.setNome(scanner.nextLine());
		
		System.out.println("Digite a pretensão salarial:");
		candidato1.setPretensaoSalarial(scanner.nextDouble());
		
		System.out.println("O candidato tem experiência em Java? (True or false)");
		candidato1.setExperienteEmJava(scanner.nextBoolean());
		
		System.out.println("Digite o sexo do candidato: (Masculino ou Feminino)");
		scanner.nextLine(); //Limpando o buffer
		candidato1.setSexo(scanner.nextLine().charAt(0));
		
		System.out.println(candidato1.getSexo());
		
		candidato1.imprimeDadosCandidato();
		
		scanner.close(); // Fechando o scanner para não consumir recursos
	}

}
