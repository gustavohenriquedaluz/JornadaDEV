package academy.devdojo.lacosderepeticao.whiles;

/* Como usuário eu gostaria de  de ter um menu visual  que seja navegável através de números.
O menu deve ser exibido da seguinte forma

1. Calcular Imposto
2. Depositar Salário
3. Sair

O menu deve ficar disponível enquanto eu não digitar o número 3.
Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
*/

import java.util.Scanner;

public class A30Aula03Menu {
public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	float salario = 0f;
	
	
	
	System.out.println("Para prosseguir, digite selecione uma opção / número conforme abaixo:");
	System.out.println("1. Calcular imposto");
	System.out.println("2. Depositar salário");
	System.out.println("3. Sair");

	
	int selecao = scanner.nextInt();
	
	 while (selecao != 3) {
		 if (selecao == 1) { // Calcular imposto
			 while (salario == 0) {
				 System.out.println("Antes de calcular o imposto digite seu salário");
				 salario = scanner.nextFloat();
		}
			if (salario <= 2000) { // 2k 5%
				System.out.println("Como seu salário de R$" + salario + " é menor que 2000, o imposto é de 5%, portanto o imposto a ser pago é de R$" + (salario * 0.05));
			} else if (salario <= 3000) { // 10% 
				System.out.println("Como seu salário de R$" + salario + " é entre R$2000 e R$3000, o imposto é de 10%, portanto o imposto a ser pago é de R$" + (salario * 0.1));
			} else { // >3k 15%
				System.out.println("Como seu salário de R$" + salario + " é maior que 3000, o imposto é de 15%, portanto o imposto a ser pago é de R$" + (salario * 0.15));
			}
		 } else if (selecao == 2) {
			 if (salario == 0) {
				 System.out.println("Digite seu salário");
				 salario = scanner.nextFloat();
			} else {
				System.out.println("Seu salario é de R$" + salario + ", digite qunato deseja depositar:");
				salario = salario + scanner.nextFloat();
				System.out.println("Agora seu salário é de R$" + salario);
			}
		 }
		 
		System.out.println("Para prosseguir, digite selecione uma opção / número conforme abaixo:");
		System.out.println("1. Calcular imposto");
		System.out.println("2. Depositar salário");
		System.out.println("3. Sair");
		selecao = scanner.nextInt();
		System.out.println("Você digitou a opção " + selecao);
	}
	
	System.out.println("Obrigado por utilizar nosso sistema."); 	
	
	
	scanner.close();
}
}
