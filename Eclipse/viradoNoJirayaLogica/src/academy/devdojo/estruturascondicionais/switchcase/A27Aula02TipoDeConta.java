package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

/*
Como gerente eu gostaria que meus usuários pudessem
digitar o tipo da conta e o sistema imprima qual a porcentagem de juros
que aquela conta irá oferecer. Com o intuito de agilizar o acesso as informações
Os tipos das contas são
CONTA_POUPANCA 0.05%
CONTA_CORRENTE 0.02%
CONTA_INVESTIMENTO 0.1%
 */


public class A27Aula02TipoDeConta {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tipo de conta poupança conforme abaixo, para saber a porcentagem de juros:");
		System.out.println("CONTA_POUPANCA");
		System.out.println("CONTA_CORRENTE");
		System.out.println("CONTA_INVESTIMENTO");
		String tipoDeConta = scanner.nextLine();
		
		//System.out.println("O tipo de conta informado foi " + tipoDeConta);
		
		switch (tipoDeConta) {
		case "CONTA_POUPANCA":
			System.out.println("Baseado no tipo de " + tipoDeConta + ", o juros é 0.05%.");
			break;
		case "CONTA_CORRENTE":
			System.out.println("Baseado no tipo de " + tipoDeConta + ", o juros é 0.02%.");
			break;
		case "CONTA_INVESTIMENTO":
			System.out.println("Baseado no tipo de " + tipoDeConta + ", o juros é 0.10%.");
			break;
		default:
			System.out.println("INVÁLIDO, verifique o tipo de conta informado e comece novamente.");
			break;
		}		
		
		scanner.close();
	}
}
