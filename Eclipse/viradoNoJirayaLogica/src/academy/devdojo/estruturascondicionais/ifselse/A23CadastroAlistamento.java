package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class A23CadastroAlistamento {
	public static void main (String[] args) {
	/*
	 Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros para que eu possa agilizar o processo de cadastramento:
	sexo, sendo válido apenas M ou F e idade.

	Se o sexo for Masculino e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório
	Se o sexo for Masculino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
	Se o sexo for Feminino e a idade for maior igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
	Se o sexo for Feminino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
	 */
		
		Scanner scanner = new Scanner(System.in); // inicia o scanner
		
		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt(); // Captura o input como int
		
		scanner.nextLine(); //Desconsiderar o enter
		
		System.out.println("Digite o sexo (M ou F)");
		String sexo = scanner.nextLine();
		
		
		if (sexo.equalsIgnoreCase("M")) { // Se for masculino
			if (idade >= 18) {
				System.out.println("Alistamento obrigatório. Compareça a um posto de atendimento para se alistar!");
			} else {
				System.out.println("Alistamento não permitido");
			}
		} else if (sexo.equalsIgnoreCase("F")) {
			if (idade >= 18) {
				//System.out.println("Alistamento opcional, caso queira se alistar, compareça em um posto de atencimento.");
				System.out.println("Alistamento opcional, deseja se alistar? (S ou N)");
				String perguntaQuerAlistar = scanner.nextLine();
				
				if (perguntaQuerAlistar.equalsIgnoreCase("S")) {
					System.out.println("Compareça a um posto de atendimento para se alistar");
				} else if (perguntaQuerAlistar.equalsIgnoreCase("N")) {
					System.out.println("Se não deseja se alistar, como é opcional, não apareça em um posto de atendimento.");
				} else {
					System.out.println("Verificar dados do alistamento opcional, recomece e escreva 'S' ou 'N'");
				}
			} else {
					System.out.println("Alistamento não permitido");
			}
		
		}
		
		
		
		scanner.close(); // fecha o scanner
	}
}

