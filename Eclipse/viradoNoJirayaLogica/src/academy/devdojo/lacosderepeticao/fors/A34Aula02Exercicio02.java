package academy.devdojo.lacosderepeticao.fors;

import java.util.Scanner;

public class A34Aula02Exercicio02 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro para calcular a tabuada:");
		int numeroInput = scanner.nextInt();
		int selecao;
		
		
		do {
			for (int i = 1; i <= 10 ; i++) {
				System.out.println(numeroInput + "*" + i + "=" + (numeroInput*i));				
			}
			System.out.println("Deseja calcular outra tabuada?");
			System.out.println("1.Sim");
			System.out.println("2.Não");
			selecao = scanner.nextInt();
			
			if (selecao == 1) {
				System.out.println("Digite um número inteiro para calcular a tabuada:");
				numeroInput = scanner.nextInt();
			}
		} while (selecao == 1);
		System.out.println("Fim do programa.");
		scanner.close();
	}
}