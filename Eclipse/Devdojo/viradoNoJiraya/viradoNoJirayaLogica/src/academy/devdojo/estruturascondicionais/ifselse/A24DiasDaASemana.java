package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class A24DiasDaASemana {
	public static void main (String[]args) {
	//Receba um  número inteiro do usuário e imprima o dia da semana correspondente
		Scanner scanner = new Scanner (System.in);
		
		
		String[] diasDaSemana = {"Segunda-feira", "Terça-Feira", "Quarta-feira", "Quinta-Feira", "Sexta-feira", "Sabado", "Domingo"};
		
		System.out.println("Digite um dia da semana entre 1 e 7.");
		int dia = scanner.nextInt();
		
		if (dia < 1 || dia > 7) {
			System.out.println("Revisar número digitado e começar novamente, como a semana tem 7 dias, digitar um número entre 1 e 7.");
			scanner.close();
			return;

		}
		
		
		System.out.println("O dia da semana correspondente ao número " + dia + " é " + diasDaSemana[(dia - 1)]);
		
		
		scanner.close();
				
		
	}
}
 